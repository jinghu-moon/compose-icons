package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = phosphorFillIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 16.0f),
                    PathNode.CurveTo(70.65f, 16.0f, 24.0f, 60.86f, 24.0f, 116.0f),
                    PathNode.CurveTo(24.0f, 150.1f, 42.27f, 182.0f, 72.0f, 200.28f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.CurveTo(72.0f, 224.83656f, 79.163445f, 232.0f, 88.0f, 232.0f),
                    PathNode.LineTo(96.0f, 232.0f),
                    PathNode.CurveTo(98.20914f, 232.0f, 100.0f, 230.20914f, 100.0f, 228.0f),
                    PathNode.LineTo(100.0f, 200.27f),
                    PathNode.CurveTo(99.94234f, 195.987f, 103.20232f, 192.38661f, 107.47f, 192.02f),
                    PathNode.CurveTo(109.68197f, 191.87312f, 111.85571f, 192.65068f, 113.47269f, 194.16719f),
                    PathNode.CurveTo(115.08966f, 195.6837f, 116.00487f, 197.80316f, 116.0f, 200.02f),
                    PathNode.LineTo(116.0f, 228.02f),
                    PathNode.CurveTo(116.0f, 230.22914f, 117.79086f, 232.02f, 120.0f, 232.02f),
                    PathNode.LineTo(136.0f, 232.02f),
                    PathNode.CurveTo(138.20914f, 232.02f, 140.0f, 230.22914f, 140.0f, 228.02f),
                    PathNode.LineTo(140.0f, 200.27f),
                    PathNode.CurveTo(139.94234f, 195.987f, 143.20233f, 192.38661f, 147.47f, 192.02f),
                    PathNode.CurveTo(149.68199f, 191.87312f, 151.85571f, 192.65068f, 153.47269f, 194.16719f),
                    PathNode.CurveTo(155.08966f, 195.6837f, 156.00487f, 197.80316f, 156.0f, 200.02f),
                    PathNode.LineTo(156.0f, 228.02f),
                    PathNode.CurveTo(156.0f, 230.22914f, 157.79086f, 232.02f, 160.0f, 232.02f),
                    PathNode.LineTo(168.0f, 232.02f),
                    PathNode.CurveTo(176.83656f, 232.02f, 184.0f, 224.85657f, 184.0f, 216.02f),
                    PathNode.LineTo(184.0f, 200.28f),
                    PathNode.CurveTo(213.73f, 182.0f, 232.0f, 150.1f, 232.0f, 116.0f),
                    PathNode.CurveTo(232.0f, 60.86f, 185.35f, 16.0f, 128.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 152.0f),
                    PathNode.CurveTo(80.95431f, 152.0f, 72.0f, 143.0457f, 72.0f, 132.0f),
                    PathNode.CurveTo(72.0f, 120.95431f, 80.95431f, 112.0f, 92.0f, 112.0f),
                    PathNode.CurveTo(103.04569f, 112.0f, 112.0f, 120.95431f, 112.0f, 132.0f),
                    PathNode.CurveTo(112.0f, 143.0457f, 103.04569f, 152.0f, 92.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 152.0f),
                    PathNode.CurveTo(152.9543f, 152.0f, 144.0f, 143.0457f, 144.0f, 132.0f),
                    PathNode.CurveTo(144.0f, 120.95431f, 152.9543f, 112.0f, 164.0f, 112.0f),
                    PathNode.CurveTo(175.0457f, 112.0f, 184.0f, 120.95431f, 184.0f, 132.0f),
                    PathNode.CurveTo(184.0f, 143.0457f, 175.0457f, 152.0f, 164.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _skull!!
    }

private var _skull: ImageVector? = null
