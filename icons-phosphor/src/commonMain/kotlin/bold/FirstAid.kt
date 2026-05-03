package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FirstAid: ImageVector
    get() {
        if (_firstAid != null) return _firstAid!!
        _firstAid = phosphorBoldIcon(
            name = "FirstAid",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 84.0f),
                    PathNode.LineTo(172.0f, 84.0f),
                    PathNode.LineTo(172.0f, 40.0f),
                    PathNode.CurveTo(172.0f, 28.954306f, 163.0457f, 20.0f, 152.0f, 20.0f),
                    PathNode.LineTo(104.0f, 20.0f),
                    PathNode.CurveTo(92.95431f, 20.0f, 84.0f, 28.954306f, 84.0f, 40.0f),
                    PathNode.LineTo(84.0f, 84.0f),
                    PathNode.LineTo(40.0f, 84.0f),
                    PathNode.CurveTo(28.954306f, 84.0f, 20.0f, 92.95431f, 20.0f, 104.0f),
                    PathNode.LineTo(20.0f, 152.0f),
                    PathNode.CurveTo(20.0f, 163.0457f, 28.954306f, 172.0f, 40.0f, 172.0f),
                    PathNode.LineTo(84.0f, 172.0f),
                    PathNode.LineTo(84.0f, 216.0f),
                    PathNode.CurveTo(84.0f, 227.0457f, 92.95431f, 236.0f, 104.0f, 236.0f),
                    PathNode.LineTo(152.0f, 236.0f),
                    PathNode.CurveTo(163.0457f, 236.0f, 172.0f, 227.0457f, 172.0f, 216.0f),
                    PathNode.LineTo(172.0f, 172.0f),
                    PathNode.LineTo(216.0f, 172.0f),
                    PathNode.CurveTo(227.0457f, 172.0f, 236.0f, 163.0457f, 236.0f, 152.0f),
                    PathNode.LineTo(236.0f, 104.0f),
                    PathNode.CurveTo(236.0f, 92.95431f, 227.0457f, 84.0f, 216.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 148.0f),
                    PathNode.LineTo(160.0f, 148.0f),
                    PathNode.CurveTo(153.37259f, 148.0f, 148.0f, 153.37259f, 148.0f, 160.0f),
                    PathNode.LineTo(148.0f, 212.0f),
                    PathNode.LineTo(108.0f, 212.0f),
                    PathNode.LineTo(108.0f, 160.0f),
                    PathNode.CurveTo(108.0f, 153.37259f, 102.62742f, 148.0f, 96.0f, 148.0f),
                    PathNode.LineTo(44.0f, 148.0f),
                    PathNode.LineTo(44.0f, 108.0f),
                    PathNode.LineTo(96.0f, 108.0f),
                    PathNode.CurveTo(102.62742f, 108.0f, 108.0f, 102.62742f, 108.0f, 96.0f),
                    PathNode.LineTo(108.0f, 44.0f),
                    PathNode.LineTo(148.0f, 44.0f),
                    PathNode.LineTo(148.0f, 96.0f),
                    PathNode.CurveTo(148.0f, 102.62742f, 153.37259f, 108.0f, 160.0f, 108.0f),
                    PathNode.LineTo(212.0f, 108.0f),
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
        return _firstAid!!
    }

private var _firstAid: ImageVector? = null
