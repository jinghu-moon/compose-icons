package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eyeglasses: ImageVector
    get() {
        if (_eyeglasses != null) return _eyeglasses!!
        _eyeglasses = phosphorThinIcon(
            name = "Eyeglasses",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 200.000 44.000 C 197.791 44.000 196.000 45.791 196.000 48.000 C 196.000 50.209 197.791 52.000 200.000 52.000 C 211.046 52.000 220.000 60.954 220.000 72.000 L 220.000 140.000 C 210.553 127.397 194.590 121.511 179.224 124.965 C 163.857 128.418 151.947 140.567 148.800 156.000 L 107.200 156.000 C 104.053 140.567 92.143 128.418 76.776 124.965 C 61.410 121.511 45.447 127.397 36.000 140.000 L 36.000 72.000 C 36.000 60.954 44.954 52.000 56.000 52.000 C 58.209 52.000 60.000 50.209 60.000 48.000 C 60.000 45.791 58.209 44.000 56.000 44.000 C 40.536 44.000 28.000 56.536 28.000 72.000 L 28.000 164.000 C 28.000 186.091 45.909 204.000 68.000 204.000 C 90.091 204.000 108.000 186.091 108.000 164.000 L 148.000 164.000 C 148.000 186.091 165.909 204.000 188.000 204.000 C 210.091 204.000 228.000 186.091 228.000 164.000 L 228.000 72.000 C 228.000 56.536 215.464 44.000 200.000 44.000 ZM 68.000 196.000 C 50.327 196.000 36.000 181.673 36.000 164.000 C 36.000 146.327 50.327 132.000 68.000 132.000 C 85.673 132.000 100.000 146.327 100.000 164.000 C 100.000 181.673 85.673 196.000 68.000 196.000 ZM 188.000 196.000 C 170.327 196.000 156.000 181.673 156.000 164.000 C 156.000 146.327 170.327 132.000 188.000 132.000 C 205.673 132.000 220.000 146.327 220.000 164.000 C 220.000 181.673 205.673 196.000 188.000 196.000 Z"),
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
        return _eyeglasses!!
    }

private var _eyeglasses: ImageVector? = null
