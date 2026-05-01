package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
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
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 80.0f),
                    PathNode.CurveTo(152.0f, 75.58172f, 155.58173f, 72.0f, 160.0f, 72.0f),
                    PathNode.LineTo(248.0f, 72.0f),
                    PathNode.CurveTo(252.41827f, 72.0f, 256.0f, 75.58172f, 256.0f, 80.0f),
                    PathNode.CurveTo(256.0f, 84.41828f, 252.41827f, 88.0f, 248.0f, 88.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.CurveTo(155.58173f, 88.0f, 152.0f, 84.41828f, 152.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 120.0f),
                    PathNode.LineTo(160.0f, 120.0f),
                    PathNode.CurveTo(155.58173f, 120.0f, 152.0f, 123.58172f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 132.41827f, 155.58173f, 136.0f, 160.0f, 136.0f),
                    PathNode.LineTo(248.0f, 136.0f),
                    PathNode.CurveTo(252.41827f, 136.0f, 256.0f, 132.41827f, 256.0f, 128.0f),
                    PathNode.CurveTo(256.0f, 123.58172f, 252.41827f, 120.0f, 248.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 168.0f),
                    PathNode.LineTo(184.0f, 168.0f),
                    PathNode.CurveTo(179.58173f, 168.0f, 176.0f, 171.58173f, 176.0f, 176.0f),
                    PathNode.CurveTo(176.0f, 180.41827f, 179.58173f, 184.0f, 184.0f, 184.0f),
                    PathNode.LineTo(248.0f, 184.0f),
                    PathNode.CurveTo(252.41827f, 184.0f, 256.0f, 180.41827f, 256.0f, 176.0f),
                    PathNode.CurveTo(256.0f, 171.58173f, 252.41827f, 168.0f, 248.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(109.29f, 142.0f),
                    PathNode.CurveTo(125.56853f, 129.46178f, 132.06107f, 107.95283f, 125.438545f, 88.50187f),
                    PathNode.CurveTo(118.81603f, 69.0509f, 100.54745f, 55.97243f, 80.0f, 55.97243f),
                    PathNode.CurveTo(59.452553f, 55.97243f, 41.183964f, 69.0509f, 34.56145f, 88.50187f),
                    PathNode.CurveTo(27.938938f, 107.95283f, 34.43147f, 129.46178f, 50.71f, 142.0f),
                    PathNode.CurveTo(30.09f, 150.73f, 13.84f, 168.3f, 8.25f, 190.0f),
                    PathNode.CurveTo(7.631247f, 192.39642f, 8.156525f, 194.94429f, 9.672646f, 196.90057f),
                    PathNode.CurveTo(11.188767f, 198.85686f, 13.52499f, 200.00125f, 16.0f, 200.0f),
                    PathNode.LineTo(144.0f, 200.0f),
                    PathNode.CurveTo(146.475f, 200.00125f, 148.81123f, 198.85686f, 150.32735f, 196.90057f),
                    PathNode.CurveTo(151.84348f, 194.94429f, 152.36876f, 192.39642f, 151.75f, 190.0f),
                    PathNode.CurveTo(146.16f, 168.29f, 129.91f, 150.72f, 109.29f, 142.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _userList!!
    }

private var _userList: ImageVector? = null
