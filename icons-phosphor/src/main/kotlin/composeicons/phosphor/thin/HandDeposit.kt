package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandDeposit: ImageVector
    get() {
        if (_handDeposit != null) return _handDeposit!!
        _handDeposit = phosphorThinIcon(
            name = "HandDeposit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M124 25.66v102.34c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-102.34L90.83 50.83c-1.563 1.563-4.097 1.563-5.66 0-1.563-1.563-1.563-4.097 0-5.66l32-32c.75-.751 1.768-1.173 2.83-1.173 1.062 0 2.08 .422 2.83 1.173l32 32c1.563 1.563 1.563 4.097 0 5.66-1.563 1.563-4.097 1.563-5.66 0ZM188 125.78v-29.78c0-6.627-5.373-12-12-12h-16c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h16c2.209 0 4 1.791 4 4v92.9l-3.27-5c-6.701-11.361-21.315-15.185-32.722-8.562-11.407 6.623-15.332 21.21-8.788 32.662 .034 .067 .074 .13 .12 .19l22.26 34c.761 1.244 2.139 1.975 3.595 1.908 1.457-.067 2.761-.921 3.405-2.229 .644-1.308 .525-2.863-.311-4.058L142.09 203.91c-4.393-7.668-1.738-17.447 5.93-21.84 7.668-4.393 17.447-1.738 21.84 5.93l.12 .19 10.67 16.31c.968 1.483 2.795 2.153 4.492 1.648 1.697-.506 2.86-2.067 2.858-3.838v-66.84c20.059 14.813 31.926 38.244 32 63.18v41.35c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-41.35c-.087-29.508-15.152-56.954-40-72.87ZM80 84h-16C57.373 84 52 89.373 52 96v104c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-104c0-2.209 1.791-4 4-4h16c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4Z"),
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
        return _handDeposit!!
    }

private var _handDeposit: ImageVector? = null
