package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.WaveformSlash: ImageVector
    get() {
        if (_waveformSlash != null) return _waveformSlash!!
        _waveformSlash = phosphorThinIcon(
            name = "WaveformSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M52 96v64c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-64c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM51 37.31C49.514 35.653 46.967 35.514 45.31 37c-1.657 1.486-1.796 4.033-.31 5.69L84 85.55v138.45c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-129.65l32 35.2v62.45c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-53.65l73 80.34c.956 1.078 2.417 1.558 3.826 1.258 1.409-.3 2.547-1.335 2.981-2.709 .433-1.374 .095-2.874-.887-3.929ZM88 40.43c2.209 0 4-1.791 4-4v-4.43c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v4.43c0 2.209 1.791 4 4 4ZM128 84.43c2.209 0 4-1.791 4-4v-16.43c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v16.43c0 2.209 1.791 4 4 4ZM168 128.43c2.209 0 4-1.791 4-4v-28.43c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v28.43c0 2.209 1.791 4 4 4ZM208 76c-2.209 0-4 1.791-4 4v88.43c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-88.43c0-2.209-1.791-4-4-4Z"),
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
