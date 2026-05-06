package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CornersIn: ImageVector
    get() {
        if (_cornersIn != null) return _cornersIn!!
        _cornersIn = phosphorFillIcon(
            name = "CornersIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M152 96v-48c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737l48 48c2.291 2.288 2.976 5.731 1.737 8.722-1.239 2.991-4.159 4.94-7.397 4.938h-48c-4.418 0-8-3.582-8-8ZM96 152h-48c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722l48 48c2.288 2.291 5.731 2.976 8.722 1.737 2.991-1.239 4.94-4.159 4.938-7.397v-48c0-4.418-3.582-8-8-8ZM99.06 40.61c-2.989-1.24-6.431-.557-8.72 1.73L42.34 90.34c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938h48c4.418 0 8-3.582 8-8v-48c-.001-3.236-1.95-6.152-4.94-7.39ZM208 152h-48c-4.418 0-8 3.582-8 8v48c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737l48-48c2.291-2.288 2.976-5.731 1.737-8.722C214.158 153.947 211.238 151.997 208 152Z"),
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
        return _cornersIn!!
    }

private var _cornersIn: ImageVector? = null
