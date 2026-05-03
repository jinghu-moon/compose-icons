package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Marquee2: ImageVector
    get() {
        if (_marquee2 != null) return _marquee2!!
        _marquee2 = tablerOutlineIcon(
            name = "Marquee2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 6.000 L 4.000 5.000 C 4.000 4.448 4.448 4.000 5.000 4.000 L 6.000 4.000M 11.000 4.000 L 13.000 4.000M 18.000 4.000 L 19.000 4.000 C 19.552 4.000 20.000 4.448 20.000 5.000 L 20.000 6.000M 20.000 11.000 L 20.000 13.000M 20.000 18.000 L 20.000 19.000 C 20.000 19.552 19.552 20.000 19.000 20.000 L 18.000 20.000M 13.000 20.000 L 11.000 20.000M 6.000 20.000 L 5.000 20.000 C 4.448 20.000 4.000 19.552 4.000 19.000 L 4.000 18.000M 4.000 13.000 L 4.000 11.000"),
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
        return _marquee2!!
    }

private var _marquee2: ImageVector? = null
