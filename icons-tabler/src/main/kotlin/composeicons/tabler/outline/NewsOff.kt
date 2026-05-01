package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NewsOff: ImageVector
    get() {
        if (_newsOff != null) return _newsOff!!
        _newsOff = tablerOutlineIcon(
            name = "NewsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 6.0f),
                    PathNode.LineTo(19.0f, 6.0f),
                    PathNode.CurveTo(19.552284f, 6.0f, 20.0f, 6.447716f, 20.0f, 7.0f),
                    PathNode.LineTo(20.0f, 16.0f),
                    PathNode.MoveTo(19.394f, 19.435f),
                    PathNode.CurveTo(18.817533f, 19.99533f, 17.961597f, 20.15604f, 17.221146f, 19.842972f),
                    PathNode.CurveTo(16.480692f, 19.529905f, 15.999655f, 18.803917f, 16.0f, 18.0f),
                    PathNode.LineTo(16.0f, 16.0f),
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.LineTo(16.0f, 5.0f),
                    PathNode.CurveTo(16.0f, 4.447716f, 15.552285f, 4.0f, 15.0f, 4.0f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.MoveTo(4.265f, 4.321f),
                    PathNode.CurveTo(4.09439f, 4.505935f, 3.999766f, 4.748388f, 4.0f, 5.0f),
                    PathNode.LineTo(4.0f, 17.0f),
                    PathNode.CurveTo(4.0f, 18.656855f, 5.343146f, 20.0f, 7.0f, 20.0f),
                    PathNode.LineTo(18.0f, 20.0f)
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
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.LineTo(12.0f, 12.0f)
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
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(12.0f, 16.0f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _newsOff!!
    }

private var _newsOff: ImageVector? = null
