package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Bubble: ImageVector
    get() {
        if (_bubble != null) return _bubble!!
        _bubble = tablerOutlineIcon(
            name = "Bubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.4f, 3.0f),
                    PathNode.CurveTo(14.535944f, 3.001327f, 16.465622f, 4.275324f, 17.306f, 6.239f),
                    PathNode.CurveTo(20.233109f, 6.56899f, 22.33849f, 9.209391f, 22.0085f, 12.1365f),
                    PathNode.CurveTo(21.67851f, 15.063609f, 19.038109f, 17.16899f, 16.111f, 16.839f),
                    PathNode.CurveTo(15.063531f, 18.691814f, 12.809272f, 19.48721f, 10.831f, 18.702f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.LineTo(7.0f, 17.866f),
                    PathNode.CurveTo(6.207184f, 17.68269f, 5.541367f, 17.147587f, 5.191781f, 16.412773f),
                    PathNode.CurveTo(4.842195f, 15.677961f, 4.847062f, 14.823781f, 5.205f, 14.093f),
                    PathNode.CurveTo(3.237219f, 12.960979f, 2.331566f, 10.605192f, 3.034285f, 8.44653f),
                    PathNode.CurveTo(3.737004f, 6.287868f, 5.855916f, 4.916682f, 8.113f, 5.16f),
                    PathNode.CurveTo(9.11854f, 3.800822f, 10.709297f, 2.99932f, 12.4f, 3.0f)
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
        return _bubble!!
    }

private var _bubble: ImageVector? = null
