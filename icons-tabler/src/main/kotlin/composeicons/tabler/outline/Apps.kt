package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Apps: ImageVector
    get() {
        if (_apps != null) return _apps!!
        _apps = tablerOutlineIcon(
            name = "Apps",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 4.447716f, 4.447716f, 4.0f, 5.0f, 4.0f),
                    PathNode.LineTo(9.0f, 4.0f),
                    PathNode.CurveTo(9.552285f, 4.0f, 10.0f, 4.447716f, 10.0f, 5.0f),
                    PathNode.LineTo(10.0f, 9.0f),
                    PathNode.CurveTo(10.0f, 9.552285f, 9.552285f, 10.0f, 9.0f, 10.0f),
                    PathNode.LineTo(5.0f, 10.0f),
                    PathNode.CurveTo(4.447716f, 10.0f, 4.0f, 9.552285f, 4.0f, 9.0f),
                    PathNode.LineTo(4.0f, 5.0f)
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
                    PathNode.MoveTo(4.0f, 15.0f),
                    PathNode.CurveTo(4.0f, 14.447715f, 4.447716f, 14.0f, 5.0f, 14.0f),
                    PathNode.LineTo(9.0f, 14.0f),
                    PathNode.CurveTo(9.552285f, 14.0f, 10.0f, 14.447715f, 10.0f, 15.0f),
                    PathNode.LineTo(10.0f, 19.0f),
                    PathNode.CurveTo(10.0f, 19.552284f, 9.552285f, 20.0f, 9.0f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(4.447716f, 20.0f, 4.0f, 19.552284f, 4.0f, 19.0f),
                    PathNode.LineTo(4.0f, 15.0f)
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
                    PathNode.MoveTo(14.0f, 15.0f),
                    PathNode.CurveTo(14.0f, 14.447715f, 14.447715f, 14.0f, 15.0f, 14.0f),
                    PathNode.LineTo(19.0f, 14.0f),
                    PathNode.CurveTo(19.552284f, 14.0f, 20.0f, 14.447715f, 20.0f, 15.0f),
                    PathNode.LineTo(20.0f, 19.0f),
                    PathNode.CurveTo(20.0f, 19.552284f, 19.552284f, 20.0f, 19.0f, 20.0f),
                    PathNode.LineTo(15.0f, 20.0f),
                    PathNode.CurveTo(14.447715f, 20.0f, 14.0f, 19.552284f, 14.0f, 19.0f),
                    PathNode.LineTo(14.0f, 15.0f)
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
                    PathNode.MoveTo(14.0f, 7.0f),
                    PathNode.LineTo(20.0f, 7.0f)
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
                    PathNode.MoveTo(17.0f, 4.0f),
                    PathNode.LineTo(17.0f, 10.0f)
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
        return _apps!!
    }

private var _apps: ImageVector? = null
