package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Dresser: ImageVector
    get() {
        if (_dresser != null) return _dresser!!
        _dresser = phosphorBoldIcon(
            name = "Dresser",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(148.0f, 176.0f),
                    PathNode.CurveTo(148.0f, 182.62741f, 142.62741f, 188.0f, 136.0f, 188.0f),
                    PathNode.LineTo(120.0f, 188.0f),
                    PathNode.CurveTo(113.37258f, 188.0f, 108.0f, 182.62741f, 108.0f, 176.0f),
                    PathNode.CurveTo(108.0f, 169.37259f, 113.37258f, 164.0f, 120.0f, 164.0f),
                    PathNode.LineTo(136.0f, 164.0f),
                    PathNode.CurveTo(142.62741f, 164.0f, 148.0f, 169.37259f, 148.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 92.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(142.62741f, 92.0f, 148.0f, 86.62742f, 148.0f, 80.0f),
                    PathNode.CurveTo(148.0f, 73.37258f, 142.62741f, 68.0f, 136.0f, 68.0f),
                    PathNode.LineTo(120.0f, 68.0f),
                    PathNode.CurveTo(113.37258f, 68.0f, 108.0f, 73.37258f, 108.0f, 80.0f),
                    PathNode.CurveTo(108.0f, 86.62742f, 113.37258f, 92.0f, 120.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 40.0f),
                    PathNode.LineTo(220.0f, 216.0f),
                    PathNode.CurveTo(220.0f, 227.0457f, 211.0457f, 236.0f, 200.0f, 236.0f),
                    PathNode.LineTo(56.0f, 236.0f),
                    PathNode.CurveTo(44.954304f, 236.0f, 36.0f, 227.0457f, 36.0f, 216.0f),
                    PathNode.LineTo(36.0f, 40.0f),
                    PathNode.CurveTo(36.0f, 28.954306f, 44.954304f, 20.0f, 56.0f, 20.0f),
                    PathNode.LineTo(200.0f, 20.0f),
                    PathNode.CurveTo(211.0457f, 20.0f, 220.0f, 28.954306f, 220.0f, 40.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 44.0f),
                    PathNode.LineTo(60.0f, 116.0f),
                    PathNode.LineTo(196.0f, 116.0f),
                    PathNode.LineTo(196.0f, 44.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 212.0f),
                    PathNode.LineTo(196.0f, 140.0f),
                    PathNode.LineTo(60.0f, 140.0f),
                    PathNode.LineTo(60.0f, 212.0f),
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
        return _dresser!!
    }

private var _dresser: ImageVector? = null
