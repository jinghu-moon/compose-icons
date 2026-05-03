package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSnapseed: ImageVector
    get() {
        if (_brandSnapseed != null) return _brandSnapseed!!
        _brandSnapseed = tablerOutlineIcon(
            name = "BrandSnapseed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(8.152001f, 3.115f),
                    PathNode.CurveTo(7.978061f, 2.961386f, 7.71694f, 2.961386f, 7.543f, 3.115f),
                    PathNode.CurveTo(4.6f, 5.695f, 3.014f, 8.556f, 3.0f, 11.493f),
                    PathNode.CurveTo(3.0f, 14.421f, 4.586f, 17.296f, 7.543f, 19.885f),
                    PathNode.CurveTo(7.717098f, 20.039204f, 7.978903f, 20.039204f, 8.153f, 19.885f),
                    PathNode.CurveTo(11.11f, 17.296f, 12.7f, 14.421f, 12.7f, 11.493f),
                    PathNode.CurveTo(12.7f, 8.565f, 11.1f, 5.694f, 8.152001f, 3.115f)
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
                    PathNode.MoveTo(8.0f, 20.0f),
                    PathNode.LineTo(20.09f, 19.989f),
                    PathNode.CurveTo(20.593f, 19.989f, 21.0f, 19.555f, 21.0f, 19.02f),
                    PathNode.LineTo(21.0f, 12.957f),
                    PathNode.CurveTo(21.0f, 12.422f, 20.593f, 11.989f, 20.09f, 11.989f),
                    PathNode.LineTo(12.708f, 11.989f)
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
        return _brandSnapseed!!
    }

private var _brandSnapseed: ImageVector? = null
