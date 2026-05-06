package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorFillIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM196.8 134.4l-48 36C147.415 171.439 145.731 172 144 172c-4.418 0-8-3.582-8-8v-36c0 2.518-1.186 4.889-3.2 6.4l-48 36C83.415 171.439 81.731 172 80 172c-4.418 0-8-3.582-8-8v-72c0-3.03 1.712-5.8 4.422-7.155 2.71-1.355 5.954-1.063 8.378 .755l48 36c2.014 1.511 3.2 3.882 3.2 6.4v-36c0-3.03 1.712-5.8 4.422-7.155 2.71-1.355 5.954-1.063 8.378 .755l48 36c2.014 1.511 3.2 3.882 3.2 6.4 0 2.518-1.186 4.889-3.2 6.4Z"),
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
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
