package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Paperclip: ImageVector
    get() {
        if (_paperclip != null) return _paperclip!!
        _paperclip = phosphorLightIcon(
            name = "Paperclip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208.25 123.76c1.127 1.125 1.76 2.653 1.76 4.245 0 1.592-.633 3.12-1.76 4.245l-82.06 82c-21.095 21.086-55.289 21.08-76.375-.015C28.729 193.14 28.735 158.946 49.83 137.86L149.1 37.14c14.834-14.848 38.897-14.859 53.745-.025 14.848 14.834 14.859 38.897 .025 53.745L103.59 191.54c-8.585 8.602-22.518 8.615-31.12 .03-8.602-8.585-8.615-22.518-.03-31.12L155.72 75.78c2.325-2.364 6.126-2.395 8.49-.07 2.364 2.325 2.395 6.126 .07 8.49L81 168.91c-3.916 3.896-3.931 10.229-.035 14.145 3.896 3.916 10.229 3.931 14.145 .035L194.35 82.4c10.162-10.145 10.175-26.608 .03-36.77C184.235 35.468 167.772 35.455 157.61 45.6L58.33 146.28c-16.414 16.395-16.43 42.991-.035 59.405 16.395 16.414 42.991 16.43 59.405 .035l82.06-82c1.131-1.121 2.661-1.747 4.253-1.74 1.592 .007 3.117 .648 4.237 1.78Z"),
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
        return _paperclip!!
    }

private var _paperclip: ImageVector? = null
