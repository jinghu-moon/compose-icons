package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowSquareUpRight: ImageVector
    get() {
        if (_arrowSquareUpRight != null) return _arrowSquareUpRight!!
        _arrowSquareUpRight = phosphorBoldIcon(
            name = "ArrowSquareUpRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 28.0f),
                    PathNode.LineTo(48.0f, 28.0f),
                    PathNode.CurveTo(36.954304f, 28.0f, 28.0f, 36.954304f, 28.0f, 48.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 219.0457f, 36.954304f, 228.0f, 48.0f, 228.0f),
                    PathNode.LineTo(208.0f, 228.0f),
                    PathNode.CurveTo(219.0457f, 228.0f, 228.0f, 219.0457f, 228.0f, 208.0f),
                    PathNode.LineTo(228.0f, 48.0f),
                    PathNode.CurveTo(228.0f, 36.954304f, 219.0457f, 28.0f, 208.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 204.0f),
                    PathNode.LineTo(52.0f, 204.0f),
                    PathNode.LineTo(52.0f, 52.0f),
                    PathNode.LineTo(204.0f, 52.0f),
                    PathNode.Close,
                    PathNode.MoveTo(87.51f, 168.49f),
                    PathNode.CurveTo(85.25055f, 166.23837f, 83.98054f, 163.17982f, 83.98054f, 159.99f),
                    PathNode.CurveTo(83.98054f, 156.80019f, 85.25055f, 153.74162f, 87.51f, 151.49f),
                    PathNode.LineTo(131.0f, 108.0f),
                    PathNode.LineTo(112.0f, 108.0f),
                    PathNode.CurveTo(105.37258f, 108.0f, 100.0f, 102.62742f, 100.0f, 96.0f),
                    PathNode.CurveTo(100.0f, 89.37258f, 105.37258f, 84.0f, 112.0f, 84.0f),
                    PathNode.LineTo(160.0f, 84.0f),
                    PathNode.CurveTo(166.62741f, 84.0f, 172.0f, 89.37258f, 172.0f, 96.0f),
                    PathNode.LineTo(172.0f, 144.0f),
                    PathNode.CurveTo(172.0f, 150.62741f, 166.62741f, 156.0f, 160.0f, 156.0f),
                    PathNode.CurveTo(153.37259f, 156.0f, 148.0f, 150.62741f, 148.0f, 144.0f),
                    PathNode.LineTo(148.0f, 125.0f),
                    PathNode.LineTo(104.49f, 168.52f),
                    PathNode.CurveTo(102.23838f, 170.77945f, 99.17982f, 172.04947f, 95.99f, 172.04947f),
                    PathNode.CurveTo(92.80018f, 172.04947f, 89.74162f, 170.77945f, 87.49f, 168.52f),
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
        return _arrowSquareUpRight!!
    }

private var _arrowSquareUpRight: ImageVector? = null
