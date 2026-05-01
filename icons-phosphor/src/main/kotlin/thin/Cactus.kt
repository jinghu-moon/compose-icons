package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = phosphorThinIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 212.0f),
                    PathNode.LineTo(164.0f, 212.0f),
                    PathNode.LineTo(164.0f, 180.0f),
                    PathNode.LineTo(172.0f, 180.0f),
                    PathNode.CurveTo(207.33023f, 179.96143f, 235.96143f, 151.33023f, 236.0f, 116.0f),
                    PathNode.CurveTo(236.0f, 102.74516f, 225.25484f, 92.0f, 212.0f, 92.0f),
                    PathNode.CurveTo(198.74516f, 92.0f, 188.0f, 102.74516f, 188.0f, 116.0f),
                    PathNode.CurveTo(188.0f, 124.836555f, 180.83656f, 132.0f, 172.0f, 132.0f),
                    PathNode.LineTo(164.0f, 132.0f),
                    PathNode.LineTo(164.0f, 56.0f),
                    PathNode.CurveTo(164.0f, 36.11775f, 147.88223f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(108.11775f, 20.0f, 92.0f, 36.11775f, 92.0f, 56.0f),
                    PathNode.LineTo(92.0f, 92.0f),
                    PathNode.LineTo(84.0f, 92.0f),
                    PathNode.CurveTo(75.163445f, 92.0f, 68.0f, 84.836555f, 68.0f, 76.0f),
                    PathNode.CurveTo(68.0f, 62.745167f, 57.254833f, 52.0f, 44.0f, 52.0f),
                    PathNode.CurveTo(30.745167f, 52.0f, 20.0f, 62.745167f, 20.0f, 76.0f),
                    PathNode.CurveTo(20.03858f, 111.33023f, 48.66977f, 139.96143f, 84.0f, 140.0f),
                    PathNode.LineTo(92.0f, 140.0f),
                    PathNode.LineTo(92.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(37.79086f, 212.0f, 36.0f, 213.79086f, 36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 218.20914f, 37.79086f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 218.20914f, 220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 213.79086f, 218.20914f, 212.0f, 216.0f, 212.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 132.0f),
                    PathNode.LineTo(84.0f, 132.0f),
                    PathNode.CurveTo(53.085766f, 131.96693f, 28.03307f, 106.91424f, 28.0f, 76.0f),
                    PathNode.CurveTo(28.0f, 67.163445f, 35.163445f, 60.0f, 44.0f, 60.0f),
                    PathNode.CurveTo(52.836555f, 60.0f, 60.0f, 67.163445f, 60.0f, 76.0f),
                    PathNode.CurveTo(60.0f, 89.25484f, 70.74516f, 100.0f, 84.0f, 100.0f),
                    PathNode.LineTo(96.0f, 100.0f),
                    PathNode.CurveTo(98.20914f, 100.0f, 100.0f, 98.20914f, 100.0f, 96.0f),
                    PathNode.LineTo(100.0f, 56.0f),
                    PathNode.CurveTo(100.0f, 40.53603f, 112.536026f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(143.46397f, 28.0f, 156.0f, 40.53603f, 156.0f, 56.0f),
                    PathNode.LineTo(156.0f, 136.0f),
                    PathNode.CurveTo(156.0f, 138.20914f, 157.79086f, 140.0f, 160.0f, 140.0f),
                    PathNode.LineTo(172.0f, 140.0f),
                    PathNode.CurveTo(185.25484f, 140.0f, 196.0f, 129.25484f, 196.0f, 116.0f),
                    PathNode.CurveTo(196.0f, 107.163445f, 203.16344f, 100.0f, 212.0f, 100.0f),
                    PathNode.CurveTo(220.83656f, 100.0f, 228.0f, 107.163445f, 228.0f, 116.0f),
                    PathNode.CurveTo(227.96693f, 146.91423f, 202.91423f, 171.96693f, 172.0f, 172.0f),
                    PathNode.LineTo(160.0f, 172.0f),
                    PathNode.CurveTo(157.79086f, 172.0f, 156.0f, 173.79086f, 156.0f, 176.0f),
                    PathNode.LineTo(156.0f, 212.0f),
                    PathNode.LineTo(100.0f, 212.0f),
                    PathNode.LineTo(100.0f, 136.0f),
                    PathNode.CurveTo(100.0f, 133.79086f, 98.20914f, 132.0f, 96.0f, 132.0f),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null
