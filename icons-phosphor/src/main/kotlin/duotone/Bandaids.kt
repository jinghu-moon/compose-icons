package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorDuotoneIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 206.630 94.630 L 173.250 128.000 L 128.000 82.750 L 161.370 49.370 C 173.868 36.872 194.132 36.872 206.630 49.370 C 219.128 61.868 219.128 82.132 206.630 94.630 ZM 49.370 161.370 C 36.872 173.868 36.872 194.132 49.370 206.630 C 61.868 219.128 82.132 219.128 94.630 206.630 L 128.000 173.250 L 82.750 128.000 ZM 82.750 128.000 L 128.000 82.750 L 94.630 49.370 C 82.132 36.872 61.868 36.872 49.370 49.370 C 36.872 61.868 36.872 82.132 49.370 94.630 ZM 173.250 128.000 L 128.000 173.250 L 161.370 206.630 C 173.868 219.128 194.132 219.128 206.630 206.630 C 219.128 194.132 219.128 173.868 206.630 161.370 Z"),
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
                pathData = parseSvgPathData("M 184.570 128.000 L 212.280 100.280 C 222.678 90.237 226.849 75.365 223.188 61.380 C 219.527 47.395 208.605 36.473 194.620 32.812 C 180.635 29.151 165.763 33.322 155.720 43.720 L 128.000 71.430 L 100.280 43.720 C 90.237 33.322 75.365 29.151 61.380 32.812 C 47.395 36.473 36.473 47.395 32.812 61.380 C 29.151 75.365 33.322 90.237 43.720 100.280 L 71.430 128.000 L 43.720 155.720 C 33.322 165.763 29.151 180.635 32.812 194.620 C 36.473 208.605 47.395 219.527 61.380 223.188 C 75.365 226.849 90.237 222.678 100.280 212.280 L 128.000 184.570 L 155.720 212.280 C 165.763 222.678 180.635 226.849 194.620 223.188 C 208.605 219.527 219.527 208.605 223.188 194.620 C 226.849 180.635 222.678 165.763 212.280 155.720 ZM 167.000 55.000 C 176.389 45.611 191.611 45.611 201.000 55.000 C 210.389 64.389 210.389 79.611 201.000 89.000 L 173.280 116.720 L 139.310 82.750 ZM 161.910 128.000 L 128.000 161.940 L 94.060 128.000 L 128.000 94.060 ZM 55.000 89.000 L 55.000 89.000 C 45.611 79.611 45.611 64.389 55.000 55.000 C 64.389 45.611 79.611 45.611 89.000 55.000 L 116.720 82.720 L 82.750 116.690 ZM 89.000 201.000 C 79.611 210.389 64.389 210.389 55.000 201.000 C 45.611 191.611 45.611 176.389 55.000 167.000 L 82.720 139.280 L 116.660 173.220 ZM 201.000 201.000 C 196.497 205.519 190.380 208.059 184.000 208.059 C 177.620 208.059 171.503 205.519 167.000 201.000 L 139.280 173.280 L 173.220 139.340 L 201.000 167.000 C 205.519 171.503 208.059 177.620 208.059 184.000 C 208.059 190.380 205.519 196.497 201.000 201.000 ZM 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 Z"),
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
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
