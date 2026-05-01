package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ListHeart: ImageVector
    get() {
        if (_listHeart != null) return _listHeart!!
        _listHeart = phosphorBoldIcon(
            name = "ListHeart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 192.0f),
                    PathNode.CurveTo(124.0f, 198.62741f, 118.62742f, 204.0f, 112.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(33.37258f, 204.0f, 28.0f, 198.62741f, 28.0f, 192.0f),
                    PathNode.CurveTo(28.0f, 185.37259f, 33.37258f, 180.0f, 40.0f, 180.0f),
                    PathNode.LineTo(112.0f, 180.0f),
                    PathNode.CurveTo(118.62742f, 180.0f, 124.0f, 185.37259f, 124.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 76.0f),
                    PathNode.LineTo(216.0f, 76.0f),
                    PathNode.CurveTo(222.62741f, 76.0f, 228.0f, 70.62742f, 228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 57.37258f, 222.62741f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(33.37258f, 52.0f, 28.0f, 57.37258f, 28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 70.62742f, 33.37258f, 76.0f, 40.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 140.0f),
                    PathNode.LineTo(96.0f, 140.0f),
                    PathNode.CurveTo(102.62742f, 140.0f, 108.0f, 134.62741f, 108.0f, 128.0f),
                    PathNode.CurveTo(108.0f, 121.37258f, 102.62742f, 116.0f, 96.0f, 116.0f),
                    PathNode.LineTo(40.0f, 116.0f),
                    PathNode.CurveTo(33.37258f, 116.0f, 28.0f, 121.37258f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 134.62741f, 33.37258f, 140.0f, 40.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 144.0f),
                    PathNode.CurveTo(252.0f, 161.0f, 242.47f, 177.56f, 223.68f, 193.22f),
                    PathNode.CurveTo(215.54457f, 199.95813f, 206.72658f, 205.82674f, 197.37f, 210.73f),
                    PathNode.CurveTo(193.98979f, 212.42146f, 190.01021f, 212.42146f, 186.63f, 210.73f),
                    PathNode.CurveTo(177.27342f, 205.82674f, 168.45543f, 199.95813f, 160.32f, 193.22f),
                    PathNode.CurveTo(141.53f, 177.56f, 132.0f, 161.0f, 132.0f, 144.0f),
                    PathNode.CurveTo(132.00899f, 129.8075f, 140.3557f, 116.94476f, 153.31348f, 111.1548f),
                    PathNode.CurveTo(166.27126f, 105.36484f, 181.42152f, 107.728325f, 192.0f, 117.19f),
                    PathNode.CurveTo(202.57848f, 107.728325f, 217.72874f, 105.36484f, 230.68652f, 111.1548f),
                    PathNode.CurveTo(243.6443f, 116.94476f, 251.99101f, 129.8075f, 252.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 144.0f),
                    PathNode.CurveTo(228.0f, 137.37259f, 222.62741f, 132.0f, 216.0f, 132.0f),
                    PathNode.CurveTo(209.37259f, 132.0f, 204.0f, 137.37259f, 204.0f, 144.0f),
                    PathNode.CurveTo(204.0f, 150.62741f, 198.62741f, 156.0f, 192.0f, 156.0f),
                    PathNode.CurveTo(185.37259f, 156.0f, 180.0f, 150.62741f, 180.0f, 144.0f),
                    PathNode.CurveTo(180.0f, 137.37259f, 174.62741f, 132.0f, 168.0f, 132.0f),
                    PathNode.CurveTo(161.37259f, 132.0f, 156.0f, 137.37259f, 156.0f, 144.0f),
                    PathNode.CurveTo(156.0f, 161.23f, 178.85f, 178.43f, 192.0f, 186.29f),
                    PathNode.CurveTo(205.14f, 178.44f, 228.0f, 161.23f, 228.0f, 144.0f),
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
        return _listHeart!!
    }

private var _listHeart: ImageVector? = null
