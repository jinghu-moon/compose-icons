package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ArrowURightDown: ImageVector
    get() {
        if (_arrowURightDown != null) return _arrowURightDown!!
        _arrowURightDown = phosphorBoldIcon(
            name = "ArrowURightDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.49f, 184.49f),
                    PathNode.LineTo(176.49f, 232.49f),
                    PathNode.CurveTo(174.23837f, 234.74945f, 171.17982f, 236.01947f, 167.99f, 236.01947f),
                    PathNode.CurveTo(164.80019f, 236.01947f, 161.74162f, 234.74945f, 159.49f, 232.49f),
                    PathNode.LineTo(111.49f, 184.49f),
                    PathNode.CurveTo(106.79558f, 179.79558f, 106.79558f, 172.18442f, 111.49f, 167.49f),
                    PathNode.CurveTo(116.18442f, 162.79558f, 123.79558f, 162.79558f, 128.49f, 167.49f),
                    PathNode.LineTo(156.0f, 195.0f),
                    PathNode.LineTo(156.0f, 88.0f),
                    PathNode.CurveTo(156.0f, 63.69947f, 136.30052f, 44.0f, 112.0f, 44.0f),
                    PathNode.CurveTo(87.69947f, 44.0f, 68.0f, 63.69947f, 68.0f, 88.0f),
                    PathNode.LineTo(68.0f, 176.0f),
                    PathNode.CurveTo(68.0f, 182.62741f, 62.62742f, 188.0f, 56.0f, 188.0f),
                    PathNode.CurveTo(49.37258f, 188.0f, 44.0f, 182.62741f, 44.0f, 176.0f),
                    PathNode.LineTo(44.0f, 88.0f),
                    PathNode.CurveTo(44.0f, 50.444637f, 74.44463f, 20.0f, 112.0f, 20.0f),
                    PathNode.CurveTo(149.55536f, 20.0f, 180.0f, 50.444637f, 180.0f, 88.0f),
                    PathNode.LineTo(180.0f, 195.0f),
                    PathNode.LineTo(207.51f, 167.48f),
                    PathNode.CurveTo(212.20442f, 162.78558f, 219.81558f, 162.78558f, 224.51f, 167.48f),
                    PathNode.CurveTo(229.20442f, 172.17442f, 229.20442f, 179.78558f, 224.51f, 184.48f),
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
        return _arrowURightDown!!
    }

private var _arrowURightDown: ImageVector? = null
