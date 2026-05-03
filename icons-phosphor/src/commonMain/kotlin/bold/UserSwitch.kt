package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserSwitch: ImageVector
    get() {
        if (_userSwitch != null) return _userSwitch!!
        _userSwitch = phosphorBoldIcon(
            name = "UserSwitch",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(213.0f, 174.26f),
                    PathNode.CurveTo(210.41489f, 172.3986f, 207.19576f, 171.64148f, 204.05196f, 172.15544f),
                    PathNode.CurveTo(200.90817f, 172.6694f, 198.09775f, 174.41228f, 196.24f, 177.0f),
                    PathNode.QuadTo(194.77f, 179.06f, 193.19f, 181.0f),
                    PathNode.CurveTo(185.99968f, 168.95604f, 175.61646f, 159.13698f, 163.19f, 152.63f),
                    PathNode.CurveTo(180.92152f, 133.53084f, 180.17372f, 103.77233f, 161.50531f, 85.58787f),
                    PathNode.CurveTo(142.8369f, 67.40339f, 113.069016f, 67.43727f, 94.442055f, 85.6642f),
                    PathNode.CurveTo(75.81509f, 103.89112f, 75.13505f, 133.65126f, 92.91f, 152.71f),
                    PathNode.CurveTo(80.50121f, 159.2091f, 70.10621f, 168.9782f, 62.85f, 180.96f),
                    PathNode.CurveTo(52.691177f, 168.50386f, 46.337616f, 153.38377f, 44.55f, 137.41f),
                    PathNode.CurveTo(49.507336f, 141.64458f, 56.938763f, 141.14629f, 61.286396f, 136.28781f),
                    PathNode.CurveTo(65.634026f, 131.42932f, 65.30705f, 123.988396f, 60.55f, 119.53f),
                    PathNode.LineTo(40.55f, 99.53f),
                    PathNode.CurveTo(38.298374f, 97.270546f, 35.23982f, 96.000534f, 32.05f, 96.000534f),
                    PathNode.CurveTo(28.860182f, 96.000534f, 25.801622f, 97.270546f, 23.55f, 99.53f),
                    PathNode.LineTo(3.55f, 119.53f),
                    PathNode.CurveTo(-0.979789f, 124.21067f, -0.948458f, 131.6503f, 3.620592f, 136.29266f),
                    PathNode.CurveTo(8.189643f, 140.935f, 15.627836f, 141.08473f, 20.38f, 136.63f),
                    PathNode.CurveTo(22.674257f, 165.2036f, 36.246307f, 191.68924f, 58.1f, 210.24f),
                    PathNode.CurveTo(58.673004f, 210.82443f, 59.302776f, 211.35036f, 59.98f, 211.81f),
                    PathNode.CurveTo(99.744255f, 244.18596f, 156.8094f, 244.07722f, 196.45f, 211.55f),
                    PathNode.CurveTo(196.89868f, 211.22415f, 197.32622f, 210.87009f, 197.73f, 210.49f),
                    PathNode.CurveTo(204.50874f, 204.7696f, 210.55453f, 198.23338f, 215.73f, 191.03f),
                    PathNode.CurveTo(217.59558f, 188.44542f, 218.35619f, 185.22478f, 217.84402f, 182.07864f),
                    PathNode.CurveTo(217.33186f, 178.93251f, 215.58902f, 176.11942f, 213.0f, 174.26f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 96.0f),
                    PathNode.CurveTo(141.25484f, 96.0f, 152.0f, 106.74516f, 152.0f, 120.0f),
                    PathNode.CurveTo(152.0f, 133.25484f, 141.25484f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(114.74516f, 144.0f, 104.0f, 133.25484f, 104.0f, 120.0f),
                    PathNode.CurveTo(104.0f, 106.74516f, 114.74516f, 96.0f, 128.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 212.0f),
                    PathNode.CurveTo(111.26712f, 212.02025f, 94.91391f, 207.01398f, 81.06f, 197.63f),
                    PathNode.CurveTo(89.68703f, 179.53148f, 107.950516f, 168.0049f, 128.0f, 168.0049f),
                    PathNode.CurveTo(148.04948f, 168.0049f, 166.31297f, 179.53148f, 174.94f, 197.63f),
                    PathNode.CurveTo(161.07143f, 206.98328f, 144.72786f, 211.98662f, 128.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(252.49f, 136.49f),
                    PathNode.LineTo(232.49f, 156.49f),
                    PathNode.CurveTo(230.23837f, 158.74945f, 227.17982f, 160.01947f, 223.99f, 160.01947f),
                    PathNode.CurveTo(220.80019f, 160.01947f, 217.74162f, 158.74945f, 215.49f, 156.49f),
                    PathNode.LineTo(195.49f, 136.49f),
                    PathNode.CurveTo(190.73296f, 132.03162f, 190.40598f, 124.590675f, 194.7536f, 119.73219f),
                    PathNode.CurveTo(199.10124f, 114.87372f, 206.53267f, 114.37543f, 211.49f, 118.61f),
                    PathNode.CurveTo(207.62726f, 84.05193f, 182.87083f, 55.446514f, 149.22487f, 46.664196f),
                    PathNode.CurveTo(115.578896f, 37.881878f, 80.0f, 50.738487f, 59.74f, 79.0f),
                    PathNode.CurveTo(57.29621f, 82.62762f, 53.07218f, 84.63823f, 48.715687f, 84.2475f),
                    PathNode.CurveTo(44.359188f, 83.85677f, 40.560356f, 81.1266f, 38.801086f, 77.12202f),
                    PathNode.CurveTo(37.041817f, 73.11743f, 37.60081f, 68.47282f, 40.26f, 65.0f),
                    PathNode.CurveTo(66.68926f, 28.175703f, 113.300415f, 11.772692f, 156.96672f, 23.929535f),
                    PathNode.CurveTo(200.63303f, 36.086376f, 232.0621f, 74.21604f, 235.66f, 119.4f),
                    PathNode.CurveTo(240.41217f, 114.945274f, 247.85036f, 115.09499f, 252.4194f, 119.73734f),
                    PathNode.CurveTo(256.98846f, 124.3797f, 257.01978f, 131.81934f, 252.49f, 136.5f),
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
        return _userSwitch!!
    }

private var _userSwitch: ImageVector? = null
