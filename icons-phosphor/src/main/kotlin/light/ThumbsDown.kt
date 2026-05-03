package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThumbsDown: ImageVector
    get() {
        if (_thumbsDown != null) return _thumbsDown!!
        _thumbsDown = phosphorLightIcon(
            name = "ThumbsDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 237.830 157.270 L 225.830 61.270 C 224.453 50.261 215.095 42.000 204.000 42.000 L 32.000 42.000 C 24.268 42.000 18.000 48.268 18.000 56.000 L 18.000 144.000 C 18.000 151.732 24.268 158.000 32.000 158.000 L 76.290 158.000 L 114.630 234.680 C 115.646 236.715 117.725 238.001 120.000 238.000 C 140.987 238.000 158.000 220.987 158.000 200.000 L 158.000 182.000 L 216.000 182.000 C 222.311 182.000 228.317 179.290 232.493 174.559 C 236.670 169.828 238.613 163.532 237.830 157.270 ZM 74.000 146.000 L 32.000 146.000 C 30.895 146.000 30.000 145.105 30.000 144.000 L 30.000 56.000 C 30.000 54.895 30.895 54.000 32.000 54.000 L 74.000 54.000 ZM 223.500 166.620 C 221.609 168.782 218.872 170.016 216.000 170.000 L 152.000 170.000 C 148.686 170.000 146.000 172.686 146.000 176.000 L 146.000 200.000 C 145.999 212.975 136.432 223.963 123.580 225.750 L 86.000 150.580 L 86.000 54.000 L 204.000 54.000 C 209.042 54.001 213.295 57.757 213.920 62.760 L 225.920 158.760 C 226.293 161.607 225.409 164.476 223.500 166.620 Z"),
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
        return _thumbsDown!!
    }

private var _thumbsDown: ImageVector? = null
