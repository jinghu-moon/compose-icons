package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Exposure: ImageVector
    get() {
        if (_exposure != null) return _exposure!!
        _exposure = tablerFilledIcon(
            name = "Exposure",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 2.000 C 20.657 2.000 22.000 3.343 22.000 5.000 L 22.000 19.000 C 22.000 20.657 20.657 22.000 19.000 22.000 L 5.000 22.000 C 3.343 22.000 2.000 20.657 2.000 19.000 L 2.000 5.000 C 2.000 3.343 3.343 2.000 5.000 2.000 ZM 19.000 4.000 L 5.000 4.000 C 4.448 4.000 4.000 4.448 4.000 5.000 L 4.000 19.000 C 4.000 19.290 4.123 19.550 4.321 19.732 L 5.931 18.148 C 8.172 15.934 10.402 13.709 12.621 11.473 L 19.715 4.300 C 19.527 4.108 19.269 4.000 19.000 4.000M 18.000 15.000 L 14.000 15.000 C 13.448 15.000 13.000 15.448 13.000 16.000 C 13.000 16.552 13.448 17.000 14.000 17.000 L 18.000 17.000 C 18.552 17.000 19.000 16.552 19.000 16.000 C 19.000 15.448 18.552 15.000 18.000 15.000M 8.000 5.000 C 8.552 5.000 9.000 5.448 9.000 6.000 L 9.000 7.000 L 10.000 7.000 C 10.507 7.000 10.934 7.380 10.993 7.883 L 11.000 8.000 C 11.000 8.552 10.552 9.000 10.000 9.000 L 9.000 9.000 L 9.000 10.000 C 9.000 10.507 8.620 10.934 8.117 10.993 L 8.000 11.000 C 7.448 11.000 7.000 10.552 7.000 10.000 L 7.000 9.000 L 6.000 9.000 C 5.493 9.000 5.066 8.620 5.007 8.117 L 5.000 8.000 C 5.000 7.448 5.448 7.000 6.000 7.000 L 7.000 7.000 L 7.000 6.000 C 7.000 5.493 7.380 5.066 7.883 5.007 Z"),
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
        return _exposure!!
    }

private var _exposure: ImageVector? = null
