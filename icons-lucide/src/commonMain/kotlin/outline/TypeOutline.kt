package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.TypeOutline: ImageVector
    get() {
        if (_typeOutline != null) return _typeOutline!!
        _typeOutline = lucideOutlineIcon(
            name = "TypeOutline",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.0f, 16.5f),
                    PathNode.CurveTo(14.0f, 16.776142f, 14.223858f, 17.0f, 14.5f, 17.0f),
                    PathNode.LineTo(15.0f, 17.0f),
                    PathNode.CurveTo(16.10457f, 17.0f, 17.0f, 17.89543f, 17.0f, 19.0f),
                    PathNode.CurveTo(17.0f, 20.10457f, 16.10457f, 21.0f, 15.0f, 21.0f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.CurveTo(7.895431f, 21.0f, 7.0f, 20.10457f, 7.0f, 19.0f),
                    PathNode.CurveTo(7.0f, 17.89543f, 7.895431f, 17.0f, 9.0f, 17.0f),
                    PathNode.LineTo(9.5f, 17.0f),
                    PathNode.CurveTo(9.776142f, 17.0f, 10.0f, 16.776142f, 10.0f, 16.5f),
                    PathNode.LineTo(10.0f, 7.5f),
                    PathNode.CurveTo(10.0f, 7.223858f, 9.776142f, 7.0f, 9.5f, 7.0f),
                    PathNode.LineTo(6.5f, 7.0f),
                    PathNode.CurveTo(6.223858f, 7.0f, 6.0f, 7.223858f, 6.0f, 7.5f),
                    PathNode.LineTo(6.0f, 8.0f),
                    PathNode.CurveTo(6.0f, 9.104569f, 5.10457f, 10.0f, 4.0f, 10.0f),
                    PathNode.CurveTo(2.895431f, 10.0f, 2.0f, 9.104569f, 2.0f, 8.0f),
                    PathNode.LineTo(2.0f, 5.0f),
                    PathNode.CurveTo(2.0f, 3.895431f, 2.895431f, 3.0f, 4.0f, 3.0f),
                    PathNode.LineTo(20.0f, 3.0f),
                    PathNode.CurveTo(21.10457f, 3.0f, 22.0f, 3.895431f, 22.0f, 5.0f),
                    PathNode.LineTo(22.0f, 8.0f),
                    PathNode.CurveTo(22.0f, 9.104569f, 21.10457f, 10.0f, 20.0f, 10.0f),
                    PathNode.CurveTo(18.89543f, 10.0f, 18.0f, 9.104569f, 18.0f, 8.0f),
                    PathNode.LineTo(18.0f, 7.5f),
                    PathNode.CurveTo(18.0f, 7.223858f, 17.776142f, 7.0f, 17.5f, 7.0f),
                    PathNode.LineTo(14.5f, 7.0f),
                    PathNode.CurveTo(14.223858f, 7.0f, 14.0f, 7.223858f, 14.0f, 7.5f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1.0f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1.0f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _typeOutline!!
    }

private var _typeOutline: ImageVector? = null
