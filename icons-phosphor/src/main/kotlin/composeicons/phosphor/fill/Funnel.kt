package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorFillIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.81 66.76l-.08 .09L160 139.17v55.49c.008 5.36-2.669 10.368-7.13 13.34l-32 21.34c-4.914 3.273-11.23 3.574-16.433 .783C99.234 227.333 95.991 221.904 96 216v-76.83L28.27 66.85l-.08-.09C23.935 62.078 22.839 55.328 25.394 49.54 27.948 43.752 33.673 40.012 40 40h176c6.332 .001 12.068 3.736 14.63 9.526 2.562 5.791 1.468 12.547-2.79 17.234Z"),
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
        return _funnel!!
    }

private var _funnel: ImageVector? = null
