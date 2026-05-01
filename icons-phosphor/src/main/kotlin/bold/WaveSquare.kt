package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.WaveSquare: ImageVector
    get() {
        if (_waveSquare != null) return _waveSquare!!
        _waveSquare = phosphorBoldIcon(
            name = "WaveSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 128.0f),
                    PathNode.LineTo(244.0f, 184.0f),
                    PathNode.CurveTo(244.0f, 190.62741f, 238.62741f, 196.0f, 232.0f, 196.0f),
                    PathNode.LineTo(128.0f, 196.0f),
                    PathNode.CurveTo(121.37258f, 196.0f, 116.0f, 190.62741f, 116.0f, 184.0f),
                    PathNode.LineTo(116.0f, 84.0f),
                    PathNode.LineTo(36.0f, 84.0f),
                    PathNode.LineTo(36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 134.62741f, 30.627417f, 140.0f, 24.0f, 140.0f),
                    PathNode.CurveTo(17.372583f, 140.0f, 12.0f, 134.62741f, 12.0f, 128.0f),
                    PathNode.LineTo(12.0f, 72.0f),
                    PathNode.CurveTo(12.0f, 65.37258f, 17.372583f, 60.0f, 24.0f, 60.0f),
                    PathNode.LineTo(128.0f, 60.0f),
                    PathNode.CurveTo(134.62741f, 60.0f, 140.0f, 65.37258f, 140.0f, 72.0f),
                    PathNode.LineTo(140.0f, 172.0f),
                    PathNode.LineTo(220.0f, 172.0f),
                    PathNode.LineTo(220.0f, 128.0f),
                    PathNode.CurveTo(220.0f, 121.37258f, 225.37259f, 116.0f, 232.0f, 116.0f),
                    PathNode.CurveTo(238.62741f, 116.0f, 244.0f, 121.37258f, 244.0f, 128.0f),
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
        return _waveSquare!!
    }

private var _waveSquare: ImageVector? = null
