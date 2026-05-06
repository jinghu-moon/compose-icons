package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CloudLightning: ImageVector
    get() {
        if (_cloudLightning != null) return _cloudLightning!!
        _cloudLightning = phosphorBoldIcon(
            name = "CloudLightning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M156 12C124.017 12.005 95.092 31.007 82.39 60.36 80.268 60.12 78.135 60 76 60 45.072 60 20 85.072 20 116c0 30.928 25.072 56 56 56h30.81L93.71 193.82c-2.227 3.708-2.287 8.327-.157 12.091 2.13 3.764 6.122 6.09 10.447 6.089h18.81l-13.1 21.82c-3.41 5.683-1.568 13.055 4.115 16.465 5.683 3.41 13.055 1.568 16.465-4.115l24-40c2.222-3.707 2.279-8.323 .15-12.083C152.31 190.326 148.322 188.001 144 188h-18.81l9.6-16h21.21c44.183 0 80-35.817 80-80C236 47.817 200.183 12 156 12ZM156 148h-80C58.327 148 44 133.673 44 116 44 98.327 58.327 84 76 84h.28c-.11 1.1-.2 2.2-.26 3.3-.384 6.627 4.678 12.311 11.305 12.695 6.627 .384 12.311-4.678 12.695-11.305 1.77-30.485 27.614-53.946 58.128-52.768 30.514 1.178 54.472 26.561 53.887 57.093C211.45 123.546 186.537 147.992 156 148Z"),
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
        return _cloudLightning!!
    }

private var _cloudLightning: ImageVector? = null
