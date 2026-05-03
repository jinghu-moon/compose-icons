package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Marquee: ImageVector
    get() {
        if (_marquee != null) return _marquee!!
        _marquee = tablerOutlineIcon(
            name = "Marquee",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 4.000 6.000 C 4.000 4.895 4.895 4.000 6.000 4.000M 9.000 4.000 L 10.500 4.000M 13.500 4.000 L 15.000 4.000M 18.000 4.000 C 19.105 4.000 20.000 4.895 20.000 6.000M 20.000 9.000 L 20.000 10.500M 20.000 13.500 L 20.000 15.000M 20.000 18.000 C 20.000 19.105 19.105 20.000 18.000 20.000M 15.000 20.000 L 13.500 20.000M 10.500 20.000 L 9.000 20.000M 6.000 20.000 C 4.895 20.000 4.000 19.105 4.000 18.000M 4.000 15.000 L 4.000 13.500M 4.000 10.500 L 4.000 9.000M 4.000 6.000"),
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
        return _marquee!!
    }

private var _marquee: ImageVector? = null
