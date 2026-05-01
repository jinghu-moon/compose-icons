package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCircleMinus: ImageVector
    get() {
        if (_userCircleMinus != null) return _userCircleMinus!!
        _userCircleMinus = phosphorThinIcon(
            name = "UserCircleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(172.0f, 56.0f),
                    PathNode.CurveTo(172.0f, 53.79086f, 173.79086f, 52.0f, 176.0f, 52.0f),
                    PathNode.LineTo(224.0f, 52.0f),
                    PathNode.CurveTo(226.20914f, 52.0f, 228.0f, 53.79086f, 228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 58.20914f, 226.20914f, 60.0f, 224.0f, 60.0f),
                    PathNode.LineTo(176.0f, 60.0f),
                    PathNode.CurveTo(173.79086f, 60.0f, 172.0f, 58.20914f, 172.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(222.31f, 94.67f),
                    PathNode.CurveTo(236.82735f, 135.7359f, 223.09412f, 181.47504f, 188.35692f, 207.75218f),
                    PathNode.CurveTo(153.61972f, 234.02934f, 105.869576f, 234.79967f, 70.30284f, 209.6567f),
                    PathNode.CurveTo(34.736107f, 184.51372f, 19.53463f, 139.24138f, 32.719784f, 97.72856f),
                    PathNode.CurveTo(45.90493f, 56.21575f, 84.44358f, 28.01216f, 128.0f, 28.0f),
                    PathNode.CurveTo(133.58199f, 27.997412f, 139.15453f, 28.459002f, 144.66f, 29.38f),
                    PathNode.CurveTo(146.82114f, 29.762188f, 148.27074f, 31.814322f, 147.90858f, 33.97891f),
                    PathNode.CurveTo(147.54646f, 36.143497f, 145.50786f, 37.612053f, 143.34f, 37.27f),
                    PathNode.CurveTo(138.27032f, 36.425327f, 133.13957f, 36.000553f, 128.0f, 36.0f),
                    PathNode.CurveTo(90.84893f, 36.0271f, 57.360058f, 58.39598f, 43.10706f, 92.704216f),
                    PathNode.CurveTo(28.854065f, 127.01244f, 36.63444f, 166.52621f, 62.83f, 192.87f),
                    PathNode.CurveTo(72.767075f, 176.25659f, 88.69788f, 164.08748f, 107.34f, 158.87f),
                    PathNode.CurveTo(89.50537f, 149.38524f, 80.41982f, 128.97533f, 85.307434f, 109.37569f),
                    PathNode.CurveTo(90.195045f, 89.77605f, 107.80013f, 76.02203f, 128.0f, 76.02203f),
                    PathNode.CurveTo(148.19986f, 76.02203f, 165.80496f, 89.77605f, 170.69257f, 109.37569f),
                    PathNode.CurveTo(175.58017f, 128.97533f, 166.49463f, 149.38524f, 148.66f, 158.87f),
                    PathNode.CurveTo(167.30212f, 164.08748f, 183.23293f, 176.25659f, 193.17f, 192.87f),
                    PathNode.CurveTo(218.13402f, 167.82167f, 226.53085f, 130.68121f, 214.77f, 97.33f),
                    PathNode.CurveTo(214.23764f, 95.96917f, 214.48973f, 94.426346f, 215.42752f, 93.30571f),
                    PathNode.CurveTo(216.3653f, 92.18508f, 217.83952f, 91.66499f, 219.2729f, 91.94912f),
                    PathNode.CurveTo(220.70625f, 92.23325f, 221.8706f, 93.276375f, 222.31f, 94.67f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 156.0f),
                    PathNode.CurveTo(147.88223f, 156.0f, 164.0f, 139.88223f, 164.0f, 120.0f),
                    PathNode.CurveTo(164.0f, 100.11775f, 147.88223f, 84.0f, 128.0f, 84.0f),
                    PathNode.CurveTo(108.11775f, 84.0f, 92.0f, 100.11775f, 92.0f, 120.0f),
                    PathNode.CurveTo(92.0f, 139.88223f, 108.11775f, 156.0f, 128.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(149.64362f, 220.01868f, 170.59485f, 212.37364f, 187.14f, 198.42f),
                    PathNode.CurveTo(175.05891f, 177.13965f, 152.47551f, 163.9916f, 128.005f, 163.9916f),
                    PathNode.CurveTo(103.534485f, 163.9916f, 80.95109f, 177.13965f, 68.87f, 198.42f),
                    PathNode.CurveTo(85.41033f, 212.37521f, 106.35907f, 220.02063f, 128.0f, 220.0f),
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
        return _userCircleMinus!!
    }

private var _userCircleMinus: ImageVector? = null
