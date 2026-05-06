package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = radixIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M11.601 1.007c.228 .047 .399 .249 .399 .49v4.003c-0 .276-.224 .5-.5 .5h-2.864l2.894 3.162 .045 .058c.095 .141 .113 .323 .043 .481-.08 .181-.259 .299-.457 .299h-3.16v3.5c-0 .202-.122 .385-.309 .462-.187 .077-.402 .035-.545-.108l-4-4C3.053 9.76 3 9.633 3 9.5v-4l.01-.101c.046-.228 .248-.399 .49-.399h2.865L3.471 1.834C3.337 1.688 3.303 1.477 3.383 1.296c.08-.181 .259-.299 .457-.299h7.66l.101 .01ZM7 12.293v-2.293h-2.293L7 12.293ZM4 9h6.025l-2.745-3h-3.28v3ZM7.721 5h3.279v-3.003h-6.025L7.721 5Z"),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
