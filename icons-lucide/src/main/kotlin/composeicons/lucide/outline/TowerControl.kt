package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TowerControl: ImageVector
    get() {
        if (_towerControl != null) return _towerControl!!
        _towerControl = lucideOutlineIcon(
            name = "TowerControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.2 12.27 20 6h-16l1.8 6.27c.12 .427 .506 .724 .95 .73h10.5c.447-.001 .839-.299 .96-.73Z")
            addPathData("M8 13v9")
            addPathData("M16 22v-9")
            addPathData("M9 6l1 7")
            addPathData("M15 6l-1 7")
            addPathData("M12 6v-4")
            addPathData("M13 2h-2")
        }
        return _towerControl!!
    }

private var _towerControl: ImageVector? = null
