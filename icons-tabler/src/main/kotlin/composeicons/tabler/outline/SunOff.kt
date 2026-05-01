package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.SunOff: ImageVector
    get() {
        if (_sunOff != null) return _sunOff!!
        _sunOff = tablerOutlineIcon(
            name = "SunOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(16.0f, 12.0f),
                    PathNode.CurveTo(16.0f, 9.790861f, 14.209139f, 8.0f, 12.0f, 8.0f),
                    PathNode.MoveTo(9.166f, 9.177f),
                    PathNode.CurveTo(7.604691f, 10.739965f, 7.606035f, 13.272691f, 9.169f, 14.834f),
                    PathNode.CurveTo(10.731966f, 16.39531f, 13.264691f, 16.393967f, 14.826f, 14.831f)
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
                    PathNode.MoveTo(3.0f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 4.0f),
                    PathNode.MoveTo(20.0f, 12.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.MoveTo(12.0f, 20.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.MoveTo(5.6f, 5.6f),
                    PathNode.LineTo(6.3f, 6.3f),
                    PathNode.MoveTo(18.4f, 5.6f),
                    PathNode.LineTo(17.7f, 6.3f),
                    PathNode.MoveTo(17.7f, 17.7f),
                    PathNode.LineTo(18.4f, 18.4f),
                    PathNode.MoveTo(6.3f, 17.7f),
                    PathNode.LineTo(5.6f, 18.4f)
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
        return _sunOff!!
    }

private var _sunOff: ImageVector? = null
