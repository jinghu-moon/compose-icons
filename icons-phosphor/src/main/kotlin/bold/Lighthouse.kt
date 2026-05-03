package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Lighthouse: ImageVector
    get() {
        if (_lighthouse != null) return _lighthouse!!
        _lighthouse = phosphorBoldIcon(
            name = "Lighthouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 220.000 84.000 C 213.373 84.000 208.000 89.373 208.000 96.000 L 208.000 104.000 L 192.870 104.000 L 187.940 54.800 C 187.654 51.797 186.247 49.012 184.000 47.000 L 141.100 8.890 L 140.800 8.640 C 133.384 2.463 122.616 2.463 115.200 8.640 L 114.900 8.890 L 72.000 47.000 C 69.740 48.993 68.312 51.763 68.000 54.760 L 63.130 104.000 L 48.000 104.000 L 48.000 96.000 C 48.000 89.373 42.627 84.000 36.000 84.000 C 29.373 84.000 24.000 89.373 24.000 96.000 L 24.000 116.000 C 24.000 122.627 29.373 128.000 36.000 128.000 L 60.720 128.000 L 52.090 214.100 C 51.555 219.709 53.411 225.284 57.201 229.454 C 60.992 233.623 66.365 236.000 72.000 236.000 L 184.000 236.000 C 189.643 235.999 195.022 233.614 198.812 229.433 C 202.602 225.253 204.450 219.666 203.900 214.050 L 195.280 128.000 L 220.000 128.000 C 226.627 128.000 232.000 122.627 232.000 116.000 L 232.000 96.000 C 232.000 89.373 226.627 84.000 220.000 84.000 ZM 128.000 29.360 L 144.460 44.000 L 111.540 44.000 ZM 90.860 68.000 L 165.140 68.000 L 168.750 104.000 L 140.000 104.000 L 140.000 96.000 C 140.000 89.373 134.627 84.000 128.000 84.000 C 121.373 84.000 116.000 89.373 116.000 96.000 L 116.000 104.000 L 87.250 104.000 ZM 76.420 212.000 L 79.630 180.000 L 176.370 180.000 L 179.580 212.000 ZM 174.000 156.000 L 82.000 156.000 L 84.800 128.000 L 171.120 128.000 Z"),
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
        return _lighthouse!!
    }

private var _lighthouse: ImageVector? = null
