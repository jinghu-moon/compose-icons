package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ComputerTower: ImageVector
    get() {
        if (_computerTower != null) return _computerTower!!
        _computerTower = phosphorThinIcon(
            name = "ComputerTower",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(164.0f, 72.0f),
                    PathNode.CurveTo(164.0f, 74.20914f, 162.20914f, 76.0f, 160.0f, 76.0f),
                    PathNode.LineTo(96.0f, 76.0f),
                    PathNode.CurveTo(93.79086f, 76.0f, 92.0f, 74.20914f, 92.0f, 72.0f),
                    PathNode.CurveTo(92.0f, 69.79086f, 93.79086f, 68.0f, 96.0f, 68.0f),
                    PathNode.LineTo(160.0f, 68.0f),
                    PathNode.CurveTo(162.20914f, 68.0f, 164.0f, 69.79086f, 164.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 100.0f),
                    PathNode.LineTo(96.0f, 100.0f),
                    PathNode.CurveTo(93.79086f, 100.0f, 92.0f, 101.79086f, 92.0f, 104.0f),
                    PathNode.CurveTo(92.0f, 106.20914f, 93.79086f, 108.0f, 96.0f, 108.0f),
                    PathNode.LineTo(160.0f, 108.0f),
                    PathNode.CurveTo(162.20914f, 108.0f, 164.0f, 106.20914f, 164.0f, 104.0f),
                    PathNode.CurveTo(164.0f, 101.79086f, 162.20914f, 100.0f, 160.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 40.0f),
                    PathNode.LineTo(204.0f, 216.0f),
                    PathNode.CurveTo(204.0f, 222.62741f, 198.62741f, 228.0f, 192.0f, 228.0f),
                    PathNode.LineTo(64.0f, 228.0f),
                    PathNode.CurveTo(57.37258f, 228.0f, 52.0f, 222.62741f, 52.0f, 216.0f),
                    PathNode.LineTo(52.0f, 40.0f),
                    PathNode.CurveTo(52.0f, 33.37258f, 57.37258f, 28.0f, 64.0f, 28.0f),
                    PathNode.LineTo(192.0f, 28.0f),
                    PathNode.CurveTo(198.62741f, 28.0f, 204.0f, 33.37258f, 204.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 40.0f),
                    PathNode.CurveTo(196.0f, 37.79086f, 194.20914f, 36.0f, 192.0f, 36.0f),
                    PathNode.LineTo(64.0f, 36.0f),
                    PathNode.CurveTo(61.79086f, 36.0f, 60.0f, 37.79086f, 60.0f, 40.0f),
                    PathNode.LineTo(60.0f, 216.0f),
                    PathNode.CurveTo(60.0f, 218.20914f, 61.79086f, 220.0f, 64.0f, 220.0f),
                    PathNode.LineTo(192.0f, 220.0f),
                    PathNode.CurveTo(194.20914f, 220.0f, 196.0f, 218.20914f, 196.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 172.0f),
                    PathNode.CurveTo(123.58172f, 172.0f, 120.0f, 175.58173f, 120.0f, 180.0f),
                    PathNode.CurveTo(120.0f, 184.41827f, 123.58172f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(132.41827f, 188.0f, 136.0f, 184.41827f, 136.0f, 180.0f),
                    PathNode.CurveTo(136.0f, 175.58173f, 132.41827f, 172.0f, 128.0f, 172.0f),
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
        return _computerTower!!
    }

private var _computerTower: ImageVector? = null
