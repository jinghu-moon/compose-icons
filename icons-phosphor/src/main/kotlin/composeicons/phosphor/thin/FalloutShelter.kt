package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorThinIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM128 220C77.19 220 36 178.81 36 128 36 77.19 77.19 36 128 36c50.81 0 92 41.19 92 92-.055 50.787-41.213 91.945-92 92ZM195.53 126.11c-.697-1.301-2.054-2.112-3.53-2.11h-56.53L163.33 82.22c.819-1.228 .896-2.807 .199-4.108C162.832 76.811 161.476 75.999 160 76h-64c-1.476-.001-2.832 .811-3.529 2.112-.697 1.301-.62 2.88 .199 4.108L120.53 124h-56.53c-1.476-.001-2.832 .811-3.529 2.112-.697 1.301-.62 2.88 .199 4.108l32 48c.742 1.114 1.991 1.784 3.33 1.784 1.339 0 2.588-.67 3.33-1.784l28.67-43 28.67 43c.742 1.114 1.991 1.784 3.33 1.784 1.339 0 2.588-.67 3.33-1.784l32-48c.82-1.228 .897-2.808 .2-4.11ZM152.53 84 128 120.79 103.47 84ZM96 168.79 71.47 132h49.06ZM160 168.79 135.47 132h49.06Z"),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
