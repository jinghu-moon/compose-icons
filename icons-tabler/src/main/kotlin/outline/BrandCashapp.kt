package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandCashapp: ImageVector
    get() {
        if (_brandCashapp != null) return _brandCashapp!!
        _brandCashapp = tablerOutlineIcon(
            name = "BrandCashapp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.100 8.648 C 16.887 8.846 16.558 8.851 16.339 8.659 C 15.315 7.795 14.019 7.320 12.680 7.319 C 11.578 7.319 10.475 7.682 10.475 8.693 C 10.475 9.716 11.657 10.057 13.021 10.568 C 15.407 11.364 17.384 12.364 17.384 14.705 C 17.384 17.250 15.407 19.000 12.180 19.193 L 11.885 20.557 C 11.831 20.815 11.603 21.000 11.339 21.000 L 9.305 21.000 L 9.203 20.989 C 8.900 20.921 8.708 20.623 8.771 20.319 L 9.089 18.875 C 7.864 18.568 6.738 17.954 5.816 17.091 L 5.816 17.080 C 5.713 16.978 5.655 16.839 5.655 16.694 C 5.655 16.548 5.713 16.409 5.816 16.307 L 6.953 15.205 C 7.167 15.005 7.500 15.005 7.714 15.205 C 8.754 16.187 10.136 16.725 11.566 16.705 C 13.044 16.705 14.032 16.080 14.032 15.091 C 14.032 14.102 13.032 13.841 11.146 13.137 C 9.146 12.421 7.248 11.409 7.248 9.046 C 7.248 6.296 9.532 4.955 12.237 4.830 L 12.521 3.432 C 12.575 3.176 12.804 2.994 13.066 3.000 L 15.089 3.000 L 15.203 3.012 C 15.345 3.042 15.469 3.127 15.548 3.248 C 15.626 3.370 15.654 3.517 15.623 3.659 L 15.316 5.216 C 16.347 5.558 17.304 6.095 18.134 6.796 L 18.157 6.818 C 18.373 7.046 18.373 7.387 18.157 7.591 L 17.100 8.648"),
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
        return _brandCashapp!!
    }

private var _brandCashapp: ImageVector? = null
