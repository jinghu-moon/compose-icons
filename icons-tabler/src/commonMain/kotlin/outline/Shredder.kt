package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Shredder: ImageVector
    get() {
        if (_shredder != null) return _shredder!!
        _shredder = tablerOutlineIcon(
            name = "Shredder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 11.0f),
                    PathNode.CurveTo(4.0f, 10.447715f, 4.447716f, 10.0f, 5.0f, 10.0f),
                    PathNode.LineTo(19.0f, 10.0f),
                    PathNode.CurveTo(19.552284f, 10.0f, 20.0f, 10.447715f, 20.0f, 11.0f),
                    PathNode.LineTo(20.0f, 14.0f),
                    PathNode.CurveTo(20.0f, 14.552285f, 19.552284f, 15.0f, 19.0f, 15.0f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.CurveTo(4.447716f, 15.0f, 4.0f, 14.552285f, 4.0f, 14.0f),
                    PathNode.LineTo(4.0f, 11.0f)
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.LineTo(17.0f, 6.0f),
                    PathNode.CurveTo(17.0f, 4.895431f, 16.10457f, 4.0f, 15.0f, 4.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(7.895431f, 4.0f, 7.0f, 4.895431f, 7.0f, 6.0f),
                    PathNode.LineTo(7.0f, 10.0f),
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(12.0f, 20.0f),
                    PathNode.MoveTo(16.0f, 15.0f),
                    PathNode.LineTo(16.0f, 17.0f),
                    PathNode.MoveTo(8.0f, 15.0f),
                    PathNode.LineTo(8.0f, 18.0f)
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
        return _shredder!!
    }

private var _shredder: ImageVector? = null
