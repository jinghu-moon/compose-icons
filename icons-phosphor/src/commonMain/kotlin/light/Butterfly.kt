package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Butterfly: ImageVector
    get() {
        if (_butterfly != null) return _butterfly!!
        _butterfly = phosphorLightIcon(
            name = "Butterfly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(231.1f, 51.71f),
                    PathNode.CurveTo(226.09f, 45.27f, 218.64f, 42.0f, 209.0f, 42.0f),
                    PathNode.CurveTo(192.67f, 42.0f, 171.59f, 53.06f, 152.6f, 71.59f),
                    PathNode.CurveTo(145.59587f, 78.33231f, 139.35803f, 85.827774f, 134.0f, 93.94f),
                    PathNode.LineTo(134.0f, 56.0f),
                    PathNode.CurveTo(134.0f, 52.68629f, 131.3137f, 50.0f, 128.0f, 50.0f),
                    PathNode.CurveTo(124.686295f, 50.0f, 122.0f, 52.68629f, 122.0f, 56.0f),
                    PathNode.LineTo(122.0f, 93.94f),
                    PathNode.CurveTo(116.66077f, 85.83083f, 110.44315f, 78.33549f, 103.46f, 71.59f),
                    PathNode.CurveTo(84.49f, 53.06f, 63.4f, 42.0f, 47.07f, 42.0f),
                    PathNode.CurveTo(37.38f, 42.0f, 29.93f, 45.27f, 24.92f, 51.71f),
                    PathNode.CurveTo(19.39f, 58.82f, 17.21f, 69.4f, 18.26f, 84.05f),
                    PathNode.CurveTo(19.17f, 96.78f, 22.38f, 110.58f, 25.07f, 121.18f),
                    PathNode.CurveTo(31.35f, 145.92f, 45.84f, 154.18f, 56.85f, 156.86f),
                    PathNode.CurveTo(44.48987f, 176.50752f, 50.39747f, 202.45486f, 70.045f, 214.815f),
                    PathNode.CurveTo(89.69253f, 227.17514f, 115.63987f, 221.26753f, 128.0f, 201.62f),
                    PathNode.CurveTo(140.36014f, 221.2703f, 166.30971f, 227.18013f, 185.96f, 214.82f),
                    PathNode.CurveTo(205.61029f, 202.45987f, 211.52013f, 176.51028f, 199.16f, 156.86f),
                    PathNode.CurveTo(210.16f, 154.23f, 224.66f, 145.92f, 230.94f, 121.18f),
                    PathNode.CurveTo(237.55f, 95.21f, 242.72f, 66.65f, 231.1f, 51.71f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 210.0f),
                    PathNode.CurveTo(76.18318f, 209.77394f, 63.236195f, 197.35115f, 62.356995f, 181.55716f),
                    PathNode.CurveTo(61.477795f, 165.76318f, 72.965996f, 151.98016f, 88.66f, 150.0f),
                    PathNode.CurveTo(91.97371f, 149.63826f, 94.366745f, 146.6587f, 94.005f, 143.345f),
                    PathNode.CurveTo(93.64326f, 140.0313f, 90.66371f, 137.63826f, 87.35f, 138.0f),
                    PathNode.CurveTo(80.00031f, 138.82162f, 73.00123f, 141.5826f, 67.07f, 146.0f),
                    PathNode.CurveTo(58.07f, 146.31f, 42.95f, 142.84f, 36.7f, 118.24f),
                    PathNode.CurveTo(33.45f, 105.43f, 24.81f, 71.41f, 34.39f, 59.09f),
                    PathNode.CurveTo(37.05f, 55.66f, 41.2f, 54.0f, 47.07f, 54.0f),
                    PathNode.CurveTo(59.95f, 54.0f, 78.79f, 64.28f, 95.07f, 80.18f),
                    PathNode.CurveTo(111.69f, 96.39f, 122.0f, 114.59f, 122.0f, 127.67f),
                    PathNode.LineTo(122.0f, 180.0f),
                    PathNode.CurveTo(122.0f, 196.56854f, 108.56854f, 210.0f, 92.0f, 210.0f),
                    PathNode.Close,
                    PathNode.MoveTo(219.31f, 118.23f),
                    PathNode.CurveTo(213.07f, 142.83f, 198.0f, 146.29f, 189.0f, 146.0f),
                    PathNode.CurveTo(183.07089f, 141.57878f, 176.07074f, 138.81738f, 168.72f, 138.0f),
                    PathNode.CurveTo(165.40628f, 137.62445f, 162.41556f, 140.00629f, 162.04f, 143.32f),
                    PathNode.CurveTo(161.66444f, 146.63371f, 164.0463f, 149.62445f, 167.36f, 150.0f),
                    PathNode.CurveTo(183.46379f, 151.74846f, 195.29839f, 165.92403f, 194.14328f, 182.08122f),
                    PathNode.CurveTo(192.98816f, 198.23843f, 179.25735f, 210.58627f, 163.0686f, 210.02606f),
                    PathNode.CurveTo(146.87987f, 209.46587f, 134.03546f, 196.1984f, 134.0f, 180.0f),
                    PathNode.LineTo(134.0f, 127.67f),
                    PathNode.CurveTo(134.0f, 114.59f, 144.32f, 96.39f, 160.93f, 80.18f),
                    PathNode.CurveTo(177.23f, 64.28f, 196.07f, 54.0f, 209.0f, 54.0f),
                    PathNode.CurveTo(214.87f, 54.0f, 219.0f, 55.66f, 221.68f, 59.08f),
                    PathNode.CurveTo(231.21f, 71.4f, 222.57f, 105.42f, 219.32f, 118.23f),
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
        return _butterfly!!
    }

private var _butterfly: ImageVector? = null
