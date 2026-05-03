package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Shower: ImageVector
    get() {
        if (_shower != null) return _shower!!
        _shower = phosphorFillIcon(
            name = "Shower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 64.000 236.000 C 64.000 242.627 58.627 248.000 52.000 248.000 C 45.373 248.000 40.000 242.627 40.000 236.000 C 40.000 229.373 45.373 224.000 52.000 224.000 C 58.627 224.000 64.000 229.373 64.000 236.000 ZM 84.000 192.000 C 77.373 192.000 72.000 197.373 72.000 204.000 C 72.000 210.627 77.373 216.000 84.000 216.000 C 90.627 216.000 96.000 210.627 96.000 204.000 C 96.000 197.373 90.627 192.000 84.000 192.000 ZM 20.000 192.000 C 13.373 192.000 8.000 197.373 8.000 204.000 C 8.000 210.627 13.373 216.000 20.000 216.000 C 26.627 216.000 32.000 210.627 32.000 204.000 C 32.000 197.373 26.627 192.000 20.000 192.000 ZM 52.000 160.000 C 45.373 160.000 40.000 165.373 40.000 172.000 C 40.000 178.627 45.373 184.000 52.000 184.000 C 58.627 184.000 64.000 178.627 64.000 172.000 C 64.000 165.373 58.627 160.000 52.000 160.000 ZM 248.000 32.000 L 216.000 32.000 C 213.878 31.998 211.842 32.840 210.340 34.340 L 180.140 64.540 L 53.380 86.190 C 47.465 87.172 42.596 91.379 40.765 97.088 C 38.935 102.798 40.449 109.051 44.690 113.290 L 142.690 211.290 C 146.925 215.524 153.170 217.038 158.874 215.215 C 164.578 213.391 168.786 208.535 169.780 202.630 L 191.460 75.860 L 219.310 48.000 L 248.000 48.000 C 252.418 48.000 256.000 44.418 256.000 40.000 C 256.000 35.582 252.418 32.000 248.000 32.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _shower!!
    }

private var _shower: ImageVector? = null
