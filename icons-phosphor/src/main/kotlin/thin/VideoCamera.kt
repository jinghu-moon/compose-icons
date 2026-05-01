package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.VideoCamera: ImageVector
    get() {
        if (_videoCamera != null) return _videoCamera!!
        _videoCamera = phosphorThinIcon(
            name = "VideoCamera",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(249.89f, 76.47f),
                    PathNode.CurveTo(248.58812f, 75.77286f, 247.00804f, 75.84975f, 245.78f, 76.67f),
                    PathNode.LineTo(204.0f, 104.53f),
                    PathNode.LineTo(204.0f, 72.0f),
                    PathNode.CurveTo(204.0f, 65.37258f, 198.62741f, 60.0f, 192.0f, 60.0f),
                    PathNode.LineTo(32.0f, 60.0f),
                    PathNode.CurveTo(25.372583f, 60.0f, 20.0f, 65.37258f, 20.0f, 72.0f),
                    PathNode.LineTo(20.0f, 184.0f),
                    PathNode.CurveTo(20.0f, 190.62741f, 25.372583f, 196.0f, 32.0f, 196.0f),
                    PathNode.LineTo(192.0f, 196.0f),
                    PathNode.CurveTo(198.62741f, 196.0f, 204.0f, 190.62741f, 204.0f, 184.0f),
                    PathNode.LineTo(204.0f, 151.47f),
                    PathNode.LineTo(245.78f, 179.33f),
                    PathNode.CurveTo(247.00775f, 180.14912f, 248.58678f, 180.22563f, 249.88794f, 179.52902f),
                    PathNode.CurveTo(251.18912f, 178.83241f, 252.00096f, 177.4759f, 252.0f, 176.0f),
                    PathNode.LineTo(252.0f, 80.0f),
                    PathNode.CurveTo(252.00172f, 78.524185f, 251.19069f, 77.16732f, 249.89f, 76.47f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 184.0f),
                    PathNode.CurveTo(196.0f, 186.20914f, 194.20914f, 188.0f, 192.0f, 188.0f),
                    PathNode.LineTo(32.0f, 188.0f),
                    PathNode.CurveTo(29.790861f, 188.0f, 28.0f, 186.20914f, 28.0f, 184.0f),
                    PathNode.LineTo(28.0f, 72.0f),
                    PathNode.CurveTo(28.0f, 69.79086f, 29.790861f, 68.0f, 32.0f, 68.0f),
                    PathNode.LineTo(192.0f, 68.0f),
                    PathNode.CurveTo(194.20914f, 68.0f, 196.0f, 69.79086f, 196.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 168.53f),
                    PathNode.LineTo(204.0f, 141.86f),
                    PathNode.LineTo(204.0f, 114.14f),
                    PathNode.LineTo(244.0f, 87.47f),
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
        return _videoCamera!!
    }

private var _videoCamera: ImageVector? = null
