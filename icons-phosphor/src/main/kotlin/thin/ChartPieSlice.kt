package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorThinIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 100.000 109.500 L 100.000 37.500 C 99.999 36.203 99.369 34.986 98.310 34.237 C 97.251 33.487 95.894 33.299 94.670 33.730 C 48.275 50.130 20.706 97.845 29.670 146.230 C 29.898 147.513 30.735 148.604 31.916 149.155 C 33.096 149.706 34.470 149.649 35.600 149.000 L 98.000 113.000 C 99.249 112.279 100.013 110.942 100.000 109.500 ZM 92.000 107.190 L 36.670 139.110 C 31.723 98.426 54.284 59.376 92.000 43.340 ZM 128.000 28.000 C 125.791 28.000 124.000 29.791 124.000 32.000 L 124.000 126.120 L 43.200 173.180 C 42.280 173.716 41.612 174.597 41.343 175.628 C 41.075 176.658 41.228 177.753 41.770 178.670 C 66.309 220.422 117.240 238.589 162.664 221.793 C 208.088 204.997 234.947 158.065 226.420 110.392 C 217.893 62.719 176.430 28.009 128.000 28.000 ZM 128.000 220.000 C 96.826 219.912 67.795 204.121 50.780 178.000 L 130.000 131.880 C 131.236 131.166 131.999 129.848 132.000 128.420 L 132.000 36.090 C 181.955 38.301 220.998 80.008 219.910 130.001 C 218.823 179.993 178.004 219.963 128.000 220.000 Z"),
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
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
