package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.DropboxLogo: ImageVector
    get() {
        if (_dropboxLogo != null) return _dropboxLogo!!
        _dropboxLogo = phosphorFillIcon(
            name = "DropboxLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 188.000 120.000 L 128.000 80.000 L 183.560 43.000 C 186.248 41.206 189.752 41.206 192.440 43.000 L 238.000 73.340 C 240.229 74.823 241.568 77.323 241.568 80.000 C 241.568 82.677 240.229 85.177 238.000 86.660 ZM 72.440 43.000 C 69.752 41.206 66.248 41.206 63.560 43.000 L 18.000 73.340 C 15.771 74.823 14.432 77.323 14.432 80.000 C 14.432 82.677 15.771 85.177 18.000 86.660 L 68.000 120.000 L 128.000 80.000 ZM 238.000 153.340 L 188.000 120.000 L 128.000 160.000 L 183.560 197.000 C 186.248 198.794 189.752 198.794 192.440 197.000 L 238.000 166.660 C 240.229 165.177 241.568 162.677 241.568 160.000 C 241.568 157.323 240.229 154.823 238.000 153.340 ZM 18.000 153.340 C 15.771 154.823 14.432 157.323 14.432 160.000 C 14.432 162.677 15.771 165.177 18.000 166.660 L 63.560 197.000 C 66.248 198.794 69.752 198.794 72.440 197.000 L 128.000 160.000 L 68.000 120.000 ZM 168.610 206.290 L 130.240 180.710 C 128.896 179.813 127.144 179.813 125.800 180.710 L 87.410 206.290 C 86.300 207.032 85.634 208.280 85.634 209.615 C 85.634 210.950 86.300 212.198 87.410 212.940 L 123.560 237.000 C 126.248 238.794 129.752 238.794 132.440 237.000 L 168.590 212.900 C 169.683 212.155 170.337 210.918 170.337 209.595 C 170.337 208.272 169.683 207.035 168.590 206.290 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _dropboxLogo!!
    }

private var _dropboxLogo: ImageVector? = null
