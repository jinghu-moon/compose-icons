package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Article: ImageVector
    get() {
        if (_article != null) return _article!!
        _article = phosphorBoldIcon(
            name = "Article",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 36.0f),
                    PathNode.LineTo(40.0f, 36.0f),
                    PathNode.CurveTo(28.954306f, 36.0f, 20.0f, 44.954304f, 20.0f, 56.0f),
                    PathNode.LineTo(20.0f, 200.0f),
                    PathNode.CurveTo(20.0f, 211.0457f, 28.954306f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(227.0457f, 220.0f, 236.0f, 211.0457f, 236.0f, 200.0f),
                    PathNode.LineTo(236.0f, 56.0f),
                    PathNode.CurveTo(236.0f, 44.954304f, 227.0457f, 36.0f, 216.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 196.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(212.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 92.0f),
                    PathNode.CurveTo(68.0f, 85.37258f, 73.37258f, 80.0f, 80.0f, 80.0f),
                    PathNode.LineTo(176.0f, 80.0f),
                    PathNode.CurveTo(182.62741f, 80.0f, 188.0f, 85.37258f, 188.0f, 92.0f),
                    PathNode.CurveTo(188.0f, 98.62742f, 182.62741f, 104.0f, 176.0f, 104.0f),
                    PathNode.LineTo(80.0f, 104.0f),
                    PathNode.CurveTo(73.37258f, 104.0f, 68.0f, 98.62742f, 68.0f, 92.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 128.0f),
                    PathNode.CurveTo(68.0f, 121.37258f, 73.37258f, 116.0f, 80.0f, 116.0f),
                    PathNode.LineTo(176.0f, 116.0f),
                    PathNode.CurveTo(182.62741f, 116.0f, 188.0f, 121.37258f, 188.0f, 128.0f),
                    PathNode.CurveTo(188.0f, 134.62741f, 182.62741f, 140.0f, 176.0f, 140.0f),
                    PathNode.LineTo(80.0f, 140.0f),
                    PathNode.CurveTo(73.37258f, 140.0f, 68.0f, 134.62741f, 68.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 164.0f),
                    PathNode.CurveTo(68.0f, 157.37259f, 73.37258f, 152.0f, 80.0f, 152.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.CurveTo(182.62741f, 152.0f, 188.0f, 157.37259f, 188.0f, 164.0f),
                    PathNode.CurveTo(188.0f, 170.62741f, 182.62741f, 176.0f, 176.0f, 176.0f),
                    PathNode.LineTo(80.0f, 176.0f),
                    PathNode.CurveTo(73.37258f, 176.0f, 68.0f, 170.62741f, 68.0f, 164.0f),
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
        return _article!!
    }

private var _article: ImageVector? = null
