package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowLineUpLeft: ImageVector
    get() {
        if (_arrowLineUpLeft != null) return _arrowLineUpLeft!!
        _arrowLineUpLeft = phosphorFillIcon(
            name = "ArrowLineUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M64 144v-96c0-4.418 3.582-8 8-8h96c3.238-.003 6.158 1.947 7.397 4.938 1.239 2.991 .554 6.434-1.737 8.722L131.31 96l58.35 58.34c3.126 3.126 3.126 8.194 0 11.32-3.126 3.126-8.194 3.126-11.32 0L120 107.31 77.66 149.66c-2.288 2.291-5.731 2.976-8.722 1.737C65.947 150.158 63.997 147.238 64 144ZM224 200h-176c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h176c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8Z"),
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
        return _arrowLineUpLeft!!
    }

private var _arrowLineUpLeft: ImageVector? = null
