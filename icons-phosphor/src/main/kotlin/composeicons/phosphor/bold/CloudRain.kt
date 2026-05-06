package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudRain: ImageVector
    get() {
        if (_cloudRain != null) return _cloudRain!!
        _cloudRain = phosphorBoldIcon(
            name = "CloudRain",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 12C124.017 12.005 95.092 31.007 82.39 60.36 80.268 60.12 78.135 60 76 60 45.072 60 20 85.072 20 116c0 30.928 25.072 56 56 56h29.58L86 201.34c-3.678 5.523-2.183 12.982 3.34 16.66 5.523 3.678 12.982 2.183 16.66-3.34L134.42 172h21.58c44.183 0 80-35.817 80-80C236 47.817 200.183 12 156 12ZM156 148h-80C58.327 148 44 133.673 44 116 44 98.327 58.327 84 76 84h.28c-.11 1.1-.2 2.2-.26 3.3-.384 6.627 4.678 12.311 11.305 12.695 6.627 .384 12.311-4.678 12.695-11.305 1.77-30.485 27.614-53.946 58.128-52.768 30.514 1.178 54.472 26.561 53.887 57.093C211.45 123.546 186.537 147.992 156 148ZM156.65 206.66l-26.67 40c-3.678 5.523-11.137 7.018-16.66 3.34-5.523-3.678-7.018-11.137-3.34-16.66l26.66-40c3.678-5.523 11.137-7.018 16.66-3.34 5.523 3.678 7.018 11.137 3.34 16.66Z"),
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
        return _cloudRain!!
    }

private var _cloudRain: ImageVector? = null
