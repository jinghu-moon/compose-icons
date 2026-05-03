package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorDuotoneIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            group(
                groupAlpha = 0.2f,
            ) {
                addPath(
                    pathData = parseSvgPathData("M 229.660 90.340 L 90.340 229.660 C 87.216 232.782 82.154 232.782 79.030 229.660 L 26.340 177.000 C 23.218 173.876 23.218 168.814 26.340 165.690 L 165.660 26.340 C 168.784 23.218 173.846 23.218 176.970 26.340 L 229.660 79.000 C 231.168 80.501 232.016 82.542 232.016 84.670 C 232.016 86.798 231.168 88.839 229.660 90.340 Z"),
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
                pathData = parseSvgPathData("M 235.320 73.370 L 182.630 20.690 C 179.629 17.689 175.559 16.002 171.315 16.002 C 167.071 16.002 163.001 17.689 160.000 20.690 L 20.680 160.000 C 17.679 163.001 15.992 167.071 15.992 171.315 C 15.992 175.559 17.679 179.629 20.680 182.630 L 73.370 235.310 C 76.371 238.311 80.441 239.998 84.685 239.998 C 88.929 239.998 92.999 238.311 96.000 235.310 L 235.320 96.000 C 238.321 92.999 240.008 88.929 240.008 84.685 C 240.008 80.441 238.321 76.371 235.320 73.370 ZM 84.680 224.000 L 32.000 171.310 L 64.000 139.310 L 90.340 165.660 C 93.466 168.786 98.534 168.786 101.660 165.660 C 104.786 162.534 104.786 157.466 101.660 154.340 L 75.310 128.000 L 96.000 107.310 L 122.340 133.660 C 125.466 136.786 130.534 136.786 133.660 133.660 C 136.786 130.534 136.786 125.466 133.660 122.340 L 107.310 96.000 L 128.000 75.310 L 154.340 101.660 C 157.466 104.786 162.534 104.786 165.660 101.660 C 168.786 98.534 168.786 93.466 165.660 90.340 L 139.310 64.000 L 171.310 32.000 L 224.000 84.690 Z"),
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
        return _ruler!!
    }

private var _ruler: ImageVector? = null
