package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = phosphorThinIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.07 61.44C226.311 60.529 225.186 60.001 224 60h-164.66L52.66 23.28C52.313 21.382 50.66 20.002 48.73 20h-24.73c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h21.39l6.69 36.8h0L71.49 171.58c.895 4.88 3.571 9.253 7.51 12.27-8.451 5.447-12.611 15.584-10.422 25.397 2.189 9.813 10.262 17.222 20.227 18.562 9.965 1.34 19.708-3.674 24.411-12.561 4.703-8.887 3.367-19.763-3.345-27.248h60.26c-7.551 8.442-8.172 21.014-1.49 30.159 6.682 9.145 18.848 12.374 29.185 7.746 10.337-4.628 16.032-15.853 13.662-26.928C209.117 187.902 199.326 179.991 188 180h-96.83c-5.796-.003-10.762-4.148-11.8-9.85L75.37 148h120.73c9.666 .001 17.95-6.91 19.68-16.42L227.94 64.72c.211-1.168-.108-2.37-.87-3.28ZM108 204c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM204 204c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM207.91 130.15c-1.039 5.706-6.01 9.852-11.81 9.85h-122.22L60.79 68h158.42Z"),
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
        return _shoppingCart!!
    }

private var _shoppingCart: ImageVector? = null
