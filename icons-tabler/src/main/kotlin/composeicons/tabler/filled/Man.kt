package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Man: ImageVector
    get() {
        if (_man != null) return _man!!
        _man = tablerFilledIcon(
            name = "Man",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M15 8c1.628 0 3.2 .787 4.707 2.293 .379 .392 .374 1.016-.012 1.402-.386 .386-1.009 .391-1.402 .012-.848-.848-1.662-1.369-2.444-1.587L15 16.064v4.936c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-4h-2v4c0 .552-.448 1-1 1C9.448 22 9 21.552 9 21v-4.929L8.15 10.12c-.781 .218-1.595 .739-2.443 1.587-.251 .26-.623 .364-.973 .273-.35-.092-.623-.365-.714-.714-.092-.35 .013-.721 .273-.973C5.799 8.787 7.373 8 9 8Z")
            addPathData("M12 1c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3C10.343 7 9 5.657 9 4l.005-.176C9.098 2.238 10.411 1 12 1")
        }
        return _man!!
    }

private var _man: ImageVector? = null
