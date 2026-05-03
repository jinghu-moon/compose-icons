package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.MapTrifold: ImageVector
    get() {
        if (_mapTrifold != null) return _mapTrifold!!
        _mapTrifold = phosphorLightIcon(
            name = "MapTrifold",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 227.690 51.270 C 226.233 50.133 224.333 49.731 222.540 50.180 L 160.700 65.640 L 98.700 34.640 C 97.418 34.001 95.949 33.841 94.560 34.190 L 30.560 50.190 C 27.887 50.851 26.007 53.246 26.000 56.000 L 26.000 200.000 C 26.000 201.849 26.852 203.594 28.309 204.731 C 29.767 205.868 31.667 206.270 33.460 205.820 L 95.300 190.360 L 157.300 221.360 C 158.582 221.999 160.051 222.159 161.440 221.810 L 225.440 205.810 C 228.113 205.149 229.993 202.754 230.000 200.000 L 230.000 56.000 C 230.000 54.152 229.147 52.407 227.690 51.270 ZM 102.000 49.710 L 154.000 75.710 L 154.000 206.290 L 102.000 180.290 ZM 38.000 60.710 L 90.000 47.710 L 90.000 179.320 L 38.000 192.320 ZM 218.000 195.320 L 166.000 208.320 L 166.000 76.680 L 218.000 63.680 Z"),
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
        return _mapTrifold!!
    }

private var _mapTrifold: ImageVector? = null
