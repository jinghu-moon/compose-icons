package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandWeibo: ImageVector
    get() {
        if (_brandWeibo != null) return _brandWeibo!!
        _brandWeibo = tablerOutlineIcon(
            name = "BrandWeibo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.000 14.127 C 19.000 17.200 15.498 20.000 11.000 20.000 C 6.874 20.000 3.000 17.776 3.000 14.435 C 3.000 12.655 3.984 10.698 5.700 8.868 C 8.062 6.358 10.893 5.181 12.251 6.630 C 12.666 7.070 13.003 8.020 13.000 8.692 C 15.000 7.077 17.308 9.079 16.500 11.385 C 17.760 11.942 19.000 11.923 19.000 14.127"),
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
        pathData = parseSvgPathData("M 15.000 4.000 L 16.000 4.000 C 18.761 4.000 21.000 6.239 21.000 9.000 L 21.000 10.000"),
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
        return _brandWeibo!!
    }

private var _brandWeibo: ImageVector? = null
