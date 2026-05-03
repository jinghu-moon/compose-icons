package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bucket: ImageVector
    get() {
        if (_bucket != null) return _bucket!!
        _bucket = tablerOutlineIcon(
            name = "Bucket",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 7.0f),
                    PathNode.CurveTo(4.0f, 9.209139f, 7.581722f, 11.0f, 12.0f, 11.0f),
                    PathNode.CurveTo(16.418278f, 11.0f, 20.0f, 9.209139f, 20.0f, 7.0f),
                    PathNode.CurveTo(20.0f, 4.790861f, 16.418278f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.581722f, 3.0f, 4.0f, 4.790861f, 4.0f, 7.0f)
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
                    PathNode.MoveTo(4.0f, 7.0f),
                    PathNode.CurveTo(4.0f, 7.664f, 4.088f, 8.324001f, 4.263f, 8.965f),
                    PathNode.LineTo(7.0f, 19.0f),
                    PathNode.CurveTo(7.5f, 20.5f, 9.239f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(14.761f, 21.0f, 16.5f, 20.5f, 17.0f, 19.0f),
                    PathNode.CurveTo(17.333f, 18.0f, 18.246f, 14.655f, 19.737f, 8.965f),
                    PathNode.CurveTo(19.911816f, 8.324641f, 20.000265f, 7.663792f, 20.0f, 7.0f)
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
        return _bucket!!
    }

private var _bucket: ImageVector? = null
