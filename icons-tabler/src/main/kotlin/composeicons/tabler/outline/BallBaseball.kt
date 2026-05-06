package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BallBaseball: ImageVector
    get() {
        if (_ballBaseball != null) return _ballBaseball!!
        _ballBaseball = tablerOutlineIcon(
            name = "BallBaseball",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M5.636 18.364c3.515 3.515 9.213 3.515 12.728 0 3.515-3.515 3.515-9.213 0-12.728C14.849 2.121 9.151 2.121 5.636 5.636c-3.515 3.515-3.515 9.213 0 12.728")
            addPathData("M12.495 3.02c.139 2.553-.815 5.044-2.623 6.852C8.064 11.68 5.573 12.634 3.02 12.495")
            addPathData("M20.98 11.505c-2.553-.139-5.044 .815-6.852 2.623-1.808 1.808-2.761 4.299-2.623 6.852")
            addPathData("M9 9l2 2")
            addPathData("M13 13l2 2")
            addPathData("M11 7l2 1")
            addPathData("M7 11l1 2")
            addPathData("M16 11l1 2")
            addPathData("M11 16l2 1")
        }
        return _ballBaseball!!
    }

private var _ballBaseball: ImageVector? = null
