package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GlobeStand: ImageVector
    get() {
        if (_globeStand != null) return _globeStand!!
        _globeStand = phosphorFillIcon(
            name = "GlobeStand",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 59.81722f, 91.81722f, 24.0f, 136.0f, 24.0f),
                    PathNode.CurveTo(180.18279f, 24.0f, 216.0f, 59.81722f, 216.0f, 104.0f),
                    PathNode.CurveTo(216.0f, 148.18279f, 180.18279f, 184.0f, 136.0f, 184.0f),
                    PathNode.CurveTo(91.83778f, 183.9504f, 56.0496f, 148.16223f, 56.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.46f, 173.28f),
                    PathNode.CurveTo(164.77634f, 209.5583f, 104.98502f, 208.9903f, 67.99736f, 172.00264f),
                    PathNode.CurveTo(31.009699f, 135.015f, 30.441696f, 75.22367f, 66.72f, 37.54f),
                    PathNode.CurveTo(68.75223f, 35.4883f, 69.520966f, 32.50061f, 68.731384f, 29.722849f),
                    PathNode.CurveTo(67.94181f, 26.945087f, 65.71648f, 24.808462f, 62.908916f, 24.132467f),
                    PathNode.CurveTo(60.101353f, 23.456474f, 57.147385f, 24.346048f, 55.18f, 26.46f),
                    PathNode.CurveTo(25.116846f, 57.79702f, 15.877928f, 103.68799f, 31.472773f, 144.21703f),
                    PathNode.CurveTo(47.06762f, 184.74606f, 84.68514f, 212.60751f, 128.0f, 215.71f),
                    PathNode.LineTo(128.0f, 232.0f),
                    PathNode.LineTo(104.0f, 232.0f),
                    PathNode.CurveTo(99.58172f, 232.0f, 96.0f, 235.58173f, 96.0f, 240.0f),
                    PathNode.CurveTo(96.0f, 244.41827f, 99.58172f, 248.0f, 104.0f, 248.0f),
                    PathNode.LineTo(168.0f, 248.0f),
                    PathNode.CurveTo(172.41827f, 248.0f, 176.0f, 244.41827f, 176.0f, 240.0f),
                    PathNode.CurveTo(176.0f, 235.58173f, 172.41827f, 232.0f, 168.0f, 232.0f),
                    PathNode.LineTo(144.0f, 232.0f),
                    PathNode.LineTo(144.0f, 215.72f),
                    PathNode.CurveTo(170.09238f, 213.91772f, 194.71474f, 202.9768f, 213.54f, 184.82f),
                    PathNode.CurveTo(215.65395f, 182.85262f, 216.54353f, 179.89865f, 215.86754f, 177.09106f),
                    PathNode.CurveTo(215.19154f, 174.28352f, 213.05492f, 172.05818f, 210.27715f, 171.2686f),
                    PathNode.CurveTo(207.49939f, 170.47903f, 204.5117f, 171.24779f, 202.46f, 173.28f),
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
        return _globeStand!!
    }

private var _globeStand: ImageVector? = null
