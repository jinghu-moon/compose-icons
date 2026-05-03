package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveTriangle: ImageVector
    get() {
        if (_waveTriangle != null) return _waveTriangle!!
        _waveTriangle = phosphorBoldIcon(
            name = "WaveTriangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 241.730 135.000 L 189.730 207.000 C 187.474 210.125 183.854 211.977 180.000 211.977 C 176.146 211.977 172.526 210.125 170.270 207.000 L 76.000 76.500 L 33.730 135.000 C 31.321 138.710 27.065 140.794 22.657 140.422 C 18.249 140.050 14.403 137.283 12.649 133.222 C 10.896 129.161 11.518 124.464 14.270 121.000 L 66.270 49.000 C 68.526 45.875 72.146 44.023 76.000 44.023 C 79.854 44.023 83.474 45.875 85.730 49.000 L 180.000 179.500 L 222.270 121.000 C 224.679 117.290 228.935 115.206 233.343 115.578 C 237.751 115.950 241.597 118.717 243.351 122.778 C 245.104 126.839 244.482 131.536 241.730 135.000 Z"),
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
        return _waveTriangle!!
    }

private var _waveTriangle: ImageVector? = null
