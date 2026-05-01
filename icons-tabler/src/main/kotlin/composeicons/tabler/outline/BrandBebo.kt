package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandBebo: ImageVector
    get() {
        if (_brandBebo != null) return _brandBebo!!
        _brandBebo = tablerOutlineIcon(
            name = "BrandBebo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 17.5f),
                    PathNode.CurveTo(13.932997f, 17.5f, 15.5f, 15.932997f, 15.5f, 14.0f),
                    PathNode.CurveTo(15.5f, 12.162f, 14.341f, 10.998f, 12.495f, 10.628f),
                    PathNode.CurveTo(11.749f, 10.478f, 11.125f, 9.883f, 11.125f, 9.122f),
                    PathNode.CurveTo(11.125f, 7.98f, 12.059f, 7.027f, 13.183f, 7.228f),
                    PathNode.CurveTo(16.793f, 7.873f, 19.0f, 10.286f, 19.0f, 14.0f),
                    PathNode.CurveTo(19.0f, 17.865993f, 15.865993f, 21.0f, 12.0f, 21.0f),
                    PathNode.CurveTo(8.134007f, 21.0f, 5.0f, 17.865993f, 5.0f, 14.0f),
                    PathNode.LineTo(5.0f, 4.75f),
                    PathNode.CurveTo(5.0f, 3.783502f, 5.783502f, 3.0f, 6.75f, 3.0f),
                    PathNode.CurveTo(7.716499f, 3.0f, 8.5f, 3.783502f, 8.5f, 4.75f),
                    PathNode.LineTo(8.5f, 14.0f),
                    PathNode.CurveTo(8.5f, 15.932997f, 10.067003f, 17.5f, 12.0f, 17.5f)
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
        return _brandBebo!!
    }

private var _brandBebo: ImageVector? = null
