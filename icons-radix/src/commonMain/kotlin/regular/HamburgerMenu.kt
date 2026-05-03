package composeicons.radix.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.radix.RadixIcons
import composeicons.radix.radixIcon

val RadixIcons.Regular.HamburgerMenu: ImageVector
    get() {
        if (_hamburgerMenu != null) return _hamburgerMenu!!
        _hamburgerMenu = radixIcon(
            name = "HamburgerMenu",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 15f, height = 15f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 13.601 11.010 C 13.829 11.056 14.000 11.258 14.000 11.500 C 14.000 11.742 13.829 11.944 13.601 11.990 L 13.500 12.000 L 1.500 12.000 C 1.224 12.000 1.000 11.776 1.000 11.500 C 1.000 11.224 1.224 11.000 1.500 11.000 L 13.500 11.000 L 13.601 11.010 ZM 13.601 7.010 C 13.829 7.056 14.000 7.258 14.000 7.500 C 14.000 7.742 13.829 7.944 13.601 7.990 L 13.500 8.000 L 1.500 8.000 C 1.224 8.000 1.000 7.776 1.000 7.500 C 1.000 7.224 1.224 7.000 1.500 7.000 L 13.500 7.000 L 13.601 7.010 ZM 13.601 3.010 C 13.829 3.056 14.000 3.258 14.000 3.500 C 14.000 3.742 13.829 3.944 13.601 3.990 L 13.500 4.000 L 1.500 4.000 C 1.224 4.000 1.000 3.776 1.000 3.500 C 1.000 3.224 1.224 3.000 1.500 3.000 L 13.500 3.000 L 13.601 3.010 Z"),
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
        return _hamburgerMenu!!
    }

private var _hamburgerMenu: ImageVector? = null
