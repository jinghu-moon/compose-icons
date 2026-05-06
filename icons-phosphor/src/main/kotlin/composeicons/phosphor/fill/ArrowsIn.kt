package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowsIn: ImageVector
    get() {
        if (_arrowsIn != null) return _arrowsIn!!
        _arrowsIn = phosphorFillIcon(
            name = "ArrowsIn",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 104v-40c-.003-3.238 1.947-6.158 4.938-7.397 2.991-1.239 6.434-.554 8.722 1.737L172 72.69 202.34 42.34c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32L183.31 84l14.35 14.34c2.291 2.288 2.976 5.731 1.737 8.722-1.239 2.991-4.159 4.94-7.397 4.938h-40c-4.418 0-8-3.582-8-8ZM104 144h-40c-3.238-.003-6.158 1.947-7.397 4.938-1.239 2.991-.554 6.434 1.737 8.722L72.69 172 42.34 202.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L84 183.31l14.34 14.35c2.288 2.291 5.731 2.976 8.722 1.737 2.991-1.239 4.94-4.159 4.938-7.397v-40c0-4.418-3.582-8-8-8ZM107.06 56.61c-2.989-1.24-6.431-.557-8.72 1.73L84 72.69 53.66 42.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L72.69 84 58.34 98.34c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938h40c4.418 0 8-3.582 8-8v-40c-.001-3.236-1.95-6.152-4.94-7.39ZM183.31 172l14.35-14.34c2.291-2.288 2.976-5.731 1.737-8.722C198.158 145.947 195.238 143.997 192 144h-40c-4.418 0-8 3.582-8 8v40c-.003 3.238 1.947 6.158 4.938 7.397 2.991 1.239 6.434 .554 8.722-1.737L172 183.31l30.34 30.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32Z"),
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
        return _arrowsIn!!
    }

private var _arrowsIn: ImageVector? = null
