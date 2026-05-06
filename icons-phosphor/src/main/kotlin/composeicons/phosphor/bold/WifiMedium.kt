package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WifiMedium: ImageVector
    get() {
        if (_wifiMedium != null) return _wifiMedium!!
        _wifiMedium = phosphorBoldIcon(
            name = "WifiMedium",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 204c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM207.45 119.64C160.895 82.784 95.105 82.784 48.55 119.64c-5.06 4.153-5.858 11.595-1.793 16.727 4.065 5.131 11.492 6.058 16.693 2.083 37.825-29.942 91.275-29.942 129.1 0 5.201 3.975 12.628 3.048 16.693-2.083 4.065-5.131 3.267-12.573-1.793-16.727ZM175.07 155.3c-28.064-20.401-66.076-20.401-94.14 0-5.357 3.905-6.535 11.413-2.63 16.77 3.905 5.357 11.413 6.535 16.77 2.63 19.633-14.274 46.227-14.274 65.86 0 5.357 3.905 12.865 2.727 16.77-2.63 3.905-5.357 2.727-12.865-2.63-16.77Z"),
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
        return _wifiMedium!!
    }

private var _wifiMedium: ImageVector? = null
