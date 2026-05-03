package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Option: ImageVector
    get() {
        if (_option != null) return _option!!
        _option = phosphorThinIcon(
            name = "Option",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 228.000 192.000 C 228.000 194.209 226.209 196.000 224.000 196.000 L 160.940 196.000 C 156.393 196.014 152.232 193.443 150.210 189.370 L 98.630 86.210 C 97.953 84.858 96.572 84.003 95.060 84.000 L 32.000 84.000 C 29.791 84.000 28.000 82.209 28.000 80.000 C 28.000 77.791 29.791 76.000 32.000 76.000 L 95.060 76.000 C 99.607 75.986 103.768 78.557 105.790 82.630 L 157.370 185.790 C 158.047 187.142 159.428 187.997 160.940 188.000 L 224.000 188.000 C 226.209 188.000 228.000 189.791 228.000 192.000 ZM 152.000 84.000 L 224.000 84.000 C 226.209 84.000 228.000 82.209 228.000 80.000 C 228.000 77.791 226.209 76.000 224.000 76.000 L 152.000 76.000 C 149.791 76.000 148.000 77.791 148.000 80.000 C 148.000 82.209 149.791 84.000 152.000 84.000 Z"),
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
        return _option!!
    }

private var _option: ImageVector? = null
