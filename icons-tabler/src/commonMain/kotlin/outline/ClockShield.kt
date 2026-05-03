package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockShield: ImageVector
    get() {
        if (_clockShield != null) return _clockShield!!
        _clockShield = tablerOutlineIcon(
            name = "ClockShield",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(20.99999f, 8.358022f, 18.80504f, 5.075037f, 15.439515f, 3.683188f),
                    PathNode.CurveTo(12.07399f, 2.291339f, 8.201366f, 3.065014f, 5.628964f, 5.643144f),
                    PathNode.CurveTo(3.056563f, 8.221275f, 2.291505f, 12.095611f, 3.690838f, 15.458032f),
                    PathNode.CurveTo(5.090171f, 18.820452f, 8.378031f, 21.008093f, 12.02f, 21.0f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(13.0f, 13.0f)
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
                    PathNode.MoveTo(22.0f, 16.0f),
                    PathNode.CurveTo(22.0f, 20.0f, 19.5f, 22.0f, 18.5f, 22.0f),
                    PathNode.CurveTo(17.5f, 22.0f, 15.0f, 20.0f, 15.0f, 16.0f),
                    PathNode.CurveTo(16.0f, 16.0f, 17.5f, 15.5f, 18.5f, 14.5f),
                    PathNode.CurveTo(19.5f, 15.5f, 21.0f, 16.0f, 22.0f, 16.0f)
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
        return _clockShield!!
    }

private var _clockShield: ImageVector? = null
