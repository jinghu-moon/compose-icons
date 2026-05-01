package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorThinIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 52.0f),
                    PathNode.LineTo(32.0f, 52.0f),
                    PathNode.CurveTo(29.790861f, 52.0f, 28.0f, 53.79086f, 28.0f, 56.0f),
                    PathNode.LineTo(28.0f, 200.0f),
                    PathNode.CurveTo(28.0f, 202.20914f, 29.790861f, 204.0f, 32.0f, 204.0f),
                    PathNode.LineTo(224.0f, 204.0f),
                    PathNode.CurveTo(226.20914f, 204.0f, 228.0f, 202.20914f, 228.0f, 200.0f),
                    PathNode.LineTo(228.0f, 56.0f),
                    PathNode.CurveTo(228.0f, 53.79086f, 226.20914f, 52.0f, 224.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 148.0f),
                    PathNode.LineTo(84.0f, 108.0f),
                    PathNode.LineTo(172.0f, 108.0f),
                    PathNode.LineTo(172.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 148.0f),
                    PathNode.LineTo(36.0f, 108.0f),
                    PathNode.LineTo(76.0f, 108.0f),
                    PathNode.LineTo(76.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 108.0f),
                    PathNode.LineTo(220.0f, 108.0f),
                    PathNode.LineTo(220.0f, 148.0f),
                    PathNode.LineTo(180.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 100.0f),
                    PathNode.LineTo(132.0f, 100.0f),
                    PathNode.LineTo(132.0f, 60.0f),
                    PathNode.LineTo(220.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(124.0f, 60.0f),
                    PathNode.LineTo(124.0f, 100.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.LineTo(36.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 156.0f),
                    PathNode.LineTo(124.0f, 156.0f),
                    PathNode.LineTo(124.0f, 196.0f),
                    PathNode.LineTo(36.0f, 196.0f),
                    PathNode.Close,
                    PathNode.MoveTo(132.0f, 196.0f),
                    PathNode.LineTo(132.0f, 156.0f),
                    PathNode.LineTo(220.0f, 156.0f),
                    PathNode.LineTo(220.0f, 196.0f),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
