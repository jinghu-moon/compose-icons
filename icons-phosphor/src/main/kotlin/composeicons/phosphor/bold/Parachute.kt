package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorBoldIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M236 120C235.934 60.381 187.619 12.066 128 12h0C68.381 12.066 20.066 60.381 20 120c.005 3.338 1.4 6.523 3.85 8.79l.22 .2c.17 .15 .35 .31 .54 .45l.19 .16L116 198v14h-4c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h32c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-4v-14l91.2-68.4h0C234.222 127.334 236 123.777 236 120ZM211.15 108h-31.52c-1.79-29.27-10-50.53-18.93-65.36 27.069 11.492 46.189 36.263 50.45 65.36ZM100.42 108C103.15 68.76 119 48.11 128 39.38c9 8.73 24.85 29.38 27.58 68.62ZM95.3 42.64C86.3 57.47 78.16 78.73 76.37 108h-31.52C49.111 78.903 68.231 54.132 95.3 42.64ZM68 132h48v36ZM140 132h48l-48 36Z"),
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
        return _parachute!!
    }

private var _parachute: ImageVector? = null
