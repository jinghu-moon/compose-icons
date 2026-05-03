package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NumberSquareSix: ImageVector
    get() {
        if (_numberSquareSix != null) return _numberSquareSix!!
        _numberSquareSix = phosphorLightIcon(
            name = "NumberSquareSix",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 208.000 34.000 L 48.000 34.000 C 40.268 34.000 34.000 40.268 34.000 48.000 L 34.000 208.000 C 34.000 215.732 40.268 222.000 48.000 222.000 L 208.000 222.000 C 215.732 222.000 222.000 215.732 222.000 208.000 L 222.000 48.000 C 222.000 40.268 215.732 34.000 208.000 34.000 ZM 210.000 208.000 C 210.000 209.105 209.105 210.000 208.000 210.000 L 48.000 210.000 C 46.895 210.000 46.000 209.105 46.000 208.000 L 46.000 48.000 C 46.000 46.895 46.895 46.000 48.000 46.000 L 208.000 46.000 C 209.105 46.000 210.000 46.895 210.000 48.000 ZM 128.000 114.000 C 126.124 114.004 124.251 114.161 122.400 114.470 L 141.150 83.080 C 142.851 80.236 141.924 76.551 139.080 74.850 C 136.236 73.149 132.551 74.076 130.850 76.920 L 98.610 130.920 C 90.875 144.234 93.053 161.085 103.919 171.994 C 114.786 182.904 131.628 185.148 144.972 177.466 C 158.317 169.783 164.832 154.092 160.854 139.216 C 156.876 124.341 143.398 113.996 128.000 114.000 ZM 128.000 170.000 C 115.850 170.000 106.000 160.150 106.000 148.000 C 106.000 135.850 115.850 126.000 128.000 126.000 C 140.150 126.000 150.000 135.850 150.000 148.000 C 150.000 160.150 140.150 170.000 128.000 170.000 Z"),
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
        return _numberSquareSix!!
    }

private var _numberSquareSix: ImageVector? = null
