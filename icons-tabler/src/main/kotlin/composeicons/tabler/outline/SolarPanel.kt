package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SolarPanel: ImageVector
    get() {
        if (_solarPanel != null) return _solarPanel!!
        _solarPanel = tablerOutlineIcon(
            name = "SolarPanel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4.28 14h15.44c.308-0 .599-.142 .788-.385 .189-.243 .257-.559 .182-.858l-1.5-6C19.079 6.312 18.679 6 18.22 6h-12.44c-.459 0-.859 .312-.97 .757l-1.5 6c-.075 .299-.008 .615 .182 .858 .189 .243 .48 .385 .788 .385")
            addPathData("M4 10h16")
            addPathData("M10 6 9 14")
            addPathData("M14 6l1 8")
            addPathData("M12 14v4")
            addPathData("M7 18h10")
        }
        return _solarPanel!!
    }

private var _solarPanel: ImageVector? = null
