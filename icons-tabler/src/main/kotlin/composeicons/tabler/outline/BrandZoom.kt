package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandZoom: ImageVector
    get() {
        if (_brandZoom != null) return _brandZoom!!
        _brandZoom = tablerOutlineIcon(
            name = "BrandZoom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(17.011f, 9.385f),
                    PathNode.LineTo(17.011f, 14.513f),
                    PathNode.LineTo(21.0f, 18.0f),
                    PathNode.LineTo(21.0f, 6.0f),
                    PathNode.LineTo(17.011f, 9.385f)
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
                    PathNode.MoveTo(3.887f, 6.0f),
                    PathNode.LineTo(13.967f, 6.0f),
                    PathNode.CurveTo(15.435f, 6.0f, 17.0f, 7.203f, 17.0f, 8.803f),
                    PathNode.LineTo(17.0f, 16.999f),
                    PathNode.CurveTo(17.005016f, 17.543625f, 16.569578f, 17.990229f, 16.025f, 17.999f),
                    PathNode.LineTo(5.652f, 17.999f),
                    PathNode.CurveTo(3.985f, 17.999f, 3.0f, 16.499f, 3.0f, 14.999f),
                    PathNode.LineTo(3.01f, 6.999f),
                    PathNode.CurveTo(2.971925f, 6.743287f, 3.04796f, 6.483744f, 3.218f, 6.289f),
                    PathNode.CurveTo(3.386121f, 6.096496f, 3.632659f, 5.990889f, 3.888f, 6.002f),
                    PathNode.LineTo(3.887f, 6.0f)
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
        return _brandZoom!!
    }

private var _brandZoom: ImageVector? = null
