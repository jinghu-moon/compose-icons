package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockQuestion: ImageVector
    get() {
        if (_clockQuestion != null) return _clockQuestion!!
        _clockQuestion = tablerOutlineIcon(
            name = "ClockQuestion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M20.975 11.33C20.686 7.457 17.944 4.206 14.176 3.267 10.407 2.328 6.461 3.913 4.389 7.198c-2.073 3.285-1.804 7.528 .665 10.526 2.47 2.998 6.584 4.073 10.204 2.667")
            addPathData("M12 7v5l2 2")
            addPathData("M19 22v.01")
            addPathData("M19 19c.923-.003 1.724-.636 1.941-1.532 .217-.897-.207-1.826-1.027-2.25-.819-.42-1.819-.219-2.414 .483")
        }
        return _clockQuestion!!
    }

private var _clockQuestion: ImageVector? = null
