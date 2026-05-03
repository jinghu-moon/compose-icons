package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.GitDiff: ImageVector
    get() {
        if (_gitDiff != null) return _gitDiff!!
        _gitDiff = phosphorThinIcon(
            name = "GitDiff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.0f, 156.0f),
                    PathNode.CurveTo(109.79086f, 156.0f, 108.0f, 157.79086f, 108.0f, 160.0f),
                    PathNode.LineTo(108.0f, 198.34f),
                    PathNode.LineTo(63.51f, 153.86f),
                    PathNode.CurveTo(61.260136f, 151.60764f, 59.997498f, 148.55356f, 60.0f, 145.37f),
                    PathNode.LineTo(60.0f, 91.71f),
                    PathNode.CurveTo(74.53531f, 89.61201f, 84.979805f, 76.64027f, 83.92811f, 61.99204f),
                    PathNode.CurveTo(82.87642f, 47.34381f, 70.685936f, 35.99719f, 56.0f, 35.99719f),
                    PathNode.CurveTo(41.314064f, 35.99719f, 29.123585f, 47.34381f, 28.07189f, 61.99204f),
                    PathNode.CurveTo(27.020193f, 76.64027f, 37.464695f, 89.61201f, 52.0f, 91.71f),
                    PathNode.LineTo(52.0f, 145.37f),
                    PathNode.CurveTo(51.984512f, 150.67719f, 54.094933f, 155.76958f, 57.86f, 159.51f),
                    PathNode.LineTo(102.34f, 204.0f),
                    PathNode.LineTo(64.0f, 204.0f),
                    PathNode.CurveTo(61.79086f, 204.0f, 60.0f, 205.79086f, 60.0f, 208.0f),
                    PathNode.CurveTo(60.0f, 210.20914f, 61.79086f, 212.0f, 64.0f, 212.0f),
                    PathNode.LineTo(112.0f, 212.0f),
                    PathNode.CurveTo(114.20914f, 212.0f, 116.0f, 210.20914f, 116.0f, 208.0f),
                    PathNode.LineTo(116.0f, 160.0f),
                    PathNode.CurveTo(116.0f, 157.79086f, 114.20914f, 156.0f, 112.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 52.954304f, 44.954304f, 44.0f, 56.0f, 44.0f),
                    PathNode.CurveTo(67.04569f, 44.0f, 76.0f, 52.954304f, 76.0f, 64.0f),
                    PathNode.CurveTo(76.0f, 75.04569f, 67.04569f, 84.0f, 56.0f, 84.0f),
                    PathNode.CurveTo(44.954304f, 84.0f, 36.0f, 75.04569f, 36.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 164.29f),
                    PathNode.LineTo(204.0f, 110.63f),
                    PathNode.CurveTo(204.01549f, 105.32281f, 201.90506f, 100.23043f, 198.14f, 96.49f),
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
        return _gitDiff!!
    }

private var _gitDiff: ImageVector? = null
