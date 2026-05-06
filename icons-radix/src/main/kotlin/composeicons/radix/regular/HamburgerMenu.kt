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
                pathData = parseSvgPathData("M13.601 11.01c.228 .047 .399 .248 .399 .49 0 .242-.171 .444-.399 .49L13.5 12h-12C1.224 12 1 11.776 1 11.5 1 11.224 1.224 11 1.5 11h12l.101 .01ZM13.601 7.01c.228 .047 .399 .249 .399 .49 0 .242-.171 .444-.399 .49L13.5 8h-12C1.224 8 1 7.776 1 7.5 1 7.224 1.224 7 1.5 7h12l.101 .01ZM13.601 3.01c.228 .047 .399 .249 .399 .49 0 .242-.171 .444-.399 .49L13.5 4h-12C1.224 4 1 3.776 1 3.5 1 3.224 1.224 3 1.5 3h12l.101 .01Z"),
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
