package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CheckFat: ImageVector
    get() {
        if (_checkFat != null) return _checkFat!!
        _checkFat = phosphorBoldIcon(
            name = "CheckFat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M246.15 65.46l-.07-.08L222.15 41.85c-7.79-7.788-20.412-7.811-28.23-.05l-90 88.83L70.06 97.78C62.236 90.041 49.63 90.077 41.85 97.86l-24 24c-7.794 7.808-7.794 20.452 0 28.26l71.62 72c3.751 3.752 8.839 5.861 14.145 5.861 5.306 0 10.394-2.108 14.145-5.861L246.15 93.74c7.808-7.81 7.808-20.47 0-28.28ZM103.61 202.33 37.64 136 56 117.61 95.65 156c4.685 4.538 12.138 4.503 16.78-.08L208 61.61l18.32 18Z"),
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
        return _checkFat!!
    }

private var _checkFat: ImageVector? = null
