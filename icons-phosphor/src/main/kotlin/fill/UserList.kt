package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorFillIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 152.000 80.000 C 152.000 75.582 155.582 72.000 160.000 72.000 L 248.000 72.000 C 252.418 72.000 256.000 75.582 256.000 80.000 C 256.000 84.418 252.418 88.000 248.000 88.000 L 160.000 88.000 C 155.582 88.000 152.000 84.418 152.000 80.000 ZM 248.000 120.000 L 160.000 120.000 C 155.582 120.000 152.000 123.582 152.000 128.000 C 152.000 132.418 155.582 136.000 160.000 136.000 L 248.000 136.000 C 252.418 136.000 256.000 132.418 256.000 128.000 C 256.000 123.582 252.418 120.000 248.000 120.000 ZM 248.000 168.000 L 184.000 168.000 C 179.582 168.000 176.000 171.582 176.000 176.000 C 176.000 180.418 179.582 184.000 184.000 184.000 L 248.000 184.000 C 252.418 184.000 256.000 180.418 256.000 176.000 C 256.000 171.582 252.418 168.000 248.000 168.000 ZM 109.290 142.000 C 125.569 129.462 132.061 107.953 125.439 88.502 C 118.816 69.051 100.547 55.972 80.000 55.972 C 59.453 55.972 41.184 69.051 34.561 88.502 C 27.939 107.953 34.431 129.462 50.710 142.000 C 30.090 150.730 13.840 168.300 8.250 190.000 C 7.631 192.396 8.157 194.944 9.673 196.901 C 11.189 198.857 13.525 200.001 16.000 200.000 L 144.000 200.000 C 146.475 200.001 148.811 198.857 150.327 196.901 C 151.843 194.944 152.369 192.396 151.750 190.000 C 146.160 168.290 129.910 150.720 109.290 142.000 Z"),
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
        return _userList!!
    }

private var _userList: ImageVector? = null
