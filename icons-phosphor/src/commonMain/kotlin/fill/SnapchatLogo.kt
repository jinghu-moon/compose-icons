package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SnapchatLogo: ImageVector
    get() {
        if (_snapchatLogo != null) return _snapchatLogo!!
        _snapchatLogo = phosphorFillIcon(
            name = "SnapchatLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.47f, 189.74f),
                    PathNode.CurveTo(238.37f, 196.41f, 227.8f, 197.45f, 217.59f, 198.46f),
                    PathNode.CurveTo(211.28f, 199.08f, 204.76f, 199.73f, 201.2f, 201.69f),
                    PathNode.CurveTo(197.83f, 203.55f, 194.35f, 208.31f, 190.99f, 212.91f),
                    PathNode.CurveTo(185.59f, 220.32f, 179.46f, 228.71f, 169.76f, 231.19f),
                    PathNode.LineTo(169.76f, 231.19f),
                    PathNode.CurveTo(167.59006f, 231.74098f, 165.35875f, 232.01318f, 163.12f, 232.0f),
                    PathNode.CurveTo(156.24f, 232.0f, 149.42f, 229.68f, 143.22f, 227.57f),
                    PathNode.CurveTo(137.67f, 225.68f, 132.42f, 223.89f, 128.01f, 223.89f),
                    PathNode.CurveTo(123.6f, 223.89f, 118.35f, 225.68f, 112.8f, 227.57f),
                    PathNode.CurveTo(104.61f, 230.36f, 95.33f, 233.57f, 86.26f, 231.19f),
                    PathNode.CurveTo(76.55f, 228.71f, 70.42f, 220.32f, 65.02f, 212.91f),
                    PathNode.CurveTo(61.66f, 208.31f, 58.18f, 203.55f, 54.81f, 201.69f),
                    PathNode.CurveTo(51.25f, 199.69f, 44.73f, 199.08f, 38.43f, 198.46f),
                    PathNode.CurveTo(28.21f, 197.46f, 17.64f, 196.41f, 10.54f, 189.74f),
                    PathNode.CurveTo(8.510512f, 187.83417f, 7.61781f, 185.01025f, 8.183026f, 182.28415f),
                    PathNode.CurveTo(8.748241f, 179.55806f, 10.690082f, 177.32187f, 13.31f, 176.38f),
                    PathNode.CurveTo(13.4f, 176.38f, 26.15f, 171.52f, 38.67f, 157.38f),
                    PathNode.CurveTo(46.423122f, 148.51364f, 52.4409f, 138.26917f, 56.41f, 127.18f),
                    PathNode.LineTo(37.0f, 119.43f),
                    PathNode.CurveTo(32.896523f, 117.77315f, 30.913145f, 113.10348f, 32.57f, 109.0f),
                    PathNode.CurveTo(34.226852f, 104.89652f, 38.896523f, 102.91315f, 43.0f, 104.57f),
                    PathNode.LineTo(60.85f, 111.72f),
                    PathNode.CurveTo(63.01442f, 101.28715f, 64.07028f, 90.65478f, 64.0f, 80.0f),
                    PathNode.CurveTo(64.0f, 44.653774f, 92.65378f, 16.0f, 128.0f, 16.0f),
                    PathNode.CurveTo(163.34622f, 16.0f, 192.0f, 44.653774f, 192.0f, 80.0f),
                    PathNode.CurveTo(191.93175f, 90.66105f, 193.0079f, 101.29863f, 195.21f, 111.73f),
                    PathNode.LineTo(213.0f, 104.57f),
                    PathNode.CurveTo(217.10347f, 102.91315f, 221.77315f, 104.89652f, 223.43f, 109.0f),
                    PathNode.CurveTo(225.08685f, 113.10348f, 223.10347f, 117.77315f, 219.0f, 119.43f),
                    PathNode.LineTo(199.7f, 127.15f),
                    PathNode.CurveTo(213.78f, 165.5f, 242.34f, 176.24f, 242.7f, 176.38f),
                    PathNode.CurveTo(245.31992f, 177.32187f, 247.26176f, 179.55806f, 247.82698f, 182.28415f),
                    PathNode.CurveTo(248.3922f, 185.01025f, 247.49948f, 187.83417f, 245.47f, 189.74f),
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
        return _snapchatLogo!!
    }

private var _snapchatLogo: ImageVector? = null
