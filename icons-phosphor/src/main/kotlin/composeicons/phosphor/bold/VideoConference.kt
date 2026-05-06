package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.VideoConference: ImageVector
    get() {
        if (_videoConference != null) return _videoConference!!
        _videoConference = phosphorBoldIcon(
            name = "VideoConference",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v144c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-144C236 44.954 227.046 36 216 36ZM212 116h-56v-56h56ZM52 120c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM44 169.77C46.69 161.84 55 156 64 156c9.43 0 18.19 6.44 20.38 15 1.657 6.418 8.202 10.277 14.62 8.62 6.418-1.657 10.277-8.202 8.62-14.62-2.409-9.115-7.733-17.192-15.16-23 10.718-13.959 9.772-33.622-2.236-46.488C78.215 82.646 58.664 80.348 44 90.08v-30.08h88v136h-88ZM156 196v-56h56v56ZM168 88c0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16 0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16ZM200 168c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _videoConference!!
    }

private var _videoConference: ImageVector? = null
