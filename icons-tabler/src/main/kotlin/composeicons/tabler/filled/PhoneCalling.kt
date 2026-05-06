package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.PhoneCalling: ImageVector
    get() {
        if (_phoneCalling != null) return _phoneCalling!!
        _phoneCalling = tablerFilledIcon(
            name = "PhoneCalling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M9.928 3.629l2 5c.182 .455 .006 .976-.414 1.228L9.844 10.86c.821 1.346 1.951 2.476 3.296 3.297l1.003-1.671c.252-.42 .773-.596 1.228-.414l5 2c.38 .152 .629 .519 .629 .928v4c0 1.657-1.343 3-3.06 2.998C9.361 21.477 2.522 14.638 2 6 2 4.343 3.343 3 5 3h4c.409 0 .776 .249 .928 .629")
            addPathData("M16 7v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01c0-.552 .448-1 1-1 .552 0 1 .448 1 1")
            addPathData("M19 7v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01c0-.552 .448-1 1-1 .552 0 1 .448 1 1")
            addPathData("M22 7v.01c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-.01c0-.552 .448-1 1-1 .552 0 1 .448 1 1")
        }
        return _phoneCalling!!
    }

private var _phoneCalling: ImageVector? = null
