package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Browsers: ImageVector
    get() {
        if (_browsers != null) return _browsers!!
        _browsers = phosphorDuotoneIcon(
            name = "Browsers",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 56.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.CurveTo(224.0f, 172.41827f, 220.41827f, 176.0f, 216.0f, 176.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.LineTo(192.0f, 88.0f),
                    PathNode.CurveTo(192.0f, 83.58172f, 188.41827f, 80.0f, 184.0f, 80.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.LineTo(64.0f, 56.0f),
                    PathNode.CurveTo(64.0f, 51.581722f, 67.58172f, 48.0f, 72.0f, 48.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.CurveTo(220.41827f, 48.0f, 224.0f, 51.581722f, 224.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(72.0f, 40.0f),
                    PathNode.CurveTo(63.163445f, 40.0f, 56.0f, 47.163445f, 56.0f, 56.0f),
                    PathNode.LineTo(56.0f, 72.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.CurveTo(31.163445f, 72.0f, 24.0f, 79.163445f, 24.0f, 88.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(184.0f, 216.0f),
                    PathNode.CurveTo(192.83656f, 216.0f, 200.0f, 208.83656f, 200.0f, 200.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.CurveTo(224.83656f, 184.0f, 232.0f, 176.83656f, 232.0f, 168.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 88.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 200.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 168.0f),
                    PathNode.LineTo(200.0f, 168.0f),
                    PathNode.LineTo(200.0f, 88.0f),
                    PathNode.CurveTo(200.0f, 79.163445f, 192.83656f, 72.0f, 184.0f, 72.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.LineTo(72.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _browsers!!
    }

private var _browsers: ImageVector? = null
