package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBebo: ImageVector
    get() {
        if (_brandBebo != null) return _brandBebo!!
        _brandBebo = tablerOutlineIcon(
            name = "BrandBebo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 17.500 C 13.933 17.500 15.500 15.933 15.500 14.000 C 15.500 12.162 14.341 10.998 12.495 10.628 C 11.749 10.478 11.125 9.883 11.125 9.122 C 11.125 7.980 12.059 7.027 13.183 7.228 C 16.793 7.873 19.000 10.286 19.000 14.000 C 19.000 17.866 15.866 21.000 12.000 21.000 C 8.134 21.000 5.000 17.866 5.000 14.000 L 5.000 4.750 C 5.000 3.784 5.784 3.000 6.750 3.000 C 7.716 3.000 8.500 3.784 8.500 4.750 L 8.500 14.000 C 8.500 15.933 10.067 17.500 12.000 17.500"),
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
        return _brandBebo!!
    }

private var _brandBebo: ImageVector? = null
