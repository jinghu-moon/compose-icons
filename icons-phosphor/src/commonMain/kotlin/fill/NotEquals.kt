package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.NotEquals: ImageVector
    get() {
        if (_notEquals != null) return _notEquals!!
        _notEquals = phosphorFillIcon(
            name = "NotEquals",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 144.0f),
                    PathNode.CurveTo(188.41827f, 144.0f, 192.0f, 147.58173f, 192.0f, 152.0f),
                    PathNode.CurveTo(192.0f, 156.41827f, 188.41827f, 160.0f, 184.0f, 160.0f),
                    PathNode.LineTo(110.63f, 160.0f),
                    PathNode.LineTo(78.0f, 197.27f),
                    PathNode.CurveTo(75.02193f, 200.2785f, 70.21565f, 200.4462f, 67.03511f, 197.65262f),
                    PathNode.CurveTo(63.85457f, 194.85905f, 63.400845f, 190.07132f, 66.0f, 186.73f),
                    PathNode.LineTo(89.37f, 160.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.CurveTo(67.58172f, 160.0f, 64.0f, 156.41827f, 64.0f, 152.0f),
                    PathNode.CurveTo(64.0f, 147.58173f, 67.58172f, 144.0f, 72.0f, 144.0f),
                    PathNode.LineTo(103.37f, 144.0f),
                    PathNode.LineTo(131.37f, 112.0f),
                    PathNode.LineTo(72.0f, 112.0f),
                    PathNode.CurveTo(67.58172f, 112.0f, 64.0f, 108.41828f, 64.0f, 104.0f),
                    PathNode.CurveTo(64.0f, 99.58172f, 67.58172f, 96.0f, 72.0f, 96.0f),
                    PathNode.LineTo(145.37f, 96.0f),
                    PathNode.LineTo(178.0f, 58.73f),
                    PathNode.CurveTo(179.8248f, 56.384167f, 182.79962f, 55.243263f, 185.72505f, 55.767292f),
                    PathNode.CurveTo(188.6505f, 56.291317f, 191.04433f, 58.3939f, 191.94138f, 61.227287f),
                    PathNode.CurveTo(192.83842f, 64.06068f, 192.09082f, 67.15783f, 190.0f, 69.27f),
                    PathNode.LineTo(166.63f, 96.0f),
                    PathNode.LineTo(184.0f, 96.0f),
                    PathNode.CurveTo(188.41827f, 96.0f, 192.0f, 99.58172f, 192.0f, 104.0f),
                    PathNode.CurveTo(192.0f, 108.41828f, 188.41827f, 112.0f, 184.0f, 112.0f),
                    PathNode.LineTo(152.63f, 112.0f),
                    PathNode.LineTo(124.63f, 144.0f),
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
        return _notEquals!!
    }

private var _notEquals: ImageVector? = null
