package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TextTSlash: ImageVector
    get() {
        if (_textTSlash != null) return _textTSlash!!
        _textTSlash = phosphorThinIcon(
            name = "TextTSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(210.69f, 219.0f),
                    PathNode.CurveTo(209.05516f, 220.48549f, 206.52573f, 220.36461f, 205.04f, 218.73f),
                    PathNode.LineTo(132.04f, 138.39f),
                    PathNode.LineTo(132.04f, 196.0f),
                    PathNode.LineTo(160.04f, 196.0f),
                    PathNode.CurveTo(162.24915f, 196.0f, 164.04f, 197.79086f, 164.04f, 200.0f),
                    PathNode.CurveTo(164.04f, 202.20914f, 162.24915f, 204.0f, 160.04f, 204.0f),
                    PathNode.LineTo(96.0f, 204.0f),
                    PathNode.CurveTo(93.79086f, 204.0f, 92.0f, 202.20914f, 92.0f, 200.0f),
                    PathNode.CurveTo(92.0f, 197.79086f, 93.79086f, 196.0f, 96.0f, 196.0f),
                    PathNode.LineTo(124.0f, 196.0f),
                    PathNode.LineTo(124.0f, 129.55f),
                    PathNode.LineTo(60.78f, 60.0f),
                    PathNode.LineTo(60.0f, 60.0f),
                    PathNode.LineTo(60.0f, 88.0f),
                    PathNode.CurveTo(60.0f, 90.20914f, 58.20914f, 92.0f, 56.0f, 92.0f),
                    PathNode.CurveTo(53.79086f, 92.0f, 52.0f, 90.20914f, 52.0f, 88.0f),
                    PathNode.LineTo(52.0f, 56.0f),
                    PathNode.CurveTo(52.005024f, 54.575977f, 52.766747f, 53.262005f, 54.0f, 52.55f),
                    PathNode.LineTo(45.0f, 42.69f),
                    PathNode.CurveTo(43.514355f, 41.033146f, 43.653145f, 38.485645f, 45.31f, 37.0f),
                    PathNode.CurveTo(46.966854f, 35.514355f, 49.514355f, 35.653145f, 51.0f, 37.31f),
                    PathNode.LineTo(211.0f, 213.31f),
                    PathNode.CurveTo(211.72092f, 214.10216f, 212.09402f, 215.15038f, 212.03575f, 216.21988f),
                    PathNode.CurveTo(211.97748f, 217.28938f, 211.49272f, 218.29085f, 210.69f, 219.0f),
                    PathNode.Close,
                    PathNode.MoveTo(105.79f, 60.0f),
                    PathNode.LineTo(124.0f, 60.0f),
                    PathNode.LineTo(124.0f, 80.43f),
                    PathNode.CurveTo(124.0f, 82.63914f, 125.79086f, 84.43f, 128.0f, 84.43f),
                    PathNode.CurveTo(130.20914f, 84.43f, 132.0f, 82.63914f, 132.0f, 80.43f),
                    PathNode.LineTo(132.0f, 60.0f),
                    PathNode.LineTo(196.0f, 60.0f),
                    PathNode.LineTo(196.0f, 88.0f),
                    PathNode.CurveTo(196.0f, 90.20914f, 197.79086f, 92.0f, 200.0f, 92.0f),
                    PathNode.CurveTo(202.20914f, 92.0f, 204.0f, 90.20914f, 204.0f, 88.0f),
                    PathNode.LineTo(204.0f, 56.0f),
                    PathNode.CurveTo(204.0f, 53.79086f, 202.20914f, 52.0f, 200.0f, 52.0f),
                    PathNode.LineTo(105.79f, 52.0f),
                    PathNode.CurveTo(103.580864f, 52.0f, 101.79f, 53.79086f, 101.79f, 56.0f),
                    PathNode.CurveTo(101.79f, 58.20914f, 103.580864f, 60.0f, 105.79f, 60.0f),
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
        return _textTSlash!!
    }

private var _textTSlash: ImageVector? = null
