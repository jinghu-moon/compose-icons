package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Gif: ImageVector
    get() {
        if (_gif != null) return _gif!!
        _gif = phosphorBoldIcon(
            name = "Gif",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 148.000 72.000 L 148.000 184.000 C 148.000 190.627 142.627 196.000 136.000 196.000 C 129.373 196.000 124.000 190.627 124.000 184.000 L 124.000 72.000 C 124.000 65.373 129.373 60.000 136.000 60.000 C 142.627 60.000 148.000 65.373 148.000 72.000 ZM 232.000 84.000 C 238.627 84.000 244.000 78.627 244.000 72.000 C 244.000 65.373 238.627 60.000 232.000 60.000 L 176.000 60.000 C 169.373 60.000 164.000 65.373 164.000 72.000 L 164.000 184.000 C 164.000 190.627 169.373 196.000 176.000 196.000 C 182.627 196.000 188.000 190.627 188.000 184.000 L 188.000 140.000 L 224.000 140.000 C 230.627 140.000 236.000 134.627 236.000 128.000 C 236.000 121.373 230.627 116.000 224.000 116.000 L 188.000 116.000 L 188.000 84.000 ZM 96.000 116.000 L 72.000 116.000 C 65.373 116.000 60.000 121.373 60.000 128.000 C 60.000 134.627 65.373 140.000 72.000 140.000 L 84.000 140.000 L 84.000 152.000 C 84.000 163.046 75.046 172.000 64.000 172.000 C 52.954 172.000 44.000 163.046 44.000 152.000 L 44.000 104.000 C 44.000 92.954 52.954 84.000 64.000 84.000 C 73.420 84.000 82.180 90.450 84.380 99.000 C 86.037 105.418 92.582 109.277 99.000 107.620 C 105.418 105.963 109.277 99.418 107.620 93.000 C 102.700 73.880 84.350 60.000 64.000 60.000 C 39.711 60.028 20.028 79.711 20.000 104.000 L 20.000 152.000 C 20.000 176.301 39.699 196.000 64.000 196.000 C 88.301 196.000 108.000 176.301 108.000 152.000 L 108.000 128.000 C 108.000 121.373 102.627 116.000 96.000 116.000 Z"),
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
        return _gif!!
    }

private var _gif: ImageVector? = null
