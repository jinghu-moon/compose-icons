package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ChatSlash: ImageVector
    get() {
        if (_chatSlash != null) return _chatSlash!!
        _chatSlash = phosphorLightIcon(
            name = "ChatSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52.44 36c-2.277-2.113-5.79-2.139-8.098-.06-2.308 2.079-2.647 5.576-.782 8.06L49 50h-9C32.268 50 26 56.268 26 64v160c-.035 5.453 3.132 10.42 8.09 12.69 4.956 2.355 10.834 1.571 15-2L82.23 206h108.57l12.76 14c1.434 1.616 3.626 2.337 5.739 1.886 2.113-.451 3.821-2.003 4.471-4.063 .65-2.061 .142-4.312-1.33-5.893ZM80 194c-1.439 .001-2.831 .519-3.92 1.46l-34.79 30c-.585 .495-1.402 .612-2.102 .301C38.487 225.45 38.026 224.766 38 224v-160c0-1.105 .895-2 2-2h19.89l120 132ZM230 64v122c0 3.314-2.686 6-6 6-3.314 0-6-2.686-6-6v-122c0-1.105-.895-2-2-2h-110.21c-3.314 0-6-2.686-6-6 0-3.314 2.686-6 6-6h110.21c7.732 0 14 6.268 14 14Z"),
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
        return _chatSlash!!
    }

private var _chatSlash: ImageVector? = null
