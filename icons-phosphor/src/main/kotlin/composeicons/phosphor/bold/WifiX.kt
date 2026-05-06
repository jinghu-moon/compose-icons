package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WifiX: ImageVector
    get() {
        if (_wifiX != null) return _wifiX!!
        _wifiX = phosphorBoldIcon(
            name = "WifiX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M144 204c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM217 80 232.52 64.49c4.694-4.694 4.694-12.306 0-17-4.694-4.694-12.306-4.694-17 0L200 63 184.49 47.51c-4.694-4.694-12.306-4.694-17 0-4.694 4.694-4.694 12.306 0 17L183 80 167.51 95.51c-4.694 4.694-4.694 12.306 0 17 4.694 4.694 12.306 4.694 17 0L200 97l15.51 15.52c4.694 4.694 12.306 4.694 17 0 4.694-4.694 4.694-12.306 0-17ZM175.1 155.3c-28.057-20.412-66.073-20.412-94.13 0-5.357 3.902-6.537 11.408-2.635 16.765 3.902 5.357 11.408 6.537 16.765 2.635 19.635-14.279 46.235-14.279 65.87 0 5.357 3.902 12.863 2.722 16.765-2.635 3.902-5.357 2.722-12.863-2.635-16.765ZM140 56c0-6.627-5.373-12-12-12C87.305 44.021 47.871 58.122 16.39 83.91c-5.122 4.206-5.866 11.768-1.66 16.89 4.206 5.122 11.768 5.866 16.89 1.66C58.807 80.194 92.859 68.019 128 68c6.627 0 12-5.373 12-12ZM140 104c0-6.627-5.373-12-12-12-28.859-.107-56.889 9.645-79.45 27.64-5.06 4.153-5.858 11.595-1.793 16.727 4.065 5.131 11.492 6.058 16.693 2.083C81.78 123.831 104.554 115.91 128 116c6.627 0 12-5.373 12-12Z"),
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
        return _wifiX!!
    }

private var _wifiX: ImageVector? = null
