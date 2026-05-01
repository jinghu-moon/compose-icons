package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.LightningA: ImageVector
    get() {
        if (_lightningA != null) return _lightningA!!
        _lightningA = phosphorThinIcon(
            name = "LightningA",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(171.92f, 112.34f),
                    PathNode.CurveTo(171.66296f, 111.07843f, 170.81438f, 110.0177f, 169.64f, 109.49f),
                    PathNode.LineTo(116.64f, 85.71f),
                    PathNode.LineTo(131.07f, 24.92f),
                    PathNode.CurveTo(131.4913f, 23.150314f, 130.66542f, 21.319218f, 129.06003f, 20.463638f),
                    PathNode.CurveTo(127.45464f, 19.608059f, 125.47412f, 19.943497f, 124.24f, 21.28f),
                    PathNode.LineTo(29.06f, 124.14f),
                    PathNode.CurveTo(28.183693f, 125.08559f, 27.816856f, 126.39558f, 28.074646f, 127.658745f),
                    PathNode.CurveTo(28.332438f, 128.92192f, 29.183247f, 129.9834f, 30.36f, 130.51f),
                    PathNode.LineTo(83.36f, 154.29f),
                    PathNode.LineTo(68.91f, 215.07f),
                    PathNode.CurveTo(68.48517f, 216.83847f, 69.30689f, 218.67093f, 70.91f, 219.53f),
                    PathNode.CurveTo(71.48776f, 219.84076f, 72.13398f, 220.00229f, 72.79f, 220.0f),
                    PathNode.CurveTo(73.90562f, 220.002f, 74.97138f, 219.538f, 75.73f, 218.72f),
                    PathNode.LineTo(170.93f, 115.86f),
                    PathNode.CurveTo(171.80836f, 114.91499f, 172.17699f, 113.604324f, 171.92f, 112.34f),
                    PathNode.Close,
                    PathNode.MoveTo(80.21f, 202.1f),
                    PathNode.LineTo(91.89f, 152.92f),
                    PathNode.CurveTo(92.33227f, 151.05429f, 91.38838f, 149.13716f, 89.64f, 148.35f),
                    PathNode.LineTo(38.72f, 125.49f),
                    PathNode.LineTo(119.79f, 37.9f),
                    PathNode.LineTo(108.11f, 87.08f),
                    PathNode.CurveTo(107.66773f, 88.94572f, 108.61162f, 90.86283f, 110.36f, 91.65f),
                    PathNode.LineTo(161.28f, 114.51f),
                    PathNode.Close,
                    PathNode.MoveTo(235.58f, 214.21f),
                    PathNode.LineTo(199.58f, 142.21f),
                    PathNode.CurveTo(198.90335f, 140.85234f, 197.51694f, 139.99426f, 196.0f, 139.99426f),
                    PathNode.CurveTo(194.48306f, 139.99426f, 193.09665f, 140.85234f, 192.42f, 142.21f),
                    PathNode.LineTo(156.42f, 214.21f),
                    PathNode.CurveTo(155.43141f, 216.18718f, 156.23282f, 218.59142f, 158.21f, 219.58f),
                    PathNode.CurveTo(160.18718f, 220.56859f, 162.59142f, 219.76718f, 163.58f, 217.79f),
                    PathNode.LineTo(174.47f, 196.0f),
                    PathNode.LineTo(217.53f, 196.0f),
                    PathNode.LineTo(228.42f, 217.79f),
                    PathNode.CurveTo(229.09825f, 219.14543f, 230.48434f, 220.00108f, 232.0f, 220.0f),
                    PathNode.CurveTo(232.62068f, 219.99663f, 233.23259f, 219.85304f, 233.79f, 219.58f),
                    PathNode.CurveTo(234.73994f, 219.10577f, 235.46242f, 218.27333f, 235.79817f, 217.26605f),
                    PathNode.CurveTo(236.13393f, 216.25879f, 236.05544f, 215.15936f, 235.58f, 214.21f),
                    PathNode.Close,
                    PathNode.MoveTo(178.47f, 188.0f),
                    PathNode.LineTo(196.0f, 152.94f),
                    PathNode.LineTo(213.53f, 188.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _lightningA!!
    }

private var _lightningA: ImageVector? = null
