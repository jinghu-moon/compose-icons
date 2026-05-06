package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Screencast: ImageVector
    get() {
        if (_screencast != null) return _screencast!!
        _screencast = phosphorBoldIcon(
            name = "Screencast",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M232 60v136c0 11.046-8.954 20-20 20h-40c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h36v-128h-160v4c0 6.627-5.373 12-12 12C29.373 80 24 74.627 24 68v-8C24 48.954 32.954 40 44 40h168c11.046 0 20 8.954 20 20ZM36 176c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 2.209 0 4 1.791 4 4 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C64 188.536 51.464 176 36 176ZM36 136c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 24.289 .028 43.972 19.711 44 44 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C103.961 166.461 73.539 136.039 36 136ZM36 96c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 46.371 .05 83.95 37.629 84 84 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12C143.934 144.381 95.619 96.066 36 96Z"),
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
        return _screencast!!
    }

private var _screencast: ImageVector? = null
