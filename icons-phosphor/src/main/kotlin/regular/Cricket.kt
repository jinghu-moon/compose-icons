package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Cricket: ImageVector
    get() {
        if (_cricket != null) return _cricket!!
        _cricket = phosphorRegularIcon(
            name = "Cricket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 243.310 81.370 L 190.630 28.690 C 187.629 25.689 183.559 24.002 179.315 24.002 C 175.071 24.002 171.001 25.689 168.000 28.690 L 60.690 136.000 C 57.689 139.001 56.002 143.071 56.002 147.315 C 56.002 151.559 57.689 155.629 60.690 158.630 L 81.370 179.310 L 34.370 226.310 C 31.244 229.436 31.244 234.504 34.370 237.630 C 37.496 240.756 42.564 240.756 45.690 237.630 L 92.690 190.630 L 113.370 211.310 C 116.371 214.311 120.441 215.998 124.685 215.998 C 128.929 215.998 132.999 214.311 136.000 211.310 L 243.310 104.000 C 246.311 100.999 247.998 96.929 247.998 92.685 C 247.998 88.441 246.311 84.371 243.310 81.370 ZM 124.690 200.000 L 104.000 179.310 L 133.660 149.660 C 136.786 146.534 136.786 141.466 133.660 138.340 C 130.534 135.214 125.466 135.214 122.340 138.340 L 92.690 168.000 L 72.000 147.310 L 107.310 112.000 L 160.000 112.000 L 160.000 164.690 ZM 232.000 92.690 L 176.000 148.690 L 176.000 104.000 C 176.000 99.582 172.418 96.000 168.000 96.000 L 123.310 96.000 L 179.310 40.000 L 232.000 92.680 ZM 60.000 88.000 C 75.464 88.000 88.000 75.464 88.000 60.000 C 88.000 44.536 75.464 32.000 60.000 32.000 C 44.536 32.000 32.000 44.536 32.000 60.000 C 32.000 75.464 44.536 88.000 60.000 88.000 ZM 60.000 48.000 C 66.627 48.000 72.000 53.373 72.000 60.000 C 72.000 66.627 66.627 72.000 60.000 72.000 C 53.373 72.000 48.000 66.627 48.000 60.000 C 48.000 53.373 53.373 48.000 60.000 48.000 Z"),
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
        return _cricket!!
    }

private var _cricket: ImageVector? = null
