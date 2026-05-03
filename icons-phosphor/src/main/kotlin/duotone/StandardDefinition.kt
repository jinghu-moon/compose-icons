package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StandardDefinition: ImageVector
    get() {
        if (_standardDefinition != null) return _standardDefinition!!
        _standardDefinition = phosphorDuotoneIcon(
            name = "StandardDefinition",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 224.000 48.000 L 224.000 208.000 L 32.000 208.000 L 32.000 48.000 Z"),
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
                pathData = parseSvgPathData("M 144.000 72.000 C 139.582 72.000 136.000 75.582 136.000 80.000 L 136.000 176.000 C 136.000 180.418 139.582 184.000 144.000 184.000 L 164.000 184.000 C 194.928 184.000 220.000 158.928 220.000 128.000 C 220.000 97.072 194.928 72.000 164.000 72.000 ZM 204.000 128.000 C 204.000 150.091 186.091 168.000 164.000 168.000 L 152.000 168.000 L 152.000 88.000 L 164.000 88.000 C 186.091 88.000 204.000 105.909 204.000 128.000 ZM 24.000 48.000 C 24.000 43.582 27.582 40.000 32.000 40.000 L 224.000 40.000 C 228.418 40.000 232.000 43.582 232.000 48.000 C 232.000 52.418 228.418 56.000 224.000 56.000 L 32.000 56.000 C 27.582 56.000 24.000 52.418 24.000 48.000 ZM 232.000 208.000 C 232.000 212.418 228.418 216.000 224.000 216.000 L 32.000 216.000 C 27.582 216.000 24.000 212.418 24.000 208.000 C 24.000 203.582 27.582 200.000 32.000 200.000 L 224.000 200.000 C 228.418 200.000 232.000 203.582 232.000 208.000 ZM 104.000 152.000 C 104.000 142.520 95.390 139.000 77.120 133.740 C 61.370 129.200 41.780 123.550 41.780 104.000 C 41.780 85.760 58.210 72.000 80.000 72.000 C 95.720 72.000 109.180 79.300 115.120 91.000 C 116.515 93.561 116.407 96.678 114.836 99.136 C 113.266 101.593 110.483 103.001 107.573 102.811 C 104.662 102.620 102.087 100.861 100.850 98.220 C 97.640 91.940 89.650 88.000 80.000 88.000 C 67.330 88.000 57.780 94.880 57.780 104.000 C 57.780 111.000 66.780 114.100 81.550 118.360 C 97.780 123.000 120.000 129.450 120.000 152.000 C 120.000 169.640 102.060 184.000 80.000 184.000 C 57.940 184.000 40.000 169.640 40.000 152.000 C 40.000 147.582 43.582 144.000 48.000 144.000 C 52.418 144.000 56.000 147.582 56.000 152.000 C 56.000 160.670 67.000 168.000 80.000 168.000 C 93.000 168.000 104.000 160.670 104.000 152.000 Z"),
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
        return _standardDefinition!!
    }

private var _standardDefinition: ImageVector? = null
