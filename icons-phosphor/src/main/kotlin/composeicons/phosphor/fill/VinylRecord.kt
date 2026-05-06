package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.VinylRecord: ImageVector
    get() {
        if (_vinylRecord != null) return _vinylRecord!!
        _vinylRecord = phosphorFillIcon(
            name = "VinylRecord",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 24C70.562 24 24 70.562 24 128c0 57.438 46.562 104 104 104 57.438 0 104-46.562 104-104C231.939 70.588 185.412 24.061 128 24ZM72 128c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C56.044 88.254 88.254 56.044 128 56c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8C97.086 72.033 72.033 97.086 72 128ZM104 128c0-13.255 10.745-24 24-24 13.255 0 24 10.745 24 24 0 13.255-10.745 24-24 24-13.255 0-24-10.745-24-24ZM128 200c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 30.914-.033 55.967-25.086 56-56 0-4.418 3.582-8 8-8 4.418 0 8 3.582 8 8-.044 39.746-32.254 71.956-72 72Z"),
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
        return _vinylRecord!!
    }

private var _vinylRecord: ImageVector? = null
