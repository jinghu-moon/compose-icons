package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UmbrellaSimple: ImageVector
    get() {
        if (_umbrellaSimple != null) return _umbrellaSimple!!
        _umbrellaSimple = phosphorThinIcon(
            name = "UmbrellaSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 236.000 127.000 C 232.410 85.799 205.699 50.228 167.133 35.291 C 128.568 20.355 84.864 28.655 54.460 56.690 C 34.545 74.963 22.242 100.065 20.000 127.000 C 19.720 130.352 20.859 133.668 23.141 136.139 C 25.422 138.611 28.636 140.012 32.000 140.000 L 124.000 140.000 L 124.000 200.000 C 124.000 215.464 136.536 228.000 152.000 228.000 C 167.464 228.000 180.000 215.464 180.000 200.000 C 180.000 197.791 178.209 196.000 176.000 196.000 C 173.791 196.000 172.000 197.791 172.000 200.000 C 172.000 211.046 163.046 220.000 152.000 220.000 C 140.954 220.000 132.000 211.046 132.000 200.000 L 132.000 140.000 L 224.000 140.000 C 227.364 140.012 230.578 138.611 232.859 136.139 C 235.141 133.668 236.280 130.352 236.000 127.000 ZM 227.000 130.740 C 226.231 131.581 225.140 132.054 224.000 132.040 L 32.000 132.040 C 30.870 132.045 29.790 131.572 29.028 130.737 C 28.266 129.903 27.893 128.785 28.000 127.660 C 31.373 89.536 56.122 56.643 91.819 42.840 C 127.516 29.036 167.956 36.723 196.100 62.660 C 214.509 79.557 225.890 102.760 227.980 127.660 C 228.071 128.776 227.690 129.878 226.930 130.700 Z"),
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
        return _umbrellaSimple!!
    }

private var _umbrellaSimple: ImageVector? = null
