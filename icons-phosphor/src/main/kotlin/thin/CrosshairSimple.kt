package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CrosshairSimple: ImageVector
    get() {
        if (_crosshairSimple != null) return _crosshairSimple!!
        _crosshairSimple = phosphorThinIcon(
            name = "CrosshairSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 128.000 28.000 C 72.772 28.000 28.000 72.772 28.000 128.000 C 28.000 183.228 72.772 228.000 128.000 228.000 C 183.228 228.000 228.000 183.228 228.000 128.000 C 227.939 72.797 183.203 28.061 128.000 28.000 ZM 132.000 219.910 L 132.000 184.000 C 132.000 181.791 130.209 180.000 128.000 180.000 C 125.791 180.000 124.000 181.791 124.000 184.000 L 124.000 219.910 C 76.362 217.774 38.226 179.638 36.090 132.000 L 72.000 132.000 C 74.209 132.000 76.000 130.209 76.000 128.000 C 76.000 125.791 74.209 124.000 72.000 124.000 L 36.090 124.000 C 38.226 76.362 76.362 38.226 124.000 36.090 L 124.000 72.000 C 124.000 74.209 125.791 76.000 128.000 76.000 C 130.209 76.000 132.000 74.209 132.000 72.000 L 132.000 36.090 C 179.638 38.226 217.774 76.362 219.910 124.000 L 184.000 124.000 C 181.791 124.000 180.000 125.791 180.000 128.000 C 180.000 130.209 181.791 132.000 184.000 132.000 L 219.910 132.000 C 217.774 179.638 179.638 217.774 132.000 219.910 Z"),
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
        return _crosshairSimple!!
    }

private var _crosshairSimple: ImageVector? = null
