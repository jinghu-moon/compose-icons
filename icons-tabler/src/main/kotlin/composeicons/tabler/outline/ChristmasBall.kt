package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ChristmasBall: ImageVector
    get() {
        if (_christmasBall != null) return _christmasBall!!
        _christmasBall = tablerOutlineIcon(
            name = "ChristmasBall",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 13.0f),
                    PathNode.CurveTo(4.0f, 17.418278f, 7.581722f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(16.418278f, 21.0f, 20.0f, 17.418278f, 20.0f, 13.0f),
                    PathNode.CurveTo(20.0f, 8.581722f, 16.418278f, 5.0f, 12.0f, 5.0f),
                    PathNode.CurveTo(7.581722f, 5.0f, 4.0f, 8.581722f, 4.0f, 13.0f)
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
                    PathNode.MoveTo(11.0f, 5.0f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(13.0f, 5.0f)
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
                    PathNode.MoveTo(4.512f, 10.161f),
                    PathNode.CurveTo(7.008f, 9.056f, 9.504f, 9.336f, 12.0f, 11.0f),
                    PathNode.CurveTo(14.627f, 12.752f, 17.255f, 12.97f, 19.882f, 11.653f)
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
                    PathNode.MoveTo(4.315f, 15.252f),
                    PathNode.CurveTo(6.876f, 14.042f, 9.438f, 14.292f, 12.0f, 16.0f),
                    PathNode.CurveTo(14.293f, 17.528f, 16.585f, 17.889f, 18.878f, 17.081f)
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
        return _christmasBall!!
    }

private var _christmasBall: ImageVector? = null
