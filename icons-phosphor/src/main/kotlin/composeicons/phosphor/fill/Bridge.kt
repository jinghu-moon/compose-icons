package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorFillIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 160h-8v-39.5c1.63 .81 3.29 1.57 5 2.26 4.074 1.57 8.655-.417 10.292-4.465 1.638-4.048-.273-8.661-4.292-10.365C213.8 99.42 199.932 78.844 200 56c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 30.928-25.072 56-56 56C97.072 112 72 86.928 72 56c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 .068 22.844-13.8 43.42-35 51.93-4.02 1.705-5.93 6.318-4.292 10.365 1.638 4.048 6.218 6.035 10.292 4.465 1.71-.69 3.37-1.45 5-2.26v39.5h-7.4C18.29 160 16 164.78 16 168c0 4.418 3.582 8 8 8h32v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h112v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM72 152c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-47.88c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM112 152c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-19.68c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM160 152c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-19.68c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM200 152c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-47.88c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _bridge!!
    }

private var _bridge: ImageVector? = null
