package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Skull: ImageVector
    get() {
        if (_skull != null) return _skull!!
        _skull = tablerOutlineIcon(
            name = "Skull",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 4.0f),
                    PathNode.CurveTo(16.418f, 4.0f, 20.0f, 7.358f, 20.0f, 11.5f),
                    PathNode.CurveTo(20.0f, 13.401f, 19.245f, 15.137f, 18.0f, 16.46f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.0f, 19.552284f, 17.552284f, 20.0f, 17.0f, 20.0f),
                    PathNode.LineTo(7.0f, 20.0f),
                    PathNode.CurveTo(6.447716f, 20.0f, 6.0f, 19.552284f, 6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 16.46f),
                    PathNode.CurveTo(4.755f, 15.138f, 4.0f, 13.402f, 4.0f, 11.5f),
                    PathNode.CurveTo(4.0f, 7.358f, 7.582f, 4.0f, 12.0f, 4.0f)
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
                    PathNode.MoveTo(10.0f, 17.0f),
                    PathNode.LineTo(10.0f, 20.0f)
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
                    PathNode.MoveTo(14.0f, 17.0f),
                    PathNode.LineTo(14.0f, 20.0f)
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
                    PathNode.MoveTo(8.0f, 11.0f),
                    PathNode.CurveTo(8.0f, 11.552285f, 8.447715f, 12.0f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.552285f, 12.0f, 10.0f, 11.552285f, 10.0f, 11.0f),
                    PathNode.CurveTo(10.0f, 10.447715f, 9.552285f, 10.0f, 9.0f, 10.0f),
                    PathNode.CurveTo(8.447715f, 10.0f, 8.0f, 10.447715f, 8.0f, 11.0f)
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
                    PathNode.MoveTo(14.0f, 11.0f),
                    PathNode.CurveTo(14.0f, 11.552285f, 14.447715f, 12.0f, 15.0f, 12.0f),
                    PathNode.CurveTo(15.552285f, 12.0f, 16.0f, 11.552285f, 16.0f, 11.0f),
                    PathNode.CurveTo(16.0f, 10.447715f, 15.552285f, 10.0f, 15.0f, 10.0f),
                    PathNode.CurveTo(14.447715f, 10.0f, 14.0f, 10.447715f, 14.0f, 11.0f)
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
        return _skull!!
    }

private var _skull: ImageVector? = null
