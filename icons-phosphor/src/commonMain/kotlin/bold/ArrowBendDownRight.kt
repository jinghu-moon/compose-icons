package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowBendDownRight: ImageVector
    get() {
        if (_arrowBendDownRight != null) return _arrowBendDownRight!!
        _arrowBendDownRight = phosphorBoldIcon(
            name = "ArrowBendDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 160.49f),
                    PathNode.LineTo(184.49f, 208.49f),
                    PathNode.CurveTo(179.79558f, 213.18442f, 172.18442f, 213.18442f, 167.49f, 208.49f),
                    PathNode.CurveTo(162.79558f, 203.79558f, 162.79558f, 196.18442f, 167.49f, 191.49f),
                    PathNode.LineTo(195.0f, 164.0f),
                    PathNode.LineTo(128.0f, 164.0f),
                    PathNode.CurveTo(68.38066f, 163.93387f, 20.066133f, 115.61934f, 20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 49.37258f, 25.372583f, 44.0f, 32.0f, 44.0f),
                    PathNode.CurveTo(38.62742f, 44.0f, 44.0f, 49.37258f, 44.0f, 56.0f),
                    PathNode.CurveTo(44.049603f, 102.37135f, 81.62865f, 139.9504f, 128.0f, 140.0f),
                    PathNode.LineTo(195.0f, 140.0f),
                    PathNode.LineTo(167.48f, 112.49f),
                    PathNode.CurveTo(162.78558f, 107.79558f, 162.78558f, 100.18442f, 167.48f, 95.49f),
                    PathNode.CurveTo(172.17442f, 90.79558f, 179.78558f, 90.79558f, 184.48f, 95.49f),
                    PathNode.LineTo(232.48f, 143.49f),
                    PathNode.CurveTo(234.74078f, 145.7403f, 236.01259f, 148.79811f, 236.01447f, 151.98793f),
                    PathNode.CurveTo(236.01634f, 155.17773f, 234.74812f, 158.23705f, 232.49f, 160.49f),
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
        return _arrowBendDownRight!!
    }

private var _arrowBendDownRight: ImageVector? = null
