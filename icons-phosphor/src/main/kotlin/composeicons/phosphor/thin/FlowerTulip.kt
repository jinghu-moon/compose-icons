package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorThinIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 52c-12.832-.008-25.493 2.942-37 8.62C156.8 34.16 131 20.99 129.81 20.42c-1.127-.564-2.453-.564-3.58 0-1.14 .57-27 13.74-41.19 40.2C73.521 54.936 60.845 51.986 48 52c-2.209 0-4 1.791-4 4v40c.053 44.815 35.239 81.715 80 83.9v45.63L81.79 204.42c-1.977-.989-4.381-.187-5.37 1.79-.989 1.977-.187 4.381 1.79 5.37l48 24c1.127 .564 2.453 .564 3.58 0l48-24c1.977-.989 2.779-3.393 1.79-5.37-.989-1.977-3.393-2.779-5.37-1.79L132 225.53v-45.63C176.761 177.715 211.947 140.815 212 96v-40c0-2.209-1.791-4-4-4ZM128 28.56c5.91 3.37 25 15.45 36 35.93-17.074 10.544-29.836 26.823-36 45.92C121.836 91.313 109.074 75.034 92 64.49 103 44.07 122.1 31.94 128 28.56ZM52 96v-35.9c40.34 2.182 71.947 35.501 72 75.9v35.9C83.66 169.718 52.053 136.399 52 96ZM204 96c-.053 40.399-31.66 73.718-72 75.9v-35.9c.053-40.399 31.66-73.718 72-75.9Z"),
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
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
