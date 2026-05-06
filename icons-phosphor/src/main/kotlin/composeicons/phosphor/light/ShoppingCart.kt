package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ShoppingCart: ImageVector
    get() {
        if (_shoppingCart != null) return _shoppingCart!!
        _shoppingCart = phosphorLightIcon(
            name = "ShoppingCart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.61 60.16C227.47 58.791 225.781 58 224 58h-163L54.63 22.93C54.113 20.077 51.63 18.002 48.73 18h-24.73c-3.314 0-6 2.686-6 6 0 3.314 2.686 6 6 6h19.72L69.53 171.94c.809 4.475 2.99 8.589 6.24 11.77-10.945 8.742-12.996 24.584-4.639 35.826 8.357 11.242 24.118 13.843 35.643 5.881 11.526-7.961 14.672-23.622 7.116-35.417h52.22c-6.396 10.009-5.195 23.081 2.917 31.757 8.113 8.677 21.074 10.752 31.49 5.042 10.416-5.71 15.638-17.753 12.686-29.259C210.252 186.034 199.878 177.991 188 178h-96.83c-4.833 .001-8.975-3.455-9.84-8.21L77.73 150h118.37c10.633 .003 19.746-7.599 21.65-18.06L229.9 65.07c.318-1.747-.155-3.545-1.29-4.91ZM106 204c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14ZM202 204c0 7.732-6.268 14-14 14-7.732 0-14-6.268-14-14 0-7.732 6.268-14 14-14 7.732 0 14 6.268 14 14ZM205.94 129.79c-.865 4.755-5.007 8.211-9.84 8.21h-120.55L63.19 70h153.62Z"),
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
