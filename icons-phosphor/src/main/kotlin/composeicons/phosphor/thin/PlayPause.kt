package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.PlayPause: ImageVector
    get() {
        if (_playPause != null) return _playPause!!
        _playPause = phosphorThinIcon(
            name = "PlayPause",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M180 64v128c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-128c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM224 60c-2.209 0-4 1.791-4 4v128c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-128c0-2.209-1.791-4-4-4ZM140 128c.02 4.055-2.051 7.834-5.48 10L46.33 194.12c-3.687 2.335-8.351 2.485-12.18 .39C30.336 192.465 27.969 188.477 28 184.15v-112.3c-.031-4.327 2.336-8.315 6.15-10.36 3.829-2.095 8.493-1.945 12.18 .39L134.52 118c3.429 2.166 5.5 5.945 5.48 10ZM132 128c.006-1.31-.668-2.529-1.78-3.22L42 68.63c-.623-.403-1.348-.621-2.09-.63-.668 .004-1.325 .176-1.91 .5-1.239 .656-2.01 1.948-2 3.35v112.3c-.01 1.402 .761 2.694 2 3.35 1.256 .694 2.792 .644 4-.13l88.18-56.15c1.128-.682 1.818-1.902 1.82-3.22Z"),
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
