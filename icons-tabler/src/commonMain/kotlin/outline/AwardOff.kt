package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AwardOff: ImageVector
    get() {
        if (_awardOff != null) return _awardOff!!
        _awardOff = tablerOutlineIcon(
            name = "AwardOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.72f, 12.704f),
                    PathNode.CurveTo(18.59683f, 10.314169f, 18.390701f, 6.898529f, 16.240093f, 4.751748f),
                    PathNode.CurveTo(14.089487f, 2.604966f, 10.673486f, 2.404919f, 8.287f, 4.286f),
                    PathNode.MoveTo(6.532f, 6.526f),
                    PathNode.CurveTo(5.501251f, 8.800745f, 5.987313f, 11.476092f, 7.752337f, 13.242896f),
                    PathNode.CurveTo(9.517362f, 15.0097f, 12.192218f, 15.498457f, 14.468f, 14.47f)
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
                    PathNode.MoveTo(12.0f, 15.0f),
                    PathNode.LineTo(15.4f, 20.89f),
                    PathNode.LineTo(16.998f, 17.657f),
                    PathNode.LineTo(17.705f, 17.703f),
                    PathNode.MoveTo(18.813f, 14.801f),
                    PathNode.LineTo(17.196f, 12.001f)
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
                    PathNode.MoveTo(6.802f, 12.0f),
                    PathNode.LineTo(3.402f, 17.89f),
                    PathNode.LineTo(7.0f, 17.657f),
                    PathNode.LineTo(8.598f, 20.889f),
                    PathNode.LineTo(11.998f, 15.0f)
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
        return _awardOff!!
    }

private var _awardOff: ImageVector? = null
