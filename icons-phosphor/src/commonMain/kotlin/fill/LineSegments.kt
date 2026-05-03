package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LineSegments: ImageVector
    get() {
        if (_lineSegments != null) return _lineSegments!!
        _lineSegments = phosphorFillIcon(
            name = "LineSegments",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.81f, 75.79f),
                    PathNode.CurveTo(230.56339f, 81.055435f, 223.43314f, 84.010475f, 216.0f, 84.0f),
                    PathNode.CurveTo(214.09537f, 83.99668f, 212.19586f, 83.802376f, 210.33f, 83.42f),
                    PathNode.LineTo(179.76f, 140.19f),
                    PathNode.LineTo(179.76f, 140.19f),
                    PathNode.CurveTo(189.95615f, 150.38365f, 190.74474f, 166.65355f, 181.5822f, 177.78549f),
                    PathNode.CurveTo(172.41966f, 188.91743f, 156.30171f, 191.27182f, 144.33781f, 183.22588f),
                    PathNode.CurveTo(132.37392f, 175.17992f, 128.47568f, 159.36426f, 135.33f, 146.68f),
                    PathNode.LineTo(109.27f, 120.62f),
                    PathNode.CurveTo(105.19353f, 122.824875f, 100.63454f, 123.9861f, 96.0f, 124.0f),
                    PathNode.CurveTo(94.09534f, 123.99722f, 92.19578f, 123.80291f, 90.33f, 123.42f),
                    PathNode.LineTo(59.76f, 180.18f),
                    PathNode.LineTo(59.76f, 180.18f),
                    PathNode.CurveTo(70.69386f, 191.11497f, 70.69325f, 208.84308f, 59.75865f, 219.77731f),
                    PathNode.CurveTo(48.82405f, 230.71153f, 31.09595f, 230.71153f, 20.161346f, 219.77731f),
                    PathNode.CurveTo(9.226744f, 208.84308f, 9.226141f, 191.11497f, 20.16f, 180.18f),
                    PathNode.LineTo(20.16f, 180.18f),
                    PathNode.CurveTo(26.827942f, 173.51804f, 36.400295f, 170.65797f, 45.63f, 172.57f),
                    PathNode.LineTo(76.2f, 115.8f),
                    PathNode.LineTo(76.2f, 115.8f),
                    PathNode.CurveTo(65.28487f, 104.85254f, 65.28487f, 87.13746f, 76.2f, 76.19f),
                    PathNode.LineTo(76.2f, 76.19f),
                    PathNode.CurveTo(86.0303f, 66.35373f, 101.59002f, 65.222694f, 112.73945f, 73.53396f),
                    PathNode.CurveTo(123.888885f, 81.845215f, 127.24895f, 97.07985f, 120.63f, 109.31f),
                    PathNode.LineTo(146.69f, 135.37f),
                    PathNode.CurveTo(152.50163f, 132.24438f, 159.22789f, 131.26378f, 165.69f, 132.6f),
                    PathNode.LineTo(196.26f, 75.83f),
                    PathNode.LineTo(196.26f, 75.83f),
                    PathNode.CurveTo(191.00836f, 70.578896f, 188.05798f, 63.45656f, 188.05798f, 56.03f),
                    PathNode.CurveTo(188.05798f, 48.603443f, 191.00836f, 41.4811f, 196.26f, 36.23f),
                    PathNode.LineTo(196.26f, 36.23f),
                    PathNode.CurveTo(207.19524f, 25.294762f, 224.92476f, 25.294762f, 235.86f, 36.23f),
                    PathNode.CurveTo(246.79524f, 47.165237f, 246.79524f, 64.89476f, 235.86f, 75.83f),
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
        return _lineSegments!!
    }

private var _lineSegments: ImageVector? = null
