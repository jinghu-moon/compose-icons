package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Heart: ImageVector
    get() {
        if (_heart != null) return _heart!!
        _heart = phosphorDuotoneIcon(
            name = "Heart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 232.000 102.000 C 232.000 168.000 128.000 224.000 128.000 224.000 C 128.000 224.000 24.000 168.000 24.000 102.000 C 24.000 72.177 48.177 48.000 78.000 48.000 C 100.590 48.000 119.940 60.310 128.000 80.000 C 136.060 60.310 155.410 48.000 178.000 48.000 C 207.823 48.000 232.000 72.177 232.000 102.000 Z"),
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
                pathData = parseSvgPathData("M 178.000 40.000 C 157.350 40.000 139.270 48.880 128.000 63.890 C 116.730 48.880 98.650 40.000 78.000 40.000 C 43.774 40.039 16.039 67.774 16.000 102.000 C 16.000 172.000 119.790 228.660 124.210 231.000 C 126.576 232.273 129.424 232.273 131.790 231.000 C 136.210 228.660 240.000 172.000 240.000 102.000 C 239.961 67.774 212.226 40.039 178.000 40.000 ZM 128.000 214.800 C 109.740 204.160 32.000 155.690 32.000 102.000 C 32.033 76.609 52.609 56.033 78.000 56.000 C 97.450 56.000 113.780 66.360 120.600 83.000 C 121.833 86.001 124.756 87.960 128.000 87.960 C 131.244 87.960 134.167 86.001 135.400 83.000 C 142.220 66.330 158.550 56.000 178.000 56.000 C 203.391 56.033 223.967 76.609 224.000 102.000 C 224.000 155.610 146.240 204.150 128.000 214.800 Z"),
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
        return _heart!!
    }

private var _heart: ImageVector? = null
