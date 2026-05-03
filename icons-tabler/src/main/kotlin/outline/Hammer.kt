package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = tablerOutlineIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 11.414 10.000 L 4.031 17.418 C 3.636 17.811 3.414 18.345 3.414 18.902 C 3.414 19.458 3.636 19.992 4.031 20.385 C 4.854 21.204 6.184 21.204 7.007 20.385 L 14.414 13.000"),
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
                pathData = parseSvgPathData("M 18.121 15.293 L 20.707 12.707 C 21.097 12.316 21.097 11.684 20.707 11.293 L 13.121 3.707 C 12.731 3.317 12.097 3.317 11.707 3.707 L 9.121 6.293 C 8.731 6.683 8.731 7.317 9.121 7.707 L 16.707 15.293 C 17.097 15.683 17.730 15.683 18.121 15.293"),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
