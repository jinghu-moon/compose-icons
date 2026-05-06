package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.IdentificationCard: ImageVector
    get() {
        if (_identificationCard != null) return _identificationCard!!
        _identificationCard = phosphorThinIcon(
            name = "IdentificationCard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 112c0 2.209-1.791 4-4 4h-40c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h40c2.209 0 4 1.791 4 4ZM192 140h-40c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h40c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM228 56v144c0 6.627-5.373 12-12 12h-176c-6.627 0-12-5.373-12-12v-144C28 49.373 33.373 44 40 44h176c6.627 0 12 5.373 12 12ZM220 56c0-2.209-1.791-4-4-4h-176c-2.209 0-4 1.791-4 4v144c0 2.209 1.791 4 4 4h176c2.209 0 4-1.791 4-4ZM131.87 167c.42 1.404 .039 2.925-.993 3.965-1.032 1.04-2.551 1.432-3.957 1.023-1.407-.41-2.477-1.556-2.79-2.988C121.06 157 109 148 96 148c-13 0-25 9-28.13 21-.456 1.765-2.047 2.999-3.87 3-.338 0-.674-.043-1-.13-2.136-.554-3.421-2.733-2.87-4.87 2.889-10.567 10.397-19.262 20.43-23.66C70.25 136.525 65.627 123.756 69.186 111.92 72.744 100.085 83.641 91.982 96 91.982c12.359 0 23.256 8.103 26.814 19.939 3.558 11.836-1.064 24.604-11.374 31.42 10.04 4.388 17.552 13.088 20.43 23.66ZM96 140c11.046 0 20-8.954 20-20 0-11.046-8.954-20-20-20-11.046 0-20 8.954-20 20 0 11.046 8.954 20 20 20Z"),
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
        return _identificationCard!!
    }

private var _identificationCard: ImageVector? = null
