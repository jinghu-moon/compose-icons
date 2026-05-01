package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Presentation: ImageVector
    get() {
        if (_presentation != null) return _presentation!!
        _presentation = phosphorThinIcon(
            name = "Presentation",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 44.0f),
                    PathNode.LineTo(132.0f, 44.0f),
                    PathNode.LineTo(132.0f, 24.0f),
                    PathNode.CurveTo(132.0f, 21.790861f, 130.20914f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(125.79086f, 20.0f, 124.0f, 21.790861f, 124.0f, 24.0f),
                    PathNode.LineTo(124.0f, 44.0f),
                    PathNode.LineTo(40.0f, 44.0f),
                    PathNode.CurveTo(33.37258f, 44.0f, 28.0f, 49.37258f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 176.0f),
                    PathNode.CurveTo(28.0f, 182.62741f, 33.37258f, 188.0f, 40.0f, 188.0f),
                    PathNode.LineTo(87.68f, 188.0f),
                    PathNode.LineTo(60.88f, 221.5f),
                    PathNode.CurveTo(59.932667f, 222.60942f, 59.66445f, 224.1466f, 60.1801f, 225.5113f),
                    PathNode.CurveTo(60.695744f, 226.87598f, 61.91346f, 227.85173f, 63.357735f, 228.05746f),
                    PathNode.CurveTo(64.80201f, 228.26324f, 66.24376f, 227.6664f, 67.12f, 226.5f),
                    PathNode.LineTo(97.92f, 188.0f),
                    PathNode.LineTo(158.08f, 188.0f),
                    PathNode.LineTo(188.88f, 226.5f),
                    PathNode.CurveTo(190.28296f, 228.14302f, 192.73709f, 228.37503f, 194.42313f, 227.02405f),
                    PathNode.CurveTo(196.10915f, 225.67308f, 196.41768f, 223.22739f, 195.12f, 221.5f),
                    PathNode.LineTo(168.32f, 188.0f),
                    PathNode.LineTo(216.0f, 188.0f),
                    PathNode.CurveTo(222.62741f, 188.0f, 228.0f, 182.62741f, 228.0f, 176.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 49.37258f, 222.62741f, 44.0f, 216.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 176.0f),
                    PathNode.CurveTo(220.0f, 178.20914f, 218.20914f, 180.0f, 216.0f, 180.0f),
                    PathNode.LineTo(40.0f, 180.0f),
                    PathNode.CurveTo(37.79086f, 180.0f, 36.0f, 178.20914f, 36.0f, 176.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 53.79086f, 37.79086f, 52.0f, 40.0f, 52.0f),
                    PathNode.LineTo(216.0f, 52.0f),
                    PathNode.CurveTo(218.20914f, 52.0f, 220.0f, 53.79086f, 220.0f, 56.0f),
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
        return _presentation!!
    }

private var _presentation: ImageVector? = null
