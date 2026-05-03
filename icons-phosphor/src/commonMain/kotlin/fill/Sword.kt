package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Sword: ImageVector
    get() {
        if (_sword != null) return _sword!!
        _sword = phosphorFillIcon(
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
                    PathNode.LineTo(40.67f, 117.39f),
                    PathNode.CurveTo(37.66863f, 120.390686f, 35.98242f, 124.46091f, 35.98242f, 128.705f),
                    PathNode.CurveTo(35.98242f, 132.9491f, 37.66863f, 137.01932f, 40.67f, 140.02f),
                    PathNode.LineTo(62.67f, 162.02f),
                    PathNode.LineTo(30.67f, 194.02f),
                    PathNode.CurveTo(27.668629f, 197.02069f, 25.982416f, 201.0909f, 25.982416f, 205.335f),
                    PathNode.CurveTo(25.982416f, 209.5791f, 27.668629f, 213.6493f, 30.67f, 216.65f),
                    PathNode.LineTo(39.36f, 225.33f),
                    PathNode.CurveTo(45.60754f, 231.57344f, 55.73246f, 231.57344f, 61.98f, 225.33f),
                    PathNode.LineTo(93.98f, 193.33f),
                    PathNode.LineTo(115.98f, 215.33f),
                    PathNode.CurveTo(118.981094f, 218.33443f, 123.05345f, 220.02258f, 127.3f, 220.02258f),
                    PathNode.CurveTo(131.54655f, 220.02258f, 135.61891f, 218.33443f, 138.62f, 215.33f),
                    PathNode.LineTo(147.31f, 206.63f),
                    PathNode.CurveTo(150.31137f, 203.62932f, 151.99759f, 199.5591f, 151.99759f, 195.315f),
                    PathNode.CurveTo(151.99759f, 191.0709f, 150.31137f, 187.00069f, 147.31f, 184.0f),
                    PathNode.LineTo(137.67f, 174.36f),
                    PathNode.LineTo(220.88f, 110.36f),
                    PathNode.CurveTo(222.85312f, 108.84109f, 224.00647f, 106.49003f, 224.0f, 104.0f),
                    PathNode.LineTo(224.0f, 40.0f),
                    PathNode.CurveTo(224.0f, 35.581722f, 220.41827f, 32.0f, 216.0f, 32.0f),
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _sword!!
    }

private var _sword: ImageVector? = null
