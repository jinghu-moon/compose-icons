package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.StarHalf: ImageVector
    get() {
        if (_starHalf != null) return _starHalf!!
        _starHalf = tablerFilledIcon(
            name = "StarHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 1.000 C 12.331 1.001 12.640 1.167 12.823 1.443 L 12.890 1.559 L 15.742 7.340 L 22.122 8.265 C 22.863 8.373 23.202 9.205 22.825 9.791 L 22.755 9.886 L 22.677 9.972 L 18.053 14.471 L 19.143 20.826 C 19.201 21.163 19.083 21.506 18.830 21.736 C 18.577 21.966 18.224 22.051 17.894 21.961 L 17.793 21.926 L 17.692 21.880 L 11.999 18.880 L 6.293 21.880 C 6.188 21.935 6.081 21.970 5.973 21.986 L 5.867 21.996 C 5.585 22.006 5.311 21.897 5.114 21.695 C 4.916 21.494 4.813 21.218 4.829 20.936 L 4.842 20.826 L 5.932 14.471 L 1.309 9.971 C 1.066 9.734 0.959 9.391 1.026 9.058 C 1.092 8.726 1.322 8.449 1.637 8.324 L 1.750 8.288 L 1.864 8.265 L 8.243 7.340 L 11.096 1.560 C 11.259 1.210 11.614 0.990 12.000 1.000 ZM 12.000 4.274 L 12.000 16.750 C 12.081 16.750 12.161 16.760 12.239 16.779 L 12.354 16.815 L 12.466 16.865 L 16.829 19.164 L 15.993 14.291 C 15.952 14.050 16.000 13.803 16.129 13.595 L 16.199 13.496 L 16.281 13.406 L 19.827 9.953 L 14.936 9.245 C 14.694 9.210 14.474 9.088 14.316 8.901 L 14.243 8.804 L 14.183 8.698 L 12.000 4.274 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _starHalf!!
    }

private var _starHalf: ImageVector? = null
