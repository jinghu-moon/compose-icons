package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Voicemail: ImageVector
    get() {
        if (_voicemail != null) return _voicemail!!
        _voicemail = phosphorThinIcon(
            name = "Voicemail",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M200 76c-23.154 .023-43.504 15.354-49.915 37.603-6.411 22.249 2.662 46.057 22.255 58.397h-88.68c21.924-13.809 30.337-41.65 19.729-65.289C92.782 83.072 66.389 70.849 41.5 78.047 16.61 85.246 .817 109.67 4.465 135.322 8.114 160.974 30.09 180.026 56 180h144c28.719 0 52-23.281 52-52C252 99.281 228.719 76 200 76ZM12 128C12 103.699 31.699 84 56 84c24.301 0 44 19.699 44 44 0 24.301-19.699 44-44 44C31.711 171.972 12.028 152.289 12 128ZM200 172c-24.301 0-44-19.699-44-44 0-24.301 19.699-44 44-44 24.301 0 44 19.699 44 44-.028 24.289-19.711 43.972-44 44Z"),
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
        return _voicemail!!
    }

private var _voicemail: ImageVector? = null
