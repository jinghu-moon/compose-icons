package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterG: ImageVector
    get() {
        if (_squareLetterG != null) return _squareLetterG!!
        _squareLetterG = tablerFilledIcon(
            name = "SquareLetterG",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 14.000 7.000 L 12.000 7.000 C 10.343 7.000 9.000 8.343 9.000 10.000 L 9.000 14.000 C 9.000 15.657 10.343 17.000 12.000 17.000 L 14.000 17.000 C 14.552 17.000 15.000 16.552 15.000 16.000 L 15.000 12.000 C 15.000 11.448 14.552 11.000 14.000 11.000 L 13.000 11.000 C 12.448 11.000 12.000 11.448 12.000 12.000 L 12.007 12.117 C 12.066 12.620 12.493 13.000 13.000 13.000 L 13.000 15.000 L 12.000 15.000 C 11.448 15.000 11.000 14.552 11.000 14.000 L 11.000 10.000 C 11.000 9.448 11.448 9.000 12.000 9.000 L 14.000 9.000 C 14.552 9.000 15.000 8.552 15.000 8.000 C 15.000 7.448 14.552 7.000 14.000 7.000"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _squareLetterG!!
    }

private var _squareLetterG: ImageVector? = null
