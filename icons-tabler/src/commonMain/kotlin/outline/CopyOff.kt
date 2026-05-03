package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CopyOff: ImageVector
    get() {
        if (_copyOff != null) return _copyOff!!
        _copyOff = tablerOutlineIcon(
            name = "CopyOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.414f, 19.415f),
                    PathNode.CurveTo(19.03885f, 19.789732f, 18.530247f, 20.000153f, 18.0f, 20.0f),
                    PathNode.LineTo(10.0f, 20.0f),
                    PathNode.CurveTo(8.895431f, 20.0f, 8.0f, 19.10457f, 8.0f, 18.0f),
                    PathNode.LineTo(8.0f, 10.0f),
                    PathNode.CurveTo(8.0f, 9.446f, 8.225001f, 8.945f, 8.589f, 8.583f),
                    PathNode.MoveTo(12.0f, 8.0f),
                    PathNode.LineTo(18.0f, 8.0f),
                    PathNode.CurveTo(19.10457f, 8.0f, 20.0f, 8.895431f, 20.0f, 10.0f),
                    PathNode.LineTo(20.0f, 16.0f)
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
                    PathNode.MoveTo(16.0f, 8.0f),
                    PathNode.LineTo(16.0f, 6.0f),
                    PathNode.CurveTo(16.0f, 4.895431f, 15.104569f, 4.0f, 14.0f, 4.0f),
                    PathNode.LineTo(8.0f, 4.0f),
                    PathNode.MoveTo(4.582f, 4.59f),
                    PathNode.CurveTo(4.222f, 4.95f, 4.0f, 5.45f, 4.0f, 6.0f),
                    PathNode.LineTo(4.0f, 14.0f),
                    PathNode.CurveTo(4.0f, 15.104569f, 4.895431f, 16.0f, 6.0f, 16.0f),
                    PathNode.LineTo(8.0f, 16.0f)
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
        return _copyOff!!
    }

private var _copyOff: ImageVector? = null
