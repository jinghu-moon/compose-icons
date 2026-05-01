package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Keyboard: ImageVector
    get() {
        if (_keyboard != null) return _keyboard!!
        _keyboard = phosphorThinIcon(
            name = "Keyboard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(25.372583f, 52.0f, 20.0f, 57.37258f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 198.62741f, 25.372583f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(230.62741f, 204.0f, 236.0f, 198.62741f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 57.37258f, 230.62741f, 52.0f, 224.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 194.20914f, 226.20914f, 196.0f, 224.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(29.790861f, 196.0f, 28.0f, 194.20914f, 28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 61.79086f, 29.790861f, 60.0f, 32.0f, 60.0f),
                    PathNode.LineTo(224.0f, 60.0f),
                    PathNode.CurveTo(226.20914f, 60.0f, 228.0f, 61.79086f, 228.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 130.20914f, 202.20914f, 132.0f, 200.0f, 132.0f),
                    PathNode.LineTo(56.0f, 132.0f),
                    PathNode.CurveTo(53.79086f, 132.0f, 52.0f, 130.20914f, 52.0f, 128.0f),
                    PathNode.CurveTo(52.0f, 125.79086f, 53.79086f, 124.0f, 56.0f, 124.0f),
                    PathNode.LineTo(200.0f, 124.0f),
                    PathNode.CurveTo(202.20914f, 124.0f, 204.0f, 125.79086f, 204.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 96.0f),
                    PathNode.CurveTo(204.0f, 98.20914f, 202.20914f, 100.0f, 200.0f, 100.0f),
                    PathNode.LineTo(56.0f, 100.0f),
                    PathNode.CurveTo(53.79086f, 100.0f, 52.0f, 98.20914f, 52.0f, 96.0f),
                    PathNode.CurveTo(52.0f, 93.79086f, 53.79086f, 92.0f, 56.0f, 92.0f),
                    PathNode.LineTo(200.0f, 92.0f),
                    PathNode.CurveTo(202.20914f, 92.0f, 204.0f, 93.79086f, 204.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 160.0f),
                    PathNode.CurveTo(68.0f, 162.20914f, 66.20914f, 164.0f, 64.0f, 164.0f),
                    PathNode.LineTo(56.0f, 164.0f),
                    PathNode.CurveTo(53.79086f, 164.0f, 52.0f, 162.20914f, 52.0f, 160.0f),
                    PathNode.CurveTo(52.0f, 157.79086f, 53.79086f, 156.0f, 56.0f, 156.0f),
                    PathNode.LineTo(64.0f, 156.0f),
                    PathNode.CurveTo(66.20914f, 156.0f, 68.0f, 157.79086f, 68.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 160.0f),
                    PathNode.CurveTo(164.0f, 162.20914f, 162.20914f, 164.0f, 160.0f, 164.0f),
                    PathNode.LineTo(96.0f, 164.0f),
                    PathNode.CurveTo(93.79086f, 164.0f, 92.0f, 162.20914f, 92.0f, 160.0f),
                    PathNode.CurveTo(92.0f, 157.79086f, 93.79086f, 156.0f, 96.0f, 156.0f),
                    PathNode.LineTo(160.0f, 156.0f),
                    PathNode.CurveTo(162.20914f, 156.0f, 164.0f, 157.79086f, 164.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 160.0f),
                    PathNode.CurveTo(204.0f, 162.20914f, 202.20914f, 164.0f, 200.0f, 164.0f),
                    PathNode.LineTo(192.0f, 164.0f),
                    PathNode.CurveTo(189.79086f, 164.0f, 188.0f, 162.20914f, 188.0f, 160.0f),
                    PathNode.CurveTo(188.0f, 157.79086f, 189.79086f, 156.0f, 192.0f, 156.0f),
                    PathNode.LineTo(200.0f, 156.0f),
                    PathNode.CurveTo(202.20914f, 156.0f, 204.0f, 157.79086f, 204.0f, 160.0f),
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
        return _keyboard!!
    }

private var _keyboard: ImageVector? = null
