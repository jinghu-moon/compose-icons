package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Tag: ImageVector
    get() {
        if (_tag != null) return _tag!!
        _tag = tablerOutlineIcon(
            name = "Tag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.5f, 7.5f),
                    PathNode.CurveTo(6.5f, 8.052285f, 6.947716f, 8.5f, 7.5f, 8.5f),
                    PathNode.CurveTo(8.052285f, 8.5f, 8.5f, 8.052285f, 8.5f, 7.5f),
                    PathNode.CurveTo(8.5f, 6.947716f, 8.052285f, 6.5f, 7.5f, 6.5f),
                    PathNode.CurveTo(6.947716f, 6.5f, 6.5f, 6.947716f, 6.5f, 7.5f)
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
                    PathNode.MoveTo(3.0f, 6.0f),
                    PathNode.LineTo(3.0f, 11.172f),
                    PathNode.CurveTo(3.000113f, 11.70239f, 3.210901f, 12.211015f, 3.586f, 12.586f),
                    PathNode.LineTo(11.296f, 20.296f),
                    PathNode.CurveTo(12.237134f, 21.236994f, 13.762866f, 21.236994f, 14.704f, 20.296f),
                    PathNode.LineTo(20.296f, 14.704f),
                    PathNode.CurveTo(21.236994f, 13.762866f, 21.236994f, 12.237134f, 20.296f, 11.296f),
                    PathNode.LineTo(12.586f, 3.586f),
                    PathNode.CurveTo(12.211015f, 3.210901f, 11.70239f, 3.000113f, 11.172f, 3.0f),
                    PathNode.LineTo(6.0f, 3.0f),
                    PathNode.CurveTo(4.343146f, 3.0f, 3.0f, 4.343146f, 3.0f, 6.0f)
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
        return _tag!!
    }

private var _tag: ImageVector? = null
