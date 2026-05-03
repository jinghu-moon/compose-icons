package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Pinwheel: ImageVector
    get() {
        if (_pinwheel != null) return _pinwheel!!
        _pinwheel = phosphorFillIcon(
            name = "Pinwheel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 218.34f),
                    PathNode.LineTo(181.24f, 169.93f),
                    PathNode.CurveTo(182.34f, 169.6f, 183.43f, 169.25f, 184.51f, 168.86f),
                    PathNode.CurveTo(215.62567f, 157.52605f, 231.67542f, 123.126045f, 220.37f, 92.0f),
                    PathNode.CurveTo(218.85828f, 87.8507f, 214.27034f, 85.71117f, 210.12f, 87.22f),
                    PathNode.LineTo(165.92f, 103.3f),
                    PathNode.CurveTo(166.24f, 102.68f, 166.56f, 102.06f, 166.85f, 101.42f),
                    PathNode.CurveTo(177.11037f, 79.43348f, 173.11913f, 53.4315f, 156.73677f, 35.53456f),
                    PathNode.CurveTo(140.3544f, 17.637625f, 114.805756f, 11.368712f, 92.0f, 19.65f),
                    PathNode.CurveTo(90.00006f, 20.368013f, 88.36794f, 21.852192f, 87.4637f, 23.775118f),
                    PathNode.CurveTo(86.55945f, 25.698046f, 86.45738f, 27.901718f, 87.18f, 29.9f),
                    PathNode.LineTo(103.27f, 74.12f),
                    PathNode.CurveTo(102.64f, 73.8f, 102.02f, 73.47f, 101.38f, 73.12f),
                    PathNode.CurveTo(79.38876f, 62.872536f, 53.390377f, 66.8775f, 35.502666f, 83.26819f),
                    PathNode.CurveTo(17.61495f, 99.658875f, 11.358722f, 125.20913f, 19.65f, 148.01f),
                    PathNode.CurveTo(21.161726f, 152.1593f, 25.749653f, 154.29884f, 29.9f, 152.79f),
                    PathNode.LineTo(74.1f, 136.7f),
                    PathNode.CurveTo(73.78f, 137.33f, 73.46f, 137.95f, 73.17f, 138.59f),
                    PathNode.CurveTo(62.922535f, 160.58124f, 66.927505f, 186.57962f, 83.31819f, 204.46733f),
                    PathNode.CurveTo(99.70888f, 222.35504f, 125.25913f, 228.61128f, 148.06f, 220.32f),
                    PathNode.CurveTo(152.20929f, 218.80827f, 154.34883f, 214.22035f, 152.84f, 210.07f),
                    PathNode.LineTo(136.76f, 165.89f),
                    PathNode.CurveTo(137.38f, 166.2f, 138.0f, 166.51f, 138.64f, 166.8f),
                    PathNode.CurveTo(145.69867f, 170.10558f, 153.33488f, 172.00104f, 161.12f, 172.38f),
                    PathNode.LineTo(218.34f, 229.61f),
                    PathNode.CurveTo(221.46593f, 232.73593f, 226.53407f, 232.73593f, 229.66f, 229.61f),
                    PathNode.CurveTo(232.78593f, 226.48407f, 232.78593f, 221.41594f, 229.66f, 218.29f),
                    PathNode.Close,
                    PathNode.MoveTo(109.0f, 203.87f),
                    PathNode.CurveTo(94.182236f, 196.96764f, 84.41231f, 182.41957f, 83.62959f, 166.09178f),
                    PathNode.CurveTo(82.846886f, 149.764f, 91.18041f, 134.34811f, 105.27f, 126.06f),
                    PathNode.LineTo(134.87f, 207.39f),
                    PathNode.CurveTo(126.089554f, 208.88672f, 117.06134f, 207.6583f, 109.0f, 203.87f),
                    PathNode.Close,
                    PathNode.MoveTo(152.4f, 94.62f),
                    PathNode.CurveTo(148.64784f, 102.72425f, 142.50641f, 109.48681f, 134.8f, 114.0f),
                    PathNode.LineTo(105.19f, 32.63f),
                    PathNode.CurveTo(121.31012f, 29.92239f, 137.60263f, 36.374214f, 147.4986f, 49.38418f),
                    PathNode.CurveTo(157.39456f, 62.39415f, 159.26279f, 79.81775f, 152.35f, 94.63f),
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
        return _pinwheel!!
    }

private var _pinwheel: ImageVector? = null
