package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.AB: ImageVector
    get() {
        if (_aB != null) return _aB!!
        _aB = tablerOutlineIcon(
            name = "AB",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 16.0f),
                    PathNode.LineTo(3.0f, 10.5f),
                    PathNode.CurveTo(3.0f, 9.119288f, 4.119288f, 8.0f, 5.5f, 8.0f),
                    PathNode.CurveTo(6.880712f, 8.0f, 8.0f, 9.119288f, 8.0f, 10.5f),
                    PathNode.LineTo(8.0f, 16.0f),
                    PathNode.MoveTo(8.0f, 12.0f),
                    PathNode.LineTo(3.0f, 12.0f)
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
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.LineTo(12.0f, 18.0f)
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
                    PathNode.MoveTo(16.0f, 16.0f),
                    PathNode.LineTo(16.0f, 8.0f),
                    PathNode.LineTo(19.0f, 8.0f),
                    PathNode.CurveTo(20.10457f, 8.0f, 21.0f, 8.895431f, 21.0f, 10.0f),
                    PathNode.CurveTo(21.0f, 11.104569f, 20.10457f, 12.0f, 19.0f, 12.0f),
                    PathNode.LineTo(16.0f, 12.0f),
                    PathNode.MoveTo(19.0f, 12.0f),
                    PathNode.CurveTo(20.10457f, 12.0f, 21.0f, 12.895431f, 21.0f, 14.0f),
                    PathNode.CurveTo(21.0f, 15.104569f, 20.10457f, 16.0f, 19.0f, 16.0f),
                    PathNode.LineTo(16.0f, 16.0f)
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
        return _aB!!
    }

private var _aB: ImageVector? = null
