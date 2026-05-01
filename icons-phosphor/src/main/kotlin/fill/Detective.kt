package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Detective: ImageVector
    get() {
        if (_detective != null) return _detective!!
        _detective = phosphorFillIcon(
            name = "Detective",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 120.0f),
                    PathNode.CurveTo(256.0f, 124.41828f, 252.41827f, 128.0f, 248.0f, 128.0f),
                    PathNode.LineTo(8.0f, 128.0f),
                    PathNode.CurveTo(3.581722f, 128.0f, 0f, 124.41828f, 0f, 120.0f),
                    PathNode.CurveTo(0f, 115.58172f, 3.581722f, 112.0f, 8.0f, 112.0f),
                    PathNode.LineTo(35.92f, 112.0f),
                    PathNode.LineTo(83.42f, 46.59f),
                    PathNode.CurveTo(86.33714f, 42.58481f, 90.94532f, 40.157143f, 95.89824f, 40.016243f),
                    PathNode.CurveTo(100.85116f, 39.875347f, 105.58989f, 42.03712f, 108.73f, 45.87f),
                    PathNode.LineTo(121.58f, 60.77f),
                    PathNode.LineTo(121.78f, 61.0f),
                    PathNode.CurveTo(123.28832f, 62.894855f, 125.57812f, 63.99883f, 128.0f, 63.99883f),
                    PathNode.CurveTo(130.42188f, 63.99883f, 132.71169f, 62.894855f, 134.22f, 61.0f),
                    PathNode.LineTo(134.42f, 60.77f),
                    PathNode.LineTo(147.27f, 45.87f),
                    PathNode.CurveTo(150.41011f, 42.03712f, 155.14885f, 39.875347f, 160.10176f, 40.016243f),
                    PathNode.CurveTo(165.05469f, 40.157143f, 169.66286f, 42.58481f, 172.58f, 46.59f),
                    PathNode.LineTo(220.08f, 112.0f),
                    PathNode.LineTo(248.0f, 112.0f),
                    PathNode.CurveTo(252.41827f, 112.0f, 256.0f, 115.58172f, 256.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 144.0f),
                    PathNode.CurveTo(161.66833f, 144.00362f, 146.26685f, 157.78185f, 144.23f, 176.0f),
                    PathNode.LineTo(111.77f, 176.0f),
                    PathNode.CurveTo(109.728546f, 157.79968f, 94.348045f, 144.0328f, 76.03361f, 144.01283f),
                    PathNode.CurveTo(57.719166f, 143.99286f, 42.308678f, 157.72617f, 40.22753f, 175.92198f),
                    PathNode.CurveTo(38.146385f, 194.11781f, 50.05796f, 210.97606f, 67.90393f, 215.09193f),
                    PathNode.CurveTo(85.7499f, 219.20781f, 103.8417f, 209.26933f, 109.94f, 192.0f),
                    PathNode.LineTo(146.06f, 192.0f),
                    PathNode.CurveTo(152.16263f, 209.26082f, 170.248f, 219.19254f, 188.08798f, 215.07994f),
                    PathNode.CurveTo(205.92796f, 210.96736f, 217.84015f, 194.1204f, 215.77031f, 175.92993f),
                    PathNode.CurveTo(213.70047f, 157.73944f, 198.30786f, 143.99942f, 180.0f, 144.0f),
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
        return _detective!!
    }

private var _detective: ImageVector? = null
