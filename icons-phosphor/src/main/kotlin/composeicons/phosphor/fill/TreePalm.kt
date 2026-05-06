package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = phosphorFillIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M239.84 60.33c-.518 2.561-2.254 4.708-4.65 5.75L179 90.55c18.282 4.888 33.877 16.833 43.36 33.21 9.611 16.4 12.206 35.982 7.2 54.32-.696 2.568-2.623 4.623-5.141 5.481-2.519 .858-5.299 .408-7.419-1.201L136 120.68v103.32c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-103.32L39 182.36c-2.119 1.614-4.903 2.067-7.425 1.208-2.522-.859-4.451-2.916-5.145-5.488-5.006-18.338-2.411-37.92 7.2-54.32C43.115 107.38 58.714 95.436 77 90.55L20.81 66.08C18.416 65.037 16.681 62.892 16.164 60.332c-.518-2.559 .246-5.211 2.046-7.102C30.855 39.687 48.552 31.999 67.08 31.999c18.528 0 36.225 7.688 48.87 21.231 4.8 5.058 8.842 10.784 12 17C131.124 64.011 135.183 58.284 140 53.23 152.645 39.687 170.342 31.999 188.87 31.999c18.528 0 36.225 7.688 48.87 21.231 1.819 1.881 2.603 4.532 2.1 7.1Z"),
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null
