package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.NotSubsetOf: ImageVector
    get() {
        if (_notSubsetOf != null) return _notSubsetOf!!
        _notSubsetOf = phosphorThinIcon(
            name = "NotSubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M210.69 37c-1.635-1.485-4.164-1.365-5.65 .27L199 44h-71C94.046 44.026 63.447 64.49 50.456 95.86c-12.991 31.37-5.82 67.476 18.174 91.5L45 213.31c-1.486 1.657-1.347 4.204 .31 5.69 1.657 1.486 4.204 1.347 5.69-.31L74.58 192.75C89.597 205.2 108.493 212.009 128 212h72c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4h-72c-17.53 .015-34.521-6.058-48.07-17.18L211 42.69c.721-.792 1.094-1.84 1.036-2.91-.058-1.07-.543-2.071-1.346-2.78ZM52 128C52.044 86.045 86.045 52.044 128 52h63.69L74 181.43C59.895 167.226 51.986 148.017 52 128Z"),
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
        return _notSubsetOf!!
    }

private var _notSubsetOf: ImageVector? = null
