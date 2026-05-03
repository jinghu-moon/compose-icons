package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandPaypal: ImageVector
    get() {
        if (_brandPaypal != null) return _brandPaypal!!
        _brandPaypal = tablerFilledIcon(
            name = "BrandPaypal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.5f, 2.0f),
                    PathNode.CurveTo(15.613f, 2.0f, 17.809f, 3.785f, 18.363f, 6.565f),
                    PathNode.CurveTo(20.088f, 7.75f, 21.0f, 9.717f, 21.0f, 12.0f),
                    PathNode.CurveTo(21.0f, 14.933f, 18.252f, 17.384f, 15.217f, 17.496f),
                    PathNode.LineTo(15.0f, 17.5f),
                    PathNode.LineTo(13.246f, 17.5f),
                    PathNode.LineTo(12.78f, 20.3f),
                    PathNode.CurveTo(12.601418f, 21.182188f, 11.855016f, 21.836058f, 10.957f, 21.897f),
                    PathNode.LineTo(10.8f, 21.9f),
                    PathNode.LineTo(8.12f, 21.9f),
                    PathNode.CurveTo(7.664433f, 21.90887f, 7.229532f, 21.710184f, 6.938f, 21.36f),
                    PathNode.CurveTo(6.687088f, 21.06226f, 6.562236f, 20.678375f, 6.59f, 20.29f),
                    PathNode.LineTo(6.632f, 20.0f),
                    PathNode.LineTo(5.0f, 20.0f),
                    PathNode.CurveTo(3.996f, 20.0f, 3.086f, 19.136f, 3.006f, 18.143f),
                    PathNode.LineTo(3.0f, 18.0f),
                    PathNode.LineTo(3.01f, 17.859f),
                    PathNode.LineTo(5.003f, 3.905f),
                    PathNode.LineTo(5.006f, 3.857f),
                    PathNode.CurveTo(5.078f, 2.963f, 5.821f, 2.175f, 6.701f, 2.025f),
                    PathNode.LineTo(6.857f, 2.005f),
                    PathNode.LineTo(7.0f, 2.0f),
                    PathNode.LineTo(12.5f, 2.0f),
                    PathNode.Close,
                    PathNode.MoveTo(18.312f, 9.35f),
                    PathNode.LineTo(18.288f, 9.437f),
                    PathNode.CurveTo(17.582f, 11.84f, 15.216f, 13.873f, 12.733f, 13.994f),
                    PathNode.LineTo(12.5f, 14.0f),
                    PathNode.LineTo(9.997f, 14.0f),
                    PathNode.LineTo(9.997f, 14.05f),
                    PathNode.LineTo(9.972f, 14.233f),
                    PathNode.LineTo(8.772f, 19.233f),
                    PathNode.CurveTo(8.766509f, 19.256554f, 8.760172f, 19.279902f, 8.753f, 19.303f),
                    PathNode.LineTo(8.665f, 19.9f),
                    PathNode.LineTo(10.819f, 19.9f),
                    PathNode.LineTo(11.414f, 16.336f),
                    PathNode.CurveTo(11.486563f, 15.898406f, 11.838718f, 15.560906f, 12.279f, 15.507f),
                    PathNode.LineTo(12.4f, 15.5f),
                    PathNode.LineTo(15.0f, 15.5f),
                    PathNode.CurveTo(17.073f, 15.5f, 19.0f, 13.83f, 19.0f, 12.0f),
                    PathNode.CurveTo(19.0f, 10.978f, 18.764f, 10.076f, 18.312f, 9.35f),
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
        return _brandPaypal!!
    }

private var _brandPaypal: ImageVector? = null
