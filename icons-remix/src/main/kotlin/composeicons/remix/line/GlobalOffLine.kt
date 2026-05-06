package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.GlobalOffLine: ImageVector
    get() {
        if (_globalOffLine != null) return _globalOffLine!!
        _globalOffLine = remixIcon(
            name = "GlobalOffLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M22.036 16.379l-2.122 2.121 2.122 2.122-1.414 1.414L18.5 19.914l-2.121 2.122L14.965 20.622l2.121-2.122L14.965 16.379l1.414-1.414 2.121 2.121 2.122-2.121 1.414 1.414ZM12.479 2.012C17.78 2.262 22 6.638 22 12v1h-11.967c.156 2.539 .902 4.915 2.105 6.996 .082-.001 .164-.001 .245-.005 .17-.008 .339-.022 .506-.04l.221 1.988c-.209 .023-.42 .039-.632 .049C12.32 21.996 12.16 22 12 22c-.16 0-.32-.004-.479-.012C6.22 21.738 2 17.362 2 12 2 6.638 6.22 2.262 11.521 2.012 11.68 2.004 11.84 2 12 2c.16 0 .32 .004 .479 .012ZM4.064 13c.396 3.177 2.654 5.776 5.648 6.668C8.75 17.626 8.16 15.374 8.03 13h-3.966ZM9.713 4.331C6.718 5.223 4.461 7.823 4.064 11h3.966C8.16 8.626 8.75 6.374 9.713 4.331ZM12 4.252C10.879 6.273 10.184 8.561 10.033 11h3.934C13.816 8.561 13.121 6.273 12 4.252ZM14.286 4.331c.964 2.043 1.553 4.295 1.684 6.669h3.966C19.539 7.822 17.281 5.223 14.286 4.331Z"),
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
        return _globalOffLine!!
    }

private var _globalOffLine: ImageVector? = null
