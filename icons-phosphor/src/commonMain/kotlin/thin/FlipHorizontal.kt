package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FlipHorizontal: ImageVector
    get() {
        if (_flipHorizontal != null) return _flipHorizontal!!
        _flipHorizontal = phosphorThinIcon(
            name = "FlipHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(106.38f, 28.26f),
                    PathNode.CurveTo(100.77224f, 27.021812f, 95.09034f, 30.014956f, 92.94f, 35.34f),
                    PathNode.LineTo(92.94f, 35.42f),
                    PathNode.LineTo(29.0f, 195.32f),
                    PathNode.CurveTo(27.433779f, 199.01785f, 27.821117f, 203.25404f, 30.031992f, 206.60652f),
                    PathNode.CurveTo(32.242867f, 209.95901f, 35.984173f, 211.98335f, 40.0f, 212.0f),
                    PathNode.LineTo(104.0f, 212.0f),
                    PathNode.CurveTo(110.62742f, 212.0f, 116.0f, 206.62741f, 116.0f, 200.0f),
                    PathNode.LineTo(116.0f, 40.0f),
                    PathNode.CurveTo(116.09005f, 34.26269f, 112.02308f, 29.299461f, 106.38f, 28.26f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 200.0f),
                    PathNode.CurveTo(108.0f, 202.20914f, 106.20914f, 204.0f, 104.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(38.657066f, 204.0115f, 37.401245f, 203.33644f, 36.67f, 202.21f),
                    PathNode.CurveTo(35.913204f, 201.0691f, 35.79248f, 199.62042f, 36.35f, 198.37f),
                    PathNode.LineTo(100.35f, 38.43f),
                    PathNode.CurveTo(101.11636f, 36.719044f, 102.968216f, 35.769894f, 104.80469f, 36.14679f),
                    PathNode.CurveTo(106.64116f, 36.52369f, 107.969475f, 38.1255f, 108.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(227.07f, 195.4f),
                    PathNode.LineTo(163.07f, 35.4f),
                    PathNode.LineTo(163.07f, 35.32f),
                    PathNode.CurveTo(160.85992f, 30.037796f, 155.2258f, 27.052902f, 149.61417f, 28.19128f),
                    PathNode.CurveTo(144.00255f, 29.329657f, 139.97697f, 34.27413f, 140.0f, 40.0f),
                    PathNode.LineTo(140.0f, 200.0f),
                    PathNode.CurveTo(140.0f, 206.62741f, 145.37259f, 212.0f, 152.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(220.0087f, 211.99889f, 223.7521f, 209.99615f, 225.97758f, 206.66196f),
                    PathNode.CurveTo(228.20305f, 203.32774f, 228.61667f, 199.10248f, 227.08f, 195.4f),
                    PathNode.Close,
                    PathNode.MoveTo(219.32f, 202.21f),
                    PathNode.CurveTo(218.59067f, 203.33344f, 217.33939f, 204.00806f, 216.0f, 204.0f),
                    PathNode.LineTo(152.0f, 204.0f),
                    PathNode.CurveTo(149.79086f, 204.0f, 148.0f, 202.20914f, 148.0f, 200.0f),
                    PathNode.LineTo(148.0f, 40.0f),
                    PathNode.CurveTo(147.91963f, 38.071373f, 149.29433f, 36.38738f, 151.2f, 36.08f),
                    PathNode.CurveTo(151.49635f, 36.020763f, 151.79779f, 35.99062f, 152.1f, 35.99f),
                    PathNode.CurveTo(153.68663f, 35.94488f, 155.12433f, 36.919464f, 155.67f, 38.41f),
                    PathNode.LineTo(219.67f, 198.41f),
                    PathNode.CurveTo(220.22333f, 199.65114f, 220.09073f, 201.0908f, 219.32f, 202.21f),
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
        return _flipHorizontal!!
    }

private var _flipHorizontal: ImageVector? = null
