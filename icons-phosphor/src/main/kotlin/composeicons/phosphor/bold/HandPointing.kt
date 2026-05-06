package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HandPointing: ImageVector
    get() {
        if (_handPointing != null) return _handPointing!!
        _handPointing = phosphorBoldIcon(
            name = "HandPointing",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M196 84c-3.83-.011-7.63 .666-11.22 2C178.126 72.305 162.743 65.195 148 69v-25C148 26.327 133.673 12 116 12 98.327 12 84 26.327 84 44v66.83C73.151 98.39 54.621 96.243 41.215 105.872 27.809 115.501 23.926 133.747 32.25 148l4.68 8.24C71.11 216.48 86.72 244 136 244c50.787-.055 91.945-41.213 92-92v-36C228 98.327 213.673 84 196 84ZM204 152c-.044 37.537-30.463 67.956-68 68C102 220 92.51 205.55 57.8 144.35l-4.69-8.28c-.005-.023-.005-.047 0-.07-2.209-3.827-.897-8.721 2.93-10.93 3.827-2.209 8.721-.897 10.93 2.93 .06 .12 .13 .23 .2 .35l18.68 30c2.846 4.512 8.329 6.604 13.457 5.134 5.128-1.47 8.67-6.149 8.693-11.484v-108c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v68c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-12c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8v20c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-4c0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8Z"),
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
        return _handPointing!!
    }

private var _handPointing: ImageVector? = null
