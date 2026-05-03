package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorRegularIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(136.0f, 184.0f),
                    PathNode.CurveTo(180.18279f, 184.0f, 216.0f, 148.18279f, 216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 59.81722f, 180.18279f, 24.0f, 136.0f, 24.0f),
                    PathNode.CurveTo(91.81722f, 24.0f, 56.0f, 59.81722f, 56.0f, 104.0f),
                    PathNode.CurveTo(56.0496f, 148.16223f, 91.83778f, 183.9504f, 136.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 40.0f),
                    PathNode.CurveTo(171.34622f, 40.0f, 200.0f, 68.65378f, 200.0f, 104.0f),
                    PathNode.CurveTo(200.0f, 139.34622f, 171.34622f, 168.0f, 136.0f, 168.0f),
                    PathNode.CurveTo(100.65378f, 168.0f, 72.0f, 139.34622f, 72.0f, 104.0f),
                    PathNode.CurveTo(72.03858f, 68.66977f, 100.66977f, 40.03858f, 136.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.77f, 173.5f),
                    PathNode.CurveTo(215.24214f, 175.03087f, 216.04512f, 177.08427f, 216.00198f, 179.20769f),
                    PathNode.CurveTo(215.95883f, 181.3311f, 215.0731f, 183.3502f, 213.54f, 184.82f),
                    PathNode.CurveTo(194.71329f, 202.97464f, 170.09175f, 213.91518f, 144.0f, 215.72f),
                    PathNode.LineTo(144.0f, 232.0f),
                    PathNode.LineTo(168.0f, 232.0f),
                    PathNode.CurveTo(172.41827f, 232.0f, 176.0f, 235.58173f, 176.0f, 240.0f),
                    PathNode.CurveTo(176.0f, 244.41827f, 172.41827f, 248.0f, 168.0f, 248.0f),
                    PathNode.LineTo(104.0f, 248.0f),
                    PathNode.CurveTo(99.58172f, 248.0f, 96.0f, 244.41827f, 96.0f, 240.0f),
                    PathNode.CurveTo(96.0f, 235.58173f, 99.58172f, 232.0f, 104.0f, 232.0f),
                    PathNode.LineTo(128.0f, 232.0f),
                    PathNode.LineTo(128.0f, 215.71f),
                    PathNode.CurveTo(84.68514f, 212.60751f, 47.06762f, 184.74606f, 31.472773f, 144.21703f),
                    PathNode.CurveTo(15.877928f, 103.68799f, 25.116846f, 57.79702f, 55.18f, 26.46f),
                    PathNode.CurveTo(57.147385f, 24.346048f, 60.101353f, 23.456474f, 62.908916f, 24.132467f),
                    PathNode.CurveTo(65.71648f, 24.808462f, 67.94181f, 26.945087f, 68.731384f, 29.722849f),
                    PathNode.CurveTo(69.520966f, 32.50061f, 68.75223f, 35.4883f, 66.72f, 37.54f),
                    PathNode.CurveTo(30.441696f, 75.22367f, 31.009699f, 135.015f, 67.99736f, 172.00264f),
                    PathNode.CurveTo(104.98502f, 208.9903f, 164.77634f, 209.5583f, 202.46f, 173.28f),
                    PathNode.CurveTo(205.64417f, 170.2182f, 210.70732f, 170.31668f, 213.77f, 173.5f),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
