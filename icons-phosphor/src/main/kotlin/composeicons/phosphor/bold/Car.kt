package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Car: ImageVector
    get() {
        if (_car != null) return _car!!
        _car = phosphorBoldIcon(
            name = "Car",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 100h-8.2L205.08 39.88C201.87 32.655 194.706 27.999 186.8 28h-117.6C61.294 27.999 54.13 32.655 50.92 39.88L24.2 100h-8.2C9.373 100 4 105.373 4 112c0 6.627 5.373 12 12 12h4v76c0 11.046 8.954 20 20 20h28c11.046 0 20-8.954 20-20v-20h80v20c0 11.046 8.954 20 20 20h28c11.046 0 20-8.954 20-20v-76h4c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM71.8 52h112.4l21.33 48h-155.06ZM64 196h-20v-16h20ZM192 196v-16h20v16ZM212 156h-168v-32h168Z"),
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
        return _car!!
    }

private var _car: ImageVector? = null
