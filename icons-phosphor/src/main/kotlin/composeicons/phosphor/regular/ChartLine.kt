package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.ChartLine: ImageVector
    get() {
        if (_chartLine != null) return _chartLine!!
        _chartLine = phosphorRegularIcon(
            name = "ChartLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 208c0 4.418-3.582 8-8 8h-192c-4.418 0-8-3.582-8-8v-160c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v94.37L90.73 98c2.845-2.491 7.045-2.649 10.07-.38l58.81 44.11L218.73 90c2.112-2.091 5.209-2.838 8.043-1.941 2.833 .897 4.936 3.291 5.46 6.216 .524 2.925-.617 5.9-2.963 7.725l-64 56c-2.845 2.491-7.045 2.649-10.07 .38L96.39 114.29 40 163.63v36.37h184c4.418 0 8 3.582 8 8Z"),
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
        return _chartLine!!
    }

private var _chartLine: ImageVector? = null
