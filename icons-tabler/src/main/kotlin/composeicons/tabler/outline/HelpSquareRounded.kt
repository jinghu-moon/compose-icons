package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HelpSquareRounded: ImageVector
    get() {
        if (_helpSquareRounded != null) return _helpSquareRounded!!
        _helpSquareRounded = tablerOutlineIcon(
            name = "HelpSquareRounded",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.CurveTo(19.2f, 3.0f, 21.0f, 4.8f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 19.2f, 19.2f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(4.8f, 21.0f, 3.0f, 19.2f, 3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 4.8f, 4.8f, 3.0f, 12.0f, 3.0f)
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
                    PathNode.MoveTo(12.0f, 16.0f),
                    PathNode.LineTo(12.0f, 16.01f)
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
                    PathNode.MoveTo(12.0f, 13.0f),
                    PathNode.CurveTo(12.925836f, 13.002783f, 13.732558f, 12.369759f, 13.950047f, 11.469826f),
                    PathNode.CurveTo(14.167534f, 10.569893f, 13.738928f, 9.638327f, 12.914f, 9.218f),
                    PathNode.CurveTo(12.094872f, 8.798393f, 11.094618f, 8.998527f, 10.5f, 9.701f)
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
        return _helpSquareRounded!!
    }

private var _helpSquareRounded: ImageVector? = null
