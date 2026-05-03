package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletHalf: ImageVector
    get() {
        if (_dropletHalf != null) return _dropletHalf!!
        _dropletHalf = tablerOutlineIcon(
            name = "DropletHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(7.502f, 19.423f),
                    PathNode.CurveTo(10.104f, 21.528f, 13.897f, 21.528f, 16.498f, 19.423f),
                    PathNode.CurveTo(19.1f, 17.318f, 19.76f, 13.715f, 18.064f, 10.877f),
                    PathNode.LineTo(13.174f, 3.617f),
                    PathNode.CurveTo(12.754f, 2.992f, 11.887f, 2.814f, 11.238f, 3.22f),
                    PathNode.CurveTo(11.07509f, 3.322226f, 10.93542f, 3.457468f, 10.828f, 3.617f),
                    PathNode.LineTo(5.935f, 10.877f),
                    PathNode.CurveTo(4.24f, 13.715f, 4.9f, 17.318f, 7.502f, 19.423f)
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
                    PathNode.MoveTo(12.0f, 3.0f),
                    PathNode.LineTo(12.0f, 21.0f)
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
        return _dropletHalf!!
    }

private var _dropletHalf: ImageVector? = null
