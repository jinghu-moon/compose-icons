package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Jacket: ImageVector
    get() {
        if (_jacket != null) return _jacket!!
        _jacket = tablerOutlineIcon(
            name = "Jacket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 3.0f),
                    PathNode.LineTo(12.0f, 8.0f),
                    PathNode.LineTo(8.0f, 3.0f)
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
                    PathNode.MoveTo(12.0f, 19.0f),
                    PathNode.CurveTo(12.0f, 20.10457f, 11.104569f, 21.0f, 10.0f, 21.0f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.CurveTo(4.895431f, 21.0f, 4.0f, 20.10457f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 10.828f),
                    PathNode.CurveTo(4.000114f, 10.29761f, 4.210902f, 9.788985f, 4.586f, 9.414f),
                    PathNode.LineTo(5.414f, 8.586f),
                    PathNode.CurveTo(5.789099f, 8.211015f, 5.999887f, 7.70239f, 6.0f, 7.172f),
                    PathNode.LineTo(6.0f, 5.0f),
                    PathNode.CurveTo(6.0f, 3.895431f, 6.895431f, 3.0f, 8.0f, 3.0f),
                    PathNode.LineTo(16.0f, 3.0f),
                    PathNode.CurveTo(17.10457f, 3.0f, 18.0f, 3.895431f, 18.0f, 5.0f),
                    PathNode.LineTo(18.0f, 7.172f),
                    PathNode.CurveTo(18.000113f, 7.70239f, 18.210901f, 8.211015f, 18.586f, 8.586f),
                    PathNode.LineTo(19.414f, 9.414f),
                    PathNode.CurveTo(19.789099f, 9.788985f, 19.999887f, 10.29761f, 20.0f, 10.828f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 20.10457f, 19.10457f, 21.0f, 18.0f, 21.0f),
                    PathNode.LineTo(14.0f, 21.0f),
                    PathNode.CurveTo(12.895431f, 21.0f, 12.0f, 20.10457f, 12.0f, 19.0f)
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
                    PathNode.MoveTo(20.0f, 13.0f),
                    PathNode.LineTo(17.0f, 13.0f),
                    PathNode.CurveTo(16.447716f, 13.0f, 16.0f, 13.447715f, 16.0f, 14.0f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 16.552284f, 16.447716f, 17.0f, 17.0f, 17.0f),
                    PathNode.LineTo(20.0f, 17.0f)
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
                    PathNode.MoveTo(4.0f, 17.0f),
                    PathNode.LineTo(7.0f, 17.0f),
                    PathNode.CurveTo(7.552285f, 17.0f, 8.0f, 16.552284f, 8.0f, 16.0f),
                    PathNode.LineTo(8.0f, 14.0f),
                    PathNode.CurveTo(8.0f, 13.447715f, 7.552285f, 13.0f, 7.0f, 13.0f),
                    PathNode.LineTo(4.0f, 13.0f)
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
                    PathNode.MoveTo(12.0f, 19.0f),
                    PathNode.LineTo(12.0f, 8.0f)
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
        return _jacket!!
    }

private var _jacket: ImageVector? = null
