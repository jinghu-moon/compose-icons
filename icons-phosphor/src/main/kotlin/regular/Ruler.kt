package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Ruler: ImageVector
    get() {
        if (_ruler != null) return _ruler!!
        _ruler = phosphorRegularIcon(
            name = "Ruler",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 235.320 73.370 L 182.630 20.690 C 179.629 17.689 175.559 16.002 171.315 16.002 C 167.071 16.002 163.001 17.689 160.000 20.690 L 20.680 160.000 C 17.679 163.001 15.992 167.071 15.992 171.315 C 15.992 175.559 17.679 179.629 20.680 182.630 L 73.370 235.310 C 76.371 238.311 80.441 239.998 84.685 239.998 C 88.929 239.998 92.999 238.311 96.000 235.310 L 235.320 96.000 C 238.321 92.999 240.008 88.929 240.008 84.685 C 240.008 80.441 238.321 76.371 235.320 73.370 ZM 84.680 224.000 L 32.000 171.310 L 64.000 139.310 L 90.340 165.660 C 93.466 168.786 98.534 168.786 101.660 165.660 C 104.786 162.534 104.786 157.466 101.660 154.340 L 75.310 128.000 L 96.000 107.310 L 122.340 133.660 C 125.466 136.786 130.534 136.786 133.660 133.660 C 136.786 130.534 136.786 125.466 133.660 122.340 L 107.310 96.000 L 128.000 75.310 L 154.340 101.660 C 157.466 104.786 162.534 104.786 165.660 101.660 C 168.786 98.534 168.786 93.466 165.660 90.340 L 139.310 64.000 L 171.310 32.000 L 224.000 84.690 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _ruler!!
    }

private var _ruler: ImageVector? = null
