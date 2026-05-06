package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CodeVariablePlus: ImageVector
    get() {
        if (_codeVariablePlus != null) return _codeVariablePlus!!
        _codeVariablePlus = tablerOutlineIcon(
            name = "CodeVariablePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M13 16h-7C4.895 16 4 15.105 4 14v-4C4 8.895 4.895 8 6 8h12c1.105 0 2 .895 2 2v1")
            addPathData("M16 18h6")
            addPathData("M19 15v6")
        }
        return _codeVariablePlus!!
    }

private var _codeVariablePlus: ImageVector? = null
