package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCakephp: ImageVector
    get() {
        if (_brandCakephp != null) return _brandCakephp!!
        _brandCakephp = tablerOutlineIcon(
            name = "BrandCakephp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 11l8 2c1.361-.545 2-1.248 2-2v-3.8C22 5.435 17.521 4 11.998 4 6.476 4 2 5.435 2 7.2v2.8c0 1.766 4.478 4 10 4v-3")
            addPathData("M12 14v3l8 2c1.362-.547 2-1.246 2-2v-3c0 .754-.638 1.453-2 2L12 14")
            addPathData("M2 17c0 1.766 4.476 3 9.998 3L12 17C6.478 17 2 15.266 2 13.5v3.5")
            addPathData("M2 10v4")
            addPathData("M22 10v4")
        }
        return _brandCakephp!!
    }

private var _brandCakephp: ImageVector? = null
