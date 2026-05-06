package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = phosphorThinIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240.49 138.83 141.17 39.51C138.924 37.256 135.872 35.992 132.69 36h-92.69c-2.209 0-4 1.791-4 4v92.69c-.008 3.182 1.256 6.234 3.51 8.48l99.32 99.32c2.252 2.259 5.31 3.529 8.5 3.529 3.19 0 6.248-1.27 8.5-3.529l84.69-84.69c2.259-2.252 3.529-5.31 3.529-8.5 0-3.19-1.27-6.248-3.529-8.5ZM234.83 150.14l-84.69 84.69c-1.561 1.558-4.089 1.558-5.65 0L45.17 135.51c-.748-.748-1.168-1.762-1.17-2.82v-88.69h88.69c1.058 .002 2.072 .422 2.82 1.17l99.32 99.32c1.558 1.561 1.558 4.089 0 5.65ZM92 84c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _tag!!
    }

private var _tag: ImageVector? = null
