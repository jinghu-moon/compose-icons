package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandTopbuzz: ImageVector
    get() {
        if (_brandTopbuzz != null) return _brandTopbuzz!!
        _brandTopbuzz = tablerOutlineIcon(
            name = "BrandTopbuzz",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 4.417 8.655 C 4.281 8.626 4.161 8.545 4.085 8.428 C 4.009 8.311 3.983 8.169 4.012 8.033 L 4.998 3.416 C 5.027 3.279 5.109 3.159 5.227 3.083 C 5.344 3.007 5.487 2.982 5.624 3.012 L 20.582 6.174 C 20.867 6.234 21.049 6.513 20.988 6.796 L 20.001 11.414 C 19.972 11.551 19.890 11.670 19.773 11.746 C 19.655 11.822 19.513 11.848 19.376 11.818 L 15.031 10.898 C 14.833 10.858 14.716 10.922 14.678 11.095 L 12.650 20.585 C 12.589 20.869 12.309 21.050 12.025 20.989 L 7.383 20.007 C 7.100 19.946 6.918 19.669 6.977 19.385 L 9.005 9.892 C 9.042 9.722 8.974 9.618 8.801 9.582 L 4.417 8.655"),
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
        return _brandTopbuzz!!
    }

private var _brandTopbuzz: ImageVector? = null
