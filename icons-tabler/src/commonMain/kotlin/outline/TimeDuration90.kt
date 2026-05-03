package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.TimeDuration90: ImageVector
    get() {
        if (_timeDuration90 != null) return _timeDuration90!!
        _timeDuration90 = tablerOutlineIcon(
            name = "TimeDuration90",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.0f, 14.25f),
                    PathNode.CurveTo(8.0f, 14.664f, 8.336001f, 15.0f, 8.75f, 15.0f),
                    PathNode.LineTo(10.25f, 15.0f),
                    PathNode.CurveTo(10.664213f, 15.0f, 11.0f, 14.664213f, 11.0f, 14.25f),
                    PathNode.LineTo(11.0f, 9.75f),
                    PathNode.CurveTo(11.0f, 9.335787f, 10.664213f, 9.0f, 10.25f, 9.0f),
                    PathNode.LineTo(8.75f, 9.0f),
                    PathNode.CurveTo(8.335787f, 9.0f, 8.0f, 9.335787f, 8.0f, 9.75f),
                    PathNode.LineTo(8.0f, 11.25f),
                    PathNode.CurveTo(8.0f, 11.664f, 8.336001f, 12.0f, 8.75f, 12.0f),
                    PathNode.LineTo(11.0f, 12.0f)
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
                    PathNode.MoveTo(14.0f, 10.5f),
                    PathNode.LineTo(14.0f, 13.5f),
                    PathNode.CurveTo(14.0f, 14.328427f, 14.671573f, 15.0f, 15.5f, 15.0f),
                    PathNode.CurveTo(16.328426f, 15.0f, 17.0f, 14.328427f, 17.0f, 13.5f),
                    PathNode.LineTo(17.0f, 10.5f),
                    PathNode.CurveTo(17.0f, 9.671573f, 16.328426f, 9.0f, 15.5f, 9.0f),
                    PathNode.CurveTo(14.671573f, 9.0f, 14.0f, 9.671573f, 14.0f, 10.5f)
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
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.0f, 16.970562f, 7.029437f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.970562f, 21.0f, 21.0f, 16.970562f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 7.029437f, 16.970562f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(7.029437f, 3.0f, 3.0f, 7.029437f, 3.0f, 12.0f)
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
        return _timeDuration90!!
    }

private var _timeDuration90: ImageVector? = null
