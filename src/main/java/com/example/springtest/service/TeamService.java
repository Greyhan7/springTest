package com.example.springtest.service;

import com.example.springtest.db.DBManager;
import com.example.springtest.vo.TeamVO;
import lombok.Setter;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.util.List;

@Service
@Setter
public class TeamService {

    public List<TeamVO> listTeam(){
        return DBManager.findAllTeam();
    }

    public int insertTeam(TeamVO teamVO){
        String path = System.getProperty("user.dir") + "/src/main/resources/static/images/team";
        String fname = "";
        MultipartFile uploadFile = teamVO.getUploadFile();
        fname= uploadFile.getOriginalFilename();

        if(fname != null && !fname.equals("")){
            try{
                byte []data = uploadFile.getBytes();
                FileOutputStream fos = new FileOutputStream(path + "/" + fname);
                fos.write(data);
                fos.close();
            }catch(Exception e){
                System.out.println("에러"+e.getMessage());
            }
        }else{
            fname = "";
        }

        teamVO.setLogo(fname);
        return DBManager.insertTeam(teamVO);
    }

}
