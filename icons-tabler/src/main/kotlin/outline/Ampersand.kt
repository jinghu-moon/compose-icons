package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Ampersand: ImageVector
    get() {
        if (_ampersand != null) return _ampersand!!
        _ampersand = tablerOutlineIcon(
            name = "Ampersand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 20.000 L 8.597 9.028 C 7.448 7.877 7.448 6.014 8.597 4.863 C 9.148 4.311 9.897 4.000 10.677 4.000 C 11.458 4.000 12.207 4.311 12.758 4.863 C 13.907 6.014 13.907 7.877 12.758 9.028 L 8.078 13.715 C 6.642 15.154 6.642 17.483 8.078 18.922 C 8.767 19.612 9.703 20.000 10.678 20.000 C 11.653 20.000 12.589 19.612 13.278 18.922 L 19.000 13.000"),
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
        return _ampersand!!
    }

private var _ampersand: ImageVector? = null
