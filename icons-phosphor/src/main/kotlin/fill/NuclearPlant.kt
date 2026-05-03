package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NuclearPlant: ImageVector
    get() {
        if (_nuclearPlant != null) return _nuclearPlant!!
        _nuclearPlant = phosphorFillIcon(
            name = "NuclearPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 152.000 32.000 L 176.000 32.000 C 180.418 32.000 184.000 28.418 184.000 24.000 C 184.000 19.582 187.582 16.000 192.000 16.000 C 196.418 16.000 200.000 19.582 200.000 24.000 C 200.000 37.255 189.255 48.000 176.000 48.000 L 152.000 48.000 C 147.582 48.000 144.000 51.582 144.000 56.000 C 144.000 60.418 140.418 64.000 136.000 64.000 C 131.582 64.000 128.000 60.418 128.000 56.000 C 128.000 42.745 138.745 32.000 152.000 32.000 ZM 104.000 64.000 C 108.418 64.000 112.000 60.418 112.000 56.000 C 112.000 33.909 129.909 16.000 152.000 16.000 L 160.000 16.000 C 164.418 16.000 168.000 12.418 168.000 8.000 C 168.000 3.582 164.418 0.000 160.000 0.000 L 152.000 0.000 C 121.086 0.033 96.033 25.086 96.000 56.000 C 96.000 60.418 99.582 64.000 104.000 64.000 ZM 248.000 216.000 C 248.000 220.418 244.418 224.000 240.000 224.000 L 16.000 224.000 C 11.582 224.000 8.000 220.418 8.000 216.000 C 8.000 211.582 11.582 208.000 16.000 208.000 L 32.740 208.000 C 46.510 180.170 62.220 139.310 63.860 95.340 C 64.168 86.745 71.250 79.951 79.850 80.000 L 168.180 80.000 C 176.743 79.991 183.795 86.726 184.180 95.280 C 186.280 143.120 208.020 187.650 219.470 208.000 L 240.000 208.000 C 244.418 208.000 248.000 211.582 248.000 216.000 ZM 168.180 96.000 L 152.180 96.000 C 153.950 139.720 169.570 180.320 183.270 208.000 L 201.270 208.000 C 188.680 184.080 170.180 141.640 168.180 96.000 Z"),
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
        return _nuclearPlant!!
    }

private var _nuclearPlant: ImageVector? = null
