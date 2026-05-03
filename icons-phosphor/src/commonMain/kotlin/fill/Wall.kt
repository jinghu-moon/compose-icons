package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Wall: ImageVector
    get() {
        if (_wall != null) return _wall!!
        _wall = phosphorFillIcon(
            name = "Wall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 88.0f),
                    PathNode.CurveTo(232.0f, 90.20914f, 230.20914f, 92.0f, 228.0f, 92.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.LineTo(136.0f, 52.0f),
                    PathNode.CurveTo(136.0f, 49.79086f, 137.79086f, 48.0f, 140.0f, 48.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(228.41827f, 48.0f, 232.0f, 51.581722f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 108.0f),
                    PathNode.LineTo(184.0f, 108.0f),
                    PathNode.LineTo(184.0f, 152.0f),
                    PathNode.LineTo(228.0f, 152.0f),
                    PathNode.CurveTo(230.20914f, 152.0f, 232.0f, 150.20914f, 232.0f, 148.0f),
                    PathNode.LineTo(232.0f, 112.0f),
                    PathNode.CurveTo(232.0f, 109.79086f, 230.20914f, 108.0f, 228.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 152.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.LineTo(168.0f, 108.0f),
                    PathNode.LineTo(88.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 152.0f),
                    PathNode.LineTo(72.0f, 152.0f),
                    PathNode.LineTo(72.0f, 108.0f),
                    PathNode.LineTo(28.0f, 108.0f),
                    PathNode.CurveTo(25.790861f, 108.0f, 24.0f, 109.79086f, 24.0f, 112.0f),
                    PathNode.LineTo(24.0f, 148.0f),
                    PathNode.CurveTo(24.0f, 150.20914f, 25.790861f, 152.0f, 28.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 168.0f),
                    PathNode.LineTo(136.0f, 168.0f),
                    PathNode.LineTo(136.0f, 204.0f),
                    PathNode.CurveTo(136.0f, 206.20914f, 137.79086f, 208.0f, 140.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(228.41827f, 208.0f, 232.0f, 204.41827f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 172.0f),
                    PathNode.CurveTo(232.0f, 169.79086f, 230.20914f, 168.0f, 228.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(28.0f, 92.0f),
                    PathNode.LineTo(120.0f, 92.0f),
                    PathNode.LineTo(120.0f, 52.0f),
                    PathNode.CurveTo(120.0f, 49.79086f, 118.20914f, 48.0f, 116.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(27.581722f, 48.0f, 24.0f, 51.581722f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 88.0f),
                    PathNode.CurveTo(24.0f, 90.20914f, 25.790861f, 92.0f, 28.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(24.0f, 172.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 204.41827f, 27.581722f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(116.0f, 208.0f),
                    PathNode.CurveTo(118.20914f, 208.0f, 120.0f, 206.20914f, 120.0f, 204.0f),
                    PathNode.LineTo(120.0f, 168.0f),
                    PathNode.LineTo(28.0f, 168.0f),
                    PathNode.CurveTo(25.790861f, 168.0f, 24.0f, 169.79086f, 24.0f, 172.0f),
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
        return _wall!!
    }

private var _wall: ImageVector? = null
