package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowUpLeft: ImageVector
    get() {
        if (_arrowUpLeft != null) return _arrowUpLeft!!
        _arrowUpLeft = phosphorDuotoneIcon(
            name = "ArrowUpLeft",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 64 64 168v-104Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M197.66 186.34 127.31 116 173.66 69.66c2.291-2.288 2.976-5.731 1.737-8.722C174.158 57.947 171.238 55.997 168 56h-104c-4.418 0-8 3.582-8 8v104c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737L116 127.31l70.34 70.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM72 72h76.69l-38.34 38.34h0L72 148.69Z"),
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
        return _arrowUpLeft!!
    }

private var _arrowUpLeft: ImageVector? = null
