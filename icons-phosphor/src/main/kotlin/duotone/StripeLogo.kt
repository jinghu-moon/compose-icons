package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) return _stripeLogo!!
        _stripeLogo = phosphorDuotoneIcon(
            name = "StripeLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 216.000 48.000 L 216.000 208.000 C 216.000 212.418 212.418 216.000 208.000 216.000 L 48.000 216.000 C 43.582 216.000 40.000 212.418 40.000 208.000 L 40.000 48.000 C 40.000 43.582 43.582 40.000 48.000 40.000 L 208.000 40.000 C 212.418 40.000 216.000 43.582 216.000 48.000 Z"),
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
                pathData = parseSvgPathData("M 168.000 152.000 C 168.000 169.650 150.060 184.000 128.000 184.000 C 105.940 184.000 88.000 169.650 88.000 152.000 C 88.000 147.582 91.582 144.000 96.000 144.000 C 100.418 144.000 104.000 147.582 104.000 152.000 C 104.000 160.670 115.000 168.000 128.000 168.000 C 141.000 168.000 152.000 160.670 152.000 152.000 C 152.000 142.520 143.390 139.000 125.120 133.740 C 109.370 129.200 89.780 123.550 89.780 104.000 C 89.780 85.760 106.210 72.000 128.000 72.000 C 143.720 72.000 157.180 79.300 163.120 91.000 C 164.515 93.561 164.407 96.678 162.836 99.136 C 161.266 101.593 158.483 103.001 155.573 102.811 C 152.662 102.620 150.087 100.861 148.850 98.220 C 145.640 91.940 137.650 88.000 128.000 88.000 C 115.330 88.000 105.780 94.880 105.780 104.000 C 105.780 111.000 114.780 114.100 129.550 118.360 C 145.780 123.000 168.000 129.450 168.000 152.000 ZM 224.000 48.000 L 224.000 208.000 C 224.000 216.837 216.837 224.000 208.000 224.000 L 48.000 224.000 C 39.163 224.000 32.000 216.837 32.000 208.000 L 32.000 48.000 C 32.000 39.163 39.163 32.000 48.000 32.000 L 208.000 32.000 C 216.837 32.000 224.000 39.163 224.000 48.000 ZM 208.000 208.000 L 208.000 48.000 L 48.000 48.000 L 48.000 208.000 L 208.000 208.000 Z"),
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
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
