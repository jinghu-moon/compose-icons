package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.DropSlash: ImageVector
    get() {
        if (_dropSlash != null) return _dropSlash!!
        _dropSlash = phosphorThinIcon(
            name = "DropSlash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(51.0f, 37.31f),
                    PathNode.CurveTo(49.514355f, 35.653145f, 46.966854f, 35.514355f, 45.31f, 37.0f),
                    PathNode.CurveTo(43.653145f, 38.485645f, 43.514355f, 41.033146f, 45.0f, 42.69f),
                    PathNode.LineTo(69.81f, 69.93f),
                    PathNode.CurveTo(52.7f, 94.85f, 44.0f, 119.75f, 44.0f, 144.0f),
                    PathNode.CurveTo(44.003925f, 178.47707f, 65.07463f, 209.45085f, 97.14088f, 222.11671f),
                    PathNode.CurveTo(129.20712f, 234.78258f, 165.75674f, 226.56825f, 189.32f, 201.4f),
                    PathNode.LineTo(205.0f, 218.69f),
                    PathNode.CurveTo(205.95595f, 219.76758f, 207.41747f, 220.24792f, 208.8263f, 219.94757f),
                    PathNode.CurveTo(210.23512f, 219.64722f, 211.37364f, 218.61255f, 211.80698f, 217.23878f),
                    PathNode.CurveTo(212.24031f, 215.865f, 211.9015f, 214.36435f, 210.92f, 213.31f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(86.04464f, 219.9559f, 52.044098f, 185.95538f, 52.0f, 144.0f),
                    PathNode.CurveTo(52.0f, 121.9f, 59.85f, 99.05f, 75.33f, 76.0f),
                    PathNode.LineTo(183.92f, 195.46f),
                    PathNode.CurveTo(169.54317f, 211.1158f, 149.25552f, 220.01886f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.78f, 47.62f),
                    PathNode.CurveTo(91.2057f, 46.098034f, 91.147766f, 43.593136f, 92.65f, 42.0f),
                    PathNode.CurveTo(102.76703f, 31.277702f, 113.83199f, 21.491264f, 125.71f, 12.76f),
                    PathNode.CurveTo(127.08559f, 11.799492f, 128.91441f, 11.799492f, 130.29f, 12.76f),
                    PathNode.CurveTo(145.21107f, 23.75021f, 158.86484f, 36.36426f, 171.0f, 50.37f),
                    PathNode.CurveTo(197.81f, 81.21f, 212.0f, 113.58f, 212.0f, 144.0f),
                    PathNode.CurveTo(212.00432f, 151.54736f, 210.9953f, 159.06116f, 209.0f, 166.34f),
                    PathNode.CurveTo(208.52246f, 168.07759f, 206.94202f, 169.28136f, 205.14f, 169.28f),
                    PathNode.CurveTo(204.78188f, 169.28273f, 204.42513f, 169.23561f, 204.08f, 169.14f),
                    PathNode.CurveTo(203.05582f, 168.85954f, 202.18521f, 168.18338f, 201.65999f, 167.2605f),
                    PathNode.CurveTo(201.13477f, 166.33762f, 200.99806f, 165.24376f, 201.28f, 164.22f),
                    PathNode.CurveTo(203.09265f, 157.63315f, 204.00758f, 150.83171f, 204.0f, 144.0f),
                    PathNode.CurveTo(204.0f, 81.71f, 140.92f, 30.75f, 128.0f, 21.0f),
                    PathNode.CurveTo(117.464226f, 29.033873f, 107.5801f, 37.888123f, 98.44f, 47.48f),
                    PathNode.CurveTo(97.70847f, 48.24996f, 96.70077f, 48.69739f, 95.63903f, 48.723656f),
                    PathNode.CurveTo(94.57729f, 48.749916f, 93.5487f, 48.352856f, 92.78f, 47.62f),
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
        return _dropSlash!!
    }

private var _dropSlash: ImageVector? = null
