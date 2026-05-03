package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Cake: ImageVector
    get() {
        if (_cake != null) return _cake!!
        _cake = phosphorDuotoneIcon(
            name = "Cake",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 48.0f),
                    PathNode.CurveTo(104.0f, 24.0f, 128.0f, 8.0f, 128.0f, 8.0f),
                    PathNode.CurveTo(128.0f, 8.0f, 152.0f, 24.0f, 152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 61.254833f, 141.25484f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(114.74516f, 72.0f, 104.0f, 61.254833f, 104.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.CurveTo(39.163445f, 96.0f, 32.0f, 103.163445f, 32.0f, 112.0f),
                    PathNode.LineTo(32.0f, 135.33f),
                    PathNode.CurveTo(32.0f, 152.77f, 45.67f, 167.51f, 63.1f, 167.99f),
                    PathNode.CurveTo(71.74004f, 168.2331f, 80.110954f, 164.97069f, 86.3079f, 158.94514f),
                    PathNode.CurveTo(92.50485f, 152.9196f, 96.00072f, 144.64343f, 96.0f, 136.0f),
                    PathNode.CurveTo(96.0f, 153.67311f, 110.32689f, 168.0f, 128.0f, 168.0f),
                    PathNode.CurveTo(145.67311f, 168.0f, 160.0f, 153.67311f, 160.0f, 136.0f),
                    PathNode.CurveTo(159.99658f, 144.64519f, 163.49126f, 152.92393f, 169.6885f, 158.95166f),
                    PathNode.CurveTo(175.88576f, 164.97937f, 184.25822f, 168.24315f, 192.9f, 168.0f),
                    PathNode.CurveTo(210.33f, 167.52f, 224.0f, 152.78f, 224.0f, 135.34f),
                    PathNode.LineTo(224.0f, 112.0f),
                    PathNode.CurveTo(224.0f, 103.163445f, 216.83656f, 96.0f, 208.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 112.0f),
                    PathNode.CurveTo(232.0f, 98.74516f, 221.25484f, 88.0f, 208.0f, 88.0f),
                    PathNode.LineTo(136.0f, 88.0f),
                    PathNode.LineTo(136.0f, 79.0f),
                    PathNode.CurveTo(150.1221f, 75.33185f, 159.9862f, 62.590717f, 160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 20.0f, 133.56f, 2.09f, 132.44f, 1.34f),
                    PathNode.CurveTo(129.75171f, -0.453596f, 126.2483f, -0.453596f, 123.56f, 1.34f),
                    PathNode.CurveTo(122.44f, 2.09f, 96.0f, 20.0f, 96.0f, 48.0f),
                    PathNode.CurveTo(96.013794f, 62.590717f, 105.87789f, 75.33185f, 120.0f, 79.0f),
                    PathNode.LineTo(120.0f, 88.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(34.745167f, 88.0f, 24.0f, 98.74516f, 24.0f, 112.0f),
                    PathNode.LineTo(24.0f, 135.33f),
                    PathNode.CurveTo(24.008207f, 144.05722f, 26.811869f, 152.55232f, 32.0f, 159.57f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(32.0f, 213.25484f, 42.745167f, 224.0f, 56.0f, 224.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(213.25484f, 224.0f, 224.0f, 213.25484f, 224.0f, 200.0f),
                    PathNode.LineTo(224.0f, 159.57f),
                    PathNode.CurveTo(229.18813f, 152.55232f, 231.99179f, 144.05722f, 232.0f, 135.33f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 48.0f),
                    PathNode.CurveTo(112.0f, 34.43f, 122.0f, 23.54f, 128.0f, 18.21f),
                    PathNode.CurveTo(134.0f, 23.54f, 144.0f, 34.43f, 144.0f, 48.0f),
                    PathNode.CurveTo(144.0f, 56.836555f, 136.83656f, 64.0f, 128.0f, 64.0f),
                    PathNode.CurveTo(119.163445f, 64.0f, 112.0f, 56.836555f, 112.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 107.58172f, 43.581722f, 104.0f, 48.0f, 104.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.CurveTo(212.41827f, 104.0f, 216.0f, 107.58172f, 216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 135.33f),
                    PathNode.CurveTo(216.0f, 148.58f, 205.54f, 159.64f, 192.68f, 159.99f),
                    PathNode.CurveTo(186.19955f, 160.17369f, 179.92044f, 157.72783f, 175.27171f, 153.20906f),
                    PathNode.CurveTo(170.62299f, 148.69029f, 168.00009f, 142.48305f, 168.0f, 136.0f),
                    PathNode.CurveTo(168.0f, 131.58173f, 164.41827f, 128.0f, 160.0f, 128.0f),
                    PathNode.CurveTo(155.58173f, 128.0f, 152.0f, 131.58173f, 152.0f, 136.0f),
                    PathNode.CurveTo(152.0f, 149.25484f, 141.25484f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(114.74516f, 160.0f, 104.0f, 149.25484f, 104.0f, 136.0f),
                    PathNode.CurveTo(104.0f, 131.58173f, 100.41828f, 128.0f, 96.0f, 128.0f),
                    PathNode.CurveTo(91.58172f, 128.0f, 88.0f, 131.58173f, 88.0f, 136.0f),
                    PathNode.CurveTo(88.0026f, 142.48479f, 85.38091f, 148.69464f, 80.73187f, 153.21559f),
                    PathNode.CurveTo(76.08284f, 157.73651f, 69.802185f, 160.18373f, 63.32f, 160.0f),
                    PathNode.CurveTo(50.46f, 159.64f, 40.0f, 148.58f, 40.0f, 135.33f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 208.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(51.581722f, 208.0f, 48.0f, 204.41827f, 48.0f, 200.0f),
                    PathNode.LineTo(48.0f, 172.56f),
                    PathNode.CurveTo(52.682854f, 174.68192f, 57.74098f, 175.85127f, 62.88f, 176.0f),
                    PathNode.CurveTo(73.68342f, 176.336f, 84.15659f, 172.25146f, 91.88f, 164.69f),
                    PathNode.CurveTo(93.37236f, 163.23538f, 94.74981f, 161.66736f, 96.0f, 160.0f),
                    PathNode.CurveTo(103.55418f, 170.07224f, 115.409706f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(140.59029f, 176.0f, 152.44583f, 170.07224f, 160.0f, 160.0f),
                    PathNode.CurveTo(161.2542f, 161.66083f, 162.63498f, 163.22214f, 164.13f, 164.67f),
                    PathNode.CurveTo(171.57202f, 171.95949f, 181.58273f, 176.02916f, 192.0f, 176.0f),
                    PathNode.CurveTo(192.38f, 176.0f, 192.76f, 176.0f, 193.14f, 176.0f),
                    PathNode.CurveTo(198.27225f, 175.84863f, 203.32332f, 174.67934f, 208.0f, 172.56f),
                    PathNode.LineTo(208.0f, 200.0f),
                    PathNode.CurveTo(208.0f, 204.41827f, 204.41827f, 208.0f, 200.0f, 208.0f),
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
        return _cake!!
    }

private var _cake: ImageVector? = null
