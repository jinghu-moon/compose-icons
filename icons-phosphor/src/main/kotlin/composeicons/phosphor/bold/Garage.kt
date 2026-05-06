package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Garage: ImageVector
    get() {
        if (_garage != null) return _garage!!
        _garage = phosphorBoldIcon(
            name = "Garage",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 188h-4v-89.33C236.009 91.972 232.664 85.714 227.09 82l-88-58.66c-6.711-4.491-15.469-4.491-22.18 0L28.91 82C23.336 85.714 19.991 91.972 20 98.67v89.33h-4C9.373 188 4 193.373 4 200c0 6.627 5.373 12 12 12h224c6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12ZM44 100.81 128 44.81l84 56v87.19h-16v-68c0-6.627-5.373-12-12-12h-112c-6.627 0-12 5.373-12 12v68h-16ZM172 132v16h-32v-16ZM116 148h-32v-16h32ZM84 172h32v16h-32ZM140 172h32v16h-32Z"),
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
        return _garage!!
    }

private var _garage: ImageVector? = null
