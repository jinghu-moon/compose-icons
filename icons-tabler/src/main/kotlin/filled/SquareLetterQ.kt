package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.SquareLetterQ: ImageVector
    get() {
        if (_squareLetterQ != null) return _squareLetterQ!!
        _squareLetterQ = tablerFilledIcon(
            name = "SquareLetterQ",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 12.000 7.000 C 10.343 7.000 9.000 8.343 9.000 10.000 L 9.000 14.000 C 9.000 15.006 9.504 15.945 10.342 16.501 C 11.180 17.057 12.241 17.156 13.168 16.764 L 13.293 16.707 C 13.685 17.086 14.309 17.081 14.695 16.695 C 15.081 16.309 15.086 15.685 14.707 15.293 L 14.764 15.168 C 14.920 14.798 15.000 14.401 15.000 14.000 L 15.000 10.000 C 15.000 8.343 13.657 7.000 12.000 7.000M 13.000 14.001 L 12.941 14.001 C 12.411 14.030 11.997 14.470 12.000 15.001 C 11.735 15.001 11.480 14.896 11.293 14.708 C 11.105 14.520 11.000 14.265 11.000 14.000 L 11.000 10.000 C 11.000 9.448 11.448 9.000 12.000 9.000 C 12.552 9.000 13.000 9.448 13.000 10.000 Z"),
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
        return _squareLetterQ!!
    }

private var _squareLetterQ: ImageVector? = null
