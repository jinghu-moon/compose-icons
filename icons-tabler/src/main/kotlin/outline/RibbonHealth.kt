package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RibbonHealth: ImageVector
    get() {
        if (_ribbonHealth != null) return _ribbonHealth!!
        _ribbonHealth = tablerOutlineIcon(
            name = "RibbonHealth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 7.000 21.000 C 7.000 21.000 16.286 11.159 16.286 7.159 C 16.350 6.032 15.919 4.933 15.104 4.151 C 14.274 3.354 13.149 2.939 12.000 3.007 C 10.851 2.939 9.726 3.353 8.896 4.150 C 8.081 4.932 7.649 6.032 7.714 7.160 C 7.714 11.160 17.000 21.000 17.000 21.000"),
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
        return _ribbonHealth!!
    }

private var _ribbonHealth: ImageVector? = null
