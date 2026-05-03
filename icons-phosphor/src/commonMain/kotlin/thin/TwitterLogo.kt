package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TwitterLogo: ImageVector
    get() {
        if (_twitterLogo != null) return _twitterLogo!!
        _twitterLogo = phosphorThinIcon(
            name = "TwitterLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(243.7f, 70.47f),
                    PathNode.CurveTo(243.08047f, 68.9735f, 241.61966f, 67.99831f, 240.0f, 68.0f),
                    PathNode.LineTo(207.2f, 68.0f),
                    PathNode.CurveTo(199.59254f, 53.375523f, 184.53416f, 44.144333f, 168.05f, 44.0f),
                    PathNode.CurveTo(156.4828f, 43.833927f, 145.34189f, 48.361725f, 137.17f, 56.55f),
                    PathNode.CurveTo(128.71713f, 64.827446f, 123.96763f, 76.16927f, 124.0f, 88.0f),
                    PathNode.LineTo(124.0f, 99.16f),
                    PathNode.CurveTo(80.35f, 89.77f, 44.0f, 53.56f, 43.61f, 53.16f),
                    PathNode.CurveTo(42.51635f, 52.056484f, 40.88264f, 51.686073f, 39.42f, 52.21f),
                    PathNode.CurveTo(37.954063f, 52.737495f, 36.92778f, 54.06815f, 36.79f, 55.62f),
                    PathNode.CurveTo(32.59f, 102.24f, 46.06f, 133.33f, 58.1f, 151.21f),
                    PathNode.CurveTo(64.64509f, 161.13329f, 72.84797f, 169.85709f, 82.35f, 177.0f),
                    PathNode.CurveTo(66.67f, 197.49f, 38.89f, 208.13f, 38.6f, 208.24f),
                    PathNode.CurveTo(37.44467f, 208.66472f, 36.549225f, 209.5977f, 36.1723f, 210.7695f),
                    PathNode.CurveTo(35.795372f, 211.94128f, 35.978947f, 213.22136f, 36.67f, 214.24f),
                    PathNode.CurveTo(36.94f, 214.64f, 39.46f, 218.24f, 46.21f, 221.6f),
                    PathNode.CurveTo(54.73f, 225.84f, 66.1f, 228.0f, 80.0f, 228.0f),
                    PathNode.CurveTo(149.09f, 228.0f, 206.73f, 174.44f, 211.89f, 105.77f),
                    PathNode.LineTo(242.83f, 74.83f),
                    PathNode.CurveTo(243.97536f, 73.686516f, 244.31877f, 71.96551f, 243.7f, 70.47f),
                    PathNode.Close,
                    PathNode.MoveTo(205.17f, 101.17f),
                    PathNode.CurveTo(204.482f, 101.86001f, 204.06952f, 102.77743f, 204.01f, 103.75f),
                    PathNode.CurveTo(199.85f, 168.94f, 145.38f, 220.0f, 80.0f, 220.0f),
                    PathNode.CurveTo(62.15f, 220.0f, 52.37f, 216.11f, 47.5f, 213.13f),
                    PathNode.CurveTo(57.87f, 208.31f, 78.95f, 196.79f, 91.33f, 178.22f),
                    PathNode.CurveTo(91.93837f, 177.3015f, 92.14096f, 176.17274f, 91.89f, 175.1f),
                    PathNode.CurveTo(91.64654f, 174.02208f, 90.960495f, 173.09647f, 90.0f, 172.55f),
                    PathNode.CurveTo(89.87f, 172.47f, 76.61f, 164.55f, 64.48f, 146.4f),
                    PathNode.CurveTo(54.0f, 130.71f, 42.39f, 104.11f, 44.19f, 64.65f),
                    PathNode.CurveTo(57.36f, 76.27f, 89.67f, 101.65f, 127.34f, 107.95f),
                    PathNode.CurveTo(128.50963f, 108.14578f, 129.70583f, 107.812485f, 130.60568f, 107.04008f),
                    PathNode.CurveTo(131.50554f, 106.26767f, 132.01627f, 105.13578f, 132.0f, 103.95f),
                    PathNode.LineTo(132.0f, 88.0f),
                    PathNode.CurveTo(131.98369f, 78.31121f, 135.87343f, 69.02484f, 142.79f, 62.24f),
                    PathNode.CurveTo(149.46823f, 55.56614f, 158.5595f, 51.873383f, 168.0f, 52.0f),
                    PathNode.CurveTo(182.2f, 52.18f, 195.49f, 60.86f, 201.06f, 73.61f),
                    PathNode.CurveTo(201.69093f, 75.04532f, 203.10226f, 75.97968f, 204.67f, 76.0f),
                    PathNode.LineTo(230.34f, 76.0f),
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
        return _twitterLogo!!
    }

private var _twitterLogo: ImageVector? = null
