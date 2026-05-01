package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Abc: ImageVector
    get() {
        if (_abc != null) return _abc!!
        _abc = tablerOutlineIcon(
            name = "Abc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 16.0f),
                    PathNode.LineTo(3.0f, 10.0f),
                    PathNode.CurveTo(3.0f, 8.895431f, 3.895431f, 8.0f, 5.0f, 8.0f),
                    PathNode.CurveTo(6.10457f, 8.0f, 7.0f, 8.895431f, 7.0f, 10.0f),
                    PathNode.LineTo(7.0f, 16.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 13.0f),
                    PathNode.LineTo(7.0f, 13.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 8.0f),
                    PathNode.LineTo(10.0f, 14.0f),
                    PathNode.CurveTo(10.0f, 15.104569f, 10.895431f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(13.104569f, 16.0f, 14.0f, 15.104569f, 14.0f, 14.0f),
                    PathNode.LineTo(14.0f, 13.0f),
                    PathNode.CurveTo(14.0f, 11.895431f, 13.104569f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(10.895431f, 11.0f, 10.0f, 11.895431f, 10.0f, 13.0f),
                    PathNode.LineTo(10.0f, 14.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.732f, 12.0f),
                    PathNode.CurveTo(20.279371f, 11.216118f, 19.356688f, 10.833959f, 18.482355f, 11.068238f),
                    PathNode.CurveTo(17.608023f, 11.302518f, 17.00004f, 12.094824f, 17.0f, 13.0f),
                    PathNode.LineTo(17.0f, 14.0f),
                    PathNode.CurveTo(17.000187f, 14.902899f, 17.605297f, 15.693708f, 18.476748f, 15.929931f),
                    PathNode.CurveTo(19.348196f, 16.166153f, 20.269852f, 15.789202f, 20.726f, 15.01f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _abc!!
    }

private var _abc: ImageVector? = null
