package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Pacman: ImageVector
    get() {
        if (_pacman != null) return _pacman!!
        _pacman = tablerOutlineIcon(
            name = "Pacman",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.636 5.636 C 8.447 3.825 10.944 2.871 13.502 3.013 C 16.059 3.156 18.435 4.382 20.033 6.383 L 14.414 12.000 L 20.033 17.617 C 17.951 20.220 14.600 21.459 11.325 20.837 C 8.051 20.214 5.388 17.833 4.405 14.648 C 3.423 11.463 4.281 7.995 6.636 5.636"),
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
                pathData = parseSvgPathData("M 11.500 7.500 C 11.500 8.052 11.948 8.500 12.500 8.500 C 13.052 8.500 13.500 8.052 13.500 7.500 C 13.500 6.948 13.052 6.500 12.500 6.500 C 11.948 6.500 11.500 6.948 11.500 7.500"),
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
        return _pacman!!
    }

private var _pacman: ImageVector? = null
