package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Diabolo: ImageVector
    get() {
        if (_diabolo != null) return _diabolo!!
        _diabolo = tablerOutlineIcon(
            name = "Diabolo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.CurveTo(4.0f, 7.656854f, 7.581722f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(16.418278f, 9.0f, 20.0f, 7.656854f, 20.0f, 6.0f),
                    PathNode.CurveTo(20.0f, 4.343146f, 16.418278f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.581722f, 3.0f, 4.0f, 4.343146f, 4.0f, 6.0f)
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
                    PathNode.MoveTo(4.0f, 6.0f),
                    PathNode.LineTo(4.0f, 6.143f),
                    PathNode.CurveTo(3.999906f, 6.247209f, 4.016102f, 6.350793f, 4.048f, 6.45f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.LineTo(4.036f, 17.67f),
                    PathNode.CurveTo(4.01219f, 17.756323f, 4.000081f, 17.845453f, 4.0f, 17.935f),
                    PathNode.LineTo(4.0f, 18.0f),
                    PathNode.CurveTo(4.0f, 19.657f, 7.582f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.418f, 21.0f, 20.0f, 19.657f, 20.0f, 18.0f),
                    PathNode.LineTo(20.0f, 17.935f),
                    PathNode.CurveTo(19.99992f, 17.845453f, 19.98781f, 17.756323f, 19.964f, 17.67f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.LineTo(19.952f, 6.45f),
                    PathNode.CurveTo(19.983898f, 6.350793f, 20.000093f, 6.247209f, 20.0f, 6.143f),
                    PathNode.LineTo(20.0f, 6.0f)
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
                    PathNode.MoveTo(6.0f, 12.0f),
                    PathNode.CurveTo(6.0f, 13.105f, 8.686f, 14.0f, 12.0f, 14.0f),
                    PathNode.CurveTo(15.314f, 14.0f, 18.0f, 13.105f, 18.0f, 12.0f)
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
        return _diabolo!!
    }

private var _diabolo: ImageVector? = null
