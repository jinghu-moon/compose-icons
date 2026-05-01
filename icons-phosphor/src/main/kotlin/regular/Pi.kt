package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Pi: ImageVector
    get() {
        if (_pi != null) return _pi!!
        _pi = phosphorRegularIcon(
            name = "Pi",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 172.0f),
                    PathNode.CurveTo(232.0f, 191.88223f, 215.88223f, 208.0f, 196.0f, 208.0f),
                    PathNode.CurveTo(176.11777f, 208.0f, 160.0f, 191.88223f, 160.0f, 172.0f),
                    PathNode.LineTo(160.0f, 72.0f),
                    PathNode.LineTo(96.0f, 72.0f),
                    PathNode.LineTo(96.0f, 200.0f),
                    PathNode.CurveTo(96.0f, 204.41827f, 92.41828f, 208.0f, 88.0f, 208.0f),
                    PathNode.CurveTo(83.58172f, 208.0f, 80.0f, 204.41827f, 80.0f, 200.0f),
                    PathNode.LineTo(80.0f, 72.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.CurveTo(49.90861f, 72.0f, 32.0f, 89.90861f, 32.0f, 112.0f),
                    PathNode.CurveTo(32.0f, 116.41828f, 28.418278f, 120.0f, 24.0f, 120.0f),
                    PathNode.CurveTo(19.581722f, 120.0f, 16.0f, 116.41828f, 16.0f, 112.0f),
                    PathNode.CurveTo(16.03307f, 81.08576f, 41.085766f, 56.03307f, 72.0f, 56.0f),
                    PathNode.LineTo(224.0f, 56.0f),
                    PathNode.CurveTo(228.41827f, 56.0f, 232.0f, 59.581722f, 232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 68.41828f, 228.41827f, 72.0f, 224.0f, 72.0f),
                    PathNode.LineTo(176.0f, 72.0f),
                    PathNode.LineTo(176.0f, 172.0f),
                    PathNode.CurveTo(176.0f, 183.0457f, 184.9543f, 192.0f, 196.0f, 192.0f),
                    PathNode.CurveTo(207.0457f, 192.0f, 216.0f, 183.0457f, 216.0f, 172.0f),
                    PathNode.CurveTo(216.0f, 167.58173f, 219.58173f, 164.0f, 224.0f, 164.0f),
                    PathNode.CurveTo(228.41827f, 164.0f, 232.0f, 167.58173f, 232.0f, 172.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _pi!!
    }

private var _pi: ImageVector? = null
