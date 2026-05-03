package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorLightIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 232.490 81.440 C 228.314 76.710 222.309 74.001 216.000 74.000 L 158.000 74.000 L 158.000 56.000 C 158.000 35.013 140.987 18.000 120.000 18.000 C 117.725 17.999 115.646 19.285 114.630 21.320 L 76.290 98.000 L 32.000 98.000 C 24.268 98.000 18.000 104.268 18.000 112.000 L 18.000 200.000 C 18.000 207.732 24.268 214.000 32.000 214.000 L 204.000 214.000 C 215.095 214.000 224.453 205.739 225.830 194.730 L 237.830 98.730 C 238.612 92.468 236.668 86.171 232.490 81.440 ZM 30.000 200.000 L 30.000 112.000 C 30.000 110.895 30.895 110.000 32.000 110.000 L 74.000 110.000 L 74.000 202.000 L 32.000 202.000 C 30.895 202.000 30.000 201.105 30.000 200.000 ZM 225.920 97.240 L 213.920 193.240 C 213.295 198.243 209.042 201.999 204.000 202.000 L 86.000 202.000 L 86.000 105.420 L 123.580 30.250 C 136.432 32.037 145.999 43.025 146.000 56.000 L 146.000 80.000 C 146.000 83.314 148.686 86.000 152.000 86.000 L 216.000 86.000 C 218.868 86.001 221.597 87.233 223.495 89.383 C 225.392 91.533 226.276 94.394 225.920 97.240 Z"),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
