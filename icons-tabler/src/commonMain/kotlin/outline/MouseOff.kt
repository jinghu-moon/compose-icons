package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MouseOff: ImageVector
    get() {
        if (_mouseOff != null) return _mouseOff!!
        _mouseOff = tablerOutlineIcon(
            name = "MouseOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.733f, 3.704f),
                    PathNode.CurveTo(8.39952f, 3.244314f, 9.190334f, 2.998733f, 10.0f, 3.0f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.CurveTo(16.209139f, 3.0f, 18.0f, 4.790861f, 18.0f, 7.0f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.MoveTo(17.9f, 17.895f),
                    PathNode.CurveTo(17.482738f, 19.712576f, 15.864856f, 21.00066f, 14.0f, 21.0f),
                    PathNode.LineTo(10.0f, 21.0f),
                    PathNode.CurveTo(7.790861f, 21.0f, 6.0f, 19.209139f, 6.0f, 17.0f),
                    PathNode.LineTo(6.0f, 7.0f),
                    PathNode.CurveTo(6.0f, 6.7f, 6.033f, 6.407f, 6.096f, 6.126f)
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
                    PathNode.LineTo(12.0f, 8.0f)
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
        return _mouseOff!!
    }

private var _mouseOff: ImageVector? = null
