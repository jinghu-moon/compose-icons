package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = phosphorRegularIcon(
            name = "Sword",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(149.517f, 31.999756f, 147.17464f, 33.152466f, 145.66f, 35.12f),
                    PathNode.LineTo(81.66f, 118.33f),
                    PathNode.LineTo(72.0f, 108.69f),
                    PathNode.CurveTo(68.99891f, 105.68557f, 64.926544f, 103.99741f, 60.68f, 103.99741f),
                    PathNode.CurveTo(56.433453f, 103.99741f, 52.36109f, 105.68557f, 49.36f, 108.69f),
                    PathNode.LineTo(36.67f, 121.39f),
                    PathNode.CurveTo(33.66863f, 124.390686f, 31.982416f, 128.4609f, 31.982416f, 132.705f),
                    PathNode.CurveTo(31.982416f, 136.9491f, 33.66863f, 141.01932f, 36.67f, 144.02f),
                    PathNode.LineTo(56.67f, 164.02f),
                    PathNode.LineTo(28.67f, 192.02f),
                    PathNode.CurveTo(25.668629f, 195.02069f, 23.982416f, 199.0909f, 23.982416f, 203.335f),
                    PathNode.CurveTo(23.982416f, 207.5791f, 25.668629f, 211.6493f, 28.67f, 214.65f),
                    PathNode.LineTo(41.36f, 227.33f),
                    PathNode.CurveTo(47.60754f, 233.57344f, 57.73246f, 233.57344f, 63.98f, 227.33f),
                    PathNode.LineTo(91.98f, 199.33f),
                    PathNode.LineTo(111.98f, 219.33f),
                    PathNode.CurveTo(114.981094f, 222.33443f, 119.05345f, 224.02258f, 123.3f, 224.02258f),
                    PathNode.CurveTo(127.54655f, 224.02258f, 131.61891f, 222.33443f, 134.62f, 219.33f),
                    PathNode.LineTo(147.31f, 206.63f),
                    PathNode.CurveTo(150.31137f, 203.62932f, 151.99759f, 199.5591f, 151.99759f, 195.315f),
                    PathNode.CurveTo(151.99759f, 191.0709f, 150.31137f, 187.00069f, 147.31f, 184.0f),
                    PathNode.LineTo(137.67f, 174.36f),
                    PathNode.LineTo(220.88f, 110.36f),
                    PathNode.CurveTo(222.85312f, 108.84109f, 224.00647f, 106.49003f, 224.0f, 104.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 35.581722f, 220.41827f, 32.0f, 216.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.69f, 216.0f),
                    PathNode.LineTo(40.0f, 203.32f),
                    PathNode.LineTo(68.0f, 175.32f),
                    PathNode.LineTo(80.68f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(123.3f, 208.0f),
                    PathNode.LineTo(48.0f, 132.71f),
                    PathNode.LineTo(60.7f, 120.0f),
                    PathNode.LineTo(136.0f, 195.31f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 100.06f),
                    PathNode.LineTo(126.26f, 162.94f),
                    PathNode.LineTo(115.32f, 152.0f),
                    PathNode.LineTo(165.66f, 101.66f),
                    PathNode.CurveTo(168.78317f, 98.534065f, 168.78093f, 93.46817f, 165.655f, 90.345f),
                    PathNode.CurveTo(162.52907f, 87.22183f, 157.46317f, 87.22407f, 154.34f, 90.35f),
                    PathNode.LineTo(104.0f, 140.68f),
                    PathNode.LineTo(93.07f, 129.74f),
                    PathNode.LineTo(155.94f, 48.0f),
                    PathNode.LineTo(208.0f, 48.0f),
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
        return _sword!!
    }

private var _sword: ImageVector? = null
