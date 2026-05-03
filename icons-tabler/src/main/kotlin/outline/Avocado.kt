package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Avocado: ImageVector
    get() {
        if (_avocado != null) return _avocado!!
        _avocado = tablerOutlineIcon(
            name = "Avocado",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 17.800 14.040 C 18.010 13.222 18.479 12.494 19.137 11.965 C 20.332 10.980 20.953 9.680 21.000 8.063 C 20.953 6.633 20.460 5.437 19.523 4.477 C 18.563 3.539 17.367 3.047 15.938 3.000 C 14.320 3.047 13.020 3.668 12.035 4.863 C 11.473 5.543 10.781 5.988 9.961 6.199 C 9.023 6.387 8.133 6.679 7.289 7.079 C 6.445 7.477 5.730 7.957 5.145 8.519 C 3.715 10.020 3.000 11.743 3.000 13.688 C 3.000 15.634 3.715 17.356 5.145 18.856 C 6.645 20.285 8.367 21.000 10.313 21.000 C 12.258 21.000 13.980 20.285 15.480 18.855 C 16.043 18.270 16.535 17.555 16.957 16.711 C 17.355 15.867 17.637 14.988 17.801 14.074 L 17.801 14.039 L 17.800 14.040"),
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
        pathData = parseSvgPathData("M 10.870 10.036 C 9.928 10.148 9.076 10.574 8.314 11.314 C 7.574 12.076 7.148 12.928 7.036 13.870 C 6.901 14.790 7.148 15.574 7.776 16.224 C 8.426 16.852 9.211 17.099 10.130 16.964 C 11.072 16.852 11.924 16.426 12.686 15.686 C 13.426 14.924 13.852 14.072 13.964 13.130 C 14.099 12.210 13.852 11.426 13.224 10.776 C 12.574 10.148 11.789 9.901 10.870 10.036"),
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
        return _avocado!!
    }

private var _avocado: ImageVector? = null
