package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HelpOff: ImageVector
    get() {
        if (_helpOff != null) return _helpOff!!
        _helpOff = tablerOutlineIcon(
            name = "HelpOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.641f, 5.631f),
                    PathNode.CurveTo(2.123499f, 9.143255f, 2.119245f, 14.841998f, 5.6315f, 18.3595f),
                    PathNode.CurveTo(9.143755f, 21.877f, 14.842499f, 21.881254f, 18.36f, 18.369f),
                    PathNode.MoveTo(20.04f, 16.051f),
                    PathNode.CurveTo(21.78978f, 12.584411f, 21.118856f, 8.38644f, 18.375772f, 5.637903f),
                    PathNode.CurveTo(15.632688f, 2.889365f, 11.436057f, 2.210108f, 7.966f, 3.953f)
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
                    PathNode.MoveTo(12.0f, 17.0f),
                    PathNode.LineTo(12.0f, 17.01f)
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
                    PathNode.MoveTo(12.0f, 13.5f),
                    PathNode.CurveTo(11.977256f, 13.095151f, 12.119387f, 12.69834f, 12.394f, 12.4f),
                    PathNode.MoveTo(14.5f, 10.5f),
                    PathNode.CurveTo(14.865634f, 9.543826f, 14.63616f, 8.462093f, 13.913809f, 7.736721f),
                    PathNode.CurveTo(13.191457f, 7.011348f, 12.110692f, 6.77736f, 11.153f, 7.139f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _helpOff!!
    }

private var _helpOff: ImageVector? = null
