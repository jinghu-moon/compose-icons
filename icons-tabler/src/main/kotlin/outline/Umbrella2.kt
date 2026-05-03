package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Umbrella2: ImageVector
    get() {
        if (_umbrella2 != null) return _umbrella2!!
        _umbrella2 = tablerOutlineIcon(
            name = "Umbrella2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 5.343 7.343 C 8.467 4.219 13.533 4.219 16.657 7.343 C 19.781 10.467 19.781 15.533 16.657 18.657 L 5.343 7.343"),
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
                pathData = parseSvgPathData("M 10.828 13.340 L 6.586 17.583 C 6.066 18.085 5.858 18.829 6.041 19.528 C 6.224 20.227 6.770 20.773 7.469 20.956 C 8.168 21.139 8.912 20.931 9.414 20.411"),
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
        return _umbrella2!!
    }

private var _umbrella2: ImageVector? = null
