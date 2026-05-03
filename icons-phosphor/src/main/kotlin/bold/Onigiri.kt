package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Onigiri: ImageVector
    get() {
        if (_onigiri != null) return _onigiri!!
        _onigiri = phosphorBoldIcon(
            name = "Onigiri",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.000 144.510 L 179.130 48.650 C 179.079 48.550 179.023 48.453 178.960 48.360 C 168.016 30.725 148.735 19.999 127.980 19.999 C 107.225 19.999 87.944 30.725 77.000 48.360 C 76.937 48.453 76.881 48.550 76.830 48.650 L 21.000 144.510 C 9.584 163.025 9.083 186.268 19.689 205.258 C 30.296 224.248 50.349 236.010 72.100 236.000 L 183.900 236.000 C 205.651 236.010 225.704 224.248 236.311 205.258 C 246.917 186.268 246.416 163.025 235.000 144.510 ZM 156.000 212.000 L 100.000 212.000 L 100.000 172.000 L 156.000 172.000 ZM 215.360 193.500 C 209.081 204.990 196.993 212.098 183.900 212.000 L 180.000 212.000 L 180.000 168.000 C 180.000 156.954 171.046 148.000 160.000 148.000 L 96.000 148.000 C 84.954 148.000 76.000 156.954 76.000 168.000 L 76.000 212.000 L 72.100 212.000 C 59.030 212.001 46.985 204.917 40.634 193.494 C 34.283 182.070 34.622 168.102 41.520 157.000 L 41.690 156.720 L 97.510 60.880 C 104.094 50.380 115.616 44.005 128.010 44.005 C 140.404 44.005 151.926 50.380 158.510 60.880 L 214.330 156.730 L 214.500 157.010 C 221.476 168.090 221.802 182.107 215.350 193.500 Z"),
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
        return _onigiri!!
    }

private var _onigiri: ImageVector? = null
