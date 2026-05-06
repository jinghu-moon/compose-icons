package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorThinIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 68c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM236 80c.001 1.338-.667 2.588-1.78 3.33L212 98.14v21.86c-.061 55.203-44.797 99.939-100 100h-88c-4.614 .001-8.82-2.644-10.819-6.803-1.998-4.159-1.435-9.095 1.449-12.697L100 98.08v-21.19C100 45.67 125 20.15 155.72 20h.28c24.926-.024 46.861 16.446 53.79 40.39l24.43 16.28c1.113 .742 1.781 1.992 1.78 3.33ZM224.79 80 204.11 66.22c-.813-.553-1.399-1.38-1.65-2.33C196.947 42.746 177.85 27.994 156 28h-.24C129.43 28.13 108 50.06 108 76.89v22.63c-.001 .936-.33 1.842-.93 2.56L20.84 205.56c-.929 1.206-1.092 2.835-.421 4.202 .671 1.367 2.059 2.234 3.581 2.238h28.79l72.14-86.56c1.438-1.601 3.885-1.778 5.538-.399 1.653 1.378 1.919 3.817 .602 5.519L63.21 212h48.79c50.787-.055 91.945-41.213 92-92v-24c-.001-1.338 .667-2.588 1.78-3.33Z"),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
