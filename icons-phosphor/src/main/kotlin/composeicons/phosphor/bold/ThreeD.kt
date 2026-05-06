package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ThreeD: ImageVector
    get() {
        if (_threeD != null) return _threeD!!
        _threeD = phosphorBoldIcon(
            name = "ThreeD",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M88 148c0-8.837-7.163-16-16-16-4.474-.001-8.576-2.49-10.642-6.458-2.066-3.968-1.753-8.756 .812-12.422L77 92h-25C45.373 92 40 86.627 40 80 40 73.373 45.373 68 52 68h48c4.474 .001 8.576 2.49 10.642 6.458 2.066 3.968 1.753 8.756-.812 12.422L91.49 113.08c13.686 7.63 21.657 22.548 20.393 38.166-1.264 15.618-11.531 29.06-26.267 34.388C70.881 190.962 54.391 187.197 43.43 176c-4.639-4.733-4.563-12.331 .17-16.97 4.733-4.639 12.331-4.563 16.97 .17 4.55 4.645 11.459 6.075 17.478 3.617C84.068 160.359 88.002 154.502 88 148ZM164 68c33.137 0 60 26.863 60 60 0 33.137-26.863 60-60 60h-24c-6.627 0-12-5.373-12-12v-96c0-6.627 5.373-12 12-12ZM164 92h-12v72h12c19.882 0 36-16.118 36-36C200 108.118 183.882 92 164 92ZM32 56h192c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12h-192C25.373 32 20 37.373 20 44c0 6.627 5.373 12 12 12ZM224 200h-192c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h192c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _threeD!!
    }

private var _threeD: ImageVector? = null
