package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveformSlash: ImageVector
    get() {
        if (_waveformSlash != null) return _waveformSlash!!
        _waveformSlash = phosphorBoldIcon(
            name = "WaveformSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M60 96v64c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-64C36 89.373 41.373 84 48 84c6.627 0 12 5.373 12 12ZM56.88 31.93C54.012 28.697 49.628 27.256 45.401 28.157c-4.226 .901-7.642 4.005-8.942 8.126-1.3 4.121-.284 8.623 2.661 11.786L76 88.64v135.36c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-109l16 17.6v59.4c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-33l59.12 65c4.478 4.81 11.991 5.124 16.854 .704 4.863-4.42 5.267-11.928 .906-16.844ZM128 80.54c6.627 0 12-5.373 12-12v-4.54c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v4.54c0 6.627 5.373 12 12 12ZM168 124.54c6.627 0 12-5.373 12-12v-16.54c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12v16.54c0 6.627 5.373 12 12 12ZM208 68c-6.627 0-12 5.373-12 12v76.54c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-76.54c0-6.627-5.373-12-12-12Z"),
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
        return _waveformSlash!!
    }

private var _waveformSlash: ImageVector? = null
