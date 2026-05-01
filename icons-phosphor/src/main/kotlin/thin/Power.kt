package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Power: ImageVector
    get() {
        if (_power != null) return _power!!
        _power = phosphorThinIcon(
            name = "Power",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(124.0f, 128.0f),
                    PathNode.LineTo(124.0f, 48.0f),
                    PathNode.CurveTo(124.0f, 45.79086f, 125.79086f, 44.0f, 128.0f, 44.0f),
                    PathNode.CurveTo(130.20914f, 44.0f, 132.0f, 45.79086f, 132.0f, 48.0f),
                    PathNode.LineTo(132.0f, 128.0f),
                    PathNode.CurveTo(132.0f, 130.20914f, 130.20914f, 132.0f, 128.0f, 132.0f),
                    PathNode.CurveTo(125.79086f, 132.0f, 124.0f, 130.20914f, 124.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(178.18f, 52.65f),
                    PathNode.CurveTo(176.98318f, 51.801857f, 175.41814f, 51.676834f, 174.10185f, 52.32423f),
                    PathNode.CurveTo(172.78557f, 52.97162f, 171.92923f, 54.287556f, 171.87042f, 55.75325f),
                    PathNode.CurveTo(171.81163f, 57.218945f, 172.5598f, 58.59925f, 173.82f, 59.35f),
                    PathNode.CurveTo(198.08f, 75.17f, 212.0f, 100.2f, 212.0f, 128.0f),
                    PathNode.CurveTo(212.0f, 174.39192f, 174.39192f, 212.0f, 128.0f, 212.0f),
                    PathNode.CurveTo(81.60808f, 212.0f, 44.0f, 174.39192f, 44.0f, 128.0f),
                    PathNode.CurveTo(44.0f, 100.2f, 57.92f, 75.17f, 82.18f, 59.35f),
                    PathNode.CurveTo(83.932144f, 58.10832f, 84.39115f, 55.704647f, 83.21984f, 53.9047f),
                    PathNode.CurveTo(82.04853f, 52.104755f, 79.664925f, 51.550903f, 77.82f, 52.65f),
                    PathNode.CurveTo(51.24f, 70.0f, 36.0f, 97.44f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 178.8102f, 77.18981f, 220.0f, 128.0f, 220.0f),
                    PathNode.CurveTo(178.8102f, 220.0f, 220.0f, 178.8102f, 220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 97.44f, 204.76f, 70.0f, 178.18f, 52.65f),
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
        return _power!!
    }

private var _power: ImageVector? = null
