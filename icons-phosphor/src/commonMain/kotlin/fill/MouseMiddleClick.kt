package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.MouseMiddleClick: ImageVector
    get() {
        if (_mouseMiddleClick != null) return _mouseMiddleClick!!
        _mouseMiddleClick = phosphorFillIcon(
            name = "MouseMiddleClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 16.0f),
                    PathNode.LineTo(112.0f, 16.0f),
                    PathNode.CurveTo(76.66977f, 16.03858f, 48.03858f, 44.66977f, 48.0f, 80.0f),
                    PathNode.LineTo(48.0f, 176.0f),
                    PathNode.CurveTo(48.03858f, 211.33023f, 76.66977f, 239.96143f, 112.0f, 240.0f),
                    PathNode.LineTo(144.0f, 240.0f),
                    PathNode.CurveTo(179.33023f, 239.96143f, 207.96143f, 211.33023f, 208.0f, 176.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.CurveTo(207.96143f, 44.66977f, 179.33023f, 16.03858f, 144.0f, 16.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 80.0f),
                    PathNode.LineTo(192.0f, 104.0f),
                    PathNode.LineTo(152.0f, 104.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.CurveTo(152.0f, 79.163445f, 144.83656f, 72.0f, 136.0f, 72.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.LineTo(144.0f, 32.0f),
                    PathNode.CurveTo(170.49825f, 32.02756f, 191.97244f, 53.501755f, 192.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(112.0f, 32.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 72.0f),
                    PathNode.CurveTo(111.163445f, 72.0f, 104.0f, 79.163445f, 104.0f, 88.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.LineTo(64.0f, 104.0f),
                    PathNode.LineTo(64.0f, 80.0f),
                    PathNode.CurveTo(64.02756f, 53.501755f, 85.501755f, 32.02756f, 112.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 224.0f),
                    PathNode.LineTo(112.0f, 224.0f),
                    PathNode.CurveTo(85.501755f, 223.97244f, 64.02756f, 202.49825f, 64.0f, 176.0f),
                    PathNode.LineTo(64.0f, 120.0f),
                    PathNode.LineTo(104.0f, 120.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.CurveTo(104.0f, 144.83656f, 111.163445f, 152.0f, 120.0f, 152.0f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.CurveTo(144.83656f, 152.0f, 152.0f, 144.83656f, 152.0f, 136.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.LineTo(192.0f, 120.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.CurveTo(191.97244f, 202.49825f, 170.49825f, 223.97244f, 144.0f, 224.0f),
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
        return _mouseMiddleClick!!
    }

private var _mouseMiddleClick: ImageVector? = null
