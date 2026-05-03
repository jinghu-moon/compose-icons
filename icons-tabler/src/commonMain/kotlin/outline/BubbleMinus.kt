package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BubbleMinus: ImageVector
    get() {
        if (_bubbleMinus != null) return _bubbleMinus!!
        _bubbleMinus = tablerOutlineIcon(
            name = "BubbleMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.4f, 19.0f),
                    PathNode.CurveTo(11.862418f, 19.00206f, 11.329439f, 18.900896f, 10.83f, 18.702f),
                    PathNode.LineTo(7.0f, 21.0f),
                    PathNode.LineTo(7.0f, 17.866f),
                    PathNode.CurveTo(6.207184f, 17.68269f, 5.541367f, 17.147587f, 5.191781f, 16.412773f),
                    PathNode.CurveTo(4.842195f, 15.677961f, 4.847062f, 14.823781f, 5.205f, 14.093f),
                    PathNode.CurveTo(3.237219f, 12.960979f, 2.331566f, 10.605192f, 3.034285f, 8.44653f),
                    PathNode.CurveTo(3.737004f, 6.287868f, 5.855916f, 4.916682f, 8.113f, 5.16f),
                    PathNode.CurveTo(9.250518f, 3.623285f, 11.123394f, 2.812765f, 13.022306f, 3.035414f),
                    PathNode.CurveTo(14.921219f, 3.258062f, 16.555809f, 4.479833f, 17.307f, 6.238f),
                    PathNode.CurveTo(19.261246f, 6.474257f, 20.926437f, 7.767825f, 21.638641f, 9.602943f),
                    PathNode.CurveTo(22.350845f, 11.438063f, 21.994238f, 13.516285f, 20.711f, 15.009f)
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
                    PathNode.MoveTo(16.0f, 19.0f),
                    PathNode.LineTo(22.0f, 19.0f)
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
        return _bubbleMinus!!
    }

private var _bubbleMinus: ImageVector? = null
