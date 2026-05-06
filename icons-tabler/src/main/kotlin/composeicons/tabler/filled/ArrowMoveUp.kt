package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowMoveUp: ImageVector
    get() {
        if (_arrowMoveUp != null) return _arrowMoveUp!!
        _arrowMoveUp = tablerFilledIcon(
            name = "ArrowMoveUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPathData("M11.852 2.011l.058-.007L12 2l.075 .003 .126 .017 .111 .03 .111 .044 .098 .052 .104 .074 .082 .073 3 3c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273L13 5.415v7.585c0 .552-.448 1-1 1-.552 0-1-.448-1-1v-7.585L9.707 6.707c-.356 .356-.922 .392-1.32 .083L8.293 6.707c-.39-.39-.39-1.023 0-1.414l3-3q.053-.054 .112-.097l.11-.071 .114-.054 .105-.035Z")
            addPathData("M12 16c1.657 0 3 1.343 3 3 0 1.657-1.343 3-3 3C10.343 22 9 20.657 9 19c0-1.657 1.343-3 3-3")
        }
        return _arrowMoveUp!!
    }

private var _arrowMoveUp: ImageVector? = null
