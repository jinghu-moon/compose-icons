package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendUpRight: ImageVector
    get() {
        if (_arrowBendUpRight != null) return _arrowBendUpRight!!
        _arrowBendUpRight = phosphorBoldIcon(
            name = "ArrowBendUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 112.49f),
                    PathNode.LineTo(184.49f, 160.49f),
                    PathNode.CurveTo(179.79558f, 165.18442f, 172.18442f, 165.18442f, 167.49f, 160.49f),
                    PathNode.CurveTo(162.79558f, 155.79558f, 162.79558f, 148.18442f, 167.49f, 143.49f),
                    PathNode.LineTo(195.0f, 116.0f),
                    PathNode.LineTo(128.0f, 116.0f),
                    PathNode.CurveTo(81.62865f, 116.04961f, 44.049603f, 153.62865f, 44.0f, 200.0f),
                    PathNode.CurveTo(44.0f, 206.62741f, 38.62742f, 212.0f, 32.0f, 212.0f),
                    PathNode.CurveTo(25.372583f, 212.0f, 20.0f, 206.62741f, 20.0f, 200.0f),
                    PathNode.CurveTo(20.066133f, 140.38066f, 68.38066f, 92.06613f, 128.0f, 92.0f),
                    PathNode.LineTo(195.0f, 92.0f),
                    PathNode.LineTo(167.51f, 64.48f),
                    PathNode.CurveTo(162.81558f, 59.78558f, 162.81558f, 52.17442f, 167.51f, 47.48f),
                    PathNode.CurveTo(172.20442f, 42.78558f, 179.81558f, 42.78558f, 184.51f, 47.48f),
                    PathNode.LineTo(232.51f, 95.48f),
                    PathNode.CurveTo(234.76988f, 97.73468f, 236.03824f, 100.79688f, 236.03448f, 103.98916f),
                    PathNode.CurveTo(236.03073f, 107.18143f, 234.75517f, 110.24064f, 232.49f, 112.49f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendUpRight!!
    }

private var _arrowBendUpRight: ImageVector? = null
