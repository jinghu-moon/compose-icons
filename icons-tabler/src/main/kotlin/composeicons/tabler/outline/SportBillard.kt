package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SportBillard: ImageVector
    get() {
        if (_sportBillard != null) return _sportBillard!!
        _sportBillard = tablerOutlineIcon(
            name = "SportBillard",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.0f, 10.0f),
                    PathNode.CurveTo(10.0f, 11.104569f, 10.895431f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(13.104569f, 12.0f, 14.0f, 11.104569f, 14.0f, 10.0f),
                    PathNode.CurveTo(14.0f, 8.895431f, 13.104569f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(10.895431f, 8.0f, 10.0f, 8.895431f, 10.0f, 10.0f)
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
                    PathNode.MoveTo(10.0f, 14.0f),
                    PathNode.CurveTo(10.0f, 15.104569f, 10.895431f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(13.104569f, 16.0f, 14.0f, 15.104569f, 14.0f, 14.0f),
                    PathNode.CurveTo(14.0f, 12.895431f, 13.104569f, 12.0f, 12.0f, 12.0f),
                    PathNode.CurveTo(10.895431f, 12.0f, 10.0f, 12.895431f, 10.0f, 14.0f)
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
                    PathNode.MoveTo(4.0f, 12.0f),
                    PathNode.CurveTo(4.0f, 16.418278f, 7.581722f, 20.0f, 12.0f, 20.0f),
                    PathNode.CurveTo(16.418278f, 20.0f, 20.0f, 16.418278f, 20.0f, 12.0f),
                    PathNode.CurveTo(20.0f, 7.581722f, 16.418278f, 4.0f, 12.0f, 4.0f),
                    PathNode.CurveTo(7.581722f, 4.0f, 4.0f, 7.581722f, 4.0f, 12.0f)
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
        return _sportBillard!!
    }

private var _sportBillard: ImageVector? = null
