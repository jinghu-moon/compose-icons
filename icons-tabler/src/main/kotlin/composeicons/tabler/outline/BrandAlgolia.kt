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
                pathData = parseSvgPathData("M15.5 11C15.086 9.523 13.614 8.5 12 8.5c-.931-.008-1.826 .358-2.484 1.016C8.858 10.174 8.492 11.069 8.5 12c-.008 .931 .358 1.826 1.016 2.484 .658 .658 1.553 1.024 2.484 1.016 .974 0 1.861-.357 2.5-1L19 19v-15h-7C7.614 4 4 7.582 4 12c0 4.418 3.614 8 8 8 1.031 .001 2.051-.208 2.998-.614"),
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
