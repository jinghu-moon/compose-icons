package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Hoodie: ImageVector
    get() {
        if (_hoodie != null) return _hoodie!!
        _hoodie = phosphorDuotoneIcon(
            name = "Hoodie",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M231.72 131.51l-21.44 78.59c-.947 3.48-4.104 5.896-7.71 5.9h-26.57c-4.418 0-8-3.582-8-8v-24h-80v24c0 4.418-3.582 8-8 8h-26.57c-3.606-.004-6.763-2.42-7.71-5.9L24.28 131.51c-.599-2.221-.213-4.593 1.06-6.51L72 55l56 33L184 55l46.66 70c1.273 1.917 1.659 4.289 1.06 6.51Z"),
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
                pathData = parseSvgPathData("M237.31 120.53 183 39.12C180.04 34.683 175.064 32.013 169.73 32h-83.46C80.936 32.013 75.96 34.683 73 39.12L18.69 120.53c-2.57 3.85-3.347 8.624-2.13 13.09L38 212.21c1.898 6.959 8.217 11.787 15.43 11.79h26.57c8.837 0 16-7.163 16-16v-16h64v16c0 8.837 7.163 16 16 16h26.57c7.213-.003 13.532-4.831 15.43-11.79l21.44-78.59c1.217-4.466 .44-9.24-2.13-13.09ZM80 176v-107l24 14.15v52.85c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-43.43l3.94 2.32c2.506 1.476 5.614 1.476 8.12 0L136 92.57v35.43c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-44.86L176 69v107ZM169.73 48l2.92 4.39L128 78.71 83.35 52.39 86.27 48ZM80 208h-26.57L32 129.41l32-48v94.59c0 8.837 7.163 16 16 16ZM202.57 208h-26.57v-16c8.837 0 16-7.163 16-16v-94.59l32 48Z"),
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
        return _hoodie!!
    }

private var _hoodie: ImageVector? = null
