package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThumbsUp: ImageVector
    get() {
        if (_thumbsUp != null) return _thumbsUp!!
        _thumbsUp = phosphorBoldIcon(
            name = "ThumbsUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M237 77.47C231.683 71.447 224.034 67.998 216 68h-52v-12C163.972 31.711 144.289 12.028 120 12c-4.543 .001-8.697 2.567-10.73 6.63L72.58 92h-40.58c-11.046 0-20 8.954-20 20v88c0 11.046 8.954 20 20 20h172c14.121-.002 26.03-10.518 27.78-24.53l12-96c.999-7.966-1.47-15.978-6.78-22ZM36 116h32v80h-32ZM220 96.5l-12 96c-.253 2.012-1.972 3.516-4 3.5h-112v-89.17L126.82 37.2C134.731 40.07 139.999 47.585 140 56v24c0 6.627 5.373 12 12 12h64c1.153-.009 2.255 .48 3.021 1.342 .766 .862 1.123 2.013 .979 3.158Z"),
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
        return _thumbsUp!!
    }

private var _thumbsUp: ImageVector? = null
