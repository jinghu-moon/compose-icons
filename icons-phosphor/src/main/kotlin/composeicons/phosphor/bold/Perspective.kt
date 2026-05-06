package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Perspective: ImageVector
    get() {
        if (_perspective != null) return _perspective!!
        _perspective = phosphorBoldIcon(
            name = "Perspective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 116h-12v-68c-.002-5.93-2.635-11.553-7.189-15.351-4.553-3.798-10.557-5.38-16.391-4.319l-160 29.09C34.914 59.15 28.003 67.428 28 77.09v38.91h-12C9.373 116 4 121.373 4 128c0 6.627 5.373 12 12 12h12v38.91c.003 9.662 6.914 17.94 16.42 19.67l160 29.09c5.834 1.061 11.838-.521 16.391-4.319 4.553-3.798 7.187-9.421 7.189-15.351v-68h12c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM52 80.43 204 52.8v63.2h-152ZM204 203.2 52 175.57v-35.57h152Z"),
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
        return _perspective!!
    }

private var _perspective: ImageVector? = null
