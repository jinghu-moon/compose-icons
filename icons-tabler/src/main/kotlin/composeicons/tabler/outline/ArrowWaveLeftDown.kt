package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ArrowWaveLeftDown: ImageVector
    get() {
        if (_arrowWaveLeftDown != null) return _arrowWaveLeftDown!!
        _arrowWaveLeftDown = tablerOutlineIcon(
            name = "ArrowWaveLeftDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 14.0f),
                    PathNode.LineTo(3.0f, 14.0f),
                    PathNode.LineTo(3.0f, 10.0f)
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
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(20.113f, 13.284f, 18.52f, 14.033f, 17.0f, 14.0f),
                    PathNode.CurveTo(15.48f, 14.033f, 13.887f, 13.284f, 13.0f, 12.0f),
                    PathNode.CurveTo(12.113f, 10.716f, 10.52f, 9.967f, 9.0f, 10.0f),
                    PathNode.CurveTo(7.48f, 9.967f, 6.0f, 11.0f, 5.0f, 12.0f),
                    PathNode.LineTo(3.0f, 14.0f)
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
        return _arrowWaveLeftDown!!
    }

private var _arrowWaveLeftDown: ImageVector? = null
