package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Confetti: ImageVector
    get() {
        if (_confetti != null) return _confetti!!
        _confetti = phosphorBoldIcon(
            name = "Confetti",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M114.32 49.8C109.542 45.012 102.649 42.997 96.045 44.455 89.44 45.914 84.037 50.645 81.72 57L29.22 201.41c-2.202 6.06-1.32 12.812 2.367 18.102 3.686 5.29 9.716 8.456 16.163 8.488 2.334-.004 4.649-.417 6.84-1.22L199 174.28c6.361-2.308 11.102-7.707 12.569-14.313 1.467-6.606-.543-13.504-5.329-18.287ZM104.19 183.21 72.79 151.81 82.94 123.9l49.16 49.16ZM51.77 209.61ZM63.77 176.7l15.53 15.56-24.45 8.89ZM157 164 92 99 102 71.42 184.57 154ZM128 40v-24C128 9.373 133.373 4 140 4c6.627 0 12 5.373 12 12v24c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM244.48 123.51c4.694 4.694 4.694 12.306 0 17-4.694 4.694-12.306 4.694-17 0l-16-16c-4.694-4.694-4.694-12.306 0-17 4.694-4.694 12.306-4.694 17 0ZM243.79 83.38l-24 8c-6.288 2.096-13.084-1.302-15.18-7.59-2.096-6.288 1.302-13.084 7.59-15.18l24-8c6.288-2.096 13.084 1.302 15.18 7.59 2.096 6.288-1.302 13.084-7.59 15.18ZM156.6 65.93C159.83 47.47 173.39 36 192 36c6.45 0 8.69-2.49 10-4.92 1.166-2.24 1.847-4.7 2-7.22v.14c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 14.47-9.59 36-36 36-4.94 0-10.21 1.19-11.76 10.06-1.001 5.742-5.982 9.934-11.81 9.94-.697-.001-1.393-.061-2.08-.18-6.528-1.143-10.893-7.362-9.75-13.89Z"),
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
        return _confetti!!
    }

private var _confetti: ImageVector? = null
