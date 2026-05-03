package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.PlaneTilt: ImageVector
    get() {
        if (_planeTilt != null) return _planeTilt!!
        _planeTilt = tablerOutlineIcon(
            name = "PlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 14.500 6.500 L 17.500 3.600 C 18.301 2.799 19.599 2.799 20.400 3.600 C 21.201 4.401 21.201 5.699 20.400 6.500 L 17.500 9.500 L 20.000 17.000 L 17.500 19.550 L 14.000 13.000 L 11.000 16.000 L 11.000 19.000 L 9.000 21.000 L 7.500 16.500 L 3.000 15.000 L 5.000 13.000 L 8.000 13.000 L 11.000 10.000 L 4.500 6.500 L 7.000 4.000 L 14.500 6.500"),
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
        return _planeTilt!!
    }

private var _planeTilt: ImageVector? = null
