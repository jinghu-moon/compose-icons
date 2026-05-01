package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AlignRightSimple: ImageVector
    get() {
        if (_alignRightSimple != null) return _alignRightSimple!!
        _alignRightSimple = phosphorBoldIcon(
            name = "AlignRightSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 200.0f),
                    PathNode.CurveTo(236.0f, 206.62741f, 230.62741f, 212.0f, 224.0f, 212.0f),
                    PathNode.CurveTo(217.37259f, 212.0f, 212.0f, 206.62741f, 212.0f, 200.0f),
                    PathNode.LineTo(212.0f, 56.0f),
                    PathNode.CurveTo(212.0f, 49.37258f, 217.37259f, 44.0f, 224.0f, 44.0f),
                    PathNode.CurveTo(230.62741f, 44.0f, 236.0f, 49.37258f, 236.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 96.0f),
                    PathNode.LineTo(196.0f, 160.0f),
                    PathNode.CurveTo(196.0f, 171.0457f, 187.0457f, 180.0f, 176.0f, 180.0f),
                    PathNode.LineTo(32.0f, 180.0f),
                    PathNode.CurveTo(20.954306f, 180.0f, 12.0f, 171.0457f, 12.0f, 160.0f),
                    PathNode.LineTo(12.0f, 96.0f),
                    PathNode.CurveTo(12.0f, 84.95431f, 20.954306f, 76.0f, 32.0f, 76.0f),
                    PathNode.LineTo(176.0f, 76.0f),
                    PathNode.CurveTo(187.0457f, 76.0f, 196.0f, 84.95431f, 196.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 100.0f),
                    PathNode.LineTo(36.0f, 100.0f),
                    PathNode.LineTo(36.0f, 156.0f),
                    PathNode.LineTo(172.0f, 156.0f),
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
        return _alignRightSimple!!
    }

private var _alignRightSimple: ImageVector? = null
