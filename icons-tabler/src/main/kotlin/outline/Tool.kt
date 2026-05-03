package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tool: ImageVector
    get() {
        if (_tool != null) return _tool!!
        _tool = tablerOutlineIcon(
            name = "Tool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 10.000 L 10.000 10.000 L 10.000 7.000 L 6.500 3.500 C 8.794 2.404 11.530 2.874 13.328 4.672 C 15.126 6.470 15.596 9.206 14.500 11.500 L 20.500 17.500 C 21.328 18.328 21.328 19.672 20.500 20.500 C 19.672 21.328 18.328 21.328 17.500 20.500 L 11.500 14.500 C 9.206 15.596 6.470 15.126 4.672 13.328 C 2.874 11.530 2.404 8.794 3.500 6.500 L 7.000 10.000"),
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
        return _tool!!
    }

private var _tool: ImageVector? = null
