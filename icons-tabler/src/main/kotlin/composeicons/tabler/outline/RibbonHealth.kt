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
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7 21c0 0 9.286-9.841 9.286-13.841C16.35 6.032 15.919 4.933 15.104 4.151 14.274 3.354 13.149 2.939 12 3.007 10.851 2.939 9.726 3.353 8.896 4.15 8.081 4.932 7.649 6.032 7.714 7.16 7.714 11.16 17 21 17 21"),
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
        return _ribbonHealth!!
    }

private var _ribbonHealth: ImageVector? = null
