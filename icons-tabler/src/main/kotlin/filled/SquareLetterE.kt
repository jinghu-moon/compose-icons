package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterE: ImageVector
    get() {
        if (_squareLetterE != null) return _squareLetterE!!
        _squareLetterE = tablerFilledIcon(
            name = "SquareLetterE",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 14.000 7.000 L 10.000 7.000 C 9.448 7.000 9.000 7.448 9.000 8.000 L 9.000 16.000 C 9.000 16.552 9.448 17.000 10.000 17.000 L 14.000 17.000 C 14.552 17.000 15.000 16.552 15.000 16.000 L 14.993 15.883 C 14.934 15.380 14.507 15.000 14.000 15.000 L 11.000 15.000 L 11.000 13.000 L 12.500 13.000 C 13.007 13.000 13.434 12.620 13.493 12.117 L 13.500 12.000 C 13.500 11.448 13.052 11.000 12.500 11.000 L 11.000 11.000 L 11.000 9.000 L 14.000 9.000 C 14.552 9.000 15.000 8.552 15.000 8.000 C 15.000 7.448 14.552 7.000 14.000 7.000"),
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
        return _squareLetterE!!
    }

private var _squareLetterE: ImageVector? = null
