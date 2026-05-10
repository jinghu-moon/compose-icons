package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.VkFill: ImageVector
    get() {
        if (_vkFill != null) return _vkFill!!
        _vkFill = remixIcon(
            name = "VkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M4.26 4.26C3 5.532 3 7.566 3 11.64v.72c0 4.068 0 6.102 1.26 7.38C5.532 21 7.566 21 11.64 21h.72c4.068 0 6.102 0 7.38-1.26C21 18.468 21 16.434 21 12.36v-.72C21 7.572 21 5.538 19.74 4.26 18.468 3 16.434 3 12.36 3h-.72C7.572 3 5.538 3 4.26 4.26ZM6.036 8.478h2.064c.066 3.432 1.578 4.884 2.778 5.184v-5.184h1.938v2.958c1.182-.126 2.43-1.476 2.85-2.964h1.932c-.158 .77-.472 1.5-.924 2.143-.452 .643-1.032 1.186-1.704 1.595 .749 .373 1.411 .9 1.942 1.548 .531 .647 .918 1.4 1.136 2.208h-2.13c-.456-1.422-1.596-2.526-3.102-2.676v2.676h-.234-.006C8.472 15.966 6.132 13.158 6.036 8.478Z"),
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
        return _vkFill!!
    }

private var _vkFill: ImageVector? = null
