package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandAlgolia: ImageVector
    get() {
        if (_brandAlgolia != null) return _brandAlgolia!!
        _brandAlgolia = tablerOutlineIcon(
            name = "BrandAlgolia",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 15.500 11.000 C 15.086 9.523 13.614 8.500 12.000 8.500 C 11.069 8.492 10.174 8.858 9.516 9.516 C 8.858 10.174 8.492 11.069 8.500 12.000 C 8.492 12.931 8.858 13.826 9.516 14.484 C 10.174 15.142 11.069 15.508 12.000 15.500 C 12.974 15.500 13.861 15.143 14.500 14.500 L 19.000 19.000 L 19.000 4.000 L 12.000 4.000 C 7.614 4.000 4.000 7.582 4.000 12.000 C 4.000 16.418 7.614 20.000 12.000 20.000 C 13.031 20.001 14.051 19.792 14.998 19.386"),
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
        return _brandAlgolia!!
    }

private var _brandAlgolia: ImageVector? = null
