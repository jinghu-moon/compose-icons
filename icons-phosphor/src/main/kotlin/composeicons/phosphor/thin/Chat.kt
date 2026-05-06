package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Chat: ImageVector
    get() {
        if (_chat != null) return _chat!!
        _chat = phosphorThinIcon(
            name = "Chat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 52h-176C33.373 52 28 57.373 28 64v160c-.029 4.673 2.682 8.93 6.93 10.88 1.59 .734 3.319 1.116 5.07 1.12 2.818-.002 5.543-1.005 7.69-2.83h0L81.49 204h134.51c6.627 0 12-5.373 12-12v-128c0-6.627-5.373-12-12-12ZM220 192c0 2.209-1.791 4-4 4h-136c-.965 .006-1.896 .361-2.62 1L42.56 227.06c-1.191 .992-2.847 1.207-4.251 .552C36.905 226.957 36.005 225.549 36 224v-160c0-2.209 1.791-4 4-4h176c2.209 0 4 1.791 4 4Z"),
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
        return _chat!!
    }

private var _chat: ImageVector? = null
