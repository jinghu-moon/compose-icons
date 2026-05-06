package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Pants: ImageVector
    get() {
        if (_pants != null) return _pants!!
        _pants = phosphorLightIcon(
            name = "Pants",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M221.89 214.26l-22-176C199.013 31.256 193.059 26.001 186 26h-116c-7.059 .001-13.013 5.256-13.89 12.26l-22 176c-.499 3.985 .737 7.992 3.394 11.003 2.657 3.011 6.48 4.736 10.496 4.737h40.69c6.407-0 11.996-4.35 13.57-10.56L128 120l25.73 99.44c1.575 6.214 7.17 10.564 13.58 10.56h40.69c4.016-0 7.838-1.725 10.496-4.737 2.657-3.011 3.893-7.019 3.394-11.003ZM195.22 97.66C180.703 95.574 169.15 84.432 166.54 70h25.23ZM70 38h116c1.014-.008 1.873 .744 2 1.75L190.27 58h-124.54L68 39.75c.127-1.006 .986-1.758 2-1.75ZM64.23 70h25.23C86.85 84.432 75.297 95.574 60.78 97.66ZM90.63 216.49c-.224 .888-1.024 1.51-1.94 1.51h-40.69c-.577 .005-1.127-.24-1.511-.671-.383-.431-.562-1.007-.489-1.579L59.25 109.87C81.032 108.298 98.718 91.648 101.6 70h20.4v25.24ZM209.5 217.32c-.379 .432-.926 .679-1.5 .68h-40.69c-.935-0-1.744-.648-1.95-1.56L134 95.24v-25.24h20.4c2.882 21.648 20.568 38.298 42.35 39.87L210 215.75c.067 .571-.115 1.143-.5 1.57Z"),
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
        return _pants!!
    }

private var _pants: ImageVector? = null
