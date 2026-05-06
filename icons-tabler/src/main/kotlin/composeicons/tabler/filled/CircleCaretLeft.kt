package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleCaretLeft: ImageVector
    get() {
        if (_circleCaretLeft != null) return _circleCaretLeft!!
        _circleCaretLeft = tablerFilledIcon(
            name = "CircleCaretLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M14 15v-6c0-.405-.243-.769-.617-.924-.374-.155-.804-.07-1.09 .216l-3 3c-.188 .188-.293 .442-.293 .708 0 .265 .106 .52 .293 .707l3 3c.391 .39 1.023 .39 1.414 0l.083-.094C13.93 15.433 14 15.217 14 15"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _circleCaretLeft!!
    }

private var _circleCaretLeft: ImageVector? = null
