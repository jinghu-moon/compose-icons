package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sphere: ImageVector
    get() {
        if (_sphere != null) return _sphere!!
        _sphere = phosphorBoldIcon(
            name = "Sphere",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 128.000 20.000 C 68.353 20.000 20.000 68.353 20.000 128.000 C 20.000 187.647 68.353 236.000 128.000 236.000 C 187.647 236.000 236.000 187.647 236.000 128.000 C 235.934 68.381 187.619 20.066 128.000 20.000 ZM 212.000 127.860 C 211.440 129.270 206.300 134.970 189.120 140.190 C 183.348 141.909 177.481 143.294 171.550 144.340 C 171.850 138.900 172.000 133.430 172.000 128.000 C 172.000 100.150 168.050 71.170 159.750 50.250 C 191.272 63.157 211.900 93.798 212.000 127.860 ZM 127.860 44.000 C 129.270 44.560 134.970 49.700 140.190 66.880 C 145.190 83.480 148.000 105.190 148.000 128.000 C 148.000 134.560 147.760 141.000 147.320 147.320 C 141.030 147.760 134.560 148.000 128.000 148.000 C 105.190 148.000 83.480 145.220 66.880 140.190 C 49.700 135.000 44.560 129.270 44.000 127.860 C 44.132 81.600 81.600 44.132 127.860 44.000 ZM 50.250 159.750 C 71.170 168.050 100.150 172.000 128.000 172.000 C 133.430 172.000 138.900 171.850 144.340 171.540 C 143.295 177.475 141.910 183.345 140.190 189.120 C 135.000 206.300 129.270 211.440 127.860 212.000 C 93.798 211.900 63.157 191.272 50.250 159.750 ZM 159.750 205.750 C 163.940 195.180 167.030 182.550 169.050 169.050 C 182.550 167.050 195.180 163.940 205.750 159.750 C 197.178 180.613 180.613 197.178 159.750 205.750 Z"),
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
        return _sphere!!
    }

private var _sphere: ImageVector? = null
