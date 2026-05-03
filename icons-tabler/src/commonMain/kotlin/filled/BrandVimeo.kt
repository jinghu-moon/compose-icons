package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandVimeo: ImageVector
    get() {
        if (_brandVimeo != null) return _brandVimeo!!
        _brandVimeo = tablerFilledIcon(
            name = "BrandVimeo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.5f, 3.0f),
                    PathNode.CurveTo(20.88f, 3.0f, 22.485f, 5.174f, 21.986f, 8.164f),
                    PathNode.CurveTo(21.451f, 11.374f, 19.736f, 14.238f, 17.178f, 16.839f),
                    PathNode.CurveTo(15.901f, 18.137f, 14.967f, 18.9f, 13.066f, 20.324f),
                    PathNode.CurveTo(10.743f, 21.921f, 8.658f, 20.689f, 7.596f, 18.427f),
                    PathNode.CurveTo(7.304f, 17.809f, 7.01f, 16.703f, 6.348f, 13.95f),
                    PathNode.LineTo(6.318f, 13.824f),
                    PathNode.CurveTo(5.835f, 11.814f, 5.499f, 10.505f, 5.336f, 9.946f),
                    PathNode.LineTo(5.32f, 9.894f),
                    PathNode.LineTo(5.289f, 9.907f),
                    PathNode.LineTo(5.159f, 9.967f),
                    PathNode.LineTo(5.022f, 10.037f),
                    PathNode.CurveTo(4.873121f, 10.117479f, 4.729499f, 10.207327f, 4.592f, 10.306f),
                    PathNode.CurveTo(4.193759f, 10.598845f, 3.641303f, 10.556773f, 3.292f, 10.207f),
                    PathNode.LineTo(2.292f, 9.207f),
                    PathNode.CurveTo(1.955135f, 8.869669f, 1.903233f, 8.341446f, 2.168f, 7.945f),
                    PathNode.CurveTo(2.745602f, 7.103212f, 3.386809f, 6.306885f, 4.086f, 5.563f),
                    PathNode.CurveTo(5.066f, 4.526f, 6.041f, 3.747f, 7.014f, 3.33f),
                    PathNode.CurveTo(7.514f, 3.116f, 8.01f, 3.0f, 8.5f, 3.0f),
                    PathNode.CurveTo(10.737f, 3.0f, 11.52f, 4.588f, 12.067f, 7.963f),
                    PathNode.CurveTo(12.097f, 8.146f, 12.124f, 8.322f, 12.179f, 8.672f),
                    PathNode.CurveTo(12.302f, 9.456f, 12.376f, 9.87f, 12.471f, 10.26f),
                    PathNode.CurveTo(12.763f, 11.445f, 12.999f, 12.244f, 13.206f, 12.743f),
                    PathNode.LineTo(13.19f, 12.704f),
                    PathNode.LineTo(13.286f, 12.597f),
                    PathNode.CurveTo(13.64f, 12.186f, 14.043f, 11.583f, 14.458f, 10.826f),
                    PathNode.LineTo(14.615f, 10.535f),
                    PathNode.CurveTo(15.006f, 9.79f, 15.12f, 9.007f, 14.978f, 8.635f),
                    PathNode.CurveTo(14.95f, 8.562f, 14.985f, 8.57f, 14.522f, 8.853f),
                    PathNode.CurveTo(14.18866f, 9.057536f, 13.766676f, 9.04898f, 13.4419f, 8.8311f),
                    PathNode.CurveTo(13.117125f, 8.613221f, 12.949167f, 8.226009f, 13.012f, 7.84f),
                    PathNode.CurveTo(13.508f, 4.787f, 15.757f, 3.0f, 18.5f, 3.0f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _brandVimeo!!
    }

private var _brandVimeo: ImageVector? = null
