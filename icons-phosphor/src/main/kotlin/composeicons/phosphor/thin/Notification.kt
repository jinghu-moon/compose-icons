package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorThinIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 128v80c0 6.627-5.373 12-12 12h-152c-6.627 0-12-5.373-12-12v-152C36 49.373 41.373 44 48 44h80c2.209 0 4 1.791 4 4 0 2.209-1.791 4-4 4h-80c-2.209 0-4 1.791-4 4v152c0 2.209 1.791 4 4 4h152c2.209 0 4-1.791 4-4v-80c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4ZM228 60c0 17.673-14.327 32-32 32C178.327 92 164 77.673 164 60c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32ZM220 60C220 46.745 209.255 36 196 36c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 13.255 0 24-10.745 24-24Z"),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
