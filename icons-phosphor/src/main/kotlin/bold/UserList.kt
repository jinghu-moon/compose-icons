package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorBoldIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 80.0f),
                    PathNode.CurveTo(152.0f, 73.37258f, 157.37259f, 68.0f, 164.0f, 68.0f),
                    PathNode.LineTo(244.0f, 68.0f),
                    PathNode.CurveTo(250.62741f, 68.0f, 256.0f, 73.37258f, 256.0f, 80.0f),
                    PathNode.CurveTo(256.0f, 86.62742f, 250.62741f, 92.0f, 244.0f, 92.0f),
                    PathNode.LineTo(164.0f, 92.0f),
                    PathNode.CurveTo(157.37259f, 92.0f, 152.0f, 86.62742f, 152.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 116.0f),
                    PathNode.LineTo(164.0f, 116.0f),
                    PathNode.CurveTo(157.37259f, 116.0f, 152.0f, 121.37258f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 134.62741f, 157.37259f, 140.0f, 164.0f, 140.0f),
                    PathNode.LineTo(244.0f, 140.0f),
                    PathNode.CurveTo(250.62741f, 140.0f, 256.0f, 134.62741f, 256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 121.37258f, 250.62741f, 116.0f, 244.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 164.0f),
                    PathNode.LineTo(188.0f, 164.0f),
                    PathNode.CurveTo(181.37259f, 164.0f, 176.0f, 169.37259f, 176.0f, 176.0f),
                    PathNode.CurveTo(176.0f, 182.62741f, 181.37259f, 188.0f, 188.0f, 188.0f),
                    PathNode.LineTo(244.0f, 188.0f),
                    PathNode.CurveTo(250.62741f, 188.0f, 256.0f, 182.62741f, 256.0f, 176.0f),
                    PathNode.CurveTo(256.0f, 169.37259f, 250.62741f, 164.0f, 244.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.62f, 189.0f),
                    PathNode.CurveTo(157.27686f, 195.41754f, 153.41754f, 201.96315f, 147.0f, 203.62f),
                    PathNode.CurveTo(140.58246f, 205.27686f, 134.03685f, 201.41754f, 132.38f, 195.0f),
                    PathNode.CurveTo(126.66f, 172.77f, 104.14f, 156.0f, 80.0f, 156.0f),
                    PathNode.CurveTo(55.86f, 156.0f, 33.34f, 172.76f, 27.62f, 195.0f),
                    PathNode.CurveTo(25.963146f, 201.41754f, 19.41755f, 205.27686f, 13.0f, 203.62f),
                    PathNode.CurveTo(6.582452f, 201.96315f, 2.723146f, 195.41754f, 4.38f, 189.0f),
                    PathNode.CurveTo(9.76f, 168.1f, 24.47f, 150.84f, 43.49f, 141.0f),
                    PathNode.CurveTo(28.460623f, 126.18859f, 23.872087f, 103.76322f, 31.87591f, 84.23891f),
                    PathNode.CurveTo(39.87973f, 64.71459f, 58.888817f, 51.962856f, 79.99f, 51.962856f),
                    PathNode.CurveTo(101.09119f, 51.962856f, 120.100266f, 64.71459f, 128.1041f, 84.23891f),
                    PathNode.CurveTo(136.10791f, 103.76322f, 131.51938f, 126.18859f, 116.49f, 141.0f),
                    PathNode.CurveTo(135.53f, 150.85f, 150.24f, 168.11f, 155.62f, 189.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 132.0f),
                    PathNode.CurveTo(95.463974f, 132.0f, 108.0f, 119.463974f, 108.0f, 104.0f),
                    PathNode.CurveTo(108.0f, 88.536026f, 95.463974f, 76.0f, 80.0f, 76.0f),
                    PathNode.CurveTo(64.536026f, 76.0f, 52.0f, 88.536026f, 52.0f, 104.0f),
                    PathNode.CurveTo(52.0f, 119.463974f, 64.536026f, 132.0f, 80.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userList!!
    }

private var _userList: ImageVector? = null
