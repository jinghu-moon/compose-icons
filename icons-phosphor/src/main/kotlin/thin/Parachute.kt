package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = phosphorThinIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(228.0f, 120.0f),
                    PathNode.CurveTo(228.0f, 64.77152f, 183.22847f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(72.77152f, 20.0f, 28.0f, 64.77152f, 28.0f, 120.0f),
                    PathNode.CurveTo(28.003157f, 121.11867f, 28.474619f, 122.1849f, 29.3f, 122.94f),
                    PathNode.CurveTo(29.393745f, 123.03363f, 29.493996f, 123.120514f, 29.6f, 123.2f),
                    PathNode.LineTo(124.0f, 194.0f),
                    PathNode.LineTo(124.0f, 220.0f),
                    PathNode.LineTo(112.0f, 220.0f),
                    PathNode.CurveTo(109.79086f, 220.0f, 108.0f, 221.79086f, 108.0f, 224.0f),
                    PathNode.CurveTo(108.0f, 226.20914f, 109.79086f, 228.0f, 112.0f, 228.0f),
                    PathNode.LineTo(144.0f, 228.0f),
                    PathNode.CurveTo(146.20914f, 228.0f, 148.0f, 226.20914f, 148.0f, 224.0f),
                    PathNode.CurveTo(148.0f, 221.79086f, 146.20914f, 220.0f, 144.0f, 220.0f),
                    PathNode.LineTo(132.0f, 220.0f),
                    PathNode.LineTo(132.0f, 194.0f),
                    PathNode.LineTo(226.4f, 123.2f),
                    PathNode.LineTo(226.4f, 123.2f),
                    PathNode.CurveTo(227.40723f, 122.44459f, 228.0f, 121.259026f, 228.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(219.91f, 116.0f),
                    PathNode.LineTo(172.0f, 116.0f),
                    PathNode.CurveTo(171.0f, 67.38f, 152.13f, 40.86f, 140.0f, 28.79f),
                    PathNode.CurveTo(184.24303f, 34.66933f, 217.91087f, 71.41283f, 219.91f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 28.89f),
                    PathNode.CurveTo(134.66624f, 34.15508f, 140.41116f, 40.491398f, 145.0f, 47.64f),
                    PathNode.CurveTo(153.36f, 60.33f, 163.27f, 82.35f, 164.0f, 116.0f),
                    PathNode.LineTo(92.05f, 116.0f),
                    PathNode.CurveTo(92.78f, 82.35f, 102.69f, 60.33f, 111.05f, 47.64f),
                    PathNode.CurveTo(115.62082f, 40.493053f, 121.34905f, 34.156513f, 128.0f, 28.89f),
                    PathNode.Close,
                    PathNode.MoveTo(161.2f, 124.0f),
                    PathNode.LineTo(128.0f, 183.76f),
                    PathNode.LineTo(94.8f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(85.65f, 124.0f),
                    PathNode.LineTo(115.39f, 177.54f),
                    PathNode.LineTo(44.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(170.35f, 124.0f),
                    PathNode.LineTo(212.0f, 124.0f),
                    PathNode.LineTo(140.61f, 177.54f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 28.79f),
                    PathNode.CurveTo(103.87f, 40.86f, 85.0f, 67.38f, 84.0f, 116.0f),
                    PathNode.LineTo(36.09f, 116.0f),
                    PathNode.CurveTo(38.089123f, 71.41283f, 71.756966f, 34.66933f, 116.0f, 28.79f),
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
        return _parachute!!
    }

private var _parachute: ImageVector? = null
