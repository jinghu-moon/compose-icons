package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Lamp: ImageVector
    get() {
        if (_lamp != null) return _lamp!!
        _lamp = phosphorRegularIcon(
            name = "Lamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M247.35 148.85l-48-112C198.09 33.909 195.199 32.001 192 32h-128c-3.199 .001-6.09 1.909-7.35 4.85L8.65 148.85c-1.058 2.471-.805 5.309 .674 7.553 1.48 2.244 3.987 3.596 6.676 3.597h104v48h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h64c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-24v-48h56v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32h32c2.688-.001 5.196-1.353 6.676-3.597 1.48-2.244 1.733-5.082 .674-7.553ZM28.13 144 69.28 48h117.44l41.15 96Z"),
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
        return _lamp!!
    }

private var _lamp: ImageVector? = null
