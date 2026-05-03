package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Octahedron: ImageVector
    get() {
        if (_octahedron != null) return _octahedron!!
        _octahedron = tablerOutlineIcon(
            name = "Octahedron",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.859 21.652 L 21.704 12.703 C 21.893 12.518 22.000 12.264 22.000 12.000 C 22.000 11.735 21.893 11.481 21.704 11.296 L 12.859 2.348 C 12.381 1.883 11.619 1.883 11.141 2.348 L 2.296 11.297 C 2.107 11.482 2.000 11.736 2.000 12.000 C 2.000 12.265 2.107 12.519 2.296 12.704 L 11.141 21.653 C 11.620 22.117 12.381 22.116 12.859 21.652"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 2.000 12.000 C 2.004 12.086 2.103 12.178 2.296 12.246 L 11.141 14.878 C 11.600 15.041 12.400 15.041 12.859 14.878 L 21.704 12.246 C 21.899 12.176 21.998 12.090 22.000 12.003"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 12.000 2.120 L 12.000 21.880"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _octahedron!!
    }

private var _octahedron: ImageVector? = null
