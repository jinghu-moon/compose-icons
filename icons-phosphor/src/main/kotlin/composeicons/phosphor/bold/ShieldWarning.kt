package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ShieldWarning: ImageVector
    get() {
        if (_shieldWarning != null) return _shieldWarning!!
        _shieldWarning = phosphorBoldIcon(
            name = "ShieldWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M116 132v-36c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12v36c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM128 188c8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16ZM228 56v56c0 54.29-26.32 87.22-48.4 105.29-23.71 19.39-47.44 26-48.44 26.29-2.069 .56-4.251 .56-6.32 0-1-.28-24.73-6.9-48.44-26.29C54.32 199.22 28 166.29 28 112v-56C28 44.954 36.954 36 48 36h160c11.046 0 20 8.954 20 20ZM204 60h-152v52c0 35.71 13.09 64.69 38.91 86.15 11.066 9.135 23.609 16.314 37.09 21.23 13.48-4.918 26.023-12.098 37.09-21.23C190.91 176.69 204 147.71 204 112Z"),
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
        return _shieldWarning!!
    }

private var _shieldWarning: ImageVector? = null
