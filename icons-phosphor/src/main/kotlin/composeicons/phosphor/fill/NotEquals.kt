package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorFillIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 32h-160C39.163 32 32 39.163 32 48v160c0 8.837 7.163 16 16 16h160c8.837 0 16-7.163 16-16v-160c0-8.837-7.163-16-16-16ZM184 144c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-73.37L78 197.27c-2.978 3.008-7.784 3.176-10.965 .383C63.855 194.859 63.401 190.071 66 186.73L89.37 160h-17.37c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h31.37l28-32h-59.37c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h73.37L178 58.73c1.825-2.346 4.8-3.487 7.725-2.963 2.925 .524 5.319 2.627 6.216 5.46 .897 2.833 .149 5.931-1.941 8.043L166.63 96h17.37c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-31.37l-28 32Z"),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
