package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Headset: ImageVector
    get() {
        if (_headset != null) return _headset!!
        _headset = tablerOutlineIcon(
            name = "Headset",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 14.0f),
                    PathNode.LineTo(4.0f, 11.0f),
                    PathNode.CurveTo(4.0f, 6.581722f, 7.581722f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(16.418278f, 3.0f, 20.0f, 6.581722f, 20.0f, 11.0f),
                    PathNode.LineTo(20.0f, 14.0f)
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
                    PathNode.MoveTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.0f, 20.657f, 15.314f, 22.0f, 12.0f, 22.0f)
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
                    PathNode.MoveTo(4.0f, 14.0f),
                    PathNode.CurveTo(4.0f, 12.895431f, 4.895431f, 12.0f, 6.0f, 12.0f),
                    PathNode.LineTo(7.0f, 12.0f),
                    PathNode.CurveTo(8.10457f, 12.0f, 9.0f, 12.895431f, 9.0f, 14.0f),
                    PathNode.LineTo(9.0f, 17.0f),
                    PathNode.CurveTo(9.0f, 18.10457f, 8.10457f, 19.0f, 7.0f, 19.0f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.CurveTo(4.895431f, 19.0f, 4.0f, 18.10457f, 4.0f, 17.0f),
                    PathNode.LineTo(4.0f, 14.0f)
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
                    PathNode.MoveTo(15.0f, 14.0f),
                    PathNode.CurveTo(15.0f, 12.895431f, 15.895431f, 12.0f, 17.0f, 12.0f),
                    PathNode.LineTo(18.0f, 12.0f),
                    PathNode.CurveTo(19.10457f, 12.0f, 20.0f, 12.895431f, 20.0f, 14.0f),
                    PathNode.LineTo(20.0f, 17.0f),
                    PathNode.CurveTo(20.0f, 18.10457f, 19.10457f, 19.0f, 18.0f, 19.0f),
                    PathNode.LineTo(17.0f, 19.0f),
                    PathNode.CurveTo(15.895431f, 19.0f, 15.0f, 18.10457f, 15.0f, 17.0f),
                    PathNode.LineTo(15.0f, 14.0f)
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
        return _headset!!
    }

private var _headset: ImageVector? = null
