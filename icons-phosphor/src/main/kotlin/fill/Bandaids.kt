package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorFillIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 116.000 C 134.627 116.000 140.000 121.373 140.000 128.000 C 140.000 134.627 134.627 140.000 128.000 140.000 C 121.373 140.000 116.000 134.627 116.000 128.000 C 116.000 121.373 121.373 116.000 128.000 116.000 ZM 212.280 155.720 C 222.678 165.763 226.849 180.635 223.188 194.620 C 219.527 208.605 208.605 219.527 194.620 223.188 C 180.635 226.849 165.763 222.678 155.720 212.280 L 128.000 184.570 L 100.280 212.280 C 90.237 222.678 75.365 226.849 61.380 223.188 C 47.395 219.527 36.473 208.605 32.812 194.620 C 29.151 180.635 33.322 165.763 43.720 155.720 L 71.430 128.000 L 43.720 100.280 C 33.322 90.237 29.151 75.365 32.812 61.380 C 36.473 47.395 47.395 36.473 61.380 32.812 C 75.365 29.151 90.237 33.322 100.280 43.720 L 128.000 71.430 L 155.720 43.720 C 165.763 33.322 180.635 29.151 194.620 32.812 C 208.605 36.473 219.527 47.395 223.188 61.380 C 226.849 75.365 222.678 90.237 212.280 100.280 L 184.570 128.000 ZM 116.690 173.250 L 82.750 139.310 L 55.000 167.000 C 45.611 176.389 45.611 191.611 55.000 201.000 C 64.389 210.389 79.611 210.389 89.000 201.000 ZM 161.940 128.000 L 128.000 94.060 L 94.060 128.000 L 128.000 161.940 ZM 200.940 89.000 C 210.329 79.628 210.342 64.419 200.970 55.030 C 191.598 45.641 176.389 45.628 167.000 55.000 L 139.310 82.750 L 173.250 116.690 Z"),
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
