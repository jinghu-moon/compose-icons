package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorDuotoneIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M132.37 134.59 44.18 190.74c-2.424 1.555-5.502 1.669-8.034 .299C33.613 189.668 32.025 187.03 32 184.15v-112.3c.025-2.88 1.613-5.518 4.146-6.889 2.533-1.37 5.61-1.256 8.034 .299l88.19 56.15c2.258 1.43 3.627 3.917 3.627 6.59 0 2.673-1.369 5.16-3.627 6.59Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M184 64v128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-128c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8ZM224 56c-4.418 0-8 3.582-8 8v128c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-128c0-4.418-3.582-8-8-8ZM144 128c.008 5.41-2.759 10.446-7.33 13.34L48.48 197.49c-4.888 3.125-11.089 3.342-16.183 .566C27.203 195.28 24.024 189.951 24 184.15v-112.3c.024-5.801 3.203-11.13 8.297-13.906 5.094-2.776 11.295-2.559 16.183 .566l88.19 56.15c4.571 2.894 7.338 7.93 7.33 13.34ZM127.82 128 40 72.08v111.85Z"),
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
