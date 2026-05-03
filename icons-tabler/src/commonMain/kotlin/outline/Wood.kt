package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Wood: ImageVector
    get() {
        if (_wood != null) return _wood!!
        _wood = tablerOutlineIcon(
            name = "Wood",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.0f, 5.5f),
                    PathNode.CurveTo(6.0f, 6.880712f, 8.686292f, 8.0f, 12.0f, 8.0f),
                    PathNode.CurveTo(15.313708f, 8.0f, 18.0f, 6.880712f, 18.0f, 5.5f),
                    PathNode.CurveTo(18.0f, 4.119288f, 15.313708f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(8.686292f, 3.0f, 6.0f, 4.119288f, 6.0f, 5.5f)
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
                    PathNode.MoveTo(18.0f, 5.5f),
                    PathNode.LineTo(18.0f, 10.126f),
                    PathNode.CurveTo(18.597624f, 9.85533f, 19.302921f, 10.030951f, 19.703836f, 10.550261f),
                    PathNode.CurveTo(20.104753f, 11.06957f, 20.096128f, 11.796351f, 19.683f, 12.306f),
                    PathNode.LineTo(19.586f, 12.414f),
                    PathNode.LineTo(18.0f, 14.0f),
                    PathNode.LineTo(18.0f, 18.0f),
                    PathNode.CurveTo(18.0f, 19.61f, 15.46f, 20.925f, 12.275f, 21.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.CurveTo(8.686f, 21.0f, 6.0f, 19.657f, 6.0f, 18.0f),
                    PathNode.LineTo(6.0f, 16.0f),
                    PathNode.LineTo(4.414f, 14.414f),
                    PathNode.CurveTo(3.929912f, 13.930558f, 3.861371f, 13.169887f, 4.251242f, 12.607696f),
                    PathNode.CurveTo(4.641113f, 12.045506f, 5.37755f, 11.843075f, 6.0f, 12.127f),
                    PathNode.LineTo(6.0f, 5.5f)
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
                    PathNode.MoveTo(10.0f, 12.5f),
                    PathNode.LineTo(10.0f, 14.0f)
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
                    PathNode.MoveTo(14.0f, 16.0f),
                    PathNode.LineTo(14.0f, 17.0f)
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
        return _wood!!
    }

private var _wood: ImageVector? = null
