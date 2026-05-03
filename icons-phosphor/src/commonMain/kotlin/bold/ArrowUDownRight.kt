package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowUDownRight: ImageVector
    get() {
        if (_arrowUDownRight != null) return _arrowUDownRight!!
        _arrowUDownRight = phosphorBoldIcon(
            name = "ArrowUDownRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.49f, 176.49f),
                    PathNode.LineTo(184.49f, 224.49f),
                    PathNode.CurveTo(179.79558f, 229.18442f, 172.18442f, 229.18442f, 167.49f, 224.49f),
                    PathNode.CurveTo(162.79558f, 219.79558f, 162.79558f, 212.18442f, 167.49f, 207.49f),
                    PathNode.LineTo(195.0f, 180.0f),
                    PathNode.LineTo(88.0f, 180.0f),
                    PathNode.CurveTo(50.444637f, 180.0f, 20.0f, 149.55536f, 20.0f, 112.0f),
                    PathNode.CurveTo(20.0f, 74.44463f, 50.444637f, 44.0f, 88.0f, 44.0f),
                    PathNode.LineTo(176.0f, 44.0f),
                    PathNode.CurveTo(182.62741f, 44.0f, 188.0f, 49.37258f, 188.0f, 56.0f),
                    PathNode.CurveTo(188.0f, 62.62742f, 182.62741f, 68.0f, 176.0f, 68.0f),
                    PathNode.LineTo(88.0f, 68.0f),
                    PathNode.CurveTo(63.69947f, 68.0f, 44.0f, 87.69947f, 44.0f, 112.0f),
                    PathNode.CurveTo(44.0f, 136.30052f, 63.69947f, 156.0f, 88.0f, 156.0f),
                    PathNode.LineTo(195.0f, 156.0f),
                    PathNode.LineTo(167.48f, 128.49f),
                    PathNode.CurveTo(162.78558f, 123.79558f, 162.78558f, 116.18442f, 167.48f, 111.49f),
                    PathNode.CurveTo(172.17442f, 106.79558f, 179.78558f, 106.79558f, 184.48f, 111.49f),
                    PathNode.LineTo(232.48f, 159.49f),
                    PathNode.CurveTo(234.74078f, 161.7403f, 236.01259f, 164.79811f, 236.01447f, 167.98793f),
                    PathNode.CurveTo(236.01634f, 171.17773f, 234.74812f, 174.23705f, 232.49f, 176.49f),
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
        return _arrowUDownRight!!
    }

private var _arrowUDownRight: ImageVector? = null
