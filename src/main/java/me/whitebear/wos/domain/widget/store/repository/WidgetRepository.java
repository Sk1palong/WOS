package me.whitebear.wos.domain.widget.store.repository;

import me.whitebear.wos.domain.widget.store.entity.Widget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WidgetRepository extends JpaRepository<Widget, Long> {

}
