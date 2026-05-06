package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Keyhole: ImageVector
    get() {
        if (_keyhole != null) return _keyhole!!
        _keyhole = phosphorDuotoneIcon(
            name = "Keyhole",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 139.72 160 176h-64l16-36.28C99.457 132.478 93.342 117.715 97.09 103.725 100.839 89.735 113.517 80.007 128 80.007c14.483 0 27.161 9.728 30.91 23.718 3.749 13.99-2.367 28.753-14.91 35.995Z"),
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
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM128 216C79.399 216 40 176.601 40 128 40 79.399 79.399 40 128 40c48.601 0 88 39.399 88 88-.055 48.578-39.422 87.945-88 88ZM168 112C168.004 93.498 155.319 77.408 137.327 73.094 119.336 68.78 100.733 77.367 92.346 93.859c-8.387 16.491-4.37 36.583 9.714 48.581L88.68 172.77c-1.092 2.474-.86 5.333 .617 7.598 1.477 2.266 3.998 3.632 6.703 3.632h64c2.705 0 5.226-1.366 6.703-3.632 1.477-2.266 1.709-5.124 .617-7.598L153.94 142.44C162.843 134.83 167.979 123.712 168 112ZM136.68 143l11 25.05h-39.41l11-25.05c1.689-3.738 .276-8.148-3.27-10.21-9.407-5.431-13.994-16.504-11.182-26.996C107.629 95.301 117.137 88.005 128 88.005c10.863 0 20.371 7.296 23.182 17.788 2.811 10.492-1.775 21.565-11.182 26.996-3.565 2.045-5 6.459-3.32 10.21Z"),
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
        return _keyhole!!
    }

private var _keyhole: ImageVector? = null
