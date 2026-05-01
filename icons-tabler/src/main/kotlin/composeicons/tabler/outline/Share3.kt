package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Share3: ImageVector
    get() {
        if (_share3 != null) return _share3!!
        _share3 = tablerOutlineIcon(
            name = "Share3",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 4.0f),
                    PathNode.LineTo(13.0f, 8.0f),
                    PathNode.CurveTo(6.425f, 9.028f, 3.98f, 14.788f, 3.0f, 20.0f),
                    PathNode.CurveTo(2.963f, 20.206f, 8.384f, 14.038f, 13.0f, 14.0f),
                    PathNode.LineTo(13.0f, 18.0f),
                    PathNode.LineTo(21.0f, 11.0f),
                    PathNode.LineTo(13.0f, 4.0f)
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
        return _share3!!
    }

private var _share3: ImageVector? = null
