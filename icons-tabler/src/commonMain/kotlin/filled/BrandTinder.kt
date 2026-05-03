package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTinder: ImageVector
    get() {
        if (_brandTinder != null) return _brandTinder!!
        _brandTinder = tablerFilledIcon(
            name = "BrandTinder",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(11.595f, 2.13f),
                    PathNode.CurveTo(11.546535f, 1.760027f, 11.708082f, 1.393844f, 12.014012f, 1.180219f),
                    PathNode.CurveTo(12.319942f, 0.966593f, 12.719361f, 0.941063f, 13.05f, 1.114f),
                    PathNode.CurveTo(16.16f, 2.739f, 18.46f, 4.911f, 19.82f, 7.741f),
                    PathNode.LineTo(19.807f, 7.717f),
                    PathNode.LineTo(19.817f, 7.736f),
                    PathNode.LineTo(19.932f, 7.968f),
                    PathNode.CurveTo(22.683f, 13.668f, 20.02f, 20.555f, 14.019f, 21.728f),
                    PathNode.LineTo(13.752f, 21.777f),
                    PathNode.CurveTo(5.033f, 23.687f, -0.703f, 13.037f, 5.782f, 6.859f),
                    PathNode.CurveTo(6.248f, 6.399f, 7.062f, 5.663f, 7.418f, 5.409f),
                    PathNode.CurveTo(7.72272f, 5.190912f, 8.123795f, 5.161486f, 8.457081f, 5.332764f),
                    PathNode.CurveTo(8.790368f, 5.504042f, 8.999929f, 5.847278f, 9.0f, 6.222f),
                    PathNode.CurveTo(9.0f, 6.533f, 9.086f, 7.339f, 9.205f, 7.916f),
                    PathNode.QuadTo(9.251f, 8.131f, 9.298f, 8.299f),
                    PathNode.LineTo(9.315f, 8.357001f),
                    PathNode.LineTo(9.415f, 8.337f),
                    PathNode.CurveTo(10.977f, 7.941f, 11.937f, 5.316f, 11.625f, 2.382f),
                    PathNode.Close
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
        return _brandTinder!!
    }

private var _brandTinder: ImageVector? = null
