package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = tablerOutlineIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 17.0f),
                    PathNode.CurveTo(16.0f, 18.10457f, 16.89543f, 19.0f, 18.0f, 19.0f),
                    PathNode.CurveTo(19.10457f, 19.0f, 20.0f, 18.10457f, 20.0f, 17.0f),
                    PathNode.CurveTo(20.0f, 15.895431f, 19.10457f, 15.0f, 18.0f, 15.0f),
                    PathNode.CurveTo(16.89543f, 15.0f, 16.0f, 15.895431f, 16.0f, 17.0f)
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
                    PathNode.MoveTo(5.0f, 16.0f),
                    PathNode.LineTo(5.0f, 17.0f),
                    PathNode.CurveTo(5.0f, 18.10457f, 5.895431f, 19.0f, 7.0f, 19.0f),
                    PathNode.CurveTo(8.10457f, 19.0f, 9.0f, 18.10457f, 9.0f, 17.0f),
                    PathNode.LineTo(9.0f, 12.0f),
                    PathNode.LineTo(6.0f, 12.0f),
                    PathNode.CurveTo(4.343146f, 12.0f, 3.0f, 13.343145f, 3.0f, 15.0f),
                    PathNode.LineTo(3.0f, 16.0f),
                    PathNode.LineTo(13.0f, 16.0f),
                    PathNode.CurveTo(13.756455f, 13.814452f, 15.701707f, 12.25825f, 18.0f, 12.0f),
                    PathNode.LineTo(18.0f, 7.0f),
                    PathNode.CurveTo(18.0f, 5.895431f, 17.10457f, 5.0f, 16.0f, 5.0f),
                    PathNode.LineTo(15.0f, 5.0f)
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
                    PathNode.MoveTo(6.0f, 9.0f),
                    PathNode.LineTo(9.0f, 9.0f)
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
        return _moped!!
    }

private var _moped: ImageVector? = null
