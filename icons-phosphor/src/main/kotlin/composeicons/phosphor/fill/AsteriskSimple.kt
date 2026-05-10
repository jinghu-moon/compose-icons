package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AsteriskSimple: ImageVector
    get() {
        if (_asteriskSimple != null) return _asteriskSimple!!
        _asteriskSimple = phosphorFillIcon(
            name = "AsteriskSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM191.34 115.83l-50.4 16.38 31.15 42.87c1.775 2.307 2.158 5.396 .998 8.066-1.16 2.67-3.678 4.499-6.576 4.777-2.898 .277-5.717-1.041-7.362-3.443L128 141.61 96.85 184.48c-2.642 3.433-7.537 4.139-11.042 1.593-3.505-2.546-4.346-7.419-1.898-10.993l31.15-42.87L64.66 115.83c-4.203-1.364-6.504-5.877-5.14-10.08 1.364-4.203 5.877-6.504 10.08-5.14L120 117v-53c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v53l50.4-16.38c4.203-1.364 8.716 .937 10.08 5.14 1.364 4.203-.937 8.716-5.14 10.08Z"),
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
        return _asteriskSimple!!
    }

private var _asteriskSimple: ImageVector? = null
