package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SolarPanel2: ImageVector
    get() {
        if (_solarPanel2 != null) return _solarPanel2!!
        _solarPanel2 = tablerOutlineIcon(
            name = "SolarPanel2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M8 2c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4")
            addPathData("M4 3h1")
            addPathData("M19 3h1")
            addPathData("M12 9v1")
            addPathData("M17.2 7.2l.707 .707")
            addPathData("M6.8 7.2l-.7 .7")
            addPathData("M4.28 21h15.44c.308-0 .599-.142 .788-.385 .189-.243 .257-.559 .182-.858l-1.5-6c-.111-.445-.511-.757-.97-.757h-12.44c-.459 0-.859 .312-.97 .757l-1.5 6c-.075 .299-.008 .615 .182 .858 .189 .243 .48 .385 .788 .385")
            addPathData("M4 17h16")
            addPathData("M10 13 9 21")
            addPathData("M14 13l1 8")
        }
        return _solarPanel2!!
    }

private var _solarPanel2: ImageVector? = null
