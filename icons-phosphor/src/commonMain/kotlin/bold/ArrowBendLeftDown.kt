package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendLeftDown: ImageVector
    get() {
        if (_arrowBendLeftDown != null) return _arrowBendLeftDown!!
        _arrowBendLeftDown = phosphorBoldIcon(
            name = "ArrowBendLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(212.0f, 32.0f),
                    PathNode.CurveTo(212.0f, 38.62742f, 206.62741f, 44.0f, 200.0f, 44.0f),
                    PathNode.CurveTo(153.62865f, 44.049603f, 116.04961f, 81.62865f, 116.0f, 128.0f),
                    PathNode.LineTo(116.0f, 195.0f),
                    PathNode.LineTo(143.51f, 167.48f),
                    PathNode.CurveTo(148.20442f, 162.78558f, 155.81558f, 162.78558f, 160.51f, 167.48f),
                    PathNode.CurveTo(165.20442f, 172.17442f, 165.20442f, 179.78558f, 160.51f, 184.48f),
                    PathNode.LineTo(112.51f, 232.48f),
                    PathNode.CurveTo(110.25838f, 234.73946f, 107.19982f, 236.00946f, 104.01f, 236.00946f),
                    PathNode.CurveTo(100.82018f, 236.00946f, 97.76162f, 234.73946f, 95.51f, 232.48f),
                    PathNode.LineTo(47.51f, 184.48f),
                    PathNode.CurveTo(42.81558f, 179.78558f, 42.81558f, 172.17442f, 47.51f, 167.48f),
                    PathNode.CurveTo(52.20442f, 162.78558f, 59.81558f, 162.78558f, 64.51f, 167.48f),
                    PathNode.LineTo(92.0f, 195.0f),
                    PathNode.LineTo(92.0f, 128.0f),
                    PathNode.CurveTo(92.06613f, 68.38066f, 140.38066f, 20.066133f, 200.0f, 20.0f),
                    PathNode.CurveTo(206.62741f, 20.0f, 212.0f, 25.372583f, 212.0f, 32.0f),
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
        return _arrowBendLeftDown!!
    }

private var _arrowBendLeftDown: ImageVector? = null
