package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScaleOutline: ImageVector
    get() {
        if (_scaleOutline != null) return _scaleOutline!!
        _scaleOutline = tablerOutlineIcon(
            name = "ScaleOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 3.000 7.000 C 3.000 4.791 4.791 3.000 7.000 3.000 L 17.000 3.000 C 19.209 3.000 21.000 4.791 21.000 7.000 L 21.000 17.000 C 21.000 19.209 19.209 21.000 17.000 21.000 L 7.000 21.000 C 4.791 21.000 3.000 19.209 3.000 17.000 L 3.000 7.000"),
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
        pathData = parseSvgPathData("M 12.000 7.000 C 13.956 7.000 15.724 7.802 17.000 9.095 L 14.044 11.999 C 13.490 11.485 12.762 11.200 12.006 11.200 C 11.250 11.200 10.523 11.485 9.968 11.998 L 7.012 9.095 C 8.328 7.751 10.131 6.996 12.012 7.000"),
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
        return _scaleOutline!!
    }

private var _scaleOutline: ImageVector? = null
