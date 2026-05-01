package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Spiral: ImageVector
    get() {
        if (_spiral != null) return _spiral!!
        _spiral = phosphorFillIcon(
            name = "Spiral",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 144.0f),
                    PathNode.CurveTo(248.0f, 148.41827f, 244.41827f, 152.0f, 240.0f, 152.0f),
                    PathNode.CurveTo(235.58173f, 152.0f, 232.0f, 148.41827f, 232.0f, 144.0f),
                    PathNode.CurveTo(231.93938f, 91.00579f, 188.9942f, 48.06062f, 136.0f, 48.0f),
                    PathNode.CurveTo(134.6f, 48.0f, 133.2f, 48.0f, 131.82f, 48.1f),
                    PathNode.CurveTo(89.32985f, 50.353447f, 56.02532f, 85.45014f, 56.0f, 128.0f),
                    PathNode.CurveTo(56.03858f, 163.33023f, 84.66977f, 191.96143f, 120.0f, 192.0f),
                    PathNode.CurveTo(144.28911f, 191.97244f, 163.97244f, 172.28911f, 164.0f, 148.0f),
                    PathNode.CurveTo(164.0f, 130.32689f, 149.67311f, 116.0f, 132.0f, 116.0f),
                    PathNode.CurveTo(127.58172f, 116.0f, 124.0f, 119.58172f, 124.0f, 124.0f),
                    PathNode.CurveTo(124.0f, 128.41827f, 127.58172f, 132.0f, 132.0f, 132.0f),
                    PathNode.CurveTo(140.83656f, 132.0f, 148.0f, 139.16344f, 148.0f, 148.0f),
                    PathNode.CurveTo(148.0f, 163.46397f, 135.46397f, 176.0f, 120.0f, 176.0f),
                    PathNode.CurveTo(93.501755f, 175.97244f, 72.02756f, 154.49825f, 72.0f, 128.0f),
                    PathNode.CurveTo(72.03858f, 92.66977f, 100.66977f, 64.03858f, 136.0f, 64.0f),
                    PathNode.CurveTo(180.16223f, 64.0496f, 215.9504f, 99.83778f, 216.0f, 144.0f),
                    PathNode.CurveTo(215.94489f, 192.57822f, 176.57822f, 231.94489f, 128.0f, 232.0f),
                    PathNode.CurveTo(75.00579f, 231.93938f, 32.06062f, 188.9942f, 32.0f, 136.0f),
                    PathNode.CurveTo(32.060627f, 78.58752f, 78.58752f, 32.060627f, 136.0f, 32.0f),
                    PathNode.CurveTo(197.82848f, 32.06614f, 247.93387f, 82.17153f, 248.0f, 144.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _spiral!!
    }

private var _spiral: ImageVector? = null
