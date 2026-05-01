package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.NeedleThread: ImageVector
    get() {
        if (_needleThread != null) return _needleThread!!
        _needleThread = tablerOutlineIcon(
            name = "NeedleThread",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.0f, 21.0f),
                    PathNode.CurveTo(2.333f, 20.333f, 6.262f, 14.764f, 14.785f, 4.291f),
                    PathNode.CurveTo(15.613069f, 3.27406f, 16.940159f, 2.805367f, 18.223219f, 3.076713f),
                    PathNode.CurveTo(19.506273f, 3.348059f, 20.529982f, 4.313908f, 20.875431f, 5.579029f),
                    PathNode.CurveTo(21.22088f, 6.844149f, 20.8301f, 8.196234f, 19.863f, 9.082f),
                    PathNode.CurveTo(9.288f, 17.694f, 3.667f, 21.667f, 3.0f, 21.0f)
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
                    PathNode.MoveTo(17.5f, 6.5f),
                    PathNode.LineTo(16.5f, 7.5f)
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
                    PathNode.MoveTo(17.0f, 7.0f),
                    PathNode.CurveTo(14.667f, 4.333f, 13.5f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.5f, 3.0f, 10.0f, 4.0f, 10.0f, 5.0f),
                    PathNode.CurveTo(10.0f, 9.0f, 18.161f, 13.406f, 16.0f, 16.0f),
                    PathNode.CurveTo(14.944f, 17.268f, 12.637f, 17.285f, 10.25f, 16.808f)
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
                    PathNode.MoveTo(5.739f, 15.425f),
                    PathNode.CurveTo(4.346f, 14.86f, 2.0f, 13.5f, 2.0f, 12.0f)
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
                    PathNode.MoveTo(19.5f, 9.5f),
                    PathNode.LineTo(21.0f, 11.0f)
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
        return _needleThread!!
    }

private var _needleThread: ImageVector? = null
