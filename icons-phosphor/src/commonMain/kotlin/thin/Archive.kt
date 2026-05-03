package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Archive: ImageVector
    get() {
        if (_archive != null) return _archive!!
        _archive = phosphorThinIcon(
            name = "Archive",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(25.372583f, 52.0f, 20.0f, 57.37258f, 20.0f, 64.0f),
                    PathNode.LineTo(20.0f, 88.0f),
                    PathNode.CurveTo(20.0f, 94.62742f, 25.372583f, 100.0f, 32.0f, 100.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.LineTo(36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 198.62741f, 41.37258f, 204.0f, 48.0f, 204.0f),
                    PathNode.LineTo(208.0f, 204.0f),
                    PathNode.CurveTo(214.62741f, 204.0f, 220.0f, 198.62741f, 220.0f, 192.0f),
                    PathNode.LineTo(220.0f, 100.0f),
                    PathNode.LineTo(224.0f, 100.0f),
                    PathNode.CurveTo(230.62741f, 100.0f, 236.0f, 94.62742f, 236.0f, 88.0f),
                    PathNode.LineTo(236.0f, 64.0f),
                    PathNode.CurveTo(236.0f, 57.37258f, 230.62741f, 52.0f, 224.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 192.0f),
                    PathNode.CurveTo(212.0f, 194.20914f, 210.20914f, 196.0f, 208.0f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(45.79086f, 196.0f, 44.0f, 194.20914f, 44.0f, 192.0f),
                    PathNode.LineTo(44.0f, 100.0f),
                    PathNode.LineTo(212.0f, 100.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 88.0f),
                    PathNode.CurveTo(228.0f, 90.20914f, 226.20914f, 92.0f, 224.0f, 92.0f),
                    PathNode.LineTo(32.0f, 92.0f),
                    PathNode.CurveTo(29.790861f, 92.0f, 28.0f, 90.20914f, 28.0f, 88.0f),
                    PathNode.LineTo(28.0f, 64.0f),
                    PathNode.CurveTo(28.0f, 61.79086f, 29.790861f, 60.0f, 32.0f, 60.0f),
                    PathNode.LineTo(224.0f, 60.0f),
                    PathNode.CurveTo(226.20914f, 60.0f, 228.0f, 61.79086f, 228.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 136.0f),
                    PathNode.CurveTo(100.0f, 133.79086f, 101.79086f, 132.0f, 104.0f, 132.0f),
                    PathNode.LineTo(152.0f, 132.0f),
                    PathNode.CurveTo(154.20914f, 132.0f, 156.0f, 133.79086f, 156.0f, 136.0f),
                    PathNode.CurveTo(156.0f, 138.20914f, 154.20914f, 140.0f, 152.0f, 140.0f),
                    PathNode.LineTo(104.0f, 140.0f),
                    PathNode.CurveTo(101.79086f, 140.0f, 100.0f, 138.20914f, 100.0f, 136.0f),
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
        return _archive!!
    }

private var _archive: ImageVector? = null
