package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WifiLow: ImageVector
    get() {
        if (_wifiLow != null) return _wifiLow!!
        _wifiLow = phosphorBoldIcon(
            name = "WifiLow",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 204c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM175.06 155.3c-28.055-20.408-66.065-20.408-94.12 0-5.357 3.902-6.537 11.408-2.635 16.765 3.902 5.357 11.408 6.537 16.765 2.635 19.633-14.274 46.227-14.274 65.86 0 5.357 3.902 12.863 2.722 16.765-2.635 3.902-5.357 2.722-12.863-2.635-16.765Z"),
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
        return _wifiLow!!
    }

private var _wifiLow: ImageVector? = null
