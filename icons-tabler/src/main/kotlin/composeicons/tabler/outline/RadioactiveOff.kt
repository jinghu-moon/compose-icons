package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.RadioactiveOff: ImageVector
    get() {
        if (_radioactiveOff != null) return _radioactiveOff!!
        _radioactiveOff = tablerOutlineIcon(
            name = "RadioactiveOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.118f, 14.127f),
                    PathNode.CurveTo(13.936f, 14.308f, 13.728f, 14.468f, 13.5f, 14.6f),
                    PathNode.LineTo(16.5f, 19.79f),
                    PathNode.CurveTo(17.177925f, 19.39841f, 17.801859f, 18.92004f, 18.356f, 18.367f),
                    PathNode.MoveTo(20.036f, 16.047f),
                    PathNode.CurveTo(20.669233f, 14.79189f, 20.999401f, 13.405805f, 21.0f, 12.0f),
                    PathNode.LineTo(16.0f, 12.0f)
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
                    PathNode.MoveTo(13.5f, 9.4f),
                    PathNode.LineTo(16.5f, 4.21f),
                    PathNode.CurveTo(13.87786f, 2.696135f, 10.670244f, 2.602191f, 7.964f, 3.96f)
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
                    PathNode.MoveTo(10.5f, 14.6f),
                    PathNode.LineTo(7.5f, 19.79f),
                    PathNode.CurveTo(4.716698f, 18.18306f, 3.00151f, 15.21388f, 3.0f, 12.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.CurveTo(8.999312f, 13.072484f, 9.571201f, 14.063758f, 10.5f, 14.6f)
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
        return _radioactiveOff!!
    }

private var _radioactiveOff: ImageVector? = null
