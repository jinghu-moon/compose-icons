package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ProgressHelp: ImageVector
    get() {
        if (_progressHelp != null) return _progressHelp!!
        _progressHelp = tablerOutlineIcon(
            name = "ProgressHelp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 20.777f),
                    PathNode.CurveTo(9.129608f, 20.579575f, 8.293677f, 20.252954f, 7.52f, 19.808f)
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
                    PathNode.MoveTo(14.0f, 3.223f),
                    PathNode.CurveTo(18.094488f, 4.158134f, 20.998436f, 7.800083f, 20.998436f, 12.0f),
                    PathNode.CurveTo(20.998436f, 16.199917f, 18.094488f, 19.841867f, 14.0f, 20.777f)
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
                    PathNode.MoveTo(4.579f, 17.093f),
                    PathNode.CurveTo(4.033505f, 16.300472f, 3.6192f, 15.425267f, 3.352f, 14.501f)
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
                    PathNode.MoveTo(3.124f, 10.5f),
                    PathNode.CurveTo(3.284f, 9.55f, 3.592f, 8.65f, 4.024f, 7.825f),
                    PathNode.LineTo(4.193f, 7.52f)
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
                    PathNode.MoveTo(6.907f, 4.579f),
                    PathNode.CurveTo(7.842654f, 3.9349f, 8.892322f, 3.474717f, 10.0f, 3.223f)
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
        return _progressHelp!!
    }

private var _progressHelp: ImageVector? = null
