package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandPolymer: ImageVector
    get() {
        if (_brandPolymer != null) return _brandPolymer!!
        _brandPolymer = tablerOutlineIcon(
            name = "BrandPolymer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(6.706f, 6.0f),
                    PathNode.LineTo(3.0f, 12.0f),
                    PathNode.LineTo(6.706f, 18.0f),
                    PathNode.LineTo(7.765f, 18.0f),
                    PathNode.LineTo(16.235f, 6.0f),
                    PathNode.LineTo(17.295f, 6.0f),
                    PathNode.LineTo(21.0f, 12.0f),
                    PathNode.LineTo(17.294f, 18.0f)
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
        return _brandPolymer!!
    }

private var _brandPolymer: ImageVector? = null
