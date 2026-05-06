package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.CallBell: ImageVector
    get() {
        if (_callBell != null) return _callBell!!
        _callBell = phosphorRegularIcon(
            name = "CallBell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M24 184h208c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-8v-16C223.94 102.107 185.715 60.555 136 56.34v-16.34h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v16.34C70.285 60.555 32.06 102.107 32 152v16h-8c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8ZM48 152C48 107.817 83.817 72 128 72c44.183 0 80 35.817 80 80v16h-160ZM240 208c0 4.418-3.582 8-8 8h-208c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h208c4.418 0 8 3.582 8 8Z"),
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
        return _callBell!!
    }

private var _callBell: ImageVector? = null
