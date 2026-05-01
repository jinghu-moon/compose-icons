package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.HammerOff: ImageVector
    get() {
        if (_hammerOff != null) return _hammerOff!!
        _hammerOff = tablerOutlineIcon(
            name = "HammerOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.698f, 10.72f),
                    PathNode.LineTo(4.03f, 17.418f),
                    PathNode.CurveTo(3.634831f, 17.810534f, 3.412604f, 18.344507f, 3.412604f, 18.9015f),
                    PathNode.CurveTo(3.412604f, 19.458492f, 3.634831f, 19.992466f, 4.03f, 20.385f),
                    PathNode.CurveTo(4.853084f, 21.203693f, 6.182916f, 21.203693f, 7.006f, 20.385f),
                    PathNode.LineTo(13.702f, 13.709f)
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
                    PathNode.MoveTo(18.713f, 14.702f),
                    PathNode.LineTo(20.713f, 12.702f),
                    PathNode.CurveTo(21.103382f, 12.311501f, 21.103382f, 11.6785f, 20.713f, 11.288f),
                    PathNode.LineTo(13.127f, 3.702f),
                    PathNode.CurveTo(12.7365f, 3.311618f, 12.103499f, 3.311618f, 11.713f, 3.702f),
                    PathNode.LineTo(9.713f, 5.702f)
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
                    PathNode.MoveTo(3.0f, 3.0f),
                    PathNode.LineTo(21.0f, 21.0f)
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
        return _hammerOff!!
    }

private var _hammerOff: ImageVector? = null
