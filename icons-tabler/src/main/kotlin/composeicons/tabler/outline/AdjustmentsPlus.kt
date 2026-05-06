package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AdjustmentsPlus: ImageVector
    get() {
        if (_adjustmentsPlus != null) return _adjustmentsPlus!!
        _adjustmentsPlus = tablerOutlineIcon(
            name = "AdjustmentsPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M4 10c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C8 8.895 7.105 8 6 8 4.895 8 4 8.895 4 10")
            addPathData("M6 4v4")
            addPathData("M6 12v8")
            addPathData("M13.958 15.592c-.214-1.029-1.189-1.717-2.231-1.573-1.042 .144-1.794 1.069-1.722 2.118 .072 1.049 .944 1.863 1.995 1.863")
            addPathData("M12 4v10")
            addPathData("M12 18v2")
            addPathData("M16 7c0 1.105 .895 2 2 2 1.105 0 2-.895 2-2C20 5.895 19.105 5 18 5c-1.105 0-2 .895-2 2")
            addPathData("M18 4v1")
            addPathData("M18 9v3")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _adjustmentsPlus!!
    }

private var _adjustmentsPlus: ImageVector? = null
