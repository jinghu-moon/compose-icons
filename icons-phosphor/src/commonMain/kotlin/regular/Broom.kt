package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Broom: ImageVector
    get() {
        if (_broom != null) return _broom!!
        _broom = phosphorRegularIcon(
            name = "Broom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.5f, 216.81f),
                    PathNode.CurveTo(212.94f, 205.81f, 200.0f, 182.23f, 200.0f, 152.01f),
                    PathNode.LineTo(200.0f, 134.73f),
                    PathNode.CurveTo(200.0174f, 128.16917f, 196.01305f, 122.26782f, 189.91f, 119.86f),
                    PathNode.LineTo(165.0f, 110.0f),
                    PathNode.CurveTo(160.92068f, 108.36828f, 158.92065f, 103.752106f, 160.52f, 99.66f),
                    PathNode.LineTo(181.84f, 46.66f),
                    PathNode.CurveTo(184.76361f, 39.631214f, 184.69931f, 31.71502f, 181.66191f, 24.734657f),
                    PathNode.CurveTo(178.62451f, 17.754293f, 172.87587f, 12.311553f, 165.74f, 9.66f),
                    PathNode.CurveTo(151.4375f, 4.41951f, 135.56161f, 11.510915f, 129.92f, 25.66f),
                    PathNode.CurveTo(129.91606f, 25.699903f, 129.91606f, 25.740099f, 129.92f, 25.78f),
                    PathNode.LineTo(108.9f, 79.0f),
                    PathNode.CurveTo(107.272224f, 83.09954f, 102.633385f, 85.10806f, 98.53f, 83.49f),
                    PathNode.LineTo(73.11f, 73.14f),
                    PathNode.CurveTo(67.11477f, 70.710655f, 60.245262f, 72.15811f, 55.74f, 76.8f),
                    PathNode.CurveTo(34.68f, 98.45f, 24.0f, 123.75f, 24.0f, 152.0f),
                    PathNode.CurveTo(23.944656f, 180.90915f, 35.124706f, 208.70868f, 55.18f, 229.53f),
                    PathNode.CurveTo(56.698566f, 231.11752f, 58.80315f, 232.0107f, 61.0f, 232.0f),
                    PathNode.LineTo(232.0f, 232.0f),
                    PathNode.CurveTo(235.72337f, 231.99643f, 238.95204f, 229.42456f, 239.78806f, 225.79625f),
                    PathNode.CurveTo(240.62407f, 222.16794f, 238.84639f, 218.44255f, 235.5f, 216.81f),
                    PathNode.Close,
                    PathNode.MoveTo(67.14f, 88.0f),
                    PathNode.LineTo(92.55f, 98.3f),
                    PathNode.CurveTo(98.47394f, 100.669945f, 105.09775f, 100.583466f, 110.957794f, 98.059685f),
                    PathNode.CurveTo(116.81785f, 95.535904f, 121.43175f, 90.78257f, 123.78f, 84.85f),
                    PathNode.LineTo(144.78f, 31.85f),
                    PathNode.CurveTo(147.34f, 25.74f, 154.25f, 22.58f, 160.21f, 24.85f),
                    PathNode.CurveTo(163.28046f, 25.989223f, 165.75192f, 28.33389f, 167.05112f, 31.34017f),
                    PathNode.CurveTo(168.35031f, 34.346447f, 168.36436f, 37.753113f, 167.09f, 40.77f),
                    PathNode.LineTo(145.69f, 93.76f),
                    PathNode.CurveTo(140.81155f, 106.06749f, 146.82072f, 120.000885f, 159.12f, 124.9f),
                    PathNode.LineTo(184.0f, 134.73f),
                    PathNode.LineTo(184.0f, 152.0f),
                    PathNode.CurveTo(184.0f, 152.33f, 184.0f, 152.66f, 184.0f, 153.0f),
                    PathNode.LineTo(55.77f, 101.71f),
                    PathNode.CurveTo(59.179077f, 96.83704f, 62.981804f, 92.25169f, 67.14f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(115.14f, 216.0f),
                    PathNode.CurveTo(103.22917f, 204.57477f, 94.791306f, 190.01479f, 90.8f, 174.0f),
                    PathNode.CurveTo(89.64263f, 169.78546f, 85.317116f, 167.2798f, 81.085365f, 168.37257f),
                    PathNode.CurveTo(76.853615f, 169.46535f, 74.28209f, 173.75203f, 75.31f, 178.0f),
                    PathNode.CurveTo(78.79931f, 191.77719f, 85.04506f, 204.70413f, 93.67f, 216.0f),
                    PathNode.LineTo(64.44f, 216.0f),
                    PathNode.CurveTo(48.661835f, 198.42143f, 39.954945f, 175.62106f, 40.0f, 152.0f),
                    PathNode.CurveTo(39.90215f, 139.48465f, 42.54035f, 127.09908f, 47.73f, 115.71f),
                    PathNode.LineTo(185.53f, 170.83f),
                    PathNode.CurveTo(188.53f, 188.83f, 196.09f, 204.31f, 207.42f, 215.99f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _broom!!
    }

private var _broom: ImageVector? = null
