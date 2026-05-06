package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CableCar: ImageVector
    get() {
        if (_cableCar != null) return _cableCar!!
        _cableCar = phosphorBoldIcon(
            name = "CableCar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M251.81 29.89c-1.167-6.522-7.398-10.864-13.92-9.7L13.89 60.19C7.778 61.291 3.516 66.873 4.064 73.059 4.612 79.245 9.79 83.991 16 84c.711 .001 1.421-.063 2.12-.19L116 66.33v25.67h-52C44.118 92 28 108.118 28 128v64c0 19.882 16.118 36 36 36h128c19.882 0 36-16.118 36-36v-64C228 108.118 211.882 92 192 92h-52v-29.95L242.11 43.81c6.522-1.167 10.864-7.398 9.7-13.92ZM108 156v-40h40v40ZM64 116h20v40h-32v-28c0-6.627 5.373-12 12-12ZM192 204h-128c-6.627 0-12-5.373-12-12v-12h152v12c0 6.627-5.373 12-12 12ZM204 128v28h-32v-40h20c6.627 0 12 5.373 12 12Z"),
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
        return _cableCar!!
    }

private var _cableCar: ImageVector? = null
