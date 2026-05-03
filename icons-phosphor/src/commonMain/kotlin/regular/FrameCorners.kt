package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FrameCorners: ImageVector
    get() {
        if (_frameCorners != null) return _frameCorners!!
        _frameCorners = phosphorRegularIcon(
            name = "FrameCorners",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 80.0f),
                    PathNode.LineTo(200.0f, 112.0f),
                    PathNode.CurveTo(200.0f, 116.41828f, 196.41827f, 120.0f, 192.0f, 120.0f),
                    PathNode.CurveTo(187.58173f, 120.0f, 184.0f, 116.41828f, 184.0f, 112.0f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.LineTo(160.0f, 88.0f),
                    PathNode.CurveTo(155.58173f, 88.0f, 152.0f, 84.41828f, 152.0f, 80.0f),
                    PathNode.CurveTo(152.0f, 75.58172f, 155.58173f, 72.0f, 160.0f, 72.0f),
                    PathNode.LineTo(192.0f, 72.0f),
                    PathNode.CurveTo(196.41827f, 72.0f, 200.0f, 75.58172f, 200.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 168.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.LineTo(72.0f, 144.0f),
                    PathNode.CurveTo(72.0f, 139.58173f, 68.41828f, 136.0f, 64.0f, 136.0f),
                    PathNode.CurveTo(59.581722f, 136.0f, 56.0f, 139.58173f, 56.0f, 144.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.CurveTo(56.0f, 180.41827f, 59.581722f, 184.0f, 64.0f, 184.0f),
                    PathNode.LineTo(96.0f, 184.0f),
                    PathNode.CurveTo(100.41828f, 184.0f, 104.0f, 180.41827f, 104.0f, 176.0f),
                    PathNode.CurveTo(104.0f, 171.58173f, 100.41828f, 168.0f, 96.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 200.0f),
                    PathNode.CurveTo(232.0f, 208.83656f, 224.83656f, 216.0f, 216.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(31.163445f, 216.0f, 24.0f, 208.83656f, 24.0f, 200.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 200.0f),
                    PathNode.LineTo(216.0f, 56.0f),
                    PathNode.LineTo(40.0f, 56.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.LineTo(216.0f, 200.0f),
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
        return _frameCorners!!
    }

private var _frameCorners: ImageVector? = null
