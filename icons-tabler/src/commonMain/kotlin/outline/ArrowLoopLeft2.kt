package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowLoopLeft2: ImageVector
    get() {
        if (_arrowLoopLeft2 != null) return _arrowLoopLeft2!!
        _arrowLoopLeft2 = tablerOutlineIcon(
            name = "ArrowLoopLeft2",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 21.0f),
                    PathNode.LineTo(13.0f, 15.0f),
                    PathNode.MoveTo(13.0f, 9.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.CurveTo(13.0f, 5.790861f, 14.790861f, 4.0f, 17.0f, 4.0f),
                    PathNode.CurveTo(19.209139f, 4.0f, 21.0f, 5.790861f, 21.0f, 8.0f),
                    PathNode.CurveTo(21.0f, 10.209139f, 19.209139f, 12.0f, 17.0f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f)
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
                    PathNode.MoveTo(8.0f, 16.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.LineTo(8.0f, 8.0f)
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
        return _arrowLoopLeft2!!
    }

private var _arrowLoopLeft2: ImageVector? = null
