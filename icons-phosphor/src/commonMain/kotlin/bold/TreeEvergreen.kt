package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.TreeEvergreen: ImageVector
    get() {
        if (_treeEvergreen != null) return _treeEvergreen!!
        _treeEvergreen = phosphorBoldIcon(
            name = "TreeEvergreen",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(233.47f, 184.63f),
                    PathNode.LineTo(192.54f, 132.0f),
                    PathNode.LineTo(208.0f, 132.0f),
                    PathNode.CurveTo(212.57262f, 132.00046f, 216.74811f, 129.40215f, 218.76753f, 125.29959f),
                    PathNode.CurveTo(220.78696f, 121.19704f, 220.2993f, 116.30336f, 217.51f, 112.68f),
                    PathNode.LineTo(137.51f, 8.68f),
                    PathNode.CurveTo(135.23785f, 5.73578f, 131.72902f, 4.011439f, 128.01f, 4.011439f),
                    PathNode.CurveTo(124.290985f, 4.011439f, 120.78214f, 5.73578f, 118.51f, 8.68f),
                    PathNode.LineTo(38.51f, 112.68f),
                    PathNode.CurveTo(35.72288f, 116.30051f, 35.233624f, 121.18962f, 37.24804f, 125.29063f),
                    PathNode.CurveTo(39.262455f, 129.39163f, 43.43097f, 131.99284f, 48.0f, 132.0f),
                    PathNode.LineTo(63.46f, 132.0f),
                    PathNode.LineTo(22.53f, 184.63f),
                    PathNode.CurveTo(19.71478f, 188.24742f, 19.206263f, 193.15262f, 21.219551f, 197.27061f),
                    PathNode.CurveTo(23.232843f, 201.38863f, 27.416197f, 203.99995f, 32.0f, 204.0f),
                    PathNode.LineTo(116.0f, 204.0f),
                    PathNode.LineTo(116.0f, 240.0f),
                    PathNode.CurveTo(116.0f, 246.62741f, 121.37258f, 252.0f, 128.0f, 252.0f),
                    PathNode.CurveTo(134.62741f, 252.0f, 140.0f, 246.62741f, 140.0f, 240.0f),
                    PathNode.LineTo(140.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(228.5838f, 203.99995f, 232.76715f, 201.38863f, 234.78044f, 197.27061f),
                    PathNode.CurveTo(236.79373f, 193.15262f, 236.28522f, 188.24742f, 233.47f, 184.63f),
                    PathNode.Close,
                    PathNode.MoveTo(56.54f, 180.0f),
                    PathNode.LineTo(97.47f, 127.37f),
                    PathNode.CurveTo(100.28522f, 123.75257f, 100.79374f, 118.847374f, 98.78045f, 114.72938f),
                    PathNode.CurveTo(96.76716f, 110.61138f, 92.5838f, 108.000046f, 88.0f, 108.0f),
                    PathNode.LineTo(72.37f, 108.0f),
                    PathNode.LineTo(128.0f, 35.68f),
                    PathNode.LineTo(183.63f, 108.0f),
                    PathNode.LineTo(168.0f, 108.0f),
                    PathNode.CurveTo(163.4162f, 108.000046f, 159.23285f, 110.61138f, 157.21956f, 114.72938f),
                    PathNode.CurveTo(155.20627f, 118.847374f, 155.71478f, 123.75257f, 158.53f, 127.37f),
                    PathNode.LineTo(199.46f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _treeEvergreen!!
    }

private var _treeEvergreen: ImageVector? = null
