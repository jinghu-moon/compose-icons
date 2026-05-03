package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RainbowCloud: ImageVector
    get() {
        if (_rainbowCloud != null) return _rainbowCloud!!
        _rainbowCloud = phosphorFillIcon(
            name = "RainbowCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 160.0f),
                    PathNode.CurveTo(247.97244f, 186.49825f, 226.49825f, 207.97244f, 200.0f, 208.0f),
                    PathNode.LineTo(152.0f, 208.0f),
                    PathNode.CurveTo(134.35f, 208.0f, 120.0f, 193.25f, 120.0f, 175.11f),
                    PathNode.CurveTo(120.0f, 156.97f, 134.35f, 142.22f, 152.0f, 142.22f),
                    PathNode.CurveTo(153.11577f, 142.21985f, 154.23071f, 142.27994f, 155.34f, 142.4f),
                    PathNode.CurveTo(163.79108f, 120.945854f, 186.30344f, 108.532425f, 208.95706f, 112.83529f),
                    PathNode.CurveTo(231.61067f, 117.13815f, 248.00377f, 136.94136f, 248.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 72.0f),
                    PathNode.CurveTo(134.92203f, 71.95392f, 156.94835f, 80.897285f, 173.35f, 96.91f),
                    PathNode.CurveTo(176.5344f, 99.87603f, 181.50557f, 99.75263f, 184.53888f, 96.63226f),
                    PathNode.CurveTo(187.57219f, 93.511894f, 187.55492f, 88.539215f, 184.5f, 85.44f),
                    PathNode.CurveTo(154.5326f, 56.302017f, 110.03288f, 47.935905f, 71.5295f, 64.201126f),
                    PathNode.CurveTo(33.02613f, 80.46635f, 8.001499f, 118.202065f, 8.0f, 160.0f),
                    PathNode.LineTo(8.0f, 176.0f),
                    PathNode.CurveTo(8.0f, 180.41827f, 11.581722f, 184.0f, 16.0f, 184.0f),
                    PathNode.CurveTo(20.418278f, 184.0f, 24.0f, 180.41827f, 24.0f, 176.0f),
                    PathNode.LineTo(24.0f, 160.0f),
                    PathNode.CurveTo(24.05511f, 111.42178f, 63.421787f, 72.05511f, 112.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 104.0f),
                    PathNode.CurveTo(123.92002f, 103.9672f, 135.5348f, 107.76751f, 145.13f, 114.84f),
                    PathNode.CurveTo(147.40509f, 116.79907f, 150.58554f, 117.31938f, 153.3663f, 116.18744f),
                    PathNode.CurveTo(156.14708f, 115.0555f, 158.05997f, 112.46188f, 158.32005f, 109.47084f),
                    PathNode.CurveTo(158.58015f, 106.4798f, 157.14365f, 103.59494f, 154.6f, 102.0f),
                    PathNode.CurveTo(132.72911f, 85.94869f, 103.69251f, 83.553535f, 79.487076f, 95.80411f),
                    PathNode.CurveTo(55.28163f, 108.05468f, 40.01701f, 132.87106f, 40.0f, 160.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.CurveTo(40.0f, 180.41827f, 43.581722f, 184.0f, 48.0f, 184.0f),
                    PathNode.CurveTo(52.418278f, 184.0f, 56.0f, 180.41827f, 56.0f, 176.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.CurveTo(56.03307f, 129.08577f, 81.08576f, 104.033066f, 112.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(127.21f, 130.71f),
                    PathNode.CurveTo(127.6995f, 128.64528f, 127.348656f, 126.470665f, 126.234665f, 124.66465f),
                    PathNode.CurveTo(125.120674f, 122.85863f, 123.3348f, 121.56917f, 121.27f, 121.08f),
                    PathNode.CurveTo(109.362206f, 118.24313f, 96.81099f, 121.0149f, 87.205345f, 128.60272f),
                    PathNode.CurveTo(77.5997f, 136.19054f, 71.99725f, 147.75896f, 72.0f, 160.0f),
                    PathNode.LineTo(72.0f, 176.0f),
                    PathNode.CurveTo(72.0f, 180.41827f, 75.58172f, 184.0f, 80.0f, 184.0f),
                    PathNode.CurveTo(84.41828f, 184.0f, 88.0f, 180.41827f, 88.0f, 176.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.CurveTo(87.998375f, 152.65395f, 91.361176f, 145.71172f, 97.12647f, 141.15915f),
                    PathNode.CurveTo(102.89176f, 136.60657f, 110.42452f, 134.9451f, 117.57f, 136.65f),
                    PathNode.CurveTo(119.636154f, 137.1425f, 121.813354f, 136.7931f, 123.621666f, 135.67886f),
                    PathNode.CurveTo(125.42998f, 134.5646f, 126.72095f, 132.77698f, 127.21f, 130.71f),
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
        return _rainbowCloud!!
    }

private var _rainbowCloud: ImageVector? = null
