package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Seat: ImageVector
    get() {
        if (_seat != null) return _seat!!
        _seat = phosphorRegularIcon(
            name = "Seat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 232c0 4.418-3.582 8-8 8h-104c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h104c4.418 0 8 3.582 8 8ZM224 160v32c0 8.837-7.163 16-16 16h-93.89c-6.07 .019-11.622-3.413-14.32-8.85L41.68 83.15c-2.24-4.511-2.24-9.809 0-14.32L63.8 24.83C67.706 17.036 77.133 13.803 85 17.56l33.69 14.22 .47 .22c7.898 3.954 11.098 13.559 7.15 21.46-.031 .076-.067 .15-.11 .22L112 80l31.78 64h64.22c8.837 0 16 7.163 16 16ZM208 160h-64.23c-6.067 .02-11.618-3.413-14.31-8.85L97.67 87.15c-2.234-4.501-2.234-9.789 0-14.29l.12-.22L112 46.32 78.57 32.21c-.16-.062-.317-.132-.47-.21L56 76l58.1 116h93.9Z"),
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
        return _seat!!
    }

private var _seat: ImageVector? = null
