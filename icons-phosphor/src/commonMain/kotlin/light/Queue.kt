package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorLightIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(34.0f, 64.0f),
                    PathNode.CurveTo(34.0f, 60.68629f, 36.68629f, 58.0f, 40.0f, 58.0f),
                    PathNode.LineTo(216.0f, 58.0f),
                    PathNode.CurveTo(219.3137f, 58.0f, 222.0f, 60.68629f, 222.0f, 64.0f),
                    PathNode.CurveTo(222.0f, 67.313705f, 219.3137f, 70.0f, 216.0f, 70.0f),
                    PathNode.LineTo(40.0f, 70.0f),
                    PathNode.CurveTo(36.68629f, 70.0f, 34.0f, 67.313705f, 34.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 122.0f),
                    PathNode.LineTo(40.0f, 122.0f),
                    PathNode.CurveTo(36.68629f, 122.0f, 34.0f, 124.686295f, 34.0f, 128.0f),
                    PathNode.CurveTo(34.0f, 131.3137f, 36.68629f, 134.0f, 40.0f, 134.0f),
                    PathNode.LineTo(136.0f, 134.0f),
                    PathNode.CurveTo(139.3137f, 134.0f, 142.0f, 131.3137f, 142.0f, 128.0f),
                    PathNode.CurveTo(142.0f, 124.686295f, 139.3137f, 122.0f, 136.0f, 122.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 186.0f),
                    PathNode.LineTo(40.0f, 186.0f),
                    PathNode.CurveTo(36.68629f, 186.0f, 34.0f, 188.6863f, 34.0f, 192.0f),
                    PathNode.CurveTo(34.0f, 195.3137f, 36.68629f, 198.0f, 40.0f, 198.0f),
                    PathNode.LineTo(136.0f, 198.0f),
                    PathNode.CurveTo(139.3137f, 198.0f, 142.0f, 195.3137f, 142.0f, 192.0f),
                    PathNode.CurveTo(142.0f, 188.6863f, 139.3137f, 186.0f, 136.0f, 186.0f),
                    PathNode.Close,
                    PathNode.MoveTo(246.0f, 160.0f),
                    PathNode.CurveTo(246.0007f, 162.06946f, 244.93489f, 163.9932f, 243.18f, 165.09f),
                    PathNode.LineTo(179.18f, 205.09f),
                    PathNode.CurveTo(177.33008f, 206.2462f, 174.99838f, 206.30724f, 173.09052f, 205.24939f),
                    PathNode.CurveTo(171.18263f, 204.19154f, 169.99927f, 202.18152f, 170.0f, 200.0f),
                    PathNode.LineTo(170.0f, 120.0f),
                    PathNode.CurveTo(169.99927f, 117.81849f, 171.18263f, 115.808464f, 173.09052f, 114.75062f),
                    PathNode.CurveTo(174.99838f, 113.692764f, 177.33008f, 113.7538f, 179.18f, 114.91f),
                    PathNode.LineTo(243.18f, 154.91f),
                    PathNode.CurveTo(244.93489f, 156.0068f, 246.0007f, 157.93054f, 246.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.68f, 160.0f),
                    PathNode.LineTo(182.0f, 130.83f),
                    PathNode.LineTo(182.0f, 189.17f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _queue!!
    }

private var _queue: ImageVector? = null
