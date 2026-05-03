package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.StethoscopeOff: ImageVector
    get() {
        if (_stethoscopeOff != null) return _stethoscopeOff!!
        _stethoscopeOff = tablerOutlineIcon(
            name = "StethoscopeOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.172f, 4.179f),
                    PathNode.CurveTo(3.458077f, 4.503697f, 2.999825f, 5.215709f, 3.0f, 6.0f),
                    PathNode.LineTo(3.0f, 9.5f),
                    PathNode.CurveTo(2.999943f, 11.85402f, 4.497998f, 13.947086f, 6.72624f, 14.706263f),
                    PathNode.CurveTo(8.954482f, 15.465439f, 11.41882f, 14.722384f, 12.856f, 12.858f),
                    PathNode.MoveTo(14.0f, 10.0f),
                    PathNode.LineTo(14.0f, 6.0f),
                    PathNode.CurveTo(14.0f, 4.895431f, 13.104569f, 4.0f, 12.0f, 4.0f),
                    PathNode.LineTo(11.0f, 4.0f)
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
                    PathNode.MoveTo(8.0f, 15.0f),
                    PathNode.CurveTo(7.999958f, 17.556652f, 9.620004f, 19.8325f, 12.035773f, 20.669476f),
                    PathNode.CurveTo(14.451544f, 21.506449f, 17.132328f, 20.720676f, 18.714f, 18.712f),
                    PathNode.MoveTo(19.93f, 15.914f),
                    PathNode.CurveTo(19.976f, 15.614f, 20.0f, 15.309f, 20.0f, 15.0f),
                    PathNode.LineTo(20.0f, 12.0f)
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
                    PathNode.MoveTo(11.0f, 3.0f),
                    PathNode.LineTo(11.0f, 5.0f)
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
                    PathNode.MoveTo(18.0f, 10.0f),
                    PathNode.CurveTo(18.0f, 11.104569f, 18.89543f, 12.0f, 20.0f, 12.0f),
                    PathNode.CurveTo(21.10457f, 12.0f, 22.0f, 11.104569f, 22.0f, 10.0f),
                    PathNode.CurveTo(22.0f, 8.895431f, 21.10457f, 8.0f, 20.0f, 8.0f),
                    PathNode.CurveTo(18.89543f, 8.0f, 18.0f, 8.895431f, 18.0f, 10.0f)
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
        return _stethoscopeOff!!
    }

private var _stethoscopeOff: ImageVector? = null
