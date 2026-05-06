package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bird: ImageVector
    get() {
        if (_bird != null) return _bird!!
        _bird = phosphorLightIcon(
            name = "Bird",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M174 68c0 5.523-4.477 10-10 10-5.523 0-10-4.477-10-10 0-5.523 4.477-10 10-10 5.523 0 10 4.477 10 10ZM238 80c.003 2.009-.999 3.885-2.67 5L214 99.21v20.79c-.066 56.306-45.694 101.934-102 102h-88c-5.383 0-10.289-3.085-12.62-7.937C9.049 209.211 9.706 203.452 13.07 199.25l.07-.09L98 97.35v-20.46C98 44.57 123.89 18.15 155.72 18h.28c25.541-.008 48.081 16.693 55.51 41.13L235.33 75c1.671 1.115 2.673 2.991 2.67 5ZM221.18 80 203 67.88c-1.226-.816-2.108-2.055-2.48-3.48C195.24 44.137 176.94 29.997 156 30h-.23C130.53 30.12 110 51.16 110 76.89v22.63c.002 1.407-.49 2.769-1.39 3.85L22.43 206.78c-.463 .602-.546 1.414-.213 2.097 .333 .683 1.024 1.118 1.783 1.123h27.86l71.53-85.84c2.129-2.515 5.888-2.842 8.419-.733 2.532 2.109 2.889 5.865 .801 8.413L67.48 210h44.52c49.683-.055 89.945-40.317 90-90v-24c-.003-2.009 .999-3.885 2.67-5Z"),
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
        return _bird!!
    }

private var _bird: ImageVector? = null
