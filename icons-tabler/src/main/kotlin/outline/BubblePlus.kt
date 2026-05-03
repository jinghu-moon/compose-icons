package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BubblePlus: ImageVector
    get() {
        if (_bubblePlus != null) return _bubblePlus!!
        _bubblePlus = tablerOutlineIcon(
            name = "BubblePlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.400 19.000 C 11.862 19.002 11.329 18.901 10.830 18.702 L 7.000 21.000 L 7.000 17.866 C 6.207 17.683 5.541 17.148 5.192 16.413 C 4.842 15.678 4.847 14.824 5.205 14.093 C 3.237 12.961 2.332 10.605 3.034 8.447 C 3.737 6.288 5.856 4.917 8.113 5.160 C 9.251 3.623 11.123 2.813 13.022 3.035 C 14.921 3.258 16.556 4.480 17.307 6.238 C 18.881 6.428 20.288 7.308 21.148 8.639 C 22.008 9.971 22.231 11.616 21.757 13.128"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 16.000 19.000 L 22.000 19.000"),
        pathFillType = PathFillType.NonZero,
        fill = null,
        fillAlpha = 1.0f,
        stroke = SolidColor(Color(0xFF000000)),
        strokeAlpha = 1.0f,
        strokeLineWidth = 2.0f,
        strokeLineCap = StrokeCap.Round,
        strokeLineJoin = StrokeJoin.Round,
    )
    addPath(
        pathData = parseSvgPathData("M 19.000 16.000 L 19.000 22.000"),
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
        return _bubblePlus!!
    }

private var _bubblePlus: ImageVector? = null
