package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Heart3Line: ImageVector
    get() {
        if (_heart3Line != null) return _heart3Line!!
        _heart3Line = remixIcon(
            name = "Heart3Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.500 3.000 C 19.538 3.000 22.000 5.500 22.000 9.000 C 22.000 16.000 14.500 20.000 12.000 21.500 C 9.500 20.000 2.000 16.000 2.000 9.000 C 2.000 5.500 4.500 3.000 7.500 3.000 C 9.360 3.000 11.000 4.000 12.000 5.000 C 13.000 4.000 14.640 3.000 16.500 3.000 ZM 12.934 18.604 C 13.816 18.049 14.610 17.496 15.355 16.903 C 18.334 14.533 20.000 11.943 20.000 9.000 C 20.000 6.641 18.463 5.000 16.500 5.000 C 15.424 5.000 14.259 5.569 13.414 6.414 L 12.000 7.828 L 10.586 6.414 C 9.741 5.569 8.576 5.000 7.500 5.000 C 5.559 5.000 4.000 6.656 4.000 9.000 C 4.000 11.943 5.666 14.533 8.645 16.903 C 9.390 17.496 10.184 18.049 11.066 18.604 C 11.365 18.792 11.661 18.973 12.000 19.175 C 12.339 18.973 12.635 18.792 12.934 18.604 Z"),
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
        return _heart3Line!!
    }

private var _heart3Line: ImageVector? = null
