package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.WaveformSlash: ImageVector
    get() {
        if (_waveformSlash != null) return _waveformSlash!!
        _waveformSlash = phosphorRegularIcon(
            name = "WaveformSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M56 96v64c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-64c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM53.92 34.62C52.008 32.465 49.085 31.504 46.267 32.105c-2.818 .601-5.095 2.67-5.961 5.418-.867 2.748-.189 5.749 1.774 7.858L80 87.09v136.91c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-119.31l24 26.4v60.91c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-43.31l66.08 72.69c1.912 2.155 4.835 3.116 7.653 2.515 2.818-.601 5.095-2.67 5.961-5.418 .867-2.748 .189-5.749-1.774-7.858ZM88 44.43c4.418 0 8-3.582 8-8v-4.43c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v4.43c0 4.418 3.582 8 8 8ZM128 88.43c4.418 0 8-3.582 8-8v-16.43c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v16.43c0 4.418 3.582 8 8 8ZM168 132.43c4.418 0 8-3.582 8-8v-28.43c0-4.418-3.582-8-8-8-4.418 0-8 3.582-8 8v28.43c0 4.418 3.582 8 8 8ZM208 72c-4.418 0-8 3.582-8 8v88.43c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-88.43c0-4.418-3.582-8-8-8Z"),
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
