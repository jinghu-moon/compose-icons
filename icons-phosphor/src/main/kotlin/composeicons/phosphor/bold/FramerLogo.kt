package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FramerLogo: ImageVector
    get() {
        if (_framerLogo != null) return _framerLogo!!
        _framerLogo = phosphorBoldIcon(
            name = "FramerLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 104v-64c0-6.627-5.373-12-12-12h-144c-5.002-.026-9.496 3.053-11.277 7.728C42.942 40.402 44.248 45.691 48 49L96.44 92h-40.44c-6.627 0-12 5.373-12 12v64c0 3.185 1.266 6.239 3.52 8.49l72 72c3.433 3.429 8.593 4.453 13.075 2.595 4.482-1.858 7.404-6.233 7.405-11.085v-60h60c5.002 .026 9.496-3.053 11.277-7.728 1.781-4.675 .475-9.963-3.277-13.272L159.59 116h40.41c6.627 0 12-5.373 12-12ZM168.44 156h-40.44c-6.627 0-12 5.373-12 12v43L68 163v-47h55.44ZM188 92h-55.44l-45-40h100.44Z"),
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
        return _framerLogo!!
    }

private var _framerLogo: ImageVector? = null
