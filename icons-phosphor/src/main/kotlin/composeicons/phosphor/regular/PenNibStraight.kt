package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PenNibStraight: ImageVector
    get() {
        if (_penNibStraight != null) return _penNibStraight!!
        _penNibStraight = phosphorRegularIcon(
            name = "PenNibStraight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222.33 123.89c-.06-.13-.12-.26-.19-.38L192 69.9v-37.9c0-8.837-7.163-16-16-16h-96C71.163 16 64 23.163 64 32v37.92L33.86 123.51c-.07 .12-.13 .25-.2 .38-2.662 5.359-2.099 11.759 1.46 16.57l.11 .14 86.44 112.28c1.515 1.964 3.855 3.115 6.335 3.115 2.48 0 4.82-1.15 6.335-3.115L220.77 140.6l.11-.14c3.56-4.812 4.12-11.213 1.45-16.57ZM176 32v32h-96v-32ZM128 144c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM136 224.5v-65.67c13.323-3.972 21.714-17.118 19.707-30.875C153.7 114.198 141.903 103.997 128 103.997c-13.903 0-25.7 10.201-27.707 23.958-2.007 13.757 6.384 26.903 19.707 30.875v65.66L48 131 76.69 80h102.63L208 131Z"),
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
