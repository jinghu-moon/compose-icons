package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Hockey: ImageVector
    get() {
        if (_hockey != null) return _hockey!!
        _hockey = phosphorThinIcon(
            name = "Hockey",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 156h-94.95L35.05 45.41c-.875-1.242-2.378-1.88-3.88-1.649-1.501 .232-2.742 1.294-3.202 2.742-.46 1.448-.061 3.031 1.032 4.087L162.56 207.77c2.279 2.682 5.62 4.229 9.14 4.23h52.3c6.627 0 12-5.373 12-12v-32c0-6.627-5.373-12-12-12ZM168.65 202.59 135.85 164h60.15v40h-24.3c-1.174 .001-2.29-.515-3.05-1.41ZM228 200c0 2.209-1.791 4-4 4h-20v-40h20c2.209 0 4 1.791 4 4ZM104 183.06 87.4 202.59c-.749 .882-1.843 1.396-3 1.41h-24.4v-40h25.2c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-53.2c-6.627 0-12 5.373-12 12v32c0 6.627 5.373 12 12 12h52.3c3.52-.001 6.861-1.548 9.14-4.23l16.61-19.53c1.43-1.684 1.224-4.21-.46-5.64-1.684-1.43-4.21-1.224-5.64 .46ZM28 200v-32c0-2.209 1.791-4 4-4h20v40h-20c-2.209 0-4-1.791-4-4ZM153.41 131.05c-.809-.687-1.312-1.667-1.399-2.725-.086-1.058 .251-2.107 .939-2.915l68-80c1.43-1.684 3.956-1.89 5.64-.46 1.684 1.43 1.89 3.956 .46 5.64l-68 80c-.687 .809-1.667 1.312-2.725 1.399-1.058 .086-2.107-.251-2.915-.939Z"),
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
        return _hockey!!
    }

private var _hockey: ImageVector? = null
