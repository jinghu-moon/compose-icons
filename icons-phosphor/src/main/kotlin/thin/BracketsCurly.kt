package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.BracketsCurly: ImageVector
    get() {
        if (_bracketsCurly != null) return _bracketsCurly!!
        _bracketsCurly = phosphorThinIcon(
            name = "BracketsCurly",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(35.89f, 128.0f),
                    PathNode.CurveTo(52.0f, 136.23f, 52.0f, 155.64f, 52.0f, 172.0f),
                    PathNode.CurveTo(52.0f, 196.8f, 53.35f, 212.0f, 80.0f, 212.0f),
                    PathNode.CurveTo(82.20914f, 212.0f, 84.0f, 213.79086f, 84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 218.20914f, 82.20914f, 220.0f, 80.0f, 220.0f),
                    PathNode.CurveTo(44.0f, 220.0f, 44.0f, 193.39f, 44.0f, 172.0f),
                    PathNode.CurveTo(44.0f, 147.2f, 42.65f, 132.0f, 16.0f, 132.0f),
                    PathNode.CurveTo(13.790861f, 132.0f, 12.0f, 130.20914f, 12.0f, 128.0f),
                    PathNode.CurveTo(12.0f, 125.79086f, 13.790861f, 124.0f, 16.0f, 124.0f),
                    PathNode.CurveTo(42.65f, 124.0f, 44.0f, 108.8f, 44.0f, 84.0f),
                    PathNode.CurveTo(44.0f, 62.61f, 44.0f, 36.0f, 80.0f, 36.0f),
                    PathNode.CurveTo(82.20914f, 36.0f, 84.0f, 37.79086f, 84.0f, 40.0f),
                    PathNode.CurveTo(84.0f, 42.20914f, 82.20914f, 44.0f, 80.0f, 44.0f),
                    PathNode.CurveTo(53.35f, 44.0f, 52.0f, 59.2f, 52.0f, 84.0f),
                    PathNode.CurveTo(52.0f, 100.36f, 52.0f, 119.77f, 35.89f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 124.0f),
                    PathNode.CurveTo(213.35f, 124.0f, 212.0f, 108.8f, 212.0f, 84.0f),
                    PathNode.CurveTo(212.0f, 62.61f, 212.0f, 36.0f, 176.0f, 36.0f),
                    PathNode.CurveTo(173.79086f, 36.0f, 172.0f, 37.79086f, 172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 42.20914f, 173.79086f, 44.0f, 176.0f, 44.0f),
                    PathNode.CurveTo(202.65f, 44.0f, 204.0f, 59.2f, 204.0f, 84.0f),
                    PathNode.CurveTo(204.0f, 100.36f, 204.0f, 119.77f, 220.11f, 128.0f),
                    PathNode.CurveTo(204.0f, 136.23f, 204.0f, 155.64f, 204.0f, 172.0f),
                    PathNode.CurveTo(204.0f, 196.8f, 202.65f, 212.0f, 176.0f, 212.0f),
                    PathNode.CurveTo(173.79086f, 212.0f, 172.0f, 213.79086f, 172.0f, 216.0f),
                    PathNode.CurveTo(172.0f, 218.20914f, 173.79086f, 220.0f, 176.0f, 220.0f),
                    PathNode.CurveTo(212.0f, 220.0f, 212.0f, 193.39f, 212.0f, 172.0f),
                    PathNode.CurveTo(212.0f, 147.2f, 213.35f, 132.0f, 240.0f, 132.0f),
                    PathNode.CurveTo(242.20914f, 132.0f, 244.0f, 130.20914f, 244.0f, 128.0f),
                    PathNode.CurveTo(244.0f, 125.79086f, 242.20914f, 124.0f, 240.0f, 124.0f),
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
        return _bracketsCurly!!
    }

private var _bracketsCurly: ImageVector? = null
