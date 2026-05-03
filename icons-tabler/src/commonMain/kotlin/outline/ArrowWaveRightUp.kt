package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowWaveRightUp: ImageVector
    get() {
        if (_arrowWaveRightUp != null) return _arrowWaveRightUp!!
        _arrowWaveRightUp = tablerOutlineIcon(
            name = "ArrowWaveRightUp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.0f, 10.0f),
                    PathNode.LineTo(21.0f, 10.0f),
                    PathNode.LineTo(21.0f, 14.0f)
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
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.CurveTo(3.887f, 10.716f, 5.48f, 9.967f, 7.0f, 10.0f),
                    PathNode.CurveTo(8.52f, 9.967f, 10.113f, 10.716f, 11.0f, 12.0f),
                    PathNode.CurveTo(11.887f, 13.284f, 13.48f, 14.033f, 15.0f, 14.0f),
                    PathNode.CurveTo(16.52f, 14.033f, 18.0f, 13.0f, 19.0f, 12.0f),
                    PathNode.LineTo(21.0f, 10.0f)
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
        return _arrowWaveRightUp!!
    }

private var _arrowWaveRightUp: ImageVector? = null
