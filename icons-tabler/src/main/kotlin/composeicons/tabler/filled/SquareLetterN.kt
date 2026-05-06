package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterN: ImageVector
    get() {
        if (_squareLetterN != null) return _squareLetterN!!
        _squareLetterN = tablerFilledIcon(
            name = "SquareLetterN",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 2c1.657 0 3 1.343 3 3v14c0 1.657-1.343 3-3 3h-14C3.343 22 2 20.657 2 19v-14C2 3.343 3.343 2 5 2ZM10.894 7.553C10.423 6.609 9 6.945 9 8v8c0 .552 .448 1 1 1l.117-.007c.503-.059 .883-.486 .883-.993v-3.764l2.106 4.211C13.577 17.391 15 17.055 15 16v-8C15 7.448 14.552 7 14 7l-.117 .007C13.38 7.066 13 7.493 13 8v3.764Z"),
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
        return _squareLetterN!!
    }

private var _squareLetterN: ImageVector? = null
