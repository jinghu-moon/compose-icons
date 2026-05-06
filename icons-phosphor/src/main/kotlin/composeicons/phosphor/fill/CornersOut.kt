package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CornersOut: ImageVector
    get() {
        if (_cornersOut != null) return _cornersOut!!
        _cornersOut = phosphorFillIcon(
            name = "CornersOut",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M93.66 202.34c2.291 2.288 2.976 5.731 1.737 8.722C94.158 214.053 91.238 216.003 88 216h-40c-4.418 0-8-3.582-8-8v-40c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737ZM88 40h-40c-4.418 0-8 3.582-8 8v40c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737L93.66 53.66c2.291-2.288 2.976-5.731 1.737-8.722C94.158 41.947 91.238 39.997 88 40ZM211.06 160.61c-2.989-1.24-6.431-.557-8.72 1.73l-40 40c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938h40c4.418 0 8-3.582 8-8v-40c-.001-3.236-1.95-6.152-4.94-7.39ZM208 40h-40c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722l40 40c2.288 2.291 5.731 2.976 8.722 1.737C214.053 94.158 216.003 91.238 216 88v-40c0-4.418-3.582-8-8-8Z"),
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
        return _cornersOut!!
    }

private var _cornersOut: ImageVector? = null
