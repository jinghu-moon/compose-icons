package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Knife: ImageVector
    get() {
        if (_knife != null) return _knife!!
        _knife = phosphorThinIcon(
            name = "Knife",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229 35c-9.302-9.279-24.358-9.279-33.66 0L21.17 209.22c-1.025 1.029-1.412 2.532-1.011 3.928 .401 1.396 1.527 2.464 2.941 2.792 11.574 2.691 23.417 4.054 35.3 4.06 39.41 0 72.27-15.08 94.78-29.6 31.21-20.14 49.23-43 50-43.91 1.244-1.591 1.107-3.86-.32-5.29L179.67 118 229 68.63c9.254-9.3 9.254-24.33 0-33.63ZM194.59 144.27c-13.455 15.222-28.932 28.529-46 39.55-37.85 24.35-77 33-116.55 25.81L146 95.67ZM223.38 63 174 112.36 151.66 90 201 40.62c6.18-6.18 16.2-6.18 22.38 0 6.18 6.18 6.18 16.2 0 22.38Z"),
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
        return _knife!!
    }

private var _knife: ImageVector? = null
