package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.NotSubsetOf: ImageVector
    get() {
        if (_notSubsetOf != null) return _notSubsetOf!!
        _notSubsetOf = phosphorLightIcon(
            name = "NotSubsetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212 35.56c-1.177-1.072-2.732-1.633-4.323-1.557-1.591 .075-3.086 .779-4.157 1.957l-5.49 6h-70.03C93.543 41.915 62.391 62.457 48.86 94.147c-13.531 31.689-6.823 68.397 17.04 93.253L43.56 212c-1.865 2.484-1.526 5.981 .782 8.06 2.308 2.079 5.821 2.053 8.098-.06L74.77 195.43C89.904 207.459 108.668 214.004 128 214h72c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6h-72c-16.341 .01-32.221-5.415-45.14-15.42L212.44 44c2.196-2.457 1.999-6.225-.44-8.44ZM54 128C54.05 87.151 87.151 54.05 128 54h59.16L74 178.5C61.147 164.827 53.994 146.766 54 128Z"),
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
