package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Sticker: ImageVector
    get() {
        if (_sticker != null) return _sticker!!
        _sticker = phosphorLightIcon(
            name = "Sticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 34h-80C58.19 34.033 34.033 58.19 34 88v80c.033 29.81 24.19 53.967 54 54h48c.646 .002 1.288-.103 1.9-.31 25.84-8.61 75.18-57.95 83.79-83.79 .207-.612 .312-1.254 .31-1.9v-48C221.967 58.19 197.81 34.033 168 34ZM46 168v-80C46 64.804 64.804 46 88 46h80c23.196 0 42 18.804 42 42v42h-26c-29.81 .033-53.967 24.19-54 54v26h-42C64.804 210 46 191.196 46 168ZM142 206.67v-22.67c0-23.196 18.804-42 42-42h22.67C194.84 163.1 163.1 194.84 142 206.67Z"),
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
        return _sticker!!
    }

private var _sticker: ImageVector? = null
