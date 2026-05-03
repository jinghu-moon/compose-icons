package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.FilterEdit: ImageVector
    get() {
        if (_filterEdit != null) return _filterEdit!!
        _filterEdit = tablerOutlineIcon(
            name = "FilterEdit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.97f, 20.344f),
                    PathNode.LineTo(9.0f, 21.0f),
                    PathNode.LineTo(9.0f, 12.5f),
                    PathNode.LineTo(4.52f, 7.572f),
                    PathNode.CurveTo(4.185447f, 7.203926f, 4.000053f, 6.724397f, 4.0f, 6.227f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.LineTo(20.0f, 4.0f),
                    PathNode.LineTo(20.0f, 6.172f),
                    PathNode.CurveTo(19.999887f, 6.70239f, 19.789099f, 7.211015f, 19.414f, 7.586f),
                    PathNode.LineTo(15.0f, 12.0f),
                    PathNode.LineTo(15.0f, 13.5f)
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
        return _filterEdit!!
    }

private var _filterEdit: ImageVector? = null
