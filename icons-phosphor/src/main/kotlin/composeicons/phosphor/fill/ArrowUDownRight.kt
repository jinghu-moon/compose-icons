package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) return _arrowUDownRight!!
        _arrowUDownRight = phosphorFillIcon(
            name = "ArrowUDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M229.66 173.66l-48 48c-2.288 2.291-5.731 2.976-8.722 1.737C169.947 222.158 167.997 219.238 168 216v-40h-80C52.654 176 24 147.346 24 112 24 76.654 52.654 48 88 48h88c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-88C61.49 64 40 85.49 40 112c0 26.51 21.49 48 48 48h80v-40c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737l48 48c1.502 1.501 2.346 3.537 2.346 5.66 0 2.123-.844 4.159-2.346 5.66Z"),
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
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null
