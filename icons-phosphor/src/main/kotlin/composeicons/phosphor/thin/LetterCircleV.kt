package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LetterCircleV: ImageVector
    get() {
        if (_letterCircleV != null) return _letterCircleV!!
        _letterCircleV = phosphorThinIcon(
            name = "LetterCircleV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM163.71 97.49l-32 80c-.61 1.513-2.078 2.505-3.71 2.505-1.632 0-3.1-.991-3.71-2.505l-32-80c-.828-2.049 .161-4.382 2.21-5.21 2.049-.828 4.382 .161 5.21 2.21L128 165.23 156.29 94.51c.828-2.049 3.161-3.038 5.21-2.21 2.049 .828 3.038 3.161 2.21 5.21Z"),
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
        return _letterCircleV!!
    }

private var _letterCircleV: ImageVector? = null
