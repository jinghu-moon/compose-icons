package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TreePalm: ImageVector
    get() {
        if (_treePalm != null) return _treePalm!!
        _treePalm = phosphorDuotoneIcon(
            name = "TreePalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 58.75f),
                    PathNode.LineTo(128.0f, 104.0f),
                    PathNode.CurveTo(127.91518f, 87.18537f, 134.30315f, 70.98273f, 145.84f, 58.75f),
                    PathNode.CurveTo(156.976f, 46.793053f, 172.5805f, 40.002193f, 188.92f, 40.002193f),
                    PathNode.CurveTo(205.25949f, 40.002193f, 220.864f, 46.793053f, 232.0f, 58.75f),
                    PathNode.Close,
                    PathNode.MoveTo(176.56f, 98.18f),
                    PathNode.CurveTo(160.17146f, 93.79418f, 142.71317f, 96.07354f, 128.0f, 104.52f),
                    PathNode.LineTo(221.81f, 176.0f),
                    PathNode.CurveTo(226.2211f, 159.71936f, 223.91933f, 142.34978f, 215.42f, 127.78f),
                    PathNode.CurveTo(206.91235f, 113.14353f, 192.9307f, 102.49357f, 176.56f, 98.18f),
                    PathNode.Close,
                    PathNode.MoveTo(110.16f, 58.75f),
                    PathNode.CurveTo(99.024f, 46.793053f, 83.419495f, 40.002193f, 67.08f, 40.002193f),
                    PathNode.CurveTo(50.740505f, 40.002193f, 35.136f, 46.793053f, 24.0f, 58.75f),
                    PathNode.LineTo(128.0f, 104.0f),
                    PathNode.CurveTo(128.08482f, 87.18537f, 121.69686f, 70.98273f, 110.16f, 58.75f),
                    PathNode.Close,
                    PathNode.MoveTo(79.44f, 98.18f),
                    PathNode.CurveTo(63.06931f, 102.49357f, 49.087646f, 113.14353f, 40.58f, 127.78f),
                    PathNode.CurveTo(32.08067f, 142.34978f, 29.778894f, 159.71936f, 34.19f, 176.0f),
                    PathNode.LineTo(128.0f, 104.52f),
                    PathNode.CurveTo(113.28684f, 96.07354f, 95.828545f, 93.79418f, 79.44f, 98.18f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.79f, 53.23f),
                    PathNode.CurveTo(225.14546f, 39.68725f, 207.4481f, 31.998749f, 188.92f, 31.998749f),
                    PathNode.CurveTo(170.39189f, 31.998749f, 152.69455f, 39.68725f, 140.05f, 53.23f),
                    PathNode.CurveTo(135.23254f, 58.284275f, 131.17363f, 64.010544f, 128.0f, 70.23f),
                    PathNode.CurveTo(124.841736f, 64.013695f, 120.79978f, 58.287586f, 116.0f, 53.23f),
                    PathNode.CurveTo(103.35545f, 39.68725f, 85.658104f, 31.998749f, 67.13f, 31.998749f),
                    PathNode.CurveTo(48.601894f, 31.998749f, 30.904543f, 39.68725f, 18.26f, 53.23f),
                    PathNode.CurveTo(16.459623f, 55.12149f, 15.695723f, 57.77262f, 16.213593f, 60.332092f),
                    PathNode.CurveTo(16.731462f, 62.891567f, 18.465914f, 65.03719f, 20.86f, 66.08f),
                    PathNode.LineTo(77.0f, 90.55f),
                    PathNode.CurveTo(58.71756f, 95.4381f, 43.122574f, 107.382515f, 33.64f, 123.76f),
                    PathNode.CurveTo(24.029083f, 140.16039f, 21.433567f, 159.74211f, 26.44f, 178.08f),
                    PathNode.CurveTo(27.135576f, 180.64844f, 29.062698f, 182.70291f, 31.581434f, 183.56122f),
                    PathNode.CurveTo(34.10017f, 184.41951f, 36.88081f, 183.96927f, 39.0f, 182.36f),
                    PathNode.LineTo(120.0f, 120.68f),
                    PathNode.LineTo(120.0f, 224.0f),
                    PathNode.CurveTo(120.0f, 228.41827f, 123.58172f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(132.41827f, 232.0f, 136.0f, 228.41827f, 136.0f, 224.0f),
                    PathNode.LineTo(136.0f, 120.68f),
                    PathNode.LineTo(217.0f, 182.36f),
                    PathNode.CurveTo(219.11948f, 183.97385f, 221.90323f, 184.4268f, 224.42502f, 183.56815f),
                    PathNode.CurveTo(226.9468f, 182.70949f, 228.87573f, 180.6519f, 229.57f, 178.08f),
                    PathNode.CurveTo(234.57643f, 159.74211f, 231.98091f, 140.16039f, 222.37f, 123.76f),
                    PathNode.CurveTo(212.8851f, 107.380424f, 197.28615f, 95.43574f, 179.0f, 90.55f),
                    PathNode.LineTo(235.22f, 66.08f),
                    PathNode.CurveTo(237.61409f, 65.03719f, 239.34854f, 62.891567f, 239.86641f, 60.332092f),
                    PathNode.CurveTo(240.38428f, 57.77262f, 239.62038f, 55.12149f, 237.82f, 53.23f),
                    PathNode.Close,
                    PathNode.MoveTo(67.08f, 48.0f),
                    PathNode.CurveTo(81.22047f, 48.031742f, 94.7164f, 53.91811f, 104.36f, 64.26f),
                    PathNode.CurveTo(111.48877f, 71.762146f, 116.421326f, 81.07727f, 118.62f, 91.19f),
                    PathNode.LineTo(39.0f, 56.53f),
                    PathNode.CurveTo(47.30925f, 50.969707f, 57.08198f, 48.000996f, 67.08f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 161.5f),
                    PathNode.CurveTo(39.61799f, 151.09138f, 42.20911f, 140.78934f, 47.47f, 131.8f),
                    PathNode.CurveTo(54.89752f, 118.98144f, 67.13772f, 109.66089f, 81.47f, 105.91f),
                    PathNode.CurveTo(86.24226f, 104.636826f, 91.16083f, 103.99469f, 96.1f, 104.0f),
                    PathNode.CurveTo(101.599174f, 103.99949f, 107.068245f, 104.81159f, 112.33f, 106.41f),
                    PathNode.Close,
                    PathNode.MoveTo(208.5f, 131.8f),
                    PathNode.CurveTo(213.77136f, 140.78621f, 216.37294f, 151.08846f, 216.0f, 161.5f),
                    PathNode.LineTo(143.7f, 106.4f),
                    PathNode.CurveTo(168.58237f, 98.88657f, 195.37404f, 109.38339f, 208.53f, 131.8f),
                    PathNode.Close,
                    PathNode.MoveTo(137.38f, 91.19f),
                    PathNode.CurveTo(139.57867f, 81.07727f, 144.51123f, 71.762146f, 151.64f, 64.26f),
                    PathNode.CurveTo(161.2836f, 53.91811f, 174.77954f, 48.031742f, 188.92f, 48.0f),
                    PathNode.CurveTo(198.91801f, 48.000996f, 208.69075f, 50.969707f, 217.0f, 56.53f),
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
        return _treePalm!!
    }

private var _treePalm: ImageVector? = null
