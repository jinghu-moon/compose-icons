package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Magnetic: ImageVector
    get() {
        if (_magnetic != null) return _magnetic!!
        _magnetic = tablerOutlineIcon(
            name = "Magnetic",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
                    PathNode.MoveTo(18.0f, 7.0f),
                    PathNode.CurveTo(17.367f, 5.745f, 16.462f, 5.0f, 15.5f, 5.0f),
                    PathNode.CurveTo(13.567f, 5.0f, 12.0f, 8.134f, 12.0f, 12.0f),
                    PathNode.CurveTo(12.0f, 15.866f, 13.567f, 19.0f, 15.5f, 19.0f),
                    PathNode.CurveTo(17.433f, 19.0f, 19.0f, 15.866f, 19.0f, 12.0f),
                    PathNode.LineTo(19.0f, 11.0f)
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
                    PathNode.MoveTo(6.0f, 7.0f),
                    PathNode.CurveTo(6.633f, 5.745f, 7.538f, 5.0f, 8.5f, 5.0f),
                    PathNode.CurveTo(10.433f, 5.0f, 12.0f, 8.134f, 12.0f, 12.0f),
                    PathNode.CurveTo(12.0f, 15.866f, 10.433f, 19.0f, 8.5f, 19.0f),
                    PathNode.CurveTo(6.567f, 19.0f, 5.0f, 15.866f, 5.0f, 12.0f),
                    PathNode.LineTo(5.0f, 11.0f)
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
                    PathNode.LineTo(5.0f, 11.0f),
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
                    PathNode.MoveTo(17.0f, 13.0f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.LineTo(21.0f, 13.0f)
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
        return _magnetic!!
    }

private var _magnetic: ImageVector? = null
