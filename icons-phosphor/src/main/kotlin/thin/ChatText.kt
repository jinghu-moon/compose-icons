package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ChatText: ImageVector
    get() {
        if (_chatText != null) return _chatText!!
        _chatText = phosphorThinIcon(
            name = "ChatText",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(33.37258f, 52.0f, 28.0f, 57.37258f, 28.0f, 64.0f),
                    PathNode.LineTo(28.0f, 224.0f),
                    PathNode.CurveTo(27.97097f, 228.67346f, 30.682478f, 232.93048f, 34.93f, 234.88f),
                    PathNode.CurveTo(36.519756f, 235.6137f, 38.24911f, 235.99573f, 40.0f, 236.0f),
                    PathNode.CurveTo(42.817684f, 235.99765f, 45.54297f, 234.99472f, 47.69f, 233.17f),
                    PathNode.LineTo(47.69f, 233.17f),
                    PathNode.LineTo(81.49f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(222.62741f, 204.0f, 228.0f, 198.62741f, 228.0f, 192.0f),
                    PathNode.LineTo(228.0f, 64.0f),
                    PathNode.CurveTo(228.0f, 57.37258f, 222.62741f, 52.0f, 216.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 192.0f),
                    PathNode.CurveTo(220.0f, 194.20914f, 218.20914f, 196.0f, 216.0f, 196.0f),
                    PathNode.LineTo(80.0f, 196.0f),
                    PathNode.CurveTo(79.03461f, 196.00624f, 78.10404f, 196.36142f, 77.38f, 197.0f),
                    PathNode.LineTo(42.56f, 227.06f),
                    PathNode.CurveTo(41.36944f, 228.05167f, 39.71325f, 228.26654f, 38.30904f, 227.61154f),
                    PathNode.CurveTo(36.90483f, 226.95653f, 36.005222f, 225.54945f, 36.0f, 224.0f),
                    PathNode.LineTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.CurveTo(218.20914f, 60.0f, 220.0f, 61.79086f, 220.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 112.0f),
                    PathNode.CurveTo(164.0f, 114.20914f, 162.20914f, 116.0f, 160.0f, 116.0f),
                    PathNode.LineTo(96.0f, 116.0f),
                    PathNode.CurveTo(93.79086f, 116.0f, 92.0f, 114.20914f, 92.0f, 112.0f),
                    PathNode.CurveTo(92.0f, 109.79086f, 93.79086f, 108.0f, 96.0f, 108.0f),
                    PathNode.LineTo(160.0f, 108.0f),
                    PathNode.CurveTo(162.20914f, 108.0f, 164.0f, 109.79086f, 164.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 144.0f),
                    PathNode.CurveTo(164.0f, 146.20914f, 162.20914f, 148.0f, 160.0f, 148.0f),
                    PathNode.LineTo(96.0f, 148.0f),
                    PathNode.CurveTo(93.79086f, 148.0f, 92.0f, 146.20914f, 92.0f, 144.0f),
                    PathNode.CurveTo(92.0f, 141.79086f, 93.79086f, 140.0f, 96.0f, 140.0f),
                    PathNode.LineTo(160.0f, 140.0f),
                    PathNode.CurveTo(162.20914f, 140.0f, 164.0f, 141.79086f, 164.0f, 144.0f),
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
        return _chatText!!
    }

private var _chatText: ImageVector? = null
