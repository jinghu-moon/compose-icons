package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Drop: ImageVector
    get() {
        if (_drop != null) return _drop!!
        _drop = phosphorDuotoneIcon(
            name = "Drop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 144c0 44.183-35.817 80-80 80C83.817 224 48 188.183 48 144 48 72 128 16 128 16c0 0 80 56 80 128Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M174 47.75C161.648 33.484 147.745 20.639 132.55 9.45c-2.756-1.93-6.424-1.93-9.18 0C108.203 20.643 94.327 33.489 82 47.75 54.51 79.32 40 112.6 40 144c0 48.601 39.399 88 88 88 48.601 0 88-39.399 88-88C216 112.6 201.49 79.32 174 47.75ZM128 216C88.254 215.956 56.044 183.746 56 144 56 86.77 111.47 39 128 26c16.53 13 72 60.75 72 118-.044 39.746-32.254 71.956-72 72ZM183.89 153.34c-4.249 23.732-22.827 42.306-46.56 46.55-.44 .07-.885 .107-1.33 .11-4.161-.001-7.626-3.191-7.97-7.338-.344-4.146 2.547-7.865 6.65-8.552 16.57-2.79 30.63-16.85 33.44-33.45 .74-4.358 4.872-7.29 9.23-6.55 4.358 .74 7.29 4.872 6.55 9.23Z"),
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
        return _drop!!
    }

private var _drop: ImageVector? = null
