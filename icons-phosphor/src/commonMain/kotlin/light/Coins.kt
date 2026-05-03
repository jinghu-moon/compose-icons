package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Coins: ImageVector
    get() {
        if (_coins != null) return _coins!!
        _coins = phosphorLightIcon(
            name = "Coins",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.56f, 103.81f),
                    PathNode.CurveTo(213.43f, 97.75f, 198.47f, 93.39f, 182.0f, 91.34f),
                    PathNode.LineTo(182.0f, 84.0f),
                    PathNode.CurveTo(182.0f, 71.88f, 172.42f, 60.9f, 155.0f, 53.07f),
                    PathNode.CurveTo(139.16f, 45.93f, 118.2f, 42.0f, 96.0f, 42.0f),
                    PathNode.CurveTo(73.8f, 42.0f, 52.84f, 45.93f, 37.0f, 53.07f),
                    PathNode.CurveTo(19.58f, 60.9f, 10.0f, 71.88f, 10.0f, 84.0f),
                    PathNode.LineTo(10.0f, 124.0f),
                    PathNode.CurveTo(10.0f, 136.12f, 19.58f, 147.1f, 37.0f, 154.93f),
                    PathNode.CurveTo(47.49f, 159.65f, 60.21f, 162.93f, 74.0f, 164.66f),
                    PathNode.LineTo(74.0f, 172.0f),
                    PathNode.CurveTo(74.0f, 184.12f, 83.58f, 195.1f, 101.0f, 202.93f),
                    PathNode.CurveTo(116.84f, 210.07f, 137.8f, 214.0f, 160.0f, 214.0f),
                    PathNode.CurveTo(182.2f, 214.0f, 203.16f, 210.07f, 219.0f, 202.93f),
                    PathNode.CurveTo(236.39f, 195.1f, 246.0f, 184.12f, 246.0f, 172.0f),
                    PathNode.LineTo(246.0f, 132.0f),
                    PathNode.CurveTo(246.0f, 121.35f, 238.39f, 111.34f, 224.56f, 103.81f),
                    PathNode.Close,
                    PathNode.MoveTo(218.82f, 114.35f),
                    PathNode.CurveTo(228.61f, 119.68f, 234.0f, 126.0f, 234.0f, 132.0f),
                    PathNode.CurveTo(234.0f, 146.19f, 203.61f, 162.0f, 160.0f, 162.0f),
                    PathNode.CurveTo(152.9087f, 162.00438f, 145.82436f, 161.55681f, 138.79f, 160.66f),
                    PathNode.CurveTo(144.3336f, 159.17278f, 149.75325f, 157.257f, 155.0f, 154.93f),
                    PathNode.CurveTo(172.39f, 147.1f, 182.0f, 136.12f, 182.0f, 124.0f),
                    PathNode.LineTo(182.0f, 103.43f),
                    PathNode.CurveTo(196.4f, 105.36f, 209.3f, 109.16f, 218.82f, 114.35f),
                    PathNode.Close,
                    PathNode.MoveTo(108.16f, 153.58f),
                    PathNode.CurveTo(104.24f, 153.85f, 100.16f, 154.0f, 96.0f, 154.0f),
                    PathNode.CurveTo(90.7f, 154.0f, 85.6f, 153.76f, 80.72f, 153.33f),
                    PathNode.CurveTo(80.59688f, 153.3197f, 80.47312f, 153.3197f, 80.35f, 153.33f),
                    PathNode.CurveTo(76.77f, 153.0f, 73.35f, 152.56f, 70.0f, 152.03f),
                    PathNode.LineTo(70.0f, 124.12f),
                    PathNode.CurveTo(78.60907f, 125.38129f, 87.299034f, 126.00964f, 96.0f, 126.0f),
                    PathNode.CurveTo(104.700966f, 126.00964f, 113.39093f, 125.38129f, 122.0f, 124.12f),
                    PathNode.LineTo(122.0f, 152.0f),
                    PathNode.CurveTo(117.66f, 152.69f, 113.09f, 153.22f, 108.31f, 153.56f),
                    PathNode.Close,
                    PathNode.MoveTo(170.0f, 105.89f),
                    PathNode.LineTo(170.0f, 124.0f),
                    PathNode.CurveTo(170.0f, 133.54f, 156.25f, 143.8f, 134.0f, 149.51f),
                    PathNode.LineTo(134.0f, 121.85f),
                    PathNode.CurveTo(141.20601f, 120.22318f, 148.23851f, 117.90581f, 155.0f, 114.93f),
                    PathNode.CurveTo(160.37828f, 112.59427f, 165.42244f, 109.55434f, 170.0f, 105.89f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 54.0f),
                    PathNode.CurveTo(139.61f, 54.0f, 170.0f, 69.81f, 170.0f, 84.0f),
                    PathNode.CurveTo(170.0f, 98.19f, 139.61f, 114.0f, 96.0f, 114.0f),
                    PathNode.CurveTo(52.39f, 114.0f, 22.0f, 98.19f, 22.0f, 84.0f),
                    PathNode.CurveTo(22.0f, 69.81f, 52.39f, 54.0f, 96.0f, 54.0f),
                    PathNode.Close,
                    PathNode.MoveTo(22.0f, 124.0f),
                    PathNode.LineTo(22.0f, 105.89f),
                    PathNode.CurveTo(26.579878f, 109.540306f, 31.623903f, 112.56672f, 37.0f, 114.89f),
                    PathNode.CurveTo(43.76149f, 117.865814f, 50.793983f, 120.18319f, 58.0f, 121.81f),
                    PathNode.LineTo(58.0f, 149.47f),
                    PathNode.CurveTo(35.75f, 143.8f, 22.0f, 133.54f, 22.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(86.0f, 172.0f),
                    PathNode.LineTo(86.0f, 165.72f),
                    PathNode.CurveTo(89.3f, 165.9f, 92.63f, 166.0f, 96.0f, 166.0f),
                    PathNode.QuadTo(101.91f, 166.0f, 107.66f, 165.63f),
                    PathNode.CurveTo(112.35037f, 167.32231f, 117.13919f, 168.72823f, 122.0f, 169.84f),
                    PathNode.LineTo(122.0f, 197.51f),
                    PathNode.CurveTo(99.75f, 191.8f, 86.0f, 181.54f, 86.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(134.0f, 200.0f),
                    PathNode.LineTo(134.0f, 172.1f),
                    PathNode.CurveTo(142.60852f, 173.36856f, 151.29852f, 174.00359f, 160.0f, 174.0f),
                    PathNode.CurveTo(168.70097f, 174.00964f, 177.39093f, 173.38129f, 186.0f, 172.12f),
                    PathNode.LineTo(186.0f, 200.0f),
                    PathNode.CurveTo(168.76923f, 202.66667f, 151.23077f, 202.66667f, 134.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(198.0f, 197.51f),
                    PathNode.LineTo(198.0f, 169.85f),
                    PathNode.CurveTo(205.20601f, 168.22319f, 212.23851f, 165.9058f, 219.0f, 162.93f),
                    PathNode.CurveTo(224.3761f, 160.60672f, 229.42014f, 157.5803f, 234.0f, 153.93f),
                    PathNode.LineTo(234.0f, 172.0f),
                    PathNode.CurveTo(234.0f, 181.54f, 220.25f, 191.8f, 198.0f, 197.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _coins!!
    }

private var _coins: ImageVector? = null
