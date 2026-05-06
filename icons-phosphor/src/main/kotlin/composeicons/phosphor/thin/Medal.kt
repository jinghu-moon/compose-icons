package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Medal: ImageVector
    get() {
        if (_medal != null) return _medal!!
        _medal = phosphorThinIcon(
            name = "Medal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 96C212.033 56.741 184.868 22.696 146.582 14.011 108.296 5.327 69.101 24.319 52.191 59.749 35.282 95.18 45.168 137.597 76 161.9v78.1c0 2.209 1.791 4 4 4 .621-.001 1.233-.145 1.79-.42L128 220.47l46.22 23.11c1.24 .616 2.709 .547 3.886-.182 1.177-.729 1.893-2.014 1.894-3.398v-78.1C200.201 145.997 211.995 121.71 212 96ZM172 233.53 129.78 212.42c-1.127-.564-2.453-.564-3.58 0L84 233.53v-66c26.973 16.641 61.027 16.641 88 0ZM128 172C86.026 172 52 137.974 52 96 52 54.026 86.026 20 128 20c41.974 0 76 34.026 76 76-.044 41.955-34.045 75.956-76 76ZM128 44C99.281 44 76 67.281 76 96c0 28.719 23.281 52 52 52 28.719 0 52-23.281 52-52C179.967 67.295 156.705 44.033 128 44ZM128 140C103.699 140 84 120.301 84 96 84 71.699 103.699 52 128 52c24.301 0 44 19.699 44 44-.028 24.289-19.711 43.972-44 44Z"),
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
        return _medal!!
    }

private var _medal: ImageVector? = null
