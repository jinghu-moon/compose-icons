package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.FileUnknown: ImageVector
    get() {
        if (_fileUnknown != null) return _fileUnknown!!
        _fileUnknown = tablerFilledIcon(
            name = "FileUnknown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 L 12.117 2.007 C 12.576 2.061 12.939 2.424 12.993 2.883 L 13.000 3.000 L 13.000 7.000 L 13.005 7.150 C 13.079 8.134 13.859 8.917 14.843 8.994 L 15.000 9.000 L 19.000 9.000 L 19.117 9.007 C 19.576 9.061 19.939 9.424 19.993 9.883 L 20.000 10.000 L 20.000 19.000 C 20.000 20.589 18.762 21.902 17.176 21.995 L 17.000 22.000 L 7.000 22.000 C 5.411 22.000 4.098 20.762 4.005 19.176 L 4.000 19.000 L 4.000 5.000 C 4.000 3.411 5.238 2.098 6.824 2.005 L 7.000 2.000 ZM 12.000 17.000 C 11.493 17.000 11.066 17.380 11.007 17.883 L 11.000 18.010 C 11.001 18.539 11.413 18.976 11.941 19.007 C 12.470 19.038 12.931 18.652 12.993 18.127 L 13.000 18.000 C 13.000 17.448 12.552 17.000 12.000 17.000M 13.136 11.273 C 12.106 10.748 10.850 10.998 10.099 11.877 C 9.754 12.278 9.782 12.879 10.162 13.247 C 10.542 13.615 11.143 13.623 11.533 13.266 L 11.621 13.176 C 11.771 13.000 12.022 12.949 12.229 13.054 C 12.435 13.160 12.542 13.393 12.488 13.618 C 12.433 13.843 12.232 14.001 12.000 14.000 C 11.448 13.999 11.000 14.447 10.999 14.999 C 10.998 15.551 11.446 15.999 11.998 16.000 C 13.154 16.000 14.159 15.208 14.430 14.085 C 14.700 12.961 14.165 11.798 13.135 11.273"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
    addPath(
        pathData = parseSvgPathData("M 19.000 7.000 L 15.000 7.000 L 14.999 2.999 Z"),
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
        return _fileUnknown!!
    }

private var _fileUnknown: ImageVector? = null
