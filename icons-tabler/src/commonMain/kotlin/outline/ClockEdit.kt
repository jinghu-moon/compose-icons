package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ClockEdit: ImageVector
    get() {
        if (_clockEdit != null) return _clockEdit!!
        _clockEdit = tablerOutlineIcon(
            name = "ClockEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 12.0f),
                    PathNode.CurveTo(20.999655f, 7.155829f, 17.165165f, 3.180944f, 12.324135f, 3.006481f),
                    PathNode.CurveTo(7.483107f, 2.832018f, 3.372438f, 6.520573f, 3.023394f, 11.352152f),
                    PathNode.CurveTo(2.67435f, 16.183731f, 6.212163f, 20.42483f, 11.028f, 20.948f),
                    PathNode.CurveTo(11.348f, 20.982f, 11.672f, 21.0f, 12.0f, 21.0f)
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
                    PathNode.MoveTo(12.0f, 7.0f),
                    PathNode.LineTo(12.0f, 12.0f),
                    PathNode.LineTo(14.0f, 14.0f)
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
                    PathNode.MoveTo(18.42f, 15.61f),
                    PathNode.CurveTo(19.240143f, 14.789857f, 20.569857f, 14.789857f, 21.39f, 15.61f),
                    PathNode.CurveTo(22.210142f, 16.430143f, 22.210142f, 17.759857f, 21.39f, 18.58f),
                    PathNode.LineTo(18.0f, 22.0f),
                    PathNode.LineTo(15.0f, 22.0f),
                    PathNode.LineTo(15.0f, 19.0f),
                    PathNode.LineTo(18.42f, 15.61f)
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
        return _clockEdit!!
    }

private var _clockEdit: ImageVector? = null
