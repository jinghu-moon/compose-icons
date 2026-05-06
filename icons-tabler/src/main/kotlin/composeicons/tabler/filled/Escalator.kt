package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Escalator: ImageVector
    get() {
        if (_escalator != null) return _escalator!!
        _escalator = tablerFilledIcon(
            name = "Escalator",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.5 4C21.433 4 23 5.567 23 7.5 23 9.433 21.433 11 19.5 11h-1.086l-8.12 8.121c-.514 .514-1.198 .824-1.924 .872L8.172 20h-3.672C2.567 20 1 18.433 1 16.5 1 14.567 2.567 13 4.5 13h2.084L14.707 4.879c.514-.514 1.198-.824 1.923-.872L16.828 4Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _escalator!!
    }

private var _escalator: ImageVector? = null
