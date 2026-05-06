package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.XLogo: ImageVector
    get() {
        if (_xLogo != null) return _xLogo!!
        _xLogo = phosphorThinIcon(
            name = "XLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M211.37 213.85 147.13 112.9 211 42.69c1.486-1.657 1.347-4.204-.31-5.69-1.657-1.486-4.204-1.347-5.69 .31l-62.32 68.59L99.38 37.85C98.644 36.696 97.369 35.998 96 36h-48c-1.46 .001-2.803 .798-3.505 2.078-.702 1.28-.65 2.841 .135 4.072l64.24 100.95L45 213.31c-1.486 1.657-1.347 4.204 .31 5.69 1.657 1.486 4.204 1.347 5.69-.31l62.36-68.59 43.3 68.05c.728 1.143 1.985 1.839 3.34 1.85h48c1.46-.001 2.803-.798 3.505-2.078 .702-1.28 .65-2.841-.135-4.072ZM162.2 212 55.29 44h38.51L200.71 212Z"),
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
        return _xLogo!!
    }

private var _xLogo: ImageVector? = null
