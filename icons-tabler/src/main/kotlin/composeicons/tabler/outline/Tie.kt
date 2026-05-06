package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tie: ImageVector
    get() {
        if (_tie != null) return _tie!!
        _tie = tablerOutlineIcon(
            name = "Tie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M12 22l4-4L13.5 7l.993-2.649c.115-.307 .072-.651-.114-.92C14.192 3.161 13.885 3 13.557 3h-3.114c-.328 0-.635 .161-.822 .431-.187 .27-.229 .613-.114 .92L10.5 7 8 18l4 4")
            addPathData("M10.5 7h3l5 5.5")
        }
        return _tie!!
    }

private var _tie: ImageVector? = null
