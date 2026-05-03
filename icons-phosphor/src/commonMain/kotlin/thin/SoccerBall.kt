package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SoccerBall: ImageVector
    get() {
        if (_soccerBall != null) return _soccerBall!!
        _soccerBall = phosphorThinIcon(
            name = "SoccerBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.87f, 175.42f),
                    PathNode.LineTo(157.18f, 159.33f),
                    PathNode.LineTo(171.13f, 118.69f),
                    PathNode.LineTo(190.06f, 112.54f),
                    PathNode.LineTo(219.71f, 135.28f),
                    PathNode.CurveTo(218.59988f, 149.48306f, 214.18216f, 163.2294f, 206.81f, 175.42f),
                    PathNode.Close,
                    PathNode.MoveTo(87.13f, 175.42f),
                    PathNode.LineTo(49.19f, 175.42f),
                    PathNode.CurveTo(41.817844f, 163.2294f, 37.400112f, 149.48306f, 36.29f, 135.28f),
                    PathNode.LineTo(65.94f, 112.54f),
                    PathNode.LineTo(84.87f, 118.69f),
                    PathNode.LineTo(98.82f, 159.33f),
                    PathNode.Close,
                    PathNode.MoveTo(51.69f, 76.66f),
                    PathNode.LineTo(60.56f, 106.58f),
                    PathNode.LineTo(36.0f, 125.39f),
                    PathNode.CurveTo(36.481915f, 107.98381f, 41.92542f, 91.07738f, 51.69f, 76.66f),
                    PathNode.Close,
                    PathNode.MoveTo(106.13f, 156.0f),
                    PathNode.LineTo(92.77f, 117.08f),
                    PathNode.LineTo(128.0f, 92.85f),
                    PathNode.LineTo(163.23f, 117.08f),
                    PathNode.LineTo(149.87f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(195.44f, 106.58f),
                    PathNode.LineTo(204.31f, 76.66f),
                    PathNode.CurveTo(214.07458f, 91.07738f, 219.51808f, 107.98381f, 220.0f, 125.39f),
                    PathNode.Close,
                    PathNode.MoveTo(198.31f, 68.74f),
                    PathNode.LineTo(187.59f, 104.93f),
                    PathNode.LineTo(168.59f, 111.09f),
                    PathNode.LineTo(132.0f, 85.9f),
                    PathNode.LineTo(132.0f, 66.1f),
                    PathNode.LineTo(164.68f, 43.64f),
                    PathNode.CurveTo(177.66595f, 49.31794f, 189.17241f, 57.905872f, 198.31f, 68.74f),
                    PathNode.Close,
                    PathNode.MoveTo(155.54f, 40.21f),
                    PathNode.LineTo(128.0f, 59.15f),
                    PathNode.LineTo(100.46f, 40.21f),
                    PathNode.CurveTo(118.39092f, 34.596516f, 137.60907f, 34.596516f, 155.54f, 40.21f),
                    PathNode.Close,
                    PathNode.MoveTo(91.32f, 43.64f),
                    PathNode.LineTo(124.0f, 66.1f),
                    PathNode.LineTo(124.0f, 85.9f),
                    PathNode.LineTo(87.36f, 111.09f),
                    PathNode.LineTo(68.36f, 104.93f),
                    PathNode.LineTo(57.69f, 68.74f),
                    PathNode.CurveTo(66.82759f, 57.905872f, 78.334045f, 49.31794f, 91.32f, 43.64f),
                    PathNode.Close,
                    PathNode.MoveTo(54.61f, 183.42f),
                    PathNode.LineTo(86.34f, 183.42f),
                    PathNode.LineTo(97.44f, 214.78f),
                    PathNode.CurveTo(80.40497f, 208.73776f, 65.51451f, 197.835f, 54.61f, 183.42f),
                    PathNode.Close,
                    PathNode.MoveTo(106.91f, 217.56f),
                    PathNode.LineTo(93.64f, 180.06f),
                    PathNode.LineTo(105.32f, 164.0f),
                    PathNode.LineTo(150.68f, 164.0f),
                    PathNode.LineTo(162.36f, 180.06f),
                    PathNode.LineTo(149.09f, 217.56f),
                    PathNode.CurveTo(135.21817f, 220.81316f, 120.78182f, 220.81316f, 106.91f, 217.56f),
                    PathNode.Close,
                    PathNode.MoveTo(158.56f, 214.78f),
                    PathNode.LineTo(169.66f, 183.42f),
                    PathNode.LineTo(201.39f, 183.42f),
                    PathNode.CurveTo(190.48549f, 197.835f, 175.59502f, 208.73776f, 158.56f, 214.78f),
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
        return _soccerBall!!
    }

private var _soccerBall: ImageVector? = null
