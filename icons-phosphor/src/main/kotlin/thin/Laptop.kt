package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Laptop: ImageVector
    get() {
        if (_laptop != null) return _laptop!!
        _laptop = phosphorThinIcon(
            name = "Laptop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 172.0f),
                    PathNode.LineTo(220.0f, 172.0f),
                    PathNode.LineTo(220.0f, 72.0f),
                    PathNode.CurveTo(220.0f, 60.954304f, 211.0457f, 52.0f, 200.0f, 52.0f),
                    PathNode.LineTo(56.0f, 52.0f),
                    PathNode.CurveTo(44.954304f, 52.0f, 36.0f, 60.954304f, 36.0f, 72.0f),
                    PathNode.LineTo(36.0f, 172.0f),
                    PathNode.LineTo(24.0f, 172.0f),
                    PathNode.CurveTo(21.790861f, 172.0f, 20.0f, 173.79086f, 20.0f, 176.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 203.0457f, 28.954306f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(227.0457f, 212.0f, 236.0f, 203.0457f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 176.0f),
                    PathNode.CurveTo(236.0f, 173.79086f, 234.20914f, 172.0f, 232.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 72.0f),
                    PathNode.CurveTo(44.0f, 65.37258f, 49.37258f, 60.0f, 56.0f, 60.0f),
                    PathNode.LineTo(200.0f, 60.0f),
                    PathNode.CurveTo(206.62741f, 60.0f, 212.0f, 65.37258f, 212.0f, 72.0f),
                    PathNode.LineTo(212.0f, 172.0f),
                    PathNode.LineTo(44.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 192.0f),
                    PathNode.CurveTo(228.0f, 198.62741f, 222.62741f, 204.0f, 216.0f, 204.0f),
                    PathNode.LineTo(40.0f, 204.0f),
                    PathNode.CurveTo(33.37258f, 204.0f, 28.0f, 198.62741f, 28.0f, 192.0f),
                    PathNode.LineTo(28.0f, 180.0f),
                    PathNode.LineTo(228.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 88.0f),
                    PathNode.CurveTo(148.0f, 90.20914f, 146.20914f, 92.0f, 144.0f, 92.0f),
                    PathNode.LineTo(112.0f, 92.0f),
                    PathNode.CurveTo(109.79086f, 92.0f, 108.0f, 90.20914f, 108.0f, 88.0f),
                    PathNode.CurveTo(108.0f, 85.79086f, 109.79086f, 84.0f, 112.0f, 84.0f),
                    PathNode.LineTo(144.0f, 84.0f),
                    PathNode.CurveTo(146.20914f, 84.0f, 148.0f, 85.79086f, 148.0f, 88.0f),
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
        return _laptop!!
    }

private var _laptop: ImageVector? = null
