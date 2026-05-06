package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorLightIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 26C71.667 26 26 71.667 26 128c0 56.333 45.667 102 102 102 56.333 0 102-45.667 102-102C229.934 71.694 184.306 26.066 128 26ZM165.52 122c-.94-5.88-3.256-11.455-6.76-16.27l37-36.95c13.004 14.831 20.751 33.538 22.04 53.22ZM154 128c0 14.359-11.641 26-26 26-14.359 0-26-11.641-26-26 0-14.359 11.641-26 26-26 14.359 0 26 11.641 26 26ZM128 218C87.994 218.031 52.769 191.651 41.545 153.251 30.32 114.852 45.79 73.653 79.515 52.132c33.725-21.521 77.607-18.197 107.705 8.158L150.27 97.24c-13.776-9.969-32.498-9.572-45.839 .972C91.089 108.756 86.377 126.879 92.893 142.586c6.516 15.707 22.674 25.173 39.561 23.176 16.887-1.996 30.392-14.969 33.066-31.762h52.28c-3.216 47.244-42.447 83.941-89.8 84Z"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
