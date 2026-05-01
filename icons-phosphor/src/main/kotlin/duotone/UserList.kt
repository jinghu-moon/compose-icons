package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.UserList: ImageVector
    get() {
        if (_userList != null) return _userList!!
        _userList = phosphorDuotoneIcon(
            name = "UserList",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 126.09139f, 102.09139f, 144.0f, 80.0f, 144.0f),
                    PathNode.CurveTo(57.90861f, 144.0f, 40.0f, 126.09139f, 40.0f, 104.0f),
                    PathNode.CurveTo(40.0f, 81.90861f, 57.90861f, 64.0f, 80.0f, 64.0f),
                    PathNode.CurveTo(102.09139f, 64.0f, 120.0f, 81.90861f, 120.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
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
                    PathNode.MoveTo(151.75f, 190.0f),
                    PathNode.CurveTo(152.27815f, 192.05545f, 151.96799f, 194.23653f, 150.88773f, 196.06323f),
                    PathNode.CurveTo(149.80745f, 197.88994f, 148.04564f, 199.21255f, 145.99f, 199.74f),
                    PathNode.CurveTo(145.33797f, 199.91573f, 144.6653f, 200.00317f, 143.99f, 200.0f),
                    PathNode.CurveTo(140.34052f, 200.00185f, 137.15237f, 197.5336f, 136.24f, 194.0f),
                    PathNode.CurveTo(130.08f, 170.06f, 105.9f, 152.0f, 79.99f, 152.0f),
                    PathNode.CurveTo(54.08f, 152.0f, 29.9f, 170.05f, 23.74f, 194.0f),
                    PathNode.CurveTo(22.635431f, 198.28021f, 18.270206f, 200.85457f, 13.99f, 199.75f),
                    PathNode.CurveTo(9.709793f, 198.64543f, 7.135431f, 194.28021f, 8.24f, 190.0f),
                    PathNode.CurveTo(13.83f, 168.29f, 30.08f, 150.71f, 50.7f, 142.0f),
                    PathNode.CurveTo(34.42147f, 129.46178f, 27.92894f, 107.95283f, 34.551453f, 88.50187f),
                    PathNode.CurveTo(41.173965f, 69.0509f, 59.44255f, 55.97243f, 79.99f, 55.97243f),
                    PathNode.CurveTo(100.537445f, 55.97243f, 118.80604f, 69.0509f, 125.42855f, 88.50187f),
                    PathNode.CurveTo(132.05106f, 107.95283f, 125.55853f, 129.46178f, 109.28f, 142.0f),
                    PathNode.CurveTo(129.91f, 150.71f, 146.16f, 168.29f, 151.75f, 190.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 136.0f),
                    PathNode.CurveTo(97.67311f, 136.0f, 112.0f, 121.67311f, 112.0f, 104.0f),
                    PathNode.CurveTo(112.0f, 86.32689f, 97.67311f, 72.0f, 80.0f, 72.0f),
                    PathNode.CurveTo(62.32689f, 72.0f, 48.0f, 86.32689f, 48.0f, 104.0f),
                    PathNode.CurveTo(48.0f, 121.67311f, 62.32689f, 136.0f, 80.0f, 136.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _userList!!
    }

private var _userList: ImageVector? = null
