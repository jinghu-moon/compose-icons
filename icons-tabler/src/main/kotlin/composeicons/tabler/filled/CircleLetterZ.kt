package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.CircleLetterZ: ImageVector
    get() {
        if (_circleLetterZ != null) return _circleLetterZ!!
        _circleLetterZ = tablerFilledIcon(
            name = "CircleLetterZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2M14 7h-4C9.448 7 9 7.448 9 8l.007 .117c.059 .503 .486 .883 .993 .883h2.382L9.106 15.553c-.155 .31-.138 .678 .044 .973 .182 .295 .504 .474 .85 .474h4c.552 0 1-.448 1-1l-.007-.117C14.934 15.38 14.507 15 14 15h-2.382L14.894 8.447c.155-.31 .138-.678-.044-.973C14.668 7.18 14.346 7 14 7"),
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
        return _circleLetterZ!!
    }

private var _circleLetterZ: ImageVector? = null
