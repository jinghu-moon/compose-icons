package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendDoubleUpRight: ImageVector
    get() {
        if (_arrowBendDoubleUpRight != null) return _arrowBendDoubleUpRight!!
        _arrowBendDoubleUpRight = phosphorBoldIcon(
            name = "ArrowBendDoubleUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 112.49f),
                    PathNode.LineTo(184.49f, 160.49f),
                    PathNode.CurveTo(179.79558f, 165.18442f, 172.18442f, 165.18442f, 167.49f, 160.49f),
                    PathNode.CurveTo(162.79558f, 155.79558f, 162.79558f, 148.18442f, 167.49f, 143.49f),
                    PathNode.LineTo(207.0f, 104.0f),
                    PathNode.LineTo(167.51f, 64.48f),
                    PathNode.CurveTo(162.81558f, 59.78558f, 162.81558f, 52.17442f, 167.51f, 47.48f),
                    PathNode.CurveTo(172.20442f, 42.78558f, 179.81558f, 42.78558f, 184.51f, 47.48f),
                    PathNode.LineTo(232.51f, 95.48f),
                    PathNode.CurveTo(234.76988f, 97.73468f, 236.03824f, 100.79688f, 236.03448f, 103.98916f),
                    PathNode.CurveTo(236.03073f, 107.18143f, 234.75517f, 110.24064f, 232.49f, 112.49f),
                    PathNode.Close,
                    PathNode.MoveTo(176.49f, 95.49f),
                    PathNode.LineTo(128.49f, 47.49f),
                    PathNode.CurveTo(123.79558f, 42.79558f, 116.18442f, 42.79558f, 111.49f, 47.49f),
                    PathNode.CurveTo(106.79558f, 52.18442f, 106.79558f, 59.79558f, 111.49f, 64.49f),
                    PathNode.LineTo(139.0f, 92.0f),
                    PathNode.LineTo(128.0f, 92.0f),
                    PathNode.CurveTo(68.38066f, 92.06613f, 20.066133f, 140.38066f, 20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 206.62741f, 25.372583f, 212.0f, 32.0f, 212.0f),
                    PathNode.CurveTo(38.62742f, 212.0f, 44.0f, 206.62741f, 44.0f, 200.0f),
                    PathNode.CurveTo(44.049603f, 153.62865f, 81.62865f, 116.04961f, 128.0f, 116.0f),
                    PathNode.LineTo(139.0f, 116.0f),
                    PathNode.LineTo(111.48f, 143.51f),
                    PathNode.CurveTo(106.78558f, 148.20442f, 106.78558f, 155.81558f, 111.48f, 160.51f),
                    PathNode.CurveTo(116.17442f, 165.20442f, 123.785576f, 165.20442f, 128.48f, 160.51f),
                    PathNode.LineTo(176.48f, 112.51f),
                    PathNode.CurveTo(178.74078f, 110.259705f, 180.01259f, 107.2019f, 180.01447f, 104.01208f),
                    PathNode.CurveTo(180.01634f, 100.82226f, 178.74812f, 97.762955f, 176.49f, 95.51f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _arrowBendDoubleUpRight!!
    }

private var _arrowBendDoubleUpRight: ImageVector? = null
