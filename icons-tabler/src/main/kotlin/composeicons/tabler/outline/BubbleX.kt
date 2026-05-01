package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BubbleX: ImageVector
    get() {
        if (_bubbleX != null) return _bubbleX!!
        _bubbleX = tablerOutlineIcon(
            name = "BubbleX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.5f, 18.75f),
                    PathNode.CurveTo(13.155f, 18.84f, 12.773f, 19.0f, 12.4f, 19.0f),
                    PathNode.CurveTo(11.862644f, 18.999638f, 11.330116f, 18.89856f, 10.83f, 18.702f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.LineTo(7.0f, 17.866f),
                    PathNode.CurveTo(6.207184f, 17.68269f, 5.541367f, 17.147587f, 5.191781f, 16.412773f),
                    PathNode.CurveTo(4.842195f, 15.677961f, 4.847062f, 14.823781f, 5.205f, 14.093f),
                    PathNode.CurveTo(3.237219f, 12.960979f, 2.331566f, 10.605192f, 3.034285f, 8.44653f),
                    PathNode.CurveTo(3.737004f, 6.287868f, 5.855916f, 4.916682f, 8.113f, 5.16f),
                    PathNode.CurveTo(9.250518f, 3.623285f, 11.123394f, 2.812765f, 13.022306f, 3.035414f),
                    PathNode.CurveTo(14.921219f, 3.258062f, 16.555809f, 4.479833f, 17.307f, 6.238f),
                    PathNode.CurveTo(18.860312f, 6.425335f, 20.253006f, 7.285315f, 21.116245f, 8.590185f),
                    PathNode.CurveTo(21.979486f, 9.895056f, 22.226183f, 11.513174f, 21.791f, 13.016f)
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
                    PathNode.MoveTo(22.0f, 22.0f),
                    PathNode.LineTo(17.0f, 17.0f)
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
                    PathNode.MoveTo(17.0f, 22.0f),
                    PathNode.LineTo(22.0f, 17.0f)
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
        return _bubbleX!!
    }

private var _bubbleX: ImageVector? = null
