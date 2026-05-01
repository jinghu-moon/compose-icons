package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Ranking: ImageVector
    get() {
        if (_ranking != null) return _ranking!!
        _ranking = phosphorBoldIcon(
            name = "Ranking",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(108.62f, 103.79f),
                    PathNode.CurveTo(106.530106f, 97.50523f, 109.92715f, 90.71563f, 116.21f, 88.62f),
                    PathNode.LineTo(128.21f, 84.62f),
                    PathNode.CurveTo(131.86809f, 83.40233f, 135.88844f, 84.01643f, 139.0162f, 86.27064f),
                    PathNode.CurveTo(142.14397f, 88.52484f, 143.99814f, 92.14458f, 144.0f, 96.0f),
                    PathNode.LineTo(144.0f, 136.0f),
                    PathNode.CurveTo(144.0f, 142.62741f, 138.62741f, 148.0f, 132.0f, 148.0f),
                    PathNode.CurveTo(125.37258f, 148.0f, 120.0f, 142.62741f, 120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.CurveTo(114.83513f, 111.99751f, 110.25123f, 108.69051f, 108.62f, 103.79f),
                    PathNode.Close,
                    PathNode.MoveTo(252.0f, 208.0f),
                    PathNode.CurveTo(252.0f, 214.62741f, 246.62741f, 220.0f, 240.0f, 220.0f),
                    PathNode.LineTo(16.0f, 220.0f),
                    PathNode.CurveTo(9.372583f, 220.0f, 4.0f, 214.62741f, 4.0f, 208.0f),
                    PathNode.CurveTo(4.0f, 201.37259f, 9.372583f, 196.0f, 16.0f, 196.0f),
                    PathNode.LineTo(20.0f, 196.0f),
                    PathNode.LineTo(20.0f, 104.0f),
                    PathNode.CurveTo(20.0f, 92.95431f, 28.954306f, 84.0f, 40.0f, 84.0f),
                    PathNode.LineTo(76.0f, 84.0f),
                    PathNode.LineTo(76.0f, 56.0f),
                    PathNode.CurveTo(76.0f, 44.954304f, 84.95431f, 36.0f, 96.0f, 36.0f),
                    PathNode.LineTo(160.0f, 36.0f),
                    PathNode.CurveTo(171.0457f, 36.0f, 180.0f, 44.954304f, 180.0f, 56.0f),
                    PathNode.LineTo(180.0f, 124.0f),
                    PathNode.LineTo(216.0f, 124.0f),
                    PathNode.CurveTo(227.0457f, 124.0f, 236.0f, 132.9543f, 236.0f, 144.0f),
                    PathNode.LineTo(236.0f, 196.0f),
                    PathNode.LineTo(240.0f, 196.0f),
                    PathNode.CurveTo(246.62741f, 196.0f, 252.0f, 201.37259f, 252.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 148.0f),
                    PathNode.LineTo(180.0f, 196.0f),
                    PathNode.LineTo(212.0f, 196.0f),
                    PathNode.LineTo(212.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(100.0f, 196.0f),
                    PathNode.LineTo(156.0f, 196.0f),
                    PathNode.LineTo(156.0f, 60.0f),
                    PathNode.LineTo(100.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(44.0f, 196.0f),
                    PathNode.LineTo(76.0f, 196.0f),
                    PathNode.LineTo(76.0f, 108.0f),
                    PathNode.LineTo(44.0f, 108.0f),
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
        return _ranking!!
    }

private var _ranking: ImageVector? = null
