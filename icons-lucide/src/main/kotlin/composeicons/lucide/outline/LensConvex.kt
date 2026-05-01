package composeicons.lucide.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.lucide.LucideIcons
import composeicons.lucide.lucideOutlineIcon

val LucideIcons.Outline.LensConvex: ImageVector
    get() {
        if (_lensConvex != null) return _lensConvex!!
        _lensConvex = lucideOutlineIcon(
            name = "LensConvex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.433f, 2.0f),
                    PathNode.CurveTo(13.765008f, 2.003279f, 14.073739f, 2.171133f, 14.257f, 2.448f),
                    PathNode.CurveTo(17.915066f, 8.290661f, 17.915066f, 15.709339f, 14.257f, 21.552f),
                    PathNode.CurveTo(14.073739f, 21.828865f, 13.765008f, 21.996721f, 13.433f, 22.0f),
                    PathNode.LineTo(10.567f, 22.0f),
                    PathNode.CurveTo(10.234992f, 21.996721f, 9.926261f, 21.828865f, 9.743f, 21.552f),
                    PathNode.CurveTo(6.084935f, 15.709339f, 6.084935f, 8.290661f, 9.743f, 2.448f),
                    PathNode.CurveTo(9.926261f, 2.171133f, 10.234992f, 2.003279f, 10.567f, 2.0f),
                    PathNode.Close
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
        return _lensConvex!!
    }

private var _lensConvex: ImageVector? = null
