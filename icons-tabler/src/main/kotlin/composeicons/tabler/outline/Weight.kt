package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Weight: ImageVector
    get() {
        if (_weight != null) return _weight!!
        _weight = tablerOutlineIcon(
            name = "Weight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(9.0f, 6.0f),
                    PathNode.CurveTo(9.0f, 7.656854f, 10.343145f, 9.0f, 12.0f, 9.0f),
                    PathNode.CurveTo(13.656855f, 9.0f, 15.0f, 7.656854f, 15.0f, 6.0f),
                    PathNode.CurveTo(15.0f, 4.343146f, 13.656855f, 3.0f, 12.0f, 3.0f),
                    PathNode.CurveTo(10.343145f, 3.0f, 9.0f, 4.343146f, 9.0f, 6.0f)
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
                    PathNode.MoveTo(6.835f, 9.0f),
                    PathNode.LineTo(17.165f, 9.0f),
                    PathNode.CurveTo(17.648298f, 8.999928f, 18.062489f, 9.345507f, 18.149f, 9.821f),
                    PathNode.LineTo(19.786f, 18.821f),
                    PathNode.CurveTo(19.839087f, 19.11278f, 19.759922f, 19.413073f, 19.56989f, 19.64076f),
                    PathNode.CurveTo(19.379862f, 19.86845f, 19.09857f, 20.000044f, 18.802f, 20.0f),
                    PathNode.LineTo(5.198f, 20.0f),
                    PathNode.CurveTo(4.90143f, 20.000044f, 4.620139f, 19.86845f, 4.430109f, 19.64076f),
                    PathNode.CurveTo(4.240078f, 19.413073f, 4.160914f, 19.11278f, 4.214f, 18.821f),
                    PathNode.LineTo(5.851f, 9.821f),
                    PathNode.CurveTo(5.937511f, 9.345507f, 6.351701f, 8.999928f, 6.835f, 9.0f)
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
        return _weight!!
    }

private var _weight: ImageVector? = null
