package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorFillIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 72h-16v-16c0-8.837-7.163-16-16-16h-32c-8.837 0-16 7.163-16 16v16h-32v-16C112 47.163 104.837 40 96 40h-32C55.163 40 48 47.163 48 56v16h-16C23.163 72 16 79.163 16 88v96c0 8.837 7.163 16 16 16h192c8.837 0 16-7.163 16-16v-96c0-8.837-7.163-16-16-16ZM64 56h32v16h-32ZM104 144h-32c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h32c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM184 144h-8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h8c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8ZM192 72h-32v-16h32Z"),
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
        return _carBattery!!
    }

private var _carBattery: ImageVector? = null
