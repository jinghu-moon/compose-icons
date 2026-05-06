package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HourglassHigh: ImageVector
    get() {
        if (_hourglassHigh != null) return _hourglassHigh!!
        _hourglassHigh = phosphorBoldIcon(
            name = "HourglassHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 20h-112C60.954 20 52 28.954 52 40v36c.016 6.291 2.976 12.213 8 16l48 36L60 164c-5.024 3.787-7.984 9.709-8 16v36c0 11.046 8.954 20 20 20h112c11.046 0 20-8.954 20-20v-35.64c-.006-6.28-2.942-12.197-7.94-16L147.9 128 196.06 91.6c4.998-3.803 7.934-9.72 7.94-16v-35.6C204 28.954 195.046 20 184 20ZM180 44v16h-104v-16ZM128 113 89.33 84h77ZM180 212h-104v-30l52-39 52 39.33Z"),
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
        return _hourglassHigh!!
    }

private var _hourglassHigh: ImageVector? = null
