package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FirstAidKit: ImageVector
    get() {
        if (_firstAidKit != null) return _firstAidKit!!
        _firstAidKit = phosphorThinIcon(
            name = "FirstAidKit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 60.0f),
                    PathNode.LineTo(172.0f, 60.0f),
                    PathNode.LineTo(172.0f, 48.0f),
                    PathNode.CurveTo(172.0f, 36.954304f, 163.0457f, 28.0f, 152.0f, 28.0f),
                    PathNode.LineTo(104.0f, 28.0f),
                    PathNode.CurveTo(92.95431f, 28.0f, 84.0f, 36.954304f, 84.0f, 48.0f),
                    PathNode.LineTo(84.0f, 60.0f),
                    PathNode.LineTo(40.0f, 60.0f),
                    PathNode.CurveTo(33.37258f, 60.0f, 28.0f, 65.37258f, 28.0f, 72.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 206.62741f, 33.37258f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(222.62741f, 212.0f, 228.0f, 206.62741f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 72.0f),
                    PathNode.CurveTo(228.0f, 65.37258f, 222.62741f, 60.0f, 216.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 48.0f),
                    PathNode.CurveTo(92.0f, 41.37258f, 97.37258f, 36.0f, 104.0f, 36.0f),
                    PathNode.LineTo(152.0f, 36.0f),
                    PathNode.CurveTo(158.62741f, 36.0f, 164.0f, 41.37258f, 164.0f, 48.0f),
                    PathNode.LineTo(164.0f, 60.0f),
                    PathNode.LineTo(92.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 200.0f),
                    PathNode.CurveTo(220.0f, 202.20914f, 218.20914f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(37.79086f, 204.0f, 36.0f, 202.20914f, 36.0f, 200.0f),
                    PathNode.LineTo(36.0f, 72.0f),
                    PathNode.CurveTo(36.0f, 69.79086f, 37.79086f, 68.0f, 40.0f, 68.0f),
                    PathNode.LineTo(216.0f, 68.0f),
                    PathNode.CurveTo(218.20914f, 68.0f, 220.0f, 69.79086f, 220.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 136.0f),
                    PathNode.CurveTo(156.0f, 138.20914f, 154.20914f, 140.0f, 152.0f, 140.0f),
                    PathNode.LineTo(132.0f, 140.0f),
                    PathNode.LineTo(132.0f, 160.0f),
                    PathNode.CurveTo(132.0f, 162.20914f, 130.20914f, 164.0f, 128.0f, 164.0f),
                    PathNode.CurveTo(125.79086f, 164.0f, 124.0f, 162.20914f, 124.0f, 160.0f),
                    PathNode.LineTo(124.0f, 140.0f),
                    PathNode.LineTo(104.0f, 140.0f),
                    PathNode.CurveTo(101.79086f, 140.0f, 100.0f, 138.20914f, 100.0f, 136.0f),
                    PathNode.CurveTo(100.0f, 133.79086f, 101.79086f, 132.0f, 104.0f, 132.0f),
                    PathNode.LineTo(124.0f, 132.0f),
                    PathNode.LineTo(124.0f, 112.0f),
                    PathNode.CurveTo(124.0f, 109.79086f, 125.79086f, 108.0f, 128.0f, 108.0f),
                    PathNode.CurveTo(130.20914f, 108.0f, 132.0f, 109.79086f, 132.0f, 112.0f),
                    PathNode.LineTo(132.0f, 132.0f),
                    PathNode.LineTo(152.0f, 132.0f),
                    PathNode.CurveTo(154.20914f, 132.0f, 156.0f, 133.79086f, 156.0f, 136.0f),
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
        return _firstAidKit!!
    }

private var _firstAidKit: ImageVector? = null
