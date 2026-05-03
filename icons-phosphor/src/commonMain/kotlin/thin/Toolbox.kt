package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Toolbox: ImageVector
    get() {
        if (_toolbox != null) return _toolbox!!
        _toolbox = phosphorThinIcon(
            name = "Toolbox",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 68.0f),
                    PathNode.LineTo(172.0f, 68.0f),
                    PathNode.LineTo(172.0f, 56.0f),
                    PathNode.CurveTo(172.0f, 44.954304f, 163.0457f, 36.0f, 152.0f, 36.0f),
                    PathNode.LineTo(104.0f, 36.0f),
                    PathNode.CurveTo(92.95431f, 36.0f, 84.0f, 44.954304f, 84.0f, 56.0f),
                    PathNode.LineTo(84.0f, 68.0f),
                    PathNode.LineTo(32.0f, 68.0f),
                    PathNode.CurveTo(25.372583f, 68.0f, 20.0f, 73.37258f, 20.0f, 80.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 198.62741f, 25.372583f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(230.62741f, 204.0f, 236.0f, 198.62741f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 73.37258f, 230.62741f, 68.0f, 224.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 56.0f),
                    PathNode.CurveTo(92.0f, 49.37258f, 97.37258f, 44.0f, 104.0f, 44.0f),
                    PathNode.LineTo(152.0f, 44.0f),
                    PathNode.CurveTo(158.62741f, 44.0f, 164.0f, 49.37258f, 164.0f, 56.0f),
                    PathNode.LineTo(164.0f, 68.0f),
                    PathNode.LineTo(92.0f, 68.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 76.0f),
                    PathNode.LineTo(224.0f, 76.0f),
                    PathNode.CurveTo(226.20914f, 76.0f, 228.0f, 77.79086f, 228.0f, 80.0f),
                    PathNode.LineTo(228.0f, 116.0f),
                    PathNode.LineTo(188.0f, 116.0f),
                    PathNode.LineTo(188.0f, 104.0f),
                    PathNode.CurveTo(188.0f, 101.79086f, 186.20914f, 100.0f, 184.0f, 100.0f),
                    PathNode.CurveTo(181.79086f, 100.0f, 180.0f, 101.79086f, 180.0f, 104.0f),
                    PathNode.LineTo(180.0f, 116.0f),
                    PathNode.LineTo(76.0f, 116.0f),
                    PathNode.LineTo(76.0f, 104.0f),
                    PathNode.CurveTo(76.0f, 101.79086f, 74.20914f, 100.0f, 72.0f, 100.0f),
                    PathNode.CurveTo(69.79086f, 100.0f, 68.0f, 101.79086f, 68.0f, 104.0f),
                    PathNode.LineTo(68.0f, 116.0f),
                    PathNode.LineTo(28.0f, 116.0f),
                    PathNode.LineTo(28.0f, 80.0f),
                    PathNode.CurveTo(28.0f, 77.79086f, 29.790861f, 76.0f, 32.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 196.0f),
                    PathNode.LineTo(32.0f, 196.0f),
                    PathNode.CurveTo(29.790861f, 196.0f, 28.0f, 194.20914f, 28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 124.0f),
                    PathNode.LineTo(68.0f, 124.0f),
                    PathNode.LineTo(68.0f, 136.0f),
                    PathNode.CurveTo(68.0f, 138.20914f, 69.79086f, 140.0f, 72.0f, 140.0f),
                    PathNode.CurveTo(74.20914f, 140.0f, 76.0f, 138.20914f, 76.0f, 136.0f),
                    PathNode.LineTo(76.0f, 124.0f),
                    PathNode.LineTo(180.0f, 124.0f),
                    PathNode.LineTo(180.0f, 136.0f),
                    PathNode.CurveTo(180.0f, 138.20914f, 181.79086f, 140.0f, 184.0f, 140.0f),
                    PathNode.CurveTo(186.20914f, 140.0f, 188.0f, 138.20914f, 188.0f, 136.0f),
                    PathNode.LineTo(188.0f, 124.0f),
                    PathNode.LineTo(228.0f, 124.0f),
                    PathNode.LineTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 194.20914f, 226.20914f, 196.0f, 224.0f, 196.0f),
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
        return _toolbox!!
    }

private var _toolbox: ImageVector? = null
