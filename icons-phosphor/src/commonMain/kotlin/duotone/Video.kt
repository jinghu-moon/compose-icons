package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Video: ImageVector
    get() {
        if (_video != null) return _video!!
        _video = phosphorDuotoneIcon(
            name = "Video",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.CurveTo(35.581722f, 48.0f, 32.0f, 51.581722f, 32.0f, 56.0f),
                    PathNode.LineTo(32.0f, 168.0f),
                    PathNode.CurveTo(32.0f, 172.41827f, 35.581722f, 176.0f, 40.0f, 176.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.CurveTo(220.41827f, 176.0f, 224.0f, 172.41827f, 224.0f, 168.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(224.0f, 51.581722f, 220.41827f, 48.0f, 216.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 144.0f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.LineTo(160.0f, 112.0f),
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
                    PathNode.MoveTo(164.44f, 105.34f),
                    PathNode.LineTo(116.44f, 73.34f),
                    PathNode.CurveTo(113.984535f, 71.701744f, 110.826454f, 71.54874f, 108.22411f, 72.94194f),
                    PathNode.CurveTo(105.62178f, 74.33517f, 103.998085f, 77.04819f, 104.0f, 80.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(103.998085f, 146.95181f, 105.62178f, 149.66484f, 108.22411f, 151.05804f),
                    PathNode.CurveTo(110.826454f, 152.45126f, 113.984535f, 152.29826f, 116.44f, 150.66f),
                    PathNode.LineTo(164.44f, 118.66f),
                    PathNode.CurveTo(166.6687f, 117.1768f, 168.0078f, 114.67713f, 168.0078f, 112.0f),
                    PathNode.CurveTo(168.0078f, 109.32287f, 166.6687f, 106.8232f, 164.44f, 105.34f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 129.05f),
                    PathNode.LineTo(120.0f, 95.0f),
                    PathNode.LineTo(145.58f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 168.0f),
                    PathNode.CurveTo(24.0f, 176.83656f, 31.163445f, 184.0f, 40.0f, 184.0f),
                    PathNode.LineTo(216.0f, 184.0f),
                    PathNode.CurveTo(224.83656f, 184.0f, 232.0f, 176.83656f, 232.0f, 168.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 168.0f),
                    PathNode.LineTo(40.0f, 168.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(216.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.CurveTo(232.0f, 212.41827f, 228.41827f, 216.0f, 224.0f, 216.0f),
                    PathNode.LineTo(32.0f, 216.0f),
                    PathNode.CurveTo(27.581722f, 216.0f, 24.0f, 212.41827f, 24.0f, 208.0f),
                    PathNode.CurveTo(24.0f, 203.58173f, 27.581722f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(224.0f, 200.0f),
                    PathNode.CurveTo(228.41827f, 200.0f, 232.0f, 203.58173f, 232.0f, 208.0f),
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
        return _video!!
    }

private var _video: ImageVector? = null
