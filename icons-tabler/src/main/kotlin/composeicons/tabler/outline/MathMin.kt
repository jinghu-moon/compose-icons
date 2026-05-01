package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MathMin: ImageVector
    get() {
        if (_mathMin != null) return _mathMin!!
        _mathMin = tablerOutlineIcon(
            name = "MathMin",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(15.0f, 18.0f),
                    PathNode.CurveTo(15.0f, 19.10457f, 15.895431f, 20.0f, 17.0f, 20.0f),
                    PathNode.CurveTo(18.10457f, 20.0f, 19.0f, 19.10457f, 19.0f, 18.0f),
                    PathNode.CurveTo(19.0f, 16.89543f, 18.10457f, 16.0f, 17.0f, 16.0f),
                    PathNode.CurveTo(15.895431f, 16.0f, 15.0f, 16.89543f, 15.0f, 18.0f)
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
                    PathNode.MoveTo(3.0f, 13.0f),
                    PathNode.CurveTo(3.0f, 13.0f, 4.0f, 4.0f, 7.0f, 4.0f),
                    PathNode.CurveTo(9.48f, 4.0f, 12.643f, 13.565f, 15.36f, 16.883f)
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
                    PathNode.MoveTo(18.748f, 17.038f),
                    PathNode.CurveTo(19.45f, 16.158f, 20.2f, 13.478f, 21.0f, 9.0f)
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
        return _mathMin!!
    }

private var _mathMin: ImageVector? = null
