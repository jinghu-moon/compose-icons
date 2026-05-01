package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.DropletCheck: ImageVector
    get() {
        if (_dropletCheck != null) return _dropletCheck!!
        _dropletCheck = tablerOutlineIcon(
            name = "DropletCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.967f, 13.594f),
                    PathNode.CurveTo(18.869461f, 12.632949f, 18.561138f, 11.705243f, 18.064f, 10.877f),
                    PathNode.LineTo(13.174f, 3.617f),
                    PathNode.CurveTo(12.754f, 2.992f, 11.887f, 2.814f, 11.238f, 3.22f),
                    PathNode.CurveTo(11.07509f, 3.322226f, 10.93542f, 3.457468f, 10.828f, 3.617f),
                    PathNode.LineTo(5.935f, 10.877f),
                    PathNode.CurveTo(4.24f, 13.715f, 4.9f, 17.318f, 7.502f, 19.423f),
                    PathNode.CurveTo(8.653567f, 20.351383f, 10.065531f, 20.898344f, 11.542f, 20.988f)
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
                    PathNode.MoveTo(15.0f, 19.0f),
                    PathNode.LineTo(17.0f, 21.0f),
                    PathNode.LineTo(21.0f, 17.0f)
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
        return _dropletCheck!!
    }

private var _dropletCheck: ImageVector? = null
