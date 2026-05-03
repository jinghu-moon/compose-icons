package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Angle: ImageVector
    get() {
        if (_angle != null) return _angle!!
        _angle = phosphorFillIcon(
            name = "Angle",
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
                    PathNode.MoveTo(112.0f, 88.0f),
                    PathNode.CurveTo(147.33023f, 88.03858f, 175.96143f, 116.66977f, 176.0f, 152.0f),
                    PathNode.CurveTo(176.0f, 156.41827f, 172.41827f, 160.0f, 168.0f, 160.0f),
                    PathNode.CurveTo(163.58173f, 160.0f, 160.0f, 156.41827f, 160.0f, 152.0f),
                    PathNode.CurveTo(159.97244f, 125.501755f, 138.49825f, 104.02756f, 112.0f, 104.0f),
                    PathNode.CurveTo(107.58172f, 104.0f, 104.0f, 100.41828f, 104.0f, 96.0f),
                    PathNode.CurveTo(104.0f, 91.58172f, 107.58172f, 88.0f, 112.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 192.0f),
                    PathNode.LineTo(80.0f, 192.0f),
                    PathNode.CurveTo(75.58172f, 192.0f, 72.0f, 188.41827f, 72.0f, 184.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.LineTo(56.0f, 104.0f),
                    PathNode.CurveTo(51.581722f, 104.0f, 48.0f, 100.41828f, 48.0f, 96.0f),
                    PathNode.CurveTo(48.0f, 91.58172f, 51.581722f, 88.0f, 56.0f, 88.0f),
                    PathNode.LineTo(72.0f, 88.0f),
                    PathNode.LineTo(72.0f, 72.0f),
                    PathNode.CurveTo(72.0f, 67.58172f, 75.58172f, 64.0f, 80.0f, 64.0f),
                    PathNode.CurveTo(84.41828f, 64.0f, 88.0f, 67.58172f, 88.0f, 72.0f),
                    PathNode.LineTo(88.0f, 176.0f),
                    PathNode.LineTo(200.0f, 176.0f),
                    PathNode.CurveTo(204.41827f, 176.0f, 208.0f, 179.58173f, 208.0f, 184.0f),
                    PathNode.CurveTo(208.0f, 188.41827f, 204.41827f, 192.0f, 200.0f, 192.0f),
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
        return _angle!!
    }

private var _angle: ImageVector? = null
