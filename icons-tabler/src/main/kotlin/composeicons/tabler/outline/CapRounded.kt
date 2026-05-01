package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CapRounded: ImageVector
    get() {
        if (_capRounded != null) return _capRounded!!
        _capRounded = tablerOutlineIcon(
            name = "CapRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.0f, 6.0f),
                    PathNode.LineTo(11.0f, 6.0f),
                    PathNode.CurveTo(7.686292f, 6.0f, 5.0f, 8.686292f, 5.0f, 12.0f),
                    PathNode.CurveTo(5.0f, 15.313708f, 7.686292f, 18.0f, 11.0f, 18.0f),
                    PathNode.LineTo(20.0f, 18.0f)
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
                    PathNode.MoveTo(13.0f, 12.0f),
                    PathNode.CurveTo(13.0f, 13.104569f, 12.104569f, 14.0f, 11.0f, 14.0f),
                    PathNode.CurveTo(9.895431f, 14.0f, 9.0f, 13.104569f, 9.0f, 12.0f),
                    PathNode.CurveTo(9.0f, 10.895431f, 9.895431f, 10.0f, 11.0f, 10.0f),
                    PathNode.CurveTo(12.104569f, 10.0f, 13.0f, 10.895431f, 13.0f, 12.0f)
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
                    PathNode.MoveTo(13.0f, 12.0f),
                    PathNode.LineTo(20.0f, 12.0f)
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
        return _capRounded!!
    }

private var _capRounded: ImageVector? = null
