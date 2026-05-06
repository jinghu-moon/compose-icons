package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorDuotoneIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 160c0 17.673-14.327 32-32 32-17.673 0-32-14.327-32-32 0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M220 160c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM215.45 199.29C211.819 222.695 191.685 239.97 168 240h-24C117.502 239.972 96.028 218.498 96 192v-40.51C64.003 147.459 40.004 120.25 40 88v-48c0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-16v40c-.001 12.842 5.144 25.149 14.284 34.169 9.141 9.02 21.515 14.002 34.356 13.831C130.75 135.66 152 113.75 152 87.17v-39.17h-16c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h24c4.418 0 8 3.582 8 8v47.17c0 32.84-24.53 60.29-56 64.31v40.52c0 17.673 14.327 32 32 32h24c14.966-.025 27.924-10.401 31.22-25-20.013-4.495-33.383-23.401-30.952-43.768 2.431-20.367 19.874-35.595 40.383-35.254 20.509 .341 37.436 16.141 39.188 36.578 1.752 20.437-12.239 38.887-32.39 42.714ZM232 160c0-13.255-10.745-24-24-24-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24Z"),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
