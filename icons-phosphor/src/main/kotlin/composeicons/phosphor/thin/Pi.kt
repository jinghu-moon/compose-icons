package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorThinIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 172c0 17.673-14.327 32-32 32-17.673 0-32-14.327-32-32v-104h-72v132c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-132h-12C47.711 68.028 28.028 87.711 28 112c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4C20.033 83.295 43.295 60.033 72 60h152c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-52v104c0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24 0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4Z"),
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
        return _pi!!
    }

private var _pi: ImageVector? = null
