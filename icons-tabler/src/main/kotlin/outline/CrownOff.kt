package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CrownOff: ImageVector
    get() {
        if (_crownOff != null) return _crownOff!!
        _crownOff = tablerOutlineIcon(
            name = "CrownOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 18.000 L 5.000 18.000 L 3.135 8.673 C 3.115 8.570 3.161 8.466 3.250 8.412 C 3.339 8.358 3.453 8.364 3.535 8.429 L 8.000 12.000 L 9.600 9.600M 11.196 7.206 L 12.000 6.000 L 16.000 12.000 L 20.464 8.429 C 20.546 8.364 20.660 8.356 20.750 8.411 C 20.839 8.466 20.885 8.570 20.865 8.673 L 19.502 15.491"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _crownOff!!
    }

private var _crownOff: ImageVector? = null
