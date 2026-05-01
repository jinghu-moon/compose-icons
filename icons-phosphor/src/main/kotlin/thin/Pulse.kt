package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorThinIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 128.0f),
                    PathNode.CurveTo(236.0f, 130.20914f, 234.20914f, 132.0f, 232.0f, 132.0f),
                    PathNode.LineTo(202.47f, 132.0f),
                    PathNode.LineTo(163.58f, 209.79f),
                    PathNode.CurveTo(162.90175f, 211.14543f, 161.51566f, 212.00108f, 160.0f, 212.0f),
                    PathNode.LineTo(159.8f, 212.0f),
                    PathNode.CurveTo(158.21213f, 211.91995f, 156.8224f, 210.9071f, 156.26f, 209.42f),
                    PathNode.LineTo(95.67f, 50.42f),
                    PathNode.LineTo(59.67f, 129.7f),
                    PathNode.CurveTo(59.00346f, 131.11995f, 57.568485f, 132.01924f, 56.0f, 132.0f),
                    PathNode.LineTo(24.0f, 132.0f),
                    PathNode.CurveTo(21.790861f, 132.0f, 20.0f, 130.20914f, 20.0f, 128.0f),
                    PathNode.CurveTo(20.0f, 125.79086f, 21.790861f, 124.0f, 24.0f, 124.0f),
                    PathNode.LineTo(53.42f, 124.0f),
                    PathNode.LineTo(92.36f, 38.35f),
                    PathNode.CurveTo(93.027504f, 36.88015f, 94.51311f, 35.95561f, 96.12664f, 36.005894f),
                    PathNode.CurveTo(97.74017f, 36.05618f, 99.16532f, 37.071438f, 99.74f, 38.58f),
                    PathNode.LineTo(160.5f, 198.06f),
                    PathNode.LineTo(196.42f, 126.21f),
                    PathNode.CurveTo(197.09825f, 124.85457f, 198.48434f, 123.99892f, 200.0f, 124.0f),
                    PathNode.LineTo(232.0f, 124.0f),
                    PathNode.CurveTo(234.20914f, 124.0f, 236.0f, 125.79086f, 236.0f, 128.0f),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
