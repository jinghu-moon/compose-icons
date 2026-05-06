package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterZ: ImageVector
    get() {
        if (_squareLetterZ != null) return _squareLetterZ!!
        _squareLetterZ = tablerFilledIcon(
            name = "SquareLetterZ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM14 7h-4C9.448 7 9 7.448 9 8l.007 .117c.059 .503 .486 .883 .993 .883h2.382L9.106 15.553c-.155 .31-.138 .678 .044 .973 .182 .295 .504 .474 .85 .474h4c.552 0 1-.448 1-1l-.007-.117C14.934 15.38 14.507 15 14 15h-2.382L14.894 8.447c.155-.31 .138-.678-.044-.973C14.668 7.18 14.346 7 14 7"),
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
        return _squareLetterZ!!
    }

private var _squareLetterZ: ImageVector? = null
