package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SmileyAngry: ImageVector
    get() {
        if (_smileyAngry != null) return _smileyAngry!!
        _smileyAngry = phosphorFillIcon(
            name = "SmileyAngry",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM80 140c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12ZM158.66 188.43c-2.447 3.678-7.412 4.676-11.09 2.23C141.07 186.34 136 184 128 184c-8 0-13.07 2.34-19.57 6.66-3.675 2.353-8.558 1.327-10.975-2.307-2.417-3.633-1.476-8.533 2.115-11.013C108 171.73 116.06 168 128 168c11.94 0 20 3.73 28.43 9.34 3.678 2.447 4.676 7.412 2.23 11.09ZM164 152c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM180.44 94.66l-48 32c-2.688 1.794-6.192 1.794-8.88 0l-48-32C71.882 92.208 70.888 87.238 73.34 83.56c2.452-3.678 7.422-4.672 11.1-2.22L128 110.39l43.56-29c3.678-2.452 8.648-1.458 11.1 2.22 2.452 3.678 1.458 8.648-2.22 11.1Z"),
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
        return _smileyAngry!!
    }

private var _smileyAngry: ImageVector? = null
