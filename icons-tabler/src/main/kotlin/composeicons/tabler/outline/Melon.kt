package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Melon: ImageVector
    get() {
        if (_melon != null) return _melon!!
        _melon = tablerOutlineIcon(
            name = "Melon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20 10c0 5.523-4.477 10-10 10C7.39 20.004 4.882 18.983 3.016 17.158L7.359 13.005c1.558 1.374 3.909 1.326 5.41-.11 1.501-1.436 1.653-3.782 .35-5.4L17.461 3.342C19.099 5.172 20.003 7.544 20 10"),
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
        return _melon!!
    }

private var _melon: ImageVector? = null
