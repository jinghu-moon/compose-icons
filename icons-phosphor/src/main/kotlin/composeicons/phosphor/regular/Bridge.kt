package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorRegularIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 160h-32v-58.66c7.69 9.487 17.671 16.859 29 21.42 4.074 1.57 8.655-.417 10.292-4.465 1.638-4.048-.273-8.661-4.292-10.365C213.8 99.42 199.932 78.844 200 56c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 0 30.928-25.072 56-56 56C97.072 112 72 86.928 72 56c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8 .068 22.844-13.8 43.42-35 51.93-4.02 1.705-5.93 6.318-4.292 10.365 1.638 4.048 6.218 6.035 10.292 4.465 11.329-4.561 21.31-11.933 29-21.42v58.66h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h112v24c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-24h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM144 126.2v33.8h-32v-33.8c10.532 2.4 21.468 2.4 32 0ZM72 101.2c6.528 8.068 14.713 14.639 24 19.27v39.53h-24ZM160 160v-39.52c9.287-4.631 17.472-11.202 24-19.27v58.79Z"),
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
