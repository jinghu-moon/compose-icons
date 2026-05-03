package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRumble: ImageVector
    get() {
        if (_brandRumble != null) return _brandRumble!!
        _brandRumble = tablerOutlineIcon(
            name = "BrandRumble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 19.993 9.108 C 20.376 9.508 20.680 9.971 20.886 10.476 C 21.301 11.490 21.304 12.626 20.892 13.642 C 20.685 14.151 20.384 14.616 20.005 15.014 C 19.319 15.734 18.581 16.402 17.797 17.014 C 17.007 17.630 16.173 18.188 15.302 18.683 C 13.542 19.680 11.649 20.421 9.680 20.885 C 8.664 21.127 7.594 20.983 6.678 20.481 C 6.232 20.236 5.837 19.908 5.515 19.514 C 5.199 19.127 4.963 18.681 4.820 18.202 C 3.621 14.300 3.798 9.890 4.954 5.972 C 5.563 3.915 7.597 2.623 9.691 3.098 C 13.571 3.978 17.211 6.245 19.993 9.108"),
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
        pathData = parseSvgPathData("M 14.044 13.034 C 14.714 12.529 14.714 11.545 14.044 11.024 C 13.567 10.646 13.066 10.297 12.546 9.980 C 12.023 9.660 11.482 9.372 10.926 9.115 C 10.156 8.765 9.296 9.254 9.173 10.088 C 8.984 11.341 8.950 12.613 9.073 13.874 C 9.107 14.269 9.328 14.623 9.668 14.827 C 10.007 15.030 10.424 15.058 10.788 14.901 C 11.370 14.662 11.936 14.385 12.482 14.074 C 13.024 13.763 13.546 13.417 14.044 13.039 L 14.044 13.034"),
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
        return _brandRumble!!
    }

private var _brandRumble: ImageVector? = null
