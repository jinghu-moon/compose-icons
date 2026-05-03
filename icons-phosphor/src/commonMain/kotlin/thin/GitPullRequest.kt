package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitPullRequest: ImageVector
    get() {
        if (_gitPullRequest != null) return _gitPullRequest!!
        _gitPullRequest = phosphorThinIcon(
            name = "GitPullRequest",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(100.0f, 64.0f),
                    PathNode.CurveTo(100.0015f, 49.055603f, 88.26656f, 36.744045f, 73.33927f, 36.029236f),
                    PathNode.CurveTo(58.411983f, 35.314426f, 45.554337f, 46.448345f, 44.12785f, 61.324505f),
                    PathNode.CurveTo(42.701363f, 76.20066f, 53.20888f, 89.57509f, 68.0f, 91.71f),
                    PathNode.LineTo(68.0f, 164.29f),
                    PathNode.CurveTo(53.464695f, 166.38799f, 43.020195f, 179.35973f, 44.071888f, 194.00797f),
                    PathNode.CurveTo(45.123585f, 208.65619f, 57.314064f, 220.0028f, 72.0f, 220.0028f),
                    PathNode.CurveTo(86.685936f, 220.0028f, 98.87642f, 208.65619f, 99.92811f, 194.00797f),
                    PathNode.CurveTo(100.979805f, 179.35973f, 90.53531f, 166.38799f, 76.0f, 164.29f),
                    PathNode.LineTo(76.0f, 91.71f),
                    PathNode.CurveTo(89.77497f, 89.72175f, 99.9986f, 77.91772f, 100.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 64.0f),
                    PathNode.CurveTo(52.0f, 52.954304f, 60.954304f, 44.0f, 72.0f, 44.0f),
                    PathNode.CurveTo(83.04569f, 44.0f, 92.0f, 52.954304f, 92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 75.04569f, 83.04569f, 84.0f, 72.0f, 84.0f),
                    PathNode.CurveTo(60.954304f, 84.0f, 52.0f, 75.04569f, 52.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 192.0f),
                    PathNode.CurveTo(92.0f, 203.0457f, 83.04569f, 212.0f, 72.0f, 212.0f),
                    PathNode.CurveTo(60.954304f, 212.0f, 52.0f, 203.0457f, 52.0f, 192.0f),
                    PathNode.CurveTo(52.0f, 180.9543f, 60.954304f, 172.0f, 72.0f, 172.0f),
                    PathNode.CurveTo(83.04569f, 172.0f, 92.0f, 180.9543f, 92.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 164.29f),
                    PathNode.LineTo(204.0f, 110.63f),
                    PathNode.CurveTo(204.0137f, 105.32023f, 201.90376f, 100.2254f, 198.14f, 96.48f),
                    PathNode.LineTo(153.66f, 52.0f),
                    PathNode.LineTo(192.0f, 52.0f),
                    PathNode.CurveTo(194.20914f, 52.0f, 196.0f, 50.20914f, 196.0f, 48.0f),
                    PathNode.CurveTo(196.0f, 45.79086f, 194.20914f, 44.0f, 192.0f, 44.0f),
                    PathNode.LineTo(144.0f, 44.0f),
                    PathNode.CurveTo(141.79086f, 44.0f, 140.0f, 45.79086f, 140.0f, 48.0f),
                    PathNode.LineTo(140.0f, 96.0f),
                    PathNode.CurveTo(140.0f, 98.20914f, 141.79086f, 100.0f, 144.0f, 100.0f),
                    PathNode.CurveTo(146.20914f, 100.0f, 148.0f, 98.20914f, 148.0f, 96.0f),
                    PathNode.LineTo(148.0f, 57.66f),
                    PathNode.LineTo(192.49f, 102.14f),
                    PathNode.CurveTo(194.73987f, 104.392365f, 196.0025f, 107.44644f, 196.0f, 110.63f),
                    PathNode.LineTo(196.0f, 164.29f),
                    PathNode.CurveTo(181.46469f, 166.38799f, 171.02019f, 179.35973f, 172.07188f, 194.00797f),
                    PathNode.CurveTo(173.12358f, 208.65619f, 185.31406f, 220.0028f, 200.0f, 220.0028f),
                    PathNode.CurveTo(214.68594f, 220.0028f, 226.87642f, 208.65619f, 227.92812f, 194.00797f),
                    PathNode.CurveTo(228.97981f, 179.35973f, 218.53531f, 166.38799f, 204.0f, 164.29f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 212.0f),
                    PathNode.CurveTo(188.9543f, 212.0f, 180.0f, 203.0457f, 180.0f, 192.0f),
                    PathNode.CurveTo(180.0f, 180.9543f, 188.9543f, 172.0f, 200.0f, 172.0f),
                    PathNode.CurveTo(211.0457f, 172.0f, 220.0f, 180.9543f, 220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 203.0457f, 211.0457f, 212.0f, 200.0f, 212.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _gitPullRequest!!
    }

private var _gitPullRequest: ImageVector? = null
