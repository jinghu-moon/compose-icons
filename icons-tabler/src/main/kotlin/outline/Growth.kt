package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Growth: ImageVector
    get() {
        if (_growth != null) return _growth!!
        _growth = tablerOutlineIcon(
            name = "Growth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 16.500 15.000 C 14.015 15.000 12.000 17.015 12.000 19.500M 16.500 11.000 C 14.015 11.000 12.000 13.015 12.000 15.500M 16.500 7.000 C 14.015 7.000 12.000 9.015 12.000 11.500M 8.000 15.000 C 10.210 15.000 12.000 17.015 12.000 19.500M 8.000 11.000 C 10.210 11.000 12.000 13.015 12.000 15.500M 8.000 7.000 C 10.210 7.000 12.000 9.015 12.000 11.500M 12.000 4.000 L 12.000 10.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
        }
        return _growth!!
    }

private var _growth: ImageVector? = null
