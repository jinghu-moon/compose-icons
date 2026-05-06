package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CarBattery: ImageVector
    get() {
        if (_carBattery != null) return _carBattery!!
        _carBattery = phosphorRegularIcon(
            name = "CarBattery",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M192 136c0 4.418-3.582 8-8 8h-8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8v-8h-8c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h8v-8c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v8h8c4.418 0 8 3.582 8 8ZM104 128h-32c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h32c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM240 88v96c0 8.837-7.163 16-16 16h-192c-8.837 0-16-7.163-16-16v-96C16 79.163 23.163 72 32 72h16v-16C48 47.163 55.163 40 64 40h32c8.837 0 16 7.163 16 16v16h32v-16c0-8.837 7.163-16 16-16h32c8.837 0 16 7.163 16 16v16h16c8.837 0 16 7.163 16 16ZM160 72h32v-16h-32ZM64 72h32v-16h-32ZM224 184v-96h-192v96h192Z"),
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
