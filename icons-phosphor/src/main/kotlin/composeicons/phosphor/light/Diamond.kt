package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorLightIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M233.92 118.14 137.86 22.08c-5.458-5.415-14.262-5.415-19.72 0L22.08 118.14c-5.415 5.458-5.415 14.262 0 19.72l96.06 96.06h0c5.458 5.415 14.262 5.415 19.72 0l96-96.06c2.616-2.615 4.086-6.161 4.086-9.86 0-3.699-1.47-7.246-4.086-9.86ZM225.43 129.38l-96.05 96.06c-.773 .737-1.987 .737-2.76 0L30.57 129.38c-.737-.773-.737-1.987 0-2.76L126.62 30.56c.773-.737 1.987-.737 2.76 0l96.05 96.06c.737 .773 .737 1.987 0 2.76Z"),
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
        return _diamond!!
    }

private var _diamond: ImageVector? = null
