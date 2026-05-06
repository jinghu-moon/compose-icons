package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FilmStrip: ImageVector
    get() {
        if (_filmStrip != null) return _filmStrip!!
        _filmStrip = phosphorLightIcon(
            name = "FilmStrip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 42h-176C32.268 42 26 48.268 26 56v144c0 7.732 6.268 14 14 14h176c7.732 0 14-6.268 14-14v-144c0-7.732-6.268-14-14-14ZM38 86h84v84h-84ZM134 74v-20h36v20ZM122 74h-36v-20h36ZM122 182v20h-36v-20ZM134 182h36v20h-36ZM134 170v-84h84v84ZM218 56v18h-36v-20h34c1.105 0 2 .895 2 2ZM40 54h34v20h-36v-18c0-1.105 .895-2 2-2ZM38 200v-18h36v20h-34c-1.105 0-2-.895-2-2ZM216 202h-34v-20h36v18c0 1.105-.895 2-2 2Z"),
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
        return _filmStrip!!
    }

private var _filmStrip: ImageVector? = null
