package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorThinIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 156.000 80.000 C 156.000 77.791 157.791 76.000 160.000 76.000 L 248.000 76.000 C 250.209 76.000 252.000 77.791 252.000 80.000 C 252.000 82.209 250.209 84.000 248.000 84.000 L 160.000 84.000 C 157.791 84.000 156.000 82.209 156.000 80.000 ZM 248.000 124.000 L 160.000 124.000 C 157.791 124.000 156.000 125.791 156.000 128.000 C 156.000 130.209 157.791 132.000 160.000 132.000 L 248.000 132.000 C 250.209 132.000 252.000 130.209 252.000 128.000 C 252.000 125.791 250.209 124.000 248.000 124.000 ZM 248.000 172.000 L 184.000 172.000 C 181.791 172.000 180.000 173.791 180.000 176.000 C 180.000 178.209 181.791 180.000 184.000 180.000 L 248.000 180.000 C 250.209 180.000 252.000 178.209 252.000 176.000 C 252.000 173.791 250.209 172.000 248.000 172.000 ZM 147.870 191.000 C 148.421 193.137 147.136 195.316 145.000 195.870 C 144.674 195.957 144.338 196.000 144.000 196.000 C 142.177 195.999 140.586 194.765 140.130 193.000 C 133.420 166.920 108.130 148.000 80.000 148.000 C 51.870 148.000 26.590 166.920 19.870 193.000 C 19.558 194.432 18.487 195.578 17.080 195.988 C 15.674 196.397 14.155 196.005 13.123 194.965 C 12.091 193.925 11.710 192.404 12.130 191.000 C 18.050 168.000 36.700 149.860 59.650 143.000 C 41.682 133.627 32.440 113.195 37.265 93.512 C 42.090 73.830 59.735 59.989 80.000 59.989 C 100.265 59.989 117.910 73.830 122.735 93.512 C 127.560 113.195 118.318 133.627 100.350 143.000 C 123.300 149.860 142.000 168.000 147.870 191.000 ZM 80.000 140.000 C 99.882 140.000 116.000 123.882 116.000 104.000 C 116.000 84.118 99.882 68.000 80.000 68.000 C 60.118 68.000 44.000 84.118 44.000 104.000 C 44.000 123.882 60.118 140.000 80.000 140.000 Z"),
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
        return _userList!!
    }

private var _userList: ImageVector? = null
