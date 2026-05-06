package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.LetterCircleV: ImageVector
    get() {
        if (_letterCircleV != null) return _letterCircleV!!
        _letterCircleV = phosphorBoldIcon(
            name = "LetterCircleV",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM171.14 100.46l-32 80c-1.823 4.554-6.235 7.539-11.14 7.539-4.905 0-9.317-2.985-11.14-7.539l-32-80C83.227 96.472 83.858 91.914 86.513 88.52c2.655-3.395 6.927-5.105 11.191-4.48 4.264 .624 7.866 3.487 9.436 7.5L128 143.69 148.86 91.54c2.497-6.099 9.447-9.043 15.565-6.593 6.119 2.45 9.116 9.376 6.715 15.513Z"),
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
