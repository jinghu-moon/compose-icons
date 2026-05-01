package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandSupabase: ImageVector
    get() {
        if (_brandSupabase != null) return _brandSupabase!!
        _brandSupabase = tablerOutlineIcon(
            name = "BrandSupabase",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(4.0f, 14.0f),
                    PathNode.LineTo(12.0f, 14.0f),
                    PathNode.LineTo(12.0f, 21.0f),
                    PathNode.LineTo(20.0f, 10.0f),
                    PathNode.LineTo(12.0f, 10.0f),
                    PathNode.LineTo(12.0f, 3.0f),
                    PathNode.LineTo(4.0f, 14.0f)
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
        return _brandSupabase!!
    }

private var _brandSupabase: ImageVector? = null
