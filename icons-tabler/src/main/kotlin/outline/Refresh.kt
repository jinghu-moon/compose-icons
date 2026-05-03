package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Refresh: ImageVector
    get() {
        if (_refresh != null) return _refresh!!
        _refresh = tablerOutlineIcon(
            name = "Refresh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 20.000 11.000 C 19.497 7.383 16.636 4.549 13.014 4.082 C 9.391 3.614 5.905 5.629 4.500 9.000M 4.000 5.000 L 4.000 9.000 L 8.000 9.000"),
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
                pathData = parseSvgPathData("M 4.000 13.000 C 4.503 16.617 7.364 19.451 10.986 19.918 C 14.609 20.386 18.095 18.371 19.500 15.000M 20.000 19.000 L 20.000 15.000 L 16.000 15.000"),
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
        return _refresh!!
    }

private var _refresh: ImageVector? = null
