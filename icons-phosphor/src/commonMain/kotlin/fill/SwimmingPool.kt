package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SwimmingPool: ImageVector
    get() {
        if (_swimmingPool != null) return _swimmingPool!!
        _swimmingPool = phosphorFillIcon(
            name = "SwimmingPool",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(24.0f, 168.0f),
                    PathNode.CurveTo(24.0f, 163.58173f, 27.581722f, 160.0f, 32.0f, 160.0f),
                    PathNode.CurveTo(46.42f, 160.0f, 54.19f, 165.18f, 60.44f, 169.34f),
                    PathNode.CurveTo(66.0f, 173.06f, 70.42f, 176.0f, 80.0f, 176.0f),
                    PathNode.CurveTo(89.58f, 176.0f, 94.0f, 173.06f, 99.56f, 169.34f),
                    PathNode.CurveTo(105.8f, 165.18f, 113.56f, 160.0f, 127.99f, 160.0f),
                    PathNode.CurveTo(142.42f, 160.0f, 150.19f, 165.18f, 156.43f, 169.34f),
                    PathNode.CurveTo(162.01f, 173.06f, 166.43f, 176.0f, 176.0f, 176.0f),
                    PathNode.CurveTo(185.57f, 176.0f, 190.0f, 173.06f, 195.56f, 169.34f),
                    PathNode.CurveTo(201.81f, 165.18f, 209.56f, 160.0f, 224.0f, 160.0f),
                    PathNode.CurveTo(228.41827f, 160.0f, 232.0f, 163.58173f, 232.0f, 168.0f),
                    PathNode.CurveTo(232.0f, 172.41827f, 228.41827f, 176.0f, 224.0f, 176.0f),
                    PathNode.CurveTo(214.42f, 176.0f, 210.0f, 178.94f, 204.44f, 182.66f),
                    PathNode.CurveTo(198.19f, 186.82f, 190.44f, 192.0f, 176.0f, 192.0f),
                    PathNode.CurveTo(161.56f, 192.0f, 153.8f, 186.82f, 147.56f, 182.66f),
                    PathNode.CurveTo(142.0f, 178.94f, 137.57f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(118.43f, 176.0f, 114.0f, 178.94f, 108.44f, 182.66f),
                    PathNode.CurveTo(102.2f, 186.82f, 94.44f, 192.0f, 80.01f, 192.0f),
                    PathNode.CurveTo(65.58f, 192.0f, 57.82f, 186.82f, 51.57f, 182.66f),
                    PathNode.CurveTo(46.0f, 178.94f, 41.58f, 176.0f, 32.0f, 176.0f),
                    PathNode.CurveTo(27.581722f, 176.0f, 24.0f, 172.41827f, 24.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 200.0f),
                    PathNode.CurveTo(209.58f, 200.0f, 201.81f, 205.18f, 195.56f, 209.34f),
                    PathNode.CurveTo(190.0f, 213.06f, 185.58f, 216.0f, 176.0f, 216.0f),
                    PathNode.CurveTo(166.42f, 216.0f, 162.0f, 213.06f, 156.43f, 209.34f),
                    PathNode.CurveTo(150.19f, 205.18f, 142.43f, 200.0f, 127.99f, 200.0f),
                    PathNode.CurveTo(113.55f, 200.0f, 105.8f, 205.18f, 99.56f, 209.34f),
                    PathNode.CurveTo(94.0f, 213.06f, 89.57f, 216.0f, 80.0f, 216.0f),
                    PathNode.CurveTo(70.43f, 216.0f, 66.0f, 213.06f, 60.44f, 209.34f),
                    PathNode.CurveTo(54.19f, 205.18f, 46.42f, 200.0f, 32.0f, 200.0f),
                    PathNode.CurveTo(27.581722f, 200.0f, 24.0f, 203.58173f, 24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 212.41827f, 27.581722f, 216.0f, 32.0f, 216.0f),
                    PathNode.CurveTo(41.58f, 216.0f, 46.0f, 218.94f, 51.56f, 222.66f),
                    PathNode.CurveTo(57.81f, 226.82f, 65.56f, 232.0f, 80.0f, 232.0f),
                    PathNode.CurveTo(94.44f, 232.0f, 102.19f, 226.82f, 108.43f, 222.66f),
                    PathNode.CurveTo(114.01f, 218.94f, 118.43f, 216.0f, 127.99f, 216.0f),
                    PathNode.CurveTo(137.55f, 216.0f, 141.99f, 218.94f, 147.56f, 222.66f),
                    PathNode.CurveTo(153.8f, 226.82f, 161.56f, 232.0f, 176.0f, 232.0f),
                    PathNode.CurveTo(190.44f, 232.0f, 198.19f, 226.82f, 204.44f, 222.66f),
                    PathNode.CurveTo(210.01f, 218.94f, 214.44f, 216.0f, 224.0f, 216.0f),
                    PathNode.CurveTo(228.41827f, 216.0f, 232.0f, 212.41827f, 232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 203.58173f, 228.41827f, 200.0f, 224.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 141.39f),
                    PathNode.LineTo(80.0f, 32.0f),
                    PathNode.CurveTo(80.0f, 27.581722f, 83.58172f, 24.0f, 88.0f, 24.0f),
                    PathNode.CurveTo(92.41828f, 24.0f, 96.0f, 27.581722f, 96.0f, 32.0f),
                    PathNode.LineTo(96.0f, 40.0f),
                    PathNode.LineTo(160.0f, 40.0f),
                    PathNode.LineTo(160.0f, 32.0f),
                    PathNode.CurveTo(160.0f, 27.581722f, 163.58173f, 24.0f, 168.0f, 24.0f),
                    PathNode.CurveTo(172.41827f, 24.0f, 176.0f, 27.581722f, 176.0f, 32.0f),
                    PathNode.LineTo(176.0f, 143.29f),
                    PathNode.CurveTo(176.0f, 147.70828f, 172.41827f, 151.29f, 168.0f, 151.29f),
                    PathNode.CurveTo(163.58173f, 151.29f, 160.0f, 147.70828f, 160.0f, 143.29f),
                    PathNode.LineTo(160.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.LineTo(96.0f, 141.39f),
                    PathNode.CurveTo(96.0f, 145.80827f, 92.41828f, 149.39f, 88.0f, 149.39f),
                    PathNode.CurveTo(83.58172f, 149.39f, 80.0f, 145.80827f, 80.0f, 141.39f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 72.0f),
                    PathNode.CurveTo(96.0f, 76.41828f, 99.58172f, 80.0f, 104.0f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(156.41827f, 80.0f, 160.0f, 76.41828f, 160.0f, 72.0f),
                    PathNode.CurveTo(160.0f, 67.58172f, 156.41827f, 64.0f, 152.0f, 64.0f),
                    PathNode.LineTo(104.0f, 64.0f),
                    PathNode.CurveTo(99.58172f, 64.0f, 96.0f, 67.58172f, 96.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 104.0f),
                    PathNode.CurveTo(96.0f, 108.41828f, 99.58172f, 112.0f, 104.0f, 112.0f),
                    PathNode.LineTo(152.0f, 112.0f),
                    PathNode.CurveTo(156.41827f, 112.0f, 160.0f, 108.41828f, 160.0f, 104.0f),
                    PathNode.CurveTo(160.0f, 99.58172f, 156.41827f, 96.0f, 152.0f, 96.0f),
                    PathNode.LineTo(104.0f, 96.0f),
                    PathNode.CurveTo(99.58172f, 96.0f, 96.0f, 99.58172f, 96.0f, 104.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _swimmingPool!!
    }

private var _swimmingPool: ImageVector? = null
