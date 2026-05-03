package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.NuclearPlant: ImageVector
    get() {
        if (_nuclearPlant != null) return _nuclearPlant!!
        _nuclearPlant = phosphorDuotoneIcon(
            name = "NuclearPlant",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 178.330 216.000 L 37.670 216.000 C 51.160 189.650 70.000 144.550 71.860 95.640 C 72.053 91.363 75.579 87.996 79.860 88.000 L 136.160 88.000 C 140.441 87.996 143.967 91.363 144.160 95.640 C 146.000 144.550 164.840 189.650 178.330 216.000 Z"),
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
            addPath(
                pathData = parseSvgPathData("M 240.000 208.000 L 219.450 208.000 C 208.000 187.650 186.260 143.120 184.160 95.280 C 183.775 86.726 176.723 79.991 168.160 80.000 L 79.850 80.000 C 71.246 79.946 64.158 86.742 63.850 95.340 C 62.210 139.340 46.500 180.170 32.730 208.000 L 16.000 208.000 C 11.582 208.000 8.000 211.582 8.000 216.000 C 8.000 220.418 11.582 224.000 16.000 224.000 L 240.000 224.000 C 244.418 224.000 248.000 220.418 248.000 216.000 C 248.000 211.582 244.418 208.000 240.000 208.000 ZM 50.500 208.000 C 64.060 179.070 78.240 139.060 79.850 96.000 L 135.200 95.940 C 135.532 95.982 135.866 96.002 136.200 96.000 C 137.820 139.090 152.000 179.090 165.550 208.000 ZM 183.260 208.000 C 169.560 180.310 153.940 139.710 152.170 96.000 L 168.170 96.000 C 170.170 141.660 188.670 184.100 201.230 208.000 ZM 152.000 32.000 L 176.000 32.000 C 180.418 32.000 184.000 28.418 184.000 24.000 C 184.000 19.582 187.582 16.000 192.000 16.000 C 196.418 16.000 200.000 19.582 200.000 24.000 C 200.000 37.255 189.255 48.000 176.000 48.000 L 152.000 48.000 C 147.582 48.000 144.000 51.582 144.000 56.000 C 144.000 60.418 140.418 64.000 136.000 64.000 C 131.582 64.000 128.000 60.418 128.000 56.000 C 128.000 42.745 138.745 32.000 152.000 32.000 ZM 96.000 56.000 C 96.033 25.086 121.086 0.033 152.000 0.000 L 160.000 0.000 C 164.418 0.000 168.000 3.582 168.000 8.000 C 168.000 12.418 164.418 16.000 160.000 16.000 L 152.000 16.000 C 129.909 16.000 112.000 33.909 112.000 56.000 C 112.000 60.418 108.418 64.000 104.000 64.000 C 99.582 64.000 96.000 60.418 96.000 56.000 Z"),
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
