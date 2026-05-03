package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Sleigh: ImageVector
    get() {
        if (_sleigh != null) return _sleigh!!
        _sleigh = tablerOutlineIcon(
            name = "Sleigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 19.0f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(20.209139f, 19.0f, 22.0f, 17.209139f, 22.0f, 15.0f)
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
                    PathNode.MoveTo(16.0f, 15.0f),
                    PathNode.LineTo(7.0f, 15.0f),
                    PathNode.CurveTo(4.790861f, 15.0f, 3.0f, 13.209139f, 3.0f, 11.0f),
                    PathNode.LineTo(3.0f, 5.0f),
                    PathNode.LineTo(4.243f, 6.243f),
                    PathNode.CurveTo(5.36812f, 7.36793f, 6.893975f, 7.999926f, 8.485f, 8.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.LineTo(12.0f, 10.0f),
                    PathNode.CurveTo(12.0f, 11.104569f, 12.895431f, 12.0f, 14.0f, 12.0f),
                    PathNode.LineTo(14.5f, 12.0f),
                    PathNode.CurveTo(15.328427f, 12.0f, 16.0f, 11.328427f, 16.0f, 10.5f),
                    PathNode.CurveTo(16.0f, 9.671573f, 16.671574f, 9.0f, 17.5f, 9.0f),
                    PathNode.CurveTo(18.328426f, 9.0f, 19.0f, 9.671573f, 19.0f, 10.5f),
                    PathNode.LineTo(19.0f, 12.0f),
                    PathNode.CurveTo(19.0f, 13.656855f, 17.656855f, 15.0f, 16.0f, 15.0f)
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
                    PathNode.MoveTo(15.0f, 15.0f),
                    PathNode.LineTo(15.0f, 19.0f)
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
                    PathNode.MoveTo(7.0f, 15.0f),
                    PathNode.LineTo(7.0f, 19.0f)
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
        return _sleigh!!
    }

private var _sleigh: ImageVector? = null
