package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorLightIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(245.54f, 69.71f),
                    PathNode.CurveTo(244.61368f, 67.46666f, 242.42706f, 66.00235f, 240.0f, 66.0f),
                    PathNode.LineTo(208.4f, 66.0f),
                    PathNode.CurveTo(200.26018f, 51.320415f, 184.85463f, 42.152718f, 168.07f, 42.0f),
                    PathNode.CurveTo(155.97285f, 41.844975f, 144.32437f, 46.575027f, 135.76f, 55.12f),
                    PathNode.CurveTo(126.93334f, 63.780247f, 121.972496f, 75.63436f, 122.0f, 88.0f),
                    PathNode.LineTo(122.0f, 96.66f),
                    PathNode.CurveTo(80.0f, 86.66f, 45.4f, 52.14f, 45.0f, 51.78f),
                    PathNode.CurveTo(43.35514f, 50.146553f, 40.916473f, 49.60676f, 38.73592f, 50.39347f),
                    PathNode.CurveTo(36.555367f, 51.18018f, 35.023075f, 53.15263f, 34.8f, 55.46f),
                    PathNode.CurveTo(30.55f, 102.68f, 44.22f, 134.21f, 56.44f, 152.35f),
                    PathNode.CurveTo(62.757187f, 161.85275f, 70.54428f, 170.2913f, 79.51f, 177.35f),
                    PathNode.CurveTo(64.02f, 196.35f, 38.17f, 206.24f, 37.89f, 206.35f),
                    PathNode.CurveTo(36.15959f, 206.99031f, 34.820007f, 208.39116f, 34.257675f, 210.14845f),
                    PathNode.CurveTo(33.69534f, 211.90575f, 33.972794f, 213.82405f, 35.01f, 215.35f),
                    PathNode.CurveTo(36.0f, 216.83f, 45.78f, 230.0f, 80.0f, 230.0f),
                    PathNode.CurveTo(149.88f, 230.0f, 208.23f, 176.0f, 213.82f, 106.66f),
                    PathNode.LineTo(244.24f, 76.25f),
                    PathNode.CurveTo(245.9563f, 74.53364f, 246.46942f, 71.95227f, 245.54f, 69.71f),
                    PathNode.Close,
                    PathNode.MoveTo(203.76f, 99.76f),
                    PathNode.CurveTo(202.72653f, 100.79095f, 202.10435f, 102.163284f, 202.01f, 103.62f),
                    PathNode.CurveTo(197.93f, 167.76f, 144.33f, 218.0f, 80.0f, 218.0f),
                    PathNode.CurveTo(66.0f, 218.0f, 57.24f, 215.59f, 51.94f, 213.2f),
                    PathNode.CurveTo(63.24f, 207.52f, 81.66f, 196.32f, 92.99f, 179.33f),
                    PathNode.CurveTo(93.90322f, 177.95634f, 94.21065f, 176.26733f, 93.84f, 174.66f),
                    PathNode.CurveTo(93.46553f, 173.04214f, 92.43728f, 171.65182f, 91.0f, 170.82f),
                    PathNode.CurveTo(90.87f, 170.74f, 77.87f, 162.96f, 66.0f, 145.1f),
                    PathNode.CurveTo(52.0f, 124.0f, 45.31f, 98.43f, 46.0f, 68.88f),
                    PathNode.CurveTo(60.88f, 81.48f, 91.57f, 103.97f, 127.0f, 109.88f),
                    PathNode.CurveTo(128.7421f, 110.17447f, 130.52544f, 109.68614f, 131.87448f, 108.545235f),
                    PathNode.CurveTo(133.22353f, 107.40432f, 134.00116f, 105.726814f, 134.0f, 103.96f),
                    PathNode.LineTo(134.0f, 88.0f),
                    PathNode.CurveTo(133.98146f, 78.8457f, 137.65514f, 70.070694f, 144.19f, 63.66f),
                    PathNode.CurveTo(150.48181f, 57.377796f, 159.03944f, 53.89563f, 167.93f, 54.0f),
                    PathNode.CurveTo(181.36f, 54.17f, 193.93f, 62.37f, 199.17f, 74.4f),
                    PathNode.CurveTo(200.12442f, 76.58686f, 202.28394f, 78.00036f, 204.67f, 78.0f),
                    PathNode.LineTo(225.51f, 78.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
