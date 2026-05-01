package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorLightIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(154.0f, 80.0f),
                    PathNode.CurveTo(154.0f, 76.686295f, 156.6863f, 74.0f, 160.0f, 74.0f),
                    PathNode.LineTo(248.0f, 74.0f),
                    PathNode.CurveTo(251.3137f, 74.0f, 254.0f, 76.686295f, 254.0f, 80.0f),
                    PathNode.CurveTo(254.0f, 83.313705f, 251.3137f, 86.0f, 248.0f, 86.0f),
                    PathNode.LineTo(160.0f, 86.0f),
                    PathNode.CurveTo(156.6863f, 86.0f, 154.0f, 83.313705f, 154.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 122.0f),
                    PathNode.LineTo(160.0f, 122.0f),
                    PathNode.CurveTo(156.6863f, 122.0f, 154.0f, 124.686295f, 154.0f, 128.0f),
                    PathNode.CurveTo(154.0f, 131.3137f, 156.6863f, 134.0f, 160.0f, 134.0f),
                    PathNode.LineTo(248.0f, 134.0f),
                    PathNode.CurveTo(251.3137f, 134.0f, 254.0f, 131.3137f, 254.0f, 128.0f),
                    PathNode.CurveTo(254.0f, 124.686295f, 251.3137f, 122.0f, 248.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 170.0f),
                    PathNode.LineTo(184.0f, 170.0f),
                    PathNode.CurveTo(180.6863f, 170.0f, 178.0f, 172.6863f, 178.0f, 176.0f),
                    PathNode.CurveTo(178.0f, 179.3137f, 180.6863f, 182.0f, 184.0f, 182.0f),
                    PathNode.LineTo(248.0f, 182.0f),
                    PathNode.CurveTo(251.3137f, 182.0f, 254.0f, 179.3137f, 254.0f, 176.0f),
                    PathNode.CurveTo(254.0f, 172.6863f, 251.3137f, 170.0f, 248.0f, 170.0f),
                    PathNode.Close,
                    PathNode.MoveTo(149.81f, 190.5f),
                    PathNode.CurveTo(150.63843f, 193.70877f, 148.70877f, 196.98157f, 145.5f, 197.81f),
                    PathNode.CurveTo(142.29123f, 198.63843f, 139.01843f, 196.70877f, 138.19f, 193.5f),
                    PathNode.CurveTo(131.7f, 168.29f, 107.23f, 150.0f, 80.0f, 150.0f),
                    PathNode.CurveTo(52.77f, 150.0f, 28.3f, 168.29f, 21.81f, 193.49f),
                    PathNode.CurveTo(20.981573f, 196.69879f, 17.708775f, 198.62843f, 14.5f, 197.8f),
                    PathNode.CurveTo(11.291225f, 196.97157f, 9.361573f, 193.69879f, 10.19f, 190.49f),
                    PathNode.CurveTo(15.93f, 168.21f, 33.19f, 150.42f, 54.86f, 142.49f),
                    PathNode.CurveTo(37.81461f, 131.36607f, 30.106216f, 110.36265f, 35.908997f, 90.853294f),
                    PathNode.CurveTo(41.711773f, 71.34394f, 59.645954f, 57.967533f, 80.0f, 57.967533f),
                    PathNode.CurveTo(100.35404f, 57.967533f, 118.28822f, 71.34394f, 124.091f, 90.853294f),
                    PathNode.CurveTo(129.89378f, 110.36265f, 122.185394f, 131.36607f, 105.14f, 142.49f),
                    PathNode.CurveTo(126.79f, 150.43f, 144.08f, 168.22f, 149.81f, 190.5f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 138.0f),
                    PathNode.CurveTo(98.77768f, 138.0f, 114.0f, 122.77768f, 114.0f, 104.0f),
                    PathNode.CurveTo(114.0f, 85.22232f, 98.77768f, 70.0f, 80.0f, 70.0f),
                    PathNode.CurveTo(61.222317f, 70.0f, 46.0f, 85.22232f, 46.0f, 104.0f),
                    PathNode.CurveTo(46.0f, 122.77768f, 61.222317f, 138.0f, 80.0f, 138.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userList!!
    }

private var _userList: ImageVector? = null
