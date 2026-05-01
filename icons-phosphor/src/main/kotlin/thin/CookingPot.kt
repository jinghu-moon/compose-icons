package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.CookingPot: ImageVector
    get() {
        if (_cookingPot != null) return _cookingPot!!
        _cookingPot = phosphorThinIcon(
            name = "CookingPot",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(92.0f, 48.0f),
                    PathNode.LineTo(92.0f, 16.0f),
                    PathNode.CurveTo(92.0f, 13.790861f, 93.79086f, 12.0f, 96.0f, 12.0f),
                    PathNode.CurveTo(98.20914f, 12.0f, 100.0f, 13.790861f, 100.0f, 16.0f),
                    PathNode.LineTo(100.0f, 48.0f),
                    PathNode.CurveTo(100.0f, 50.20914f, 98.20914f, 52.0f, 96.0f, 52.0f),
                    PathNode.CurveTo(93.79086f, 52.0f, 92.0f, 50.20914f, 92.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 52.0f),
                    PathNode.CurveTo(130.20914f, 52.0f, 132.0f, 50.20914f, 132.0f, 48.0f),
                    PathNode.LineTo(132.0f, 16.0f),
                    PathNode.CurveTo(132.0f, 13.790861f, 130.20914f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(125.79086f, 12.0f, 124.0f, 13.790861f, 124.0f, 16.0f),
                    PathNode.LineTo(124.0f, 48.0f),
                    PathNode.CurveTo(124.0f, 50.20914f, 125.79086f, 52.0f, 128.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 52.0f),
                    PathNode.CurveTo(162.20914f, 52.0f, 164.0f, 50.20914f, 164.0f, 48.0f),
                    PathNode.LineTo(164.0f, 16.0f),
                    PathNode.CurveTo(164.0f, 13.790861f, 162.20914f, 12.0f, 160.0f, 12.0f),
                    PathNode.CurveTo(157.79086f, 12.0f, 156.0f, 13.790861f, 156.0f, 16.0f),
                    PathNode.LineTo(156.0f, 48.0f),
                    PathNode.CurveTo(156.0f, 50.20914f, 157.79086f, 52.0f, 160.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(250.4f, 99.2f),
                    PathNode.LineTo(220.0f, 122.0f),
                    PathNode.LineTo(220.0f, 184.0f),
                    PathNode.CurveTo(220.0f, 199.46397f, 207.46397f, 212.0f, 192.0f, 212.0f),
                    PathNode.LineTo(64.0f, 212.0f),
                    PathNode.CurveTo(48.53603f, 212.0f, 36.0f, 199.46397f, 36.0f, 184.0f),
                    PathNode.LineTo(36.0f, 122.0f),
                    PathNode.LineTo(5.6f, 99.2f),
                    PathNode.CurveTo(3.832689f, 97.87452f, 3.474517f, 95.36731f, 4.8f, 93.6f),
                    PathNode.CurveTo(6.125484f, 91.83269f, 8.632689f, 91.47452f, 10.4f, 92.8f),
                    PathNode.LineTo(36.0f, 112.0f),
                    PathNode.LineTo(36.0f, 80.0f),
                    PathNode.CurveTo(36.0f, 77.79086f, 37.79086f, 76.0f, 40.0f, 76.0f),
                    PathNode.LineTo(216.0f, 76.0f),
                    PathNode.CurveTo(218.20914f, 76.0f, 220.0f, 77.79086f, 220.0f, 80.0f),
                    PathNode.LineTo(220.0f, 112.0f),
                    PathNode.LineTo(245.6f, 92.8f),
                    PathNode.CurveTo(247.36731f, 91.47452f, 249.87451f, 91.83269f, 251.2f, 93.6f),
                    PathNode.CurveTo(252.52548f, 95.36731f, 252.16731f, 97.87452f, 250.4f, 99.2f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 84.0f),
                    PathNode.LineTo(44.0f, 84.0f),
                    PathNode.LineTo(44.0f, 184.0f),
                    PathNode.CurveTo(44.0f, 195.0457f, 52.954304f, 204.0f, 64.0f, 204.0f),
                    PathNode.LineTo(192.0f, 204.0f),
                    PathNode.CurveTo(203.0457f, 204.0f, 212.0f, 195.0457f, 212.0f, 184.0f),
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
        return _cookingPot!!
    }

private var _cookingPot: ImageVector? = null
