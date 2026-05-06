package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BadgeCc: ImageVector
    get() {
        if (_badgeCc != null) return _badgeCc!!
        _badgeCc = tablerFilledIcon(
            name = "BadgeCc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 4c1.657 0 3 1.343 3 3v10c0 1.657-1.343 3-3 3h-14C3.343 20 2 18.657 2 17v-10C2 5.343 3.343 4 5 4ZM8.5 8C7.119 8 6 9.119 6 10.5v3C6 14.881 7.119 16 8.5 16 9.881 16 11 14.881 11 13.5c0-.552-.448-1-1-1-.552 0-1 .448-1 1C9 13.776 8.776 14 8.5 14 8.224 14 8 13.776 8 13.5v-3C8 10.224 8.224 10 8.5 10c.276 0 .5 .224 .5 .5 0 .552 .448 1 1 1 .552 0 1-.448 1-1C11 9.119 9.881 8 8.5 8M15.5 8C14.119 8 13 9.119 13 10.5v3C13 14.881 14.119 16 15.5 16 16.881 16 18 14.881 18 13.5c0-.552-.448-1-1-1-.552 0-1 .448-1 1 0 .276-.224 .5-.5 .5C15.224 14 15 13.776 15 13.5v-3c0-.276 .224-.5 .5-.5 .276 0 .5 .224 .5 .5 0 .552 .448 1 1 1 .552 0 1-.448 1-1C18 9.119 16.881 8 15.5 8"),
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
        return _badgeCc!!
    }

private var _badgeCc: ImageVector? = null
