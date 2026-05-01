package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Diamond: ImageVector
    get() {
        if (_diamond != null) return _diamond!!
        _diamond = phosphorBoldIcon(
            name = "Diamond",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(238.16f, 113.89f),
                    PathNode.LineTo(142.1f, 17.83f),
                    PathNode.CurveTo(134.29808f, 10.068898f, 121.69192f, 10.068898f, 113.89f, 17.83f),
                    PathNode.LineTo(17.89f, 113.89f),
                    PathNode.CurveTo(10.122265f, 121.69308f, 10.122265f, 134.30692f, 17.89f, 142.11f),
                    PathNode.LineTo(113.94f, 238.17f),
                    PathNode.LineTo(113.94f, 238.17f),
                    PathNode.CurveTo(121.74191f, 245.9311f, 134.34808f, 245.9311f, 142.15f, 238.17f),
                    PathNode.LineTo(238.15f, 142.11f),
                    PathNode.CurveTo(245.91774f, 134.30692f, 245.91774f, 121.69308f, 238.15f, 113.89f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.33f),
                    PathNode.LineTo(37.68f, 128.0f),
                    PathNode.LineTo(128.0f, 37.67f),
                    PathNode.LineTo(218.32f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _diamond!!
    }

private var _diamond: ImageVector? = null
