package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Circuitry: ImageVector
    get() {
        if (_circuitry != null) return _circuitry!!
        _circuitry = phosphorThinIcon(
            name = "Circuitry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 36h-160C41.373 36 36 41.373 36 48v160c0 6.627 5.373 12 12 12h160c6.627 0 12-5.373 12-12v-160c0-6.627-5.373-12-12-12ZM88 156c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12ZM44 208v-160c0-2.209 1.791-4 4-4h36v104.4c-10.06 2.053-16.931 11.391-15.899 21.606 1.032 10.215 9.631 17.99 19.899 17.99 10.267 0 18.867-7.775 19.899-17.99C108.931 159.791 102.06 150.453 92 148.4v-42.74l56 56v50.34h-100c-2.209 0-4-1.791-4-4ZM212 208c0 2.209-1.791 4-4 4h-52v-52c.001-1.061-.42-2.079-1.17-2.83L92 94.34v-50.34h40v28c-.001 1.061 .42 2.079 1.17 2.83L151.33 93c-5.656 8.567-3.909 20.024 4.045 26.515 7.953 6.491 19.529 5.906 26.788-1.353 7.259-7.259 7.843-18.834 1.353-26.788C177.024 83.421 165.567 81.674 157 87.33l-17-17v-26.33h68c2.209 0 4 1.791 4 4ZM168 92c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12Z"),
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
        return _circuitry!!
    }

private var _circuitry: ImageVector? = null
