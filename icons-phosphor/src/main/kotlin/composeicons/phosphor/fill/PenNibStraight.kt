package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorFillIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.33 123.89c-.06-.13-.12-.26-.19-.38L192 69.91v-37.91c0-8.837-7.163-16-16-16h-96C71.163 16 64 23.163 64 32v37.9L33.86 123.51c-.07 .12-.13 .25-.2 .38-2.662 5.359-2.099 11.759 1.46 16.57l.11 .14 77.61 100.81c1.043 1.345 2.823 1.882 4.436 1.339 1.613-.543 2.706-2.047 2.724-3.749v-84.37c-11.02-3.896-17.631-15.165-15.654-26.686 1.977-11.521 11.965-19.942 23.654-19.942 11.689 0 21.678 8.421 23.654 19.942 1.977 11.521-4.634 22.79-15.654 26.686v84.37c.005 1.707 1.094 3.223 2.71 3.774 1.616 .551 3.404 .015 4.45-1.334L220.76 140.63l.11-.14c3.575-4.816 4.139-11.233 1.46-16.6ZM176 64h-96v-32h96Z"),
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
        return _penNibStraight!!
    }

private var _penNibStraight: ImageVector? = null
