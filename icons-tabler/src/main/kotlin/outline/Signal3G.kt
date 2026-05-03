package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Signal3G: ImageVector
    get() {
        if (_signal3G != null) return _signal3G!!
        _signal3G = tablerOutlineIcon(
            name = "Signal3G",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 17.000 8.000 L 15.000 8.000 C 13.895 8.000 13.000 8.895 13.000 10.000 L 13.000 14.000 C 13.000 15.105 13.895 16.000 15.000 16.000 L 17.000 16.000 L 17.000 12.000 L 16.000 12.000"),
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
                pathData = parseSvgPathData("M 6.000 8.000 L 8.500 8.000 C 9.328 8.000 10.000 8.672 10.000 9.500 L 10.000 10.500 C 10.000 11.328 9.328 12.000 8.500 12.000 L 7.000 12.000 L 8.500 12.000 C 9.328 12.000 10.000 12.672 10.000 13.500 L 10.000 14.500 C 10.000 15.328 9.328 16.000 8.500 16.000 L 6.000 16.000"),
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
        return _signal3G!!
    }

private var _signal3G: ImageVector? = null
