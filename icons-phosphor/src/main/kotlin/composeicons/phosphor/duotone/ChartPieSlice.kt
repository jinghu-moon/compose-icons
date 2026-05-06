package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorDuotoneIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 37.5v72l-62.4 36C24.994 99.05 51.461 53.244 96 37.5Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M100 116.43c2.476-1.429 4.001-4.071 4-6.93v-72c-.014-2.588-1.28-5.009-3.397-6.498C98.487 29.513 95.781 29.139 93.34 30 45.102 47.072 16.435 96.681 25.73 147c.473 2.556 2.159 4.723 4.52 5.81 1.049 .49 2.192 .743 3.35 .74 1.404 .001 2.784-.368 4-1.07ZM88 49.62v55.26L40.12 132.51C40 131 40 129.48 40 128 40.029 94.937 58.563 64.673 88 49.62ZM128 24c-4.418 0-8 3.582-8 8v91.82L41.19 169.73c-1.847 1.071-3.19 2.836-3.729 4.902-.539 2.066-.23 4.262 .859 6.098 25.533 43.406 78.497 62.283 125.728 44.808 47.231-17.474 75.155-66.277 66.289-115.85C221.47 60.116 178.359 24.019 128 24ZM128 216C99.672 215.924 73.093 202.287 56.51 179.32l75.52-44c2.473-1.428 3.997-4.065 4-6.92v-88.04c46.876 4.253 82.106 44.639 79.957 91.659C213.837 179.039 175.069 216.042 128 216Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _chartPieSlice!!
    }

private var _chartPieSlice: ImageVector? = null
