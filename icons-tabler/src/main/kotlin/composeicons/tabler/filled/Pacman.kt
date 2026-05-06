package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pacman: ImageVector
    get() {
        if (_pacman != null) return _pacman!!
        _pacman = tablerFilledIcon(
            name = "Pacman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M13.557 2.015c2.842 .158 5.481 1.52 7.257 3.744 .318 .398 .286 .971-.074 1.331L15.828 12l4.912 4.91c.36 .36 .392 .934 .074 1.332-2.29 2.861-5.961 4.241-9.568 3.596C7.639 21.193 4.673 18.627 3.517 15.149 2.361 11.672 3.199 7.841 5.702 5.164l.235-.242 .07-.063C8.011 2.891 10.752 1.858 13.557 2.015M12.5 5.5c-1.02 0-1.86 .762-1.982 1.748l-.013 .15c-.003 .034-.005 .068-.005 .102 0 1.105 .895 2 2 2 1.105 0 2-.895 2-2 0-1.105-.895-2-2-2"),
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
        return _pacman!!
    }

private var _pacman: ImageVector? = null
