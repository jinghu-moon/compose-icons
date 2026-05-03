package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathMaxMin: ImageVector
    get() {
        if (_mathMaxMin != null) return _mathMaxMin!!
        _mathMaxMin = tablerOutlineIcon(
            name = "MathMaxMin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 19.0f),
                    PathNode.CurveTo(15.0f, 20.10457f, 15.895431f, 21.0f, 17.0f, 21.0f),
                    PathNode.CurveTo(18.10457f, 21.0f, 19.0f, 20.10457f, 19.0f, 19.0f),
                    PathNode.CurveTo(19.0f, 17.89543f, 18.10457f, 17.0f, 17.0f, 17.0f),
                    PathNode.CurveTo(15.895431f, 17.0f, 15.0f, 17.89543f, 15.0f, 19.0f)
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
                    PathNode.MoveTo(5.0f, 5.0f),
                    PathNode.CurveTo(5.0f, 6.10457f, 5.895431f, 7.0f, 7.0f, 7.0f),
                    PathNode.CurveTo(8.10457f, 7.0f, 9.0f, 6.10457f, 9.0f, 5.0f),
                    PathNode.CurveTo(9.0f, 3.895431f, 8.10457f, 3.0f, 7.0f, 3.0f),
                    PathNode.CurveTo(5.895431f, 3.0f, 5.0f, 3.895431f, 5.0f, 5.0f)
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
                    PathNode.MoveTo(3.0f, 14.0f),
                    PathNode.CurveTo(3.0f, 14.0f, 3.605f, 8.56f, 5.284f, 6.138f),
                    PathNode.MoveTo(8.679f, 6.164f),
                    PathNode.CurveTo(10.816f, 8.816f, 13.226f, 15.277f, 15.359f, 17.883f)
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
                    PathNode.MoveTo(18.748f, 18.038f),
                    PathNode.CurveTo(19.45f, 17.158f, 20.2f, 14.478f, 21.0f, 10.0f)
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
        return _mathMaxMin!!
    }

private var _mathMaxMin: ImageVector? = null
