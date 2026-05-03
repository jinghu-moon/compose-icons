package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaystationSquare: ImageVector
    get() {
        if (_playstationSquare != null) return _playstationSquare!!
        _playstationSquare = tablerOutlineIcon(
            name = "PlaystationSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 21.000 C 16.971 21.000 21.000 16.971 21.000 12.000 C 21.000 7.029 16.971 3.000 12.000 3.000 C 7.029 3.000 3.000 7.029 3.000 12.000 C 3.000 16.971 7.029 21.000 12.000 21.000"),
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
                pathData = parseSvgPathData("M 8.000 9.000 C 8.000 8.448 8.448 8.000 9.000 8.000 L 15.000 8.000 C 15.552 8.000 16.000 8.448 16.000 9.000 L 16.000 15.000 C 16.000 15.552 15.552 16.000 15.000 16.000 L 9.000 16.000 C 8.448 16.000 8.000 15.552 8.000 15.000 L 8.000 9.000"),
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
        return _playstationSquare!!
    }

private var _playstationSquare: ImageVector? = null
