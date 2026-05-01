package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Engine: ImageVector
    get() {
        if (_engine != null) return _engine!!
        _engine = tablerOutlineIcon(
            name = "Engine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 10.0f),
                    PathNode.LineTo(3.0f, 16.0f)
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
                    PathNode.MoveTo(12.0f, 5.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 5.0f),
                    PathNode.LineTo(14.0f, 5.0f)
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
                    PathNode.MoveTo(5.0f, 13.0f),
                    PathNode.LineTo(3.0f, 13.0f)
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
                    PathNode.MoveTo(6.0f, 10.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.LineTo(10.0f, 8.0f),
                    PathNode.LineTo(13.382f, 8.0f),
                    PathNode.CurveTo(13.760666f, 8.000202f, 14.106736f, 8.214271f, 14.276f, 8.553f),
                    PathNode.LineTo(15.724f, 11.447f),
                    PathNode.CurveTo(15.893264f, 11.785729f, 16.239334f, 11.999798f, 16.618f, 12.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(18.0f, 10.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.CurveTo(20.552284f, 10.0f, 21.0f, 10.447715f, 21.0f, 11.0f),
                    PathNode.LineTo(21.0f, 17.0f),
                    PathNode.CurveTo(21.0f, 17.552284f, 20.552284f, 18.0f, 20.0f, 18.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.LineTo(18.0f, 16.0f),
                    PathNode.LineTo(15.0f, 16.0f),
                    PathNode.LineTo(15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 18.552284f, 14.552285f, 19.0f, 14.0f, 19.0f),
                    PathNode.LineTo(10.535f, 19.0f),
                    PathNode.CurveTo(10.200722f, 19.00005f, 9.888525f, 18.833069f, 9.703f, 18.555f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.LineTo(6.0f, 16.0f),
                    PathNode.LineTo(6.0f, 10.0f)
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
        return _engine!!
    }

private var _engine: ImageVector? = null
