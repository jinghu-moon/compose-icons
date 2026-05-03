package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Stairs: ImageVector
    get() {
        if (_stairs != null) return _stairs!!
        _stairs = phosphorBoldIcon(
            name = "Stairs",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 20.0f),
                    PathNode.LineTo(56.0f, 20.0f),
                    PathNode.CurveTo(44.954304f, 20.0f, 36.0f, 28.954306f, 36.0f, 40.0f),
                    PathNode.LineTo(36.0f, 216.0f),
                    PathNode.CurveTo(36.0f, 227.0457f, 44.954304f, 236.0f, 56.0f, 236.0f),
                    PathNode.LineTo(200.0f, 236.0f),
                    PathNode.CurveTo(211.0457f, 236.0f, 220.0f, 227.0457f, 220.0f, 216.0f),
                    PathNode.LineTo(220.0f, 40.0f),
                    PathNode.CurveTo(220.0f, 28.954306f, 211.0457f, 20.0f, 200.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 148.0f),
                    PathNode.LineTo(196.0f, 148.0f),
                    PathNode.LineTo(196.0f, 164.0f),
                    PathNode.LineTo(116.0f, 164.0f),
                    PathNode.LineTo(116.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 124.0f),
                    PathNode.LineTo(164.0f, 108.0f),
                    PathNode.LineTo(196.0f, 108.0f),
                    PathNode.LineTo(196.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 44.0f),
                    PathNode.LineTo(196.0f, 84.0f),
                    PathNode.LineTo(152.0f, 84.0f),
                    PathNode.CurveTo(145.37259f, 84.0f, 140.0f, 89.37258f, 140.0f, 96.0f),
                    PathNode.LineTo(140.0f, 124.0f),
                    PathNode.LineTo(104.0f, 124.0f),
                    PathNode.CurveTo(97.37258f, 124.0f, 92.0f, 129.37259f, 92.0f, 136.0f),
                    PathNode.LineTo(92.0f, 164.0f),
                    PathNode.LineTo(60.0f, 164.0f),
                    PathNode.LineTo(60.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 212.0f),
                    PathNode.LineTo(60.0f, 188.0f),
                    PathNode.LineTo(196.0f, 188.0f),
                    PathNode.LineTo(196.0f, 212.0f),
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
        return _stairs!!
    }

private var _stairs: ImageVector? = null
