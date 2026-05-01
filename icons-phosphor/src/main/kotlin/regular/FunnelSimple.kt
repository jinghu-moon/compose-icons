package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FunnelSimple: ImageVector
    get() {
        if (_funnelSimple != null) return _funnelSimple!!
        _funnelSimple = phosphorRegularIcon(
            name = "FunnelSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 136.0f),
                    PathNode.CurveTo(200.0f, 140.41827f, 196.41827f, 144.0f, 192.0f, 144.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(59.581722f, 144.0f, 56.0f, 140.41827f, 56.0f, 136.0f),
                    PathNode.CurveTo(56.0f, 131.58173f, 59.581722f, 128.0f, 64.0f, 128.0f),
                    PathNode.LineTo(192.0f, 128.0f),
                    PathNode.CurveTo(196.41827f, 128.0f, 200.0f, 131.58173f, 200.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 80.0f),
                    PathNode.LineTo(24.0f, 80.0f),
                    PathNode.CurveTo(19.581722f, 80.0f, 16.0f, 83.58172f, 16.0f, 88.0f),
                    PathNode.CurveTo(16.0f, 92.41828f, 19.581722f, 96.0f, 24.0f, 96.0f),
                    PathNode.LineTo(232.0f, 96.0f),
                    PathNode.CurveTo(236.41827f, 96.0f, 240.0f, 92.41828f, 240.0f, 88.0f),
                    PathNode.CurveTo(240.0f, 83.58172f, 236.41827f, 80.0f, 232.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 176.0f),
                    PathNode.LineTo(104.0f, 176.0f),
                    PathNode.CurveTo(99.58172f, 176.0f, 96.0f, 179.58173f, 96.0f, 184.0f),
                    PathNode.CurveTo(96.0f, 188.41827f, 99.58172f, 192.0f, 104.0f, 192.0f),
                    PathNode.LineTo(152.0f, 192.0f),
                    PathNode.CurveTo(156.41827f, 192.0f, 160.0f, 188.41827f, 160.0f, 184.0f),
                    PathNode.CurveTo(160.0f, 179.58173f, 156.41827f, 176.0f, 152.0f, 176.0f),
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
        return _funnelSimple!!
    }

private var _funnelSimple: ImageVector? = null
