package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MagnetOff: ImageVector
    get() {
        if (_magnetOff != null) return _magnetOff!!
        _magnetOff = tablerOutlineIcon(
            name = "MagnetOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.0f, 3.0f),
                    PathNode.CurveTo(8.10457f, 3.0f, 9.0f, 3.895431f, 9.0f, 5.0f),
                    PathNode.MoveTo(9.0f, 9.0f),
                    PathNode.LineTo(9.0f, 13.0f),
                    PathNode.CurveTo(8.999605f, 14.341304f, 9.889615f, 15.519886f, 11.179819f, 15.886591f),
                    PathNode.CurveTo(12.470022f, 16.253294f, 13.846869f, 15.719003f, 14.552f, 14.578f),
                    PathNode.MoveTo(15.0f, 11.0f),
                    PathNode.LineTo(15.0f, 5.0f),
                    PathNode.CurveTo(15.0f, 3.895431f, 15.895431f, 3.0f, 17.0f, 3.0f),
                    PathNode.LineTo(18.0f, 3.0f),
                    PathNode.CurveTo(19.10457f, 3.0f, 20.0f, 3.895431f, 20.0f, 5.0f),
                    PathNode.LineTo(20.0f, 13.0f),
                    PathNode.CurveTo(20.000961f, 13.876441f, 19.857716f, 14.747068f, 19.576f, 15.577f),
                    PathNode.MoveTo(18.113f, 18.161f),
                    PathNode.CurveTo(15.94628f, 20.727621f, 12.40701f, 21.667435f, 9.252424f, 20.51383f),
                    PathNode.CurveTo(6.097838f, 19.360226f, 3.999809f, 16.358902f, 4.0f, 13.0f),
                    PathNode.LineTo(4.0f, 5.0f),
                    PathNode.CurveTo(4.0f, 4.703f, 4.065f, 4.42f, 4.181f, 4.167f)
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
                    PathNode.MoveTo(4.0f, 8.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 8.0f),
                    PathNode.LineTo(19.0f, 8.0f)
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
        return _magnetOff!!
    }

private var _magnetOff: ImageVector? = null
