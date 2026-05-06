package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorLightIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.74 188.32 180.27 126h27.73c2.287 .002 4.377-1.296 5.388-3.348 1.011-2.052 .768-4.5-.628-6.312l-80-104C131.624 10.86 129.865 9.993 128 9.993c-1.865 0-3.624 .867-4.76 2.347L43.24 116.34c-1.395 1.812-1.639 4.26-.628 6.312 1.011 2.052 3.1 3.35 5.388 3.348h27.73L27.26 188.32c-1.405 1.809-1.657 4.261-.65 6.319 1.008 2.058 3.099 3.362 5.39 3.361h90v42c0 3.314 2.686 6 6 6 3.314 0 6-2.686 6-6v-42h90c2.291 0 4.382-1.304 5.39-3.361 1.008-2.058 .755-4.509-.65-6.319ZM44.27 186 92.74 123.68c1.405-1.809 1.657-4.261 .65-6.319C92.382 115.304 90.291 114 88 114h-27.81L128 25.84 195.81 114h-27.81c-2.291-0-4.382 1.304-5.39 3.361-1.008 2.058-.755 4.509 .65 6.319L211.73 186Z"),
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
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
