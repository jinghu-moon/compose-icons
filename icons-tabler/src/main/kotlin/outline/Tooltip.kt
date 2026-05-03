package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tooltip: ImageVector
    get() {
        if (_tooltip != null) return _tooltip!!
        _tooltip = tablerOutlineIcon(
            name = "Tooltip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 10.000 18.000 C 10.000 19.105 10.895 20.000 12.000 20.000 C 13.105 20.000 14.000 19.105 14.000 18.000 C 14.000 16.895 13.105 16.000 12.000 16.000 C 10.895 16.000 10.000 16.895 10.000 18.000"),
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
        pathData = parseSvgPathData("M 12.000 13.000 L 10.293 11.293 C 10.106 11.105 9.851 11.000 9.586 11.000 L 7.000 11.000 C 5.895 11.000 5.000 10.105 5.000 9.000 L 5.000 6.000 C 5.000 4.895 5.895 4.000 7.000 4.000 L 17.000 4.000 C 18.105 4.000 19.000 4.895 19.000 6.000 L 19.000 9.000 C 19.000 10.105 18.105 11.000 17.000 11.000 L 14.414 11.000 C 14.149 11.000 13.894 11.105 13.707 11.293 L 12.000 13.000"),
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
        return _tooltip!!
    }

private var _tooltip: ImageVector? = null
