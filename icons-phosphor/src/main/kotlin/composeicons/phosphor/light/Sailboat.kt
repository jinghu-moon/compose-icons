package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorLightIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M245.41 173.4c-1-2.079-3.103-3.401-5.41-3.4h-98v-28h74c2.36-.013 4.494-1.408 5.452-3.565 .958-2.157 .562-4.676-1.012-6.435L142 45.68v-37.68c0-2.541-1.6-4.806-3.995-5.656-2.395-.849-5.065-.098-6.665 1.876L27.34 132.22c-1.458 1.797-1.752 4.272-.757 6.361 .995 2.089 3.103 3.419 5.417 3.419h98v28h-114c-2.308-.002-4.413 1.319-5.413 3.399-1 2.08-.719 4.549 .723 6.351l29.6 37c2.657 3.319 6.679 5.25 10.93 5.25h152.32c4.251 0 8.273-1.931 10.93-5.25l29.6-37c1.441-1.802 1.721-4.271 .72-6.35ZM202.41 130h-60.41v-66.48ZM44.61 130 130 24.9v105.1ZM205.72 209.25c-.379 .474-.953 .75-1.56 .75h-152.32c-.607-0-1.181-.276-1.56-.75L28.48 182h199Z"),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
