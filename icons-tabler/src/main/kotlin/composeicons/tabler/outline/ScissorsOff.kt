package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ScissorsOff: ImageVector
    get() {
        if (_scissorsOff != null) return _scissorsOff!!
        _scissorsOff = tablerOutlineIcon(
            name = "ScissorsOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.432f, 4.442f),
                    PathNode.CurveTo(3.376463f, 5.090042f, 2.827697f, 6.32015f, 3.050605f, 7.538521f),
                    PathNode.CurveTo(3.273512f, 8.756891f, 4.222262f, 9.713021f, 5.43887f, 9.945362f),
                    PathNode.CurveTo(6.655477f, 10.177703f, 7.8898f, 9.638484f, 8.546f, 8.588f)
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
                    PathNode.MoveTo(3.0f, 17.0f),
                    PathNode.CurveTo(3.0f, 18.656855f, 4.343146f, 20.0f, 6.0f, 20.0f),
                    PathNode.CurveTo(7.656854f, 20.0f, 9.0f, 18.656855f, 9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 15.343145f, 7.656854f, 14.0f, 6.0f, 14.0f),
                    PathNode.CurveTo(4.343146f, 14.0f, 3.0f, 15.343145f, 3.0f, 17.0f)
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
                    PathNode.MoveTo(8.6f, 15.4f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(19.0f, 5.0f)
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
        return _scissorsOff!!
    }

private var _scissorsOff: ImageVector? = null
