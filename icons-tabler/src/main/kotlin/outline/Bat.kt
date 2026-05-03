package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bat: ImageVector
    get() {
        if (_bat != null) return _bat!!
        _bat = tablerOutlineIcon(
            name = "Bat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 16.000 C 17.740 13.714 19.778 12.238 22.000 13.000 C 21.827 10.405 22.130 7.686 20.000 5.500 C 18.292 8.148 16.642 8.057 15.000 8.000 L 15.000 4.000 L 12.000 6.000 L 9.000 4.000 L 9.000 8.000 C 7.358 8.057 5.708 8.148 4.000 5.500 C 1.870 7.686 2.173 10.405 2.000 13.000 C 4.222 12.238 6.260 13.714 7.000 16.000 C 9.593 16.000 10.889 16.952 12.000 20.000 C 13.111 16.952 14.407 16.000 17.000 16.000"),
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
                pathData = parseSvgPathData("M 9.000 8.000 C 9.000 9.657 10.343 11.000 12.000 11.000 C 13.657 11.000 15.000 9.657 15.000 8.000"),
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
        return _bat!!
    }

private var _bat: ImageVector? = null
