package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Baby: ImageVector
    get() {
        if (_baby != null) return _baby!!
        _baby = phosphorLightIcon(
            name = "Baby",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 92.000 138.000 C 86.477 138.000 82.000 133.523 82.000 128.000 C 82.000 122.477 86.477 118.000 92.000 118.000 C 97.523 118.000 102.000 122.477 102.000 128.000 C 102.000 133.523 97.523 138.000 92.000 138.000 ZM 164.000 118.000 C 158.477 118.000 154.000 122.477 154.000 128.000 C 154.000 133.523 158.477 138.000 164.000 138.000 C 169.523 138.000 174.000 133.523 174.000 128.000 C 174.000 122.477 169.523 118.000 164.000 118.000 ZM 152.800 162.920 C 137.612 172.354 118.388 172.354 103.200 162.920 C 100.394 161.153 96.687 161.994 94.920 164.800 C 93.153 167.606 93.994 171.313 96.800 173.080 C 115.898 184.979 140.102 184.979 159.200 173.080 C 162.006 171.313 162.847 167.606 161.080 164.800 C 159.313 161.994 155.606 161.153 152.800 162.920 ZM 230.000 128.000 C 230.000 184.333 184.333 230.000 128.000 230.000 C 71.667 230.000 26.000 184.333 26.000 128.000 C 26.000 71.667 71.667 26.000 128.000 26.000 C 184.306 26.066 229.934 71.694 230.000 128.000 ZM 218.000 128.000 C 217.941 79.459 179.443 39.688 130.930 38.050 C 118.300 55.230 118.000 71.850 118.000 72.000 C 118.000 77.523 122.477 82.000 128.000 82.000 C 133.523 82.000 138.000 77.523 138.000 72.000 C 138.000 68.686 140.686 66.000 144.000 66.000 C 147.314 66.000 150.000 68.686 150.000 72.000 C 150.000 84.150 140.150 94.000 128.000 94.000 C 115.850 94.000 106.000 84.150 106.000 72.000 C 106.000 71.250 106.150 56.180 116.140 38.780 C 68.396 45.127 34.112 87.936 38.349 135.913 C 42.586 183.890 83.843 220.027 131.960 217.908 C 180.077 215.789 217.997 176.164 218.000 128.000 Z"),
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
        return _baby!!
    }

private var _baby: ImageVector? = null
