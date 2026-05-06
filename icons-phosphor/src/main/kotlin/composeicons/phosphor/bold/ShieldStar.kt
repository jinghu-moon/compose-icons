package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldStar: ImageVector
    get() {
        if (_shieldStar != null) return _shieldStar!!
        _shieldStar = phosphorBoldIcon(
            name = "ShieldStar",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M76.86 115.54c2.463-6.152 9.448-9.143 15.6-6.68L116 118.28v-22.28c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v22.28l23.54-9.42c6.138-2.402 13.064 .596 15.513 6.715 2.45 6.119-.494 13.068-6.593 15.565L147 141.33l14.6 19.47c3.976 5.302 2.902 12.824-2.4 16.8-5.302 3.976-12.824 2.902-16.8-2.4L128 156l-14.4 19.2c-3.976 5.302-11.498 6.376-16.8 2.4-5.302-3.976-6.376-11.498-2.4-16.8L109 141.33 83.54 131.14c-6.152-2.463-9.143-9.448-6.68-15.6ZM228 56v56c0 54.29-26.32 87.22-48.4 105.29-23.71 19.39-47.44 26-48.44 26.29-2.069 .56-4.251 .56-6.32 0-1-.28-24.73-6.9-48.44-26.29C54.32 199.22 28 166.29 28 112v-56C28 44.954 36.954 36 48 36h160c11.046 0 20 8.954 20 20ZM204 60h-152v52c0 35.71 13.09 64.69 38.91 86.15 11.066 9.135 23.609 16.314 37.09 21.23 13.48-4.918 26.023-12.098 37.09-21.23C190.91 176.69 204 147.71 204 112Z"),
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
        return _shieldStar!!
    }

private var _shieldStar: ImageVector? = null
