package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.ArrowUpSquare: ImageVector
    get() {
        if (_arrowUpSquare != null) return _arrowUpSquare!!
        _arrowUpSquare = tablerFilledIcon(
            name = "ArrowUpSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.852 2.011l.058-.007L12 2l.075 .003 .126 .017 .111 .03 .111 .044 .098 .052 .104 .074 .082 .073 3 3c.26 .251 .364 .623 .273 .973-.092 .35-.365 .623-.714 .714-.35 .092-.721-.013-.973-.273L13 5.415v10.585h1c.552 0 1 .448 1 1v4c0 .552-.448 1-1 1h-4C9.448 22 9 21.552 9 21v-4c0-.552 .448-1 1-1h1v-10.585L9.707 6.707c-.356 .356-.922 .392-1.32 .083L8.293 6.707c-.39-.39-.39-1.023 0-1.414l3-3q.053-.054 .112-.097l.11-.071 .114-.054 .105-.035Z"),
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
        return _arrowUpSquare!!
    }

private var _arrowUpSquare: ImageVector? = null
