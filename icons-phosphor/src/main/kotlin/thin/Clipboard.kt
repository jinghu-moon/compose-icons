package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Clipboard: ImageVector
    get() {
        if (_clipboard != null) return _clipboard!!
        _clipboard = phosphorThinIcon(
            name = "Clipboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 36.0f),
                    PathNode.LineTo(161.92f, 36.0f),
                    PathNode.CurveTo(153.5613f, 25.883266f, 141.12312f, 20.025587f, 128.0f, 20.025587f),
                    PathNode.CurveTo(114.87688f, 20.025587f, 102.438705f, 25.883266f, 94.08f, 36.0f),
                    PathNode.LineTo(56.0f, 36.0f),
                    PathNode.CurveTo(49.37258f, 36.0f, 44.0f, 41.37258f, 44.0f, 48.0f),
                    PathNode.LineTo(44.0f, 216.0f),
                    PathNode.CurveTo(44.0f, 222.62741f, 49.37258f, 228.0f, 56.0f, 228.0f),
                    PathNode.LineTo(200.0f, 228.0f),
                    PathNode.CurveTo(206.62741f, 228.0f, 212.0f, 222.62741f, 212.0f, 216.0f),
                    PathNode.LineTo(212.0f, 48.0f),
                    PathNode.CurveTo(212.0f, 41.37258f, 206.62741f, 36.0f, 200.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(147.88223f, 28.0f, 164.0f, 44.11775f, 164.0f, 64.0f),
                    PathNode.LineTo(164.0f, 68.0f),
                    PathNode.LineTo(92.0f, 68.0f),
                    PathNode.LineTo(92.0f, 64.0f),
                    PathNode.CurveTo(92.0f, 44.11775f, 108.11775f, 28.0f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 218.20914f, 202.20914f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(56.0f, 220.0f),
                    PathNode.CurveTo(53.79086f, 220.0f, 52.0f, 218.20914f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 48.0f),
                    PathNode.CurveTo(52.0f, 45.79086f, 53.79086f, 44.0f, 56.0f, 44.0f),
                    PathNode.LineTo(88.83f, 44.0f),
                    PathNode.CurveTo(85.651535f, 50.18737f, 83.99566f, 57.04398f, 84.0f, 64.0f),
                    PathNode.LineTo(84.0f, 72.0f),
                    PathNode.CurveTo(84.0f, 74.20914f, 85.79086f, 76.0f, 88.0f, 76.0f),
                    PathNode.LineTo(168.0f, 76.0f),
                    PathNode.CurveTo(170.20914f, 76.0f, 172.0f, 74.20914f, 172.0f, 72.0f),
                    PathNode.LineTo(172.0f, 64.0f),
                    PathNode.CurveTo(172.00433f, 57.04398f, 170.34846f, 50.18737f, 167.17f, 44.0f),
                    PathNode.LineTo(200.0f, 44.0f),
                    PathNode.CurveTo(202.20914f, 44.0f, 204.0f, 45.79086f, 204.0f, 48.0f),
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
        return _clipboard!!
    }

private var _clipboard: ImageVector? = null
