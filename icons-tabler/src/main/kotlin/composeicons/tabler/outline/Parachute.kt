package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Parachute: ImageVector
    get() {
        if (_parachute != null) return _parachute!!
        _parachute = tablerOutlineIcon(
            name = "Parachute",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 6.477153f, 17.522848f, 2.0f, 12.0f, 2.0f),
                    PathNode.CurveTo(6.477153f, 2.0f, 2.0f, 6.477153f, 2.0f, 12.0f)
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
                    PathNode.MoveTo(22.0f, 12.0f),
                    PathNode.CurveTo(22.0f, 10.34f, 20.54f, 9.0f, 18.75f, 9.0f),
                    PathNode.CurveTo(16.95f, 9.0f, 15.5f, 10.34f, 15.5f, 12.0f),
                    PathNode.CurveTo(15.5f, 10.34f, 13.93f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(10.07f, 9.0f, 8.5f, 10.34f, 8.5f, 12.0f),
                    PathNode.CurveTo(8.5f, 10.34f, 7.04f, 9.0f, 5.25f, 9.0f),
                    PathNode.CurveTo(3.45f, 9.0f, 2.0f, 10.34f, 2.0f, 12.0f)
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
                    PathNode.MoveTo(2.0f, 12.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(8.5f, 12.0f)
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
                    PathNode.MoveTo(15.5f, 12.0f),
                    PathNode.LineTo(12.0f, 22.0f),
                    PathNode.LineTo(22.0f, 12.0f)
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
        return _parachute!!
    }

private var _parachute: ImageVector? = null
