package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Shower: ImageVector
    get() {
        if (_shower != null) return _shower!!
        _shower = phosphorDuotoneIcon(
            name = "Shower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    group(
        groupAlpha = 0.20000000298023224f,
    ) {
        addPath(
            pathData = parseSvgPathData("M 184.000 72.000 L 161.910 201.310 C 161.415 204.262 159.313 206.691 156.462 207.605 C 153.611 208.518 150.489 207.764 148.370 205.650 L 50.370 107.650 C 48.256 105.531 47.502 102.409 48.415 99.558 C 49.329 96.707 51.758 94.605 54.710 94.110 Z"),
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
    addPath(
        pathData = parseSvgPathData("M 64.000 236.000 C 64.000 242.627 58.627 248.000 52.000 248.000 C 45.373 248.000 40.000 242.627 40.000 236.000 C 40.000 229.373 45.373 224.000 52.000 224.000 C 58.627 224.000 64.000 229.373 64.000 236.000 ZM 84.000 192.000 C 77.373 192.000 72.000 197.373 72.000 204.000 C 72.000 210.627 77.373 216.000 84.000 216.000 C 90.627 216.000 96.000 210.627 96.000 204.000 C 96.000 197.373 90.627 192.000 84.000 192.000 ZM 20.000 192.000 C 13.373 192.000 8.000 197.373 8.000 204.000 C 8.000 210.627 13.373 216.000 20.000 216.000 C 26.627 216.000 32.000 210.627 32.000 204.000 C 32.000 197.373 26.627 192.000 20.000 192.000 ZM 52.000 160.000 C 45.373 160.000 40.000 165.373 40.000 172.000 C 40.000 178.627 45.373 184.000 52.000 184.000 C 58.627 184.000 64.000 178.627 64.000 172.000 C 64.000 165.373 58.627 160.000 52.000 160.000 ZM 256.000 40.000 C 256.000 44.418 252.418 48.000 248.000 48.000 L 219.310 48.000 L 191.460 75.860 L 169.800 202.650 C 168.806 208.555 164.598 213.411 158.894 215.235 C 153.190 217.058 146.945 215.544 142.710 211.310 L 44.710 113.310 C 40.469 109.071 38.955 102.818 40.785 97.108 C 42.616 91.399 47.485 87.192 53.400 86.210 L 180.140 64.540 L 210.340 34.340 C 211.842 32.840 213.878 31.998 216.000 32.000 L 248.000 32.000 C 252.418 32.000 256.000 35.582 256.000 40.000 ZM 174.210 81.790 L 56.000 102.000 L 154.000 200.000 Z"),
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
        return _shower!!
    }

private var _shower: ImageVector? = null
