package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bubble: ImageVector
    get() {
        if (_bubble != null) return _bubble!!
        _bubble = tablerOutlineIcon(
            name = "Bubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.400 3.000 C 14.536 3.001 16.466 4.275 17.306 6.239 C 20.233 6.569 22.338 9.209 22.008 12.137 C 21.679 15.064 19.038 17.169 16.111 16.839 C 15.064 18.692 12.809 19.487 10.831 18.702 L 7.000 21.000 L 7.000 17.866 C 6.207 17.683 5.541 17.148 5.192 16.413 C 4.842 15.678 4.847 14.824 5.205 14.093 C 3.237 12.961 2.332 10.605 3.034 8.447 C 3.737 6.288 5.856 4.917 8.113 5.160 C 9.119 3.801 10.709 2.999 12.400 3.000"),
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
        return _bubble!!
    }

private var _bubble: ImageVector? = null
