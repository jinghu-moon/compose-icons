package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Funnel: ImageVector
    get() {
        if (_funnel != null) return _funnel!!
        _funnel = phosphorBoldIcon(
            name = "Funnel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M234.29 47.91C231.088 40.67 223.917 36 216 36h-176c-7.915 .001-15.085 4.669-18.288 11.908-3.203 7.238-1.835 15.684 3.488 21.542l.12 .14L92 140.75v75.25c-.001 7.378 4.06 14.157 10.565 17.637 6.505 3.481 14.398 3.097 20.535-.997l32-21.33c5.564-3.712 8.904-9.961 8.9-16.65v-53.91L230.67 69.59l.12-.14c5.326-5.855 6.698-14.3 3.5-21.54ZM143.29 127.8c-2.1 2.215-3.276 5.148-3.29 8.2v56.52l-24 16v-72.52c-.003-3.047-1.165-5.978-3.25-8.2L49.23 60h157.54Z"),
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
