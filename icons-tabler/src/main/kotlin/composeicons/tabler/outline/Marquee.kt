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
                pathData = parseSvgPathData("M4 6C4 4.895 4.895 4 6 4M9 4h1.5M13.5 4h1.5M18 4c1.105 0 2 .895 2 2M20 9v1.5M20 13.5v1.5M20 18c0 1.105-.895 2-2 2M15 20h-1.5M10.5 20h-1.5M6 20C4.895 20 4 19.105 4 18M4 15v-1.5M4 10.5v-1.5M4 6"),
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
