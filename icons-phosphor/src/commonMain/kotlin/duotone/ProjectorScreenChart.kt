package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ProjectorScreenChart: ImageVector
    get() {
        if (_projectorScreenChart != null) return _projectorScreenChart!!
        _projectorScreenChart = phosphorDuotoneIcon(
            name = "ProjectorScreenChart",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 72.0f),
                    PathNode.LineTo(208.0f, 184.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.LineTo(48.0f, 72.0f),
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
                    PathNode.MoveTo(88.0f, 144.0f),
                    PathNode.LineTo(88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 123.58172f, 91.58172f, 120.0f, 96.0f, 120.0f),
                    PathNode.CurveTo(100.41828f, 120.0f, 104.0f, 123.58172f, 104.0f, 128.0f),
                    PathNode.LineTo(104.0f, 144.0f),
                    PathNode.CurveTo(104.0f, 148.41827f, 100.41828f, 152.0f, 96.0f, 152.0f),
                    PathNode.CurveTo(91.58172f, 152.0f, 88.0f, 148.41827f, 88.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.CurveTo(132.41827f, 152.0f, 136.0f, 148.41827f, 136.0f, 144.0f),
                    PathNode.LineTo(136.0f, 120.0f),
                    PathNode.CurveTo(136.0f, 115.58172f, 132.41827f, 112.0f, 128.0f, 112.0f),
                    PathNode.CurveTo(123.58172f, 112.0f, 120.0f, 115.58172f, 120.0f, 120.0f),
                    PathNode.LineTo(120.0f, 144.0f),
                    PathNode.CurveTo(120.0f, 148.41827f, 123.58172f, 152.0f, 128.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 152.0f),
                    PathNode.CurveTo(164.41827f, 152.0f, 168.0f, 148.41827f, 168.0f, 144.0f),
                    PathNode.LineTo(168.0f, 112.0f),
                    PathNode.CurveTo(168.0f, 107.58172f, 164.41827f, 104.0f, 160.0f, 104.0f),
                    PathNode.CurveTo(155.58173f, 104.0f, 152.0f, 107.58172f, 152.0f, 112.0f),
                    PathNode.LineTo(152.0f, 144.0f),
                    PathNode.CurveTo(152.0f, 148.41827f, 155.58173f, 152.0f, 160.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 80.0f),
                    PathNode.LineTo(216.0f, 176.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(228.41827f, 176.0f, 232.0f, 179.58173f, 232.0f, 184.0f),
                    PathNode.CurveTo(232.0f, 188.41827f, 228.41827f, 192.0f, 224.0f, 192.0f),
                    PathNode.LineTo(136.0f, 192.0f),
                    PathNode.LineTo(136.0f, 209.38f),
                    PathNode.CurveTo(147.02037f, 213.27629f, 153.63098f, 224.54533f, 151.65436f, 236.06586f),
                    PathNode.CurveTo(149.67775f, 247.5864f, 139.68887f, 256.00742f, 128.0f, 256.00742f),
                    PathNode.CurveTo(116.31113f, 256.00742f, 106.32224f, 247.5864f, 104.345634f, 236.06586f),
                    PathNode.CurveTo(102.369026f, 224.54533f, 108.97963f, 213.27629f, 120.0f, 209.38f),
                    PathNode.LineTo(120.0f, 192.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(27.581722f, 192.0f, 24.0f, 188.41827f, 24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 179.58173f, 27.581722f, 176.0f, 32.0f, 176.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.LineTo(40.0f, 80.0f),
                    PathNode.CurveTo(31.163445f, 80.0f, 24.0f, 72.836555f, 24.0f, 64.0f),
                    PathNode.LineTo(24.0f, 48.0f),
                    PathNode.CurveTo(24.0f, 39.163445f, 31.163445f, 32.0f, 40.0f, 32.0f),
                    PathNode.LineTo(216.0f, 32.0f),
                    PathNode.CurveTo(224.83656f, 32.0f, 232.0f, 39.163445f, 232.0f, 48.0f),
                    PathNode.LineTo(232.0f, 64.0f),
                    PathNode.CurveTo(232.0f, 72.836555f, 224.83656f, 80.0f, 216.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 232.0f),
                    PathNode.CurveTo(136.0f, 227.58173f, 132.41827f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(123.58172f, 224.0f, 120.0f, 227.58173f, 120.0f, 232.0f),
                    PathNode.CurveTo(120.0f, 236.41827f, 123.58172f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(132.41827f, 240.0f, 136.0f, 236.41827f, 136.0f, 232.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 64.0f),
                    PathNode.LineTo(216.0f, 64.0f),
                    PathNode.LineTo(216.0f, 48.0f),
                    PathNode.LineTo(40.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 80.0f),
                    PathNode.LineTo(56.0f, 80.0f),
                    PathNode.LineTo(56.0f, 176.0f),
                    PathNode.LineTo(200.0f, 176.0f),
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
        return _projectorScreenChart!!
    }

private var _projectorScreenChart: ImageVector? = null
