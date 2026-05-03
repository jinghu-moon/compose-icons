package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.AlignBoxTopCenter: ImageVector
    get() {
        if (_alignBoxTopCenter != null) return _alignBoxTopCenter!!
        _alignBoxTopCenter = tablerFilledIcon(
            name = "AlignBoxTopCenter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.333 2.000 C 20.293 2.000 21.893 3.537 21.995 5.472 L 22.000 5.667 L 22.000 18.333 C 22.000 20.293 20.463 21.893 18.528 21.995 L 18.333 22.000 L 5.667 22.000 C 3.717 22.000 2.109 20.475 2.005 18.528 L 2.000 18.333 L 2.000 5.667 C 2.000 3.707 3.537 2.107 5.472 2.005 L 5.667 2.000 L 18.333 2.000 ZM 12.000 5.000 C 11.448 5.000 11.000 5.448 11.000 6.000 L 11.000 12.000 L 11.007 12.117 C 11.069 12.642 11.530 13.028 12.059 12.997 C 12.587 12.966 12.999 12.529 13.000 12.000 L 13.000 6.000 L 12.993 5.883 C 12.934 5.380 12.507 5.000 12.000 5.000 ZM 15.000 5.000 C 14.448 5.000 14.000 5.448 14.000 6.000 L 14.000 10.000 L 14.007 10.117 C 14.069 10.642 14.530 11.028 15.059 10.997 C 15.587 10.966 15.999 10.529 16.000 10.000 L 16.000 6.000 L 15.993 5.883 C 15.934 5.380 15.507 5.000 15.000 5.000 ZM 9.000 5.000 C 8.448 5.000 8.000 5.448 8.000 6.000 L 8.000 8.000 L 8.007 8.117 C 8.069 8.642 8.530 9.028 9.059 8.997 C 9.587 8.966 9.999 8.529 10.000 8.000 L 10.000 6.000 L 9.993 5.883 C 9.934 5.380 9.507 5.000 9.000 5.000 Z"),
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
        return _alignBoxTopCenter!!
    }

private var _alignBoxTopCenter: ImageVector? = null
