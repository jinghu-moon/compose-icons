package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ConePlus: ImageVector
    get() {
        if (_conePlus != null) return _conePlus!!
        _conePlus = tablerOutlineIcon(
            name = "ConePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M18.03 12.022 12.87 2.507C12.692 2.194 12.36 2 12 2c-.36 0-.692 .194-.87 .507L3 17.497v.5C3 19.657 7.03 21 12 21c.17 0 .34-.002 .508-.005")
            addPathData("M16 19h6")
            addPathData("M19 16v6")
        }
        return _conePlus!!
    }

private var _conePlus: ImageVector? = null
