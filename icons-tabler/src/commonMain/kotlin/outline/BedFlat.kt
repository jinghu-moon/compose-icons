package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BedFlat: ImageVector
    get() {
        if (_bedFlat != null) return _bedFlat!!
        _bedFlat = tablerOutlineIcon(
            name = "BedFlat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 11.0f),
                    PathNode.CurveTo(3.0f, 12.104569f, 3.895431f, 13.0f, 5.0f, 13.0f),
                    PathNode.CurveTo(6.10457f, 13.0f, 7.0f, 12.104569f, 7.0f, 11.0f),
                    PathNode.CurveTo(7.0f, 9.895431f, 6.10457f, 9.0f, 5.0f, 9.0f),
                    PathNode.CurveTo(3.895431f, 9.0f, 3.0f, 9.895431f, 3.0f, 11.0f)
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
                    PathNode.MoveTo(10.0f, 13.0f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.CurveTo(21.0f, 9.343145f, 19.656855f, 8.0f, 18.0f, 8.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.LineTo(10.0f, 13.0f)
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
                    PathNode.MoveTo(3.0f, 16.0f),
                    PathNode.LineTo(21.0f, 16.0f)
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
        return _bedFlat!!
    }

private var _bedFlat: ImageVector? = null
