package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Warehouse: ImageVector
    get() {
        if (_warehouse != null) return _warehouse!!
        _warehouse = phosphorThinIcon(
            name = "Warehouse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 240.000 188.000 L 228.000 188.000 L 228.000 54.660 L 240.840 51.910 C 242.261 51.634 243.423 50.611 243.876 49.236 C 244.330 47.861 244.005 46.348 243.027 45.281 C 242.048 44.213 240.569 43.758 239.160 44.090 L 15.160 92.090 C 13.162 92.521 11.810 94.390 12.026 96.422 C 12.242 98.455 13.956 99.998 16.000 100.000 C 16.282 99.999 16.564 99.969 16.840 99.910 L 28.000 97.520 L 28.000 188.000 L 16.000 188.000 C 13.791 188.000 12.000 189.791 12.000 192.000 C 12.000 194.209 13.791 196.000 16.000 196.000 L 240.000 196.000 C 242.209 196.000 244.000 194.209 244.000 192.000 C 244.000 189.791 242.209 188.000 240.000 188.000 ZM 36.000 95.810 L 220.000 56.380 L 220.000 188.000 L 188.000 188.000 L 188.000 128.000 C 188.000 125.791 186.209 124.000 184.000 124.000 L 72.000 124.000 C 69.791 124.000 68.000 125.791 68.000 128.000 L 68.000 188.000 L 36.000 188.000 ZM 180.000 156.000 L 76.000 156.000 L 76.000 132.000 L 180.000 132.000 ZM 76.000 164.000 L 180.000 164.000 L 180.000 188.000 L 76.000 188.000 Z"),
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
        return _warehouse!!
    }

private var _warehouse: ImageVector? = null
