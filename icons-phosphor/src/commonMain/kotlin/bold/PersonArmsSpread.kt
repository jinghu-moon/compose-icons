package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.PersonArmsSpread: ImageVector
    get() {
        if (_personArmsSpread != null) return _personArmsSpread!!
        _personArmsSpread = phosphorBoldIcon(
            name = "PersonArmsSpread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.4f, 86.85f),
                    PathNode.CurveTo(233.14247f, 75.760376f, 223.31601f, 67.84463f, 212.0f, 68.0f),
                    PathNode.LineTo(150.59f, 68.0f),
                    PathNode.CurveTo(162.47559f, 58.421204f, 167.02786f, 42.38786f, 161.94913f, 27.992472f),
                    PathNode.CurveTo(156.8704f, 13.597087f, 143.26501f, 3.969804f, 128.0f, 3.969804f),
                    PathNode.CurveTo(112.734985f, 3.969804f, 99.12959f, 13.597087f, 94.050865f, 27.992472f),
                    PathNode.CurveTo(88.972145f, 42.38786f, 93.52441f, 58.421204f, 105.41f, 68.0f),
                    PathNode.LineTo(44.0f, 68.0f),
                    PathNode.CurveTo(32.74067f, 68.02789f, 23.014383f, 75.87919f, 20.61209f, 86.879295f),
                    PathNode.CurveTo(18.209793f, 97.8794f, 23.7774f, 109.0707f, 34.0f, 113.79f),
                    PathNode.LineTo(34.19f, 113.88f),
                    PathNode.LineTo(81.82f, 134.88f),
                    PathNode.LineTo(61.76f, 211.0f),
                    PathNode.CurveTo(56.978794f, 222.83665f, 62.30031f, 236.34477f, 73.87f, 241.74f),
                    PathNode.CurveTo(77.03896f, 243.23033f, 80.498085f, 244.00206f, 84.0f, 244.0f),
                    PathNode.CurveTo(93.11504f, 244.01602f, 101.45242f, 238.86714f, 105.52f, 230.71f),
                    PathNode.LineTo(128.0f, 191.91f),
                    PathNode.LineTo(150.51f, 230.71f),
                    PathNode.CurveTo(156.2485f, 242.27074f, 170.1025f, 247.22287f, 181.86916f, 241.9194f),
                    PathNode.CurveTo(193.63582f, 236.61594f, 199.10106f, 222.95622f, 194.24f, 211.0f),
                    PathNode.LineTo(174.24f, 134.85f),
                    PathNode.LineTo(221.87f, 113.85f),
                    PathNode.LineTo(222.06f, 113.76f),
                    PathNode.CurveTo(232.39194f, 109.15741f, 237.99255f, 97.85961f, 235.4f, 86.85f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(134.62741f, 28.0f, 140.0f, 33.37258f, 140.0f, 40.0f),
                    PathNode.CurveTo(140.0f, 46.62742f, 134.62741f, 52.0f, 128.0f, 52.0f),
                    PathNode.CurveTo(121.37258f, 52.0f, 116.0f, 46.62742f, 116.0f, 40.0f),
                    PathNode.CurveTo(116.0f, 33.37258f, 121.37258f, 28.0f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(155.16f, 117.0f),
                    PathNode.CurveTo(149.77576f, 119.37531f, 146.90851f, 125.30461f, 148.39f, 131.0f),
                    PathNode.LineTo(171.26f, 218.0f),
                    PathNode.CurveTo(171.44293f, 218.6872f, 171.68724f, 219.35657f, 171.99f, 220.0f),
                    PathNode.CurveTo(171.84f, 219.68f, 171.67f, 219.36f, 171.49f, 219.05f),
                    PathNode.LineTo(138.38f, 162.0f),
                    PathNode.CurveTo(136.23322f, 158.29918f, 132.27841f, 156.02126f, 128.0f, 156.02126f),
                    PathNode.CurveTo(123.721596f, 156.02126f, 119.766785f, 158.29918f, 117.62f, 162.0f),
                    PathNode.LineTo(84.51f, 219.05f),
                    PathNode.CurveTo(84.33f, 219.36f, 84.16f, 219.68f, 84.01f, 220.0f),
                    PathNode.CurveTo(84.31275f, 219.35657f, 84.55706f, 218.6872f, 84.74f, 218.0f),
                    PathNode.LineTo(107.61f, 131.08f),
                    PathNode.CurveTo(109.09149f, 125.38461f, 106.22425f, 119.455315f, 100.84f, 117.08f),
                    PathNode.LineTo(44.0f, 92.0f),
                    PathNode.LineTo(212.0f, 92.0f),
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
        return _personArmsSpread!!
    }

private var _personArmsSpread: ImageVector? = null
