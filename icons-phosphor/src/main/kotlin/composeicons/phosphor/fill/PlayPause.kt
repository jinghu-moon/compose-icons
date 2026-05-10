package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorFillIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 64v128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-128c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM224 56c-4.418 0-8 3.582-8 8v128c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-128c0-4.418-3.582-8-8-8ZM136.67 114.66 48.48 58.51C43.592 55.385 37.391 55.168 32.297 57.944 27.203 60.72 24.024 66.049 24 71.85v112.3c.013 5.772 3.167 11.079 8.23 13.85 5.107 2.805 11.337 2.601 16.25-.53l88.19-56.15c4.567-2.898 7.333-7.931 7.333-13.34 0-5.409-2.767-10.442-7.333-13.34Z"),
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
        return _playPause!!
    }

private var _playPause: ImageVector? = null
