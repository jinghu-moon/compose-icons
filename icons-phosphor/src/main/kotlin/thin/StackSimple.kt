package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.StackSimple: ImageVector
    get() {
        if (_stackSimple != null) return _stackSimple!!
        _stackSimple = phosphorThinIcon(
            name = "StackSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 14.000 107.470 L 126.000 171.470 C 127.238 172.185 128.762 172.185 130.000 171.470 L 242.000 107.470 C 243.243 106.757 244.010 105.433 244.010 104.000 C 244.010 102.567 243.243 101.243 242.000 100.530 L 130.000 36.530 C 128.762 35.815 127.238 35.815 126.000 36.530 L 14.000 100.530 C 12.757 101.243 11.990 102.567 11.990 104.000 C 11.990 105.433 12.757 106.757 14.000 107.470 ZM 128.000 44.610 L 231.940 104.000 L 128.000 163.390 L 24.060 104.000 ZM 243.470 142.000 C 244.561 143.917 243.894 146.355 241.980 147.450 L 129.980 211.450 C 128.742 212.165 127.218 212.165 125.980 211.450 L 13.980 147.450 C 12.064 146.345 11.405 143.896 12.510 141.980 C 13.615 140.064 16.064 139.405 17.980 140.510 L 127.980 203.370 L 237.980 140.510 C 238.904 139.973 240.005 139.829 241.036 140.109 C 242.067 140.389 242.944 141.070 243.470 142.000 Z"),
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
        return _stackSimple!!
    }

private var _stackSimple: ImageVector? = null
