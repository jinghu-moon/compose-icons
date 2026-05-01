package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendRightDown: ImageVector
    get() {
        if (_arrowBendRightDown != null) return _arrowBendRightDown!!
        _arrowBendRightDown = phosphorBoldIcon(
            name = "ArrowBendRightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.49f, 184.49f),
                    PathNode.LineTo(160.49f, 232.49f),
                    PathNode.CurveTo(158.23837f, 234.74945f, 155.17982f, 236.01947f, 151.99f, 236.01947f),
                    PathNode.CurveTo(148.80019f, 236.01947f, 145.74162f, 234.74945f, 143.49f, 232.49f),
                    PathNode.LineTo(95.49f, 184.49f),
                    PathNode.CurveTo(90.79558f, 179.79558f, 90.79558f, 172.18442f, 95.49f, 167.49f),
                    PathNode.CurveTo(100.18442f, 162.79558f, 107.79558f, 162.79558f, 112.49f, 167.49f),
                    PathNode.LineTo(140.0f, 195.0f),
                    PathNode.LineTo(140.0f, 128.0f),
                    PathNode.CurveTo(139.9504f, 81.62865f, 102.37135f, 44.049603f, 56.0f, 44.0f),
                    PathNode.CurveTo(49.37258f, 44.0f, 44.0f, 38.62742f, 44.0f, 32.0f),
                    PathNode.CurveTo(44.0f, 25.372583f, 49.37258f, 20.0f, 56.0f, 20.0f),
                    PathNode.CurveTo(115.61934f, 20.066133f, 163.93387f, 68.38066f, 164.0f, 128.0f),
                    PathNode.LineTo(164.0f, 195.0f),
                    PathNode.LineTo(191.51f, 167.48f),
                    PathNode.CurveTo(196.20442f, 162.78558f, 203.81558f, 162.78558f, 208.51f, 167.48f),
                    PathNode.CurveTo(213.20442f, 172.17442f, 213.20442f, 179.78558f, 208.51f, 184.48f),
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
        return _arrowBendRightDown!!
    }

private var _arrowBendRightDown: ImageVector? = null
