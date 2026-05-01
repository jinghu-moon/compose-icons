package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Notification: ImageVector
    get() {
        if (_notification != null) return _notification!!
        _notification = phosphorThinIcon(
            name = "Notification",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 128.0f),
                    PathNode.LineTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 214.62741f, 206.62741f, 220.0f, 200.0f, 220.0f),
                    PathNode.LineTo(48.0f, 220.0f),
                    PathNode.CurveTo(41.37258f, 220.0f, 36.0f, 214.62741f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 56.0f),
                    PathNode.CurveTo(36.0f, 49.37258f, 41.37258f, 44.0f, 48.0f, 44.0f),
                    PathNode.LineTo(128.0f, 44.0f),
                    PathNode.CurveTo(130.20914f, 44.0f, 132.0f, 45.79086f, 132.0f, 48.0f),
                    PathNode.CurveTo(132.0f, 50.20914f, 130.20914f, 52.0f, 128.0f, 52.0f),
                    PathNode.LineTo(48.0f, 52.0f),
                    PathNode.CurveTo(45.79086f, 52.0f, 44.0f, 53.79086f, 44.0f, 56.0f),
                    PathNode.LineTo(44.0f, 208.0f),
                    PathNode.CurveTo(44.0f, 210.20914f, 45.79086f, 212.0f, 48.0f, 212.0f),
                    PathNode.LineTo(200.0f, 212.0f),
                    PathNode.CurveTo(202.20914f, 212.0f, 204.0f, 210.20914f, 204.0f, 208.0f),
                    PathNode.LineTo(204.0f, 128.0f),
                    PathNode.CurveTo(204.0f, 125.79086f, 205.79086f, 124.0f, 208.0f, 124.0f),
                    PathNode.CurveTo(210.20914f, 124.0f, 212.0f, 125.79086f, 212.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 60.0f),
                    PathNode.CurveTo(228.0f, 77.67311f, 213.67311f, 92.0f, 196.0f, 92.0f),
                    PathNode.CurveTo(178.32689f, 92.0f, 164.0f, 77.67311f, 164.0f, 60.0f),
                    PathNode.CurveTo(164.0f, 42.32689f, 178.32689f, 28.0f, 196.0f, 28.0f),
                    PathNode.CurveTo(213.67311f, 28.0f, 228.0f, 42.32689f, 228.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 60.0f),
                    PathNode.CurveTo(220.0f, 46.745167f, 209.25484f, 36.0f, 196.0f, 36.0f),
                    PathNode.CurveTo(182.74516f, 36.0f, 172.0f, 46.745167f, 172.0f, 60.0f),
                    PathNode.CurveTo(172.0f, 73.25484f, 182.74516f, 84.0f, 196.0f, 84.0f),
                    PathNode.CurveTo(209.25484f, 84.0f, 220.0f, 73.25484f, 220.0f, 60.0f),
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
        return _notification!!
    }

private var _notification: ImageVector? = null
