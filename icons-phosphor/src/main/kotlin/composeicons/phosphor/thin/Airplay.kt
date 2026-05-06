package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Airplay: ImageVector
    get() {
        if (_airplay != null) return _airplay!!
        _airplay = phosphorThinIcon(
            name = "Airplay",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M131 157.4c-.76-.885-1.868-1.394-3.035-1.394-1.167 0-2.275 .509-3.035 1.394l-48 56c-1.01 1.181-1.245 2.84-.602 4.255 .643 1.415 2.048 2.329 3.602 2.345h96c1.554-.015 2.959-.93 3.602-2.345 .643-1.415 .408-3.074-.602-4.255ZM88.7 212 128 166.15 167.3 212ZM228 64v112c0 11.046-8.954 20-20 20h-8c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h8c6.627 0 12-5.373 12-12v-112c0-6.627-5.373-12-12-12h-160C41.373 52 36 57.373 36 64v112c0 6.627 5.373 12 12 12h8c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-8C36.954 196 28 187.046 28 176v-112C28 52.954 36.954 44 48 44h160c11.046 0 20 8.954 20 20Z"),
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
        return _airplay!!
    }

private var _airplay: ImageVector? = null
