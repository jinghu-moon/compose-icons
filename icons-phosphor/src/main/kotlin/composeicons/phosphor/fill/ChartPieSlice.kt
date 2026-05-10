package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ChartPieSlice: ImageVector
    get() {
        if (_chartPieSlice != null) return _chartPieSlice!!
        _chartPieSlice = phosphorFillIcon(
            name = "ChartPieSlice",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M100 116.43c2.476-1.429 4.001-4.071 4-6.93v-72c-.014-2.588-1.28-5.009-3.397-6.498C98.487 29.513 95.781 29.139 93.34 30 45.102 47.072 16.435 96.681 25.73 147c.473 2.556 2.159 4.723 4.52 5.81 1.049 .49 2.192 .743 3.35 .74 1.404 .001 2.784-.368 4-1.07ZM88 49.62v55.26L40.12 132.51C40 131 40 129.48 40 128 40.029 94.937 58.563 64.673 88 49.62ZM232 128c.016 46.935-31.406 88.065-76.695 100.387C110.017 240.71 62.087 221.172 38.32 180.7c-1.089-1.837-1.398-4.032-.859-6.098 .539-2.066 1.882-3.831 3.729-4.902L120 123.83v-91.83c0-4.418 3.582-8 8-8 36.929 .019 71.082 19.611 89.74 51.48 .11 .16 .21 .32 .31 .49 .1 .17 .2 .37 .29 .55C227.313 92.192 232.023 109.941 232 128Z"),
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
