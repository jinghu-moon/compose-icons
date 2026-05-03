package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FunnelSimple: ImageVector
    get() {
        if (_funnelSimple != null) return _funnelSimple!!
        _funnelSimple = phosphorFillIcon(
            name = "FunnelSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 40.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(31.163445f, 40.0f, 24.0f, 47.163445f, 24.0f, 56.0f),
                    PathNode.LineTo(24.0f, 200.0f),
                    PathNode.CurveTo(24.0f, 208.83656f, 31.163445f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(224.83656f, 216.0f, 232.0f, 208.83656f, 232.0f, 200.0f),
                    PathNode.LineTo(232.0f, 56.0f),
                    PathNode.CurveTo(232.0f, 47.163445f, 224.83656f, 40.0f, 216.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 176.0f),
                    PathNode.LineTo(112.0f, 176.0f),
                    PathNode.CurveTo(107.58172f, 176.0f, 104.0f, 172.41827f, 104.0f, 168.0f),
                    PathNode.CurveTo(104.0f, 163.58173f, 107.58172f, 160.0f, 112.0f, 160.0f),
                    PathNode.LineTo(144.0f, 160.0f),
                    PathNode.CurveTo(148.41827f, 160.0f, 152.0f, 163.58173f, 152.0f, 168.0f),
                    PathNode.CurveTo(152.0f, 172.41827f, 148.41827f, 176.0f, 144.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 136.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.CurveTo(75.58172f, 136.0f, 72.0f, 132.41827f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.0f, 123.58172f, 75.58172f, 120.0f, 80.0f, 120.0f),
                    PathNode.LineTo(176.0f, 120.0f),
                    PathNode.CurveTo(180.41827f, 120.0f, 184.0f, 123.58172f, 184.0f, 128.0f),
                    PathNode.CurveTo(184.0f, 132.41827f, 180.41827f, 136.0f, 176.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.LineTo(48.0f, 96.0f),
                    PathNode.CurveTo(43.581722f, 96.0f, 40.0f, 92.41828f, 40.0f, 88.0f),
                    PathNode.CurveTo(40.0f, 83.58172f, 43.581722f, 80.0f, 48.0f, 80.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.CurveTo(212.41827f, 80.0f, 216.0f, 83.58172f, 216.0f, 88.0f),
                    PathNode.CurveTo(216.0f, 92.41828f, 212.41827f, 96.0f, 208.0f, 96.0f),
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
        return _funnelSimple!!
    }

private var _funnelSimple: ImageVector? = null
