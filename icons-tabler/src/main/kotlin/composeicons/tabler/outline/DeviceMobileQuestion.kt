package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DeviceMobileQuestion: ImageVector
    get() {
        if (_deviceMobileQuestion != null) return _deviceMobileQuestion!!
        _deviceMobileQuestion = tablerOutlineIcon(
            name = "DeviceMobileQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 21h-7C6.895 21 6 20.105 6 19v-14C6 3.895 6.895 3 8 3h8c1.105 0 2 .895 2 2v6")
            addPathData("M19 22v.01")
            addPathData("M19 19c.923-.003 1.724-.636 1.941-1.532 .217-.897-.207-1.826-1.027-2.25-.819-.42-1.819-.219-2.414 .483")
            addPathData("M11 4h2")
            addPathData("M12 17v.01")
        }
        return _deviceMobileQuestion!!
    }

private var _deviceMobileQuestion: ImageVector? = null
