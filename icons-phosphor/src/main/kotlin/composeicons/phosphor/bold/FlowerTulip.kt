package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FlowerTulip: ImageVector
    get() {
        if (_flowerTulip != null) return _flowerTulip!!
        _flowerTulip = phosphorBoldIcon(
            name = "FlowerTulip",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 44c-11.561-.011-23.02 2.167-33.77 6.42C158.43 26.02 134.51 13.84 133.37 13.27c-3.38-1.691-7.36-1.691-10.74 0-1.14 .57-25.06 12.75-40.86 37.15C71.02 46.167 59.561 43.989 48 44 41.373 44 36 49.373 36 56v40c.058 46.151 34.251 85.139 80 91.22v25.36L85.37 197.27c-5.908-2.85-13.01-.429-15.946 5.437-2.936 5.866-.617 13.002 5.206 16.023l48 24c3.38 1.691 7.36 1.691 10.74 0l48-24c3.899-1.881 6.482-5.716 6.761-10.035 .279-4.32-1.791-8.455-5.415-10.821-3.625-2.366-8.243-2.597-12.085-.604L140 212.58v-25.36C185.749 181.139 219.942 142.151 220 96v-40c0-6.627-5.373-12-12-12ZM128 37.94c6.37 4.16 17.13 12.31 25.21 24.2C142.928 69.784 134.344 79.479 128 90.61 121.653 79.481 113.069 69.787 102.79 62.14 110.87 50.25 121.63 42.1 128 37.94ZM60 96v-26.94c32.389 5.852 55.959 34.027 56 66.94v26.94C83.614 157.084 60.045 128.911 60 96ZM196 96c-.045 32.911-23.614 61.084-56 66.94v-26.94c.041-32.913 23.611-61.088 56-66.94Z"),
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
        return _flowerTulip!!
    }

private var _flowerTulip: ImageVector? = null
