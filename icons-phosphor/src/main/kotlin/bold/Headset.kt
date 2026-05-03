package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = phosphorBoldIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 204.730 51.850 C 173.880 20.802 127.349 11.429 86.883 28.109 C 46.418 44.790 20.009 84.231 20.000 128.000 L 20.000 184.000 C 20.000 199.464 32.536 212.000 48.000 212.000 L 64.000 212.000 C 79.464 212.000 92.000 199.464 92.000 184.000 L 92.000 144.000 C 92.000 128.536 79.464 116.000 64.000 116.000 L 44.840 116.000 C 50.827 74.675 86.243 44.011 128.000 44.000 L 128.640 44.000 C 170.210 44.178 205.350 74.838 211.160 116.000 L 192.000 116.000 C 176.536 116.000 164.000 128.536 164.000 144.000 L 164.000 184.000 C 164.000 199.464 176.536 212.000 192.000 212.000 L 211.600 212.000 C 209.699 221.313 201.505 228.002 192.000 228.000 L 136.000 228.000 C 129.373 228.000 124.000 233.373 124.000 240.000 C 124.000 246.627 129.373 252.000 136.000 252.000 L 192.000 252.000 C 216.289 251.972 235.972 232.289 236.000 208.000 L 236.000 128.000 C 236.111 99.470 224.859 72.069 204.730 51.850 ZM 64.000 140.000 C 66.209 140.000 68.000 141.791 68.000 144.000 L 68.000 184.000 C 68.000 186.209 66.209 188.000 64.000 188.000 L 48.000 188.000 C 45.791 188.000 44.000 186.209 44.000 184.000 L 44.000 140.000 ZM 188.000 184.000 L 188.000 144.000 C 188.000 141.791 189.791 140.000 192.000 140.000 L 212.000 140.000 L 212.000 188.000 L 192.000 188.000 C 189.791 188.000 188.000 186.209 188.000 184.000 Z"),
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
        return _headset!!
    }

private var _headset: ImageVector? = null
