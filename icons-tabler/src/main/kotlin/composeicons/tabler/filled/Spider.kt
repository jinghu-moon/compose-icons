package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Spider: ImageVector
    get() {
        if (_spider != null) return _spider!!
        _spider = tablerFilledIcon(
            name = "Spider",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.0f, 3.0f),
                    PathNode.CurveTo(19.552284f, 3.0f, 20.0f, 3.447715f, 20.0f, 4.0f),
                    PathNode.LineTo(20.0f, 6.0f),
                    PathNode.CurveTo(19.999943f, 6.265195f, 19.89455f, 6.519508f, 19.707f, 6.707f),
                    PathNode.LineTo(16.414f, 10.0f),
                    PathNode.LineTo(19.584f, 10.0f),
                    PathNode.LineTo(20.793f, 8.793f),
                    PathNode.CurveTo(21.18538f, 8.414028f, 21.809084f, 8.419448f, 22.194818f, 8.805182f),
                    PathNode.CurveTo(22.580553f, 9.190915f, 22.585972f, 9.814621f, 22.207f, 10.207f),
                    PathNode.LineTo(20.707f, 11.707f),
                    PathNode.CurveTo(20.519506f, 11.894549f, 20.265194f, 11.999944f, 20.0f, 12.0f),
                    PathNode.LineTo(16.415f, 12.0f),
                    PathNode.LineTo(20.707f, 16.293f),
                    PathNode.CurveTo(20.89455f, 16.480494f, 20.999943f, 16.734806f, 21.0f, 17.0f),
                    PathNode.LineTo(21.0f, 19.0f),
                    PathNode.CurveTo(21.0f, 19.552284f, 20.552284f, 20.0f, 20.0f, 20.0f),
                    PathNode.CurveTo(19.447716f, 20.0f, 19.0f, 19.552284f, 19.0f, 19.0f),
                    PathNode.LineTo(19.0f, 17.415f),
                    PathNode.LineTo(16.984f, 15.399f),
                    PathNode.CurveTo(16.775652f, 17.997095f, 14.606436f, 19.99932f, 12.0f, 19.99932f),
                    PathNode.CurveTo(9.393564f, 19.99932f, 7.224348f, 17.997095f, 7.016f, 15.399f),
                    PathNode.LineTo(5.0f, 17.414f),
                    PathNode.LineTo(5.0f, 19.0f),
                    PathNode.CurveTo(4.999933f, 19.506975f, 4.620493f, 19.933683f, 4.117f, 19.993f),
                    PathNode.LineTo(4.0f, 20.0f),
                    PathNode.CurveTo(3.447715f, 20.0f, 3.0f, 19.552284f, 3.0f, 19.0f),
                    PathNode.LineTo(3.0f, 17.0f),
                    PathNode.CurveTo(3.000057f, 16.734806f, 3.105451f, 16.480494f, 3.293f, 16.293f),
                    PathNode.LineTo(7.584f, 12.0f),
                    PathNode.LineTo(4.0f, 12.0f),
                    PathNode.CurveTo(3.734805f, 11.999944f, 3.480493f, 11.894549f, 3.293f, 11.707f),
                    PathNode.LineTo(1.793f, 10.207f),
                    PathNode.CurveTo(1.414028f, 9.814621f, 1.419448f, 9.190915f, 1.805181f, 8.805182f),
                    PathNode.CurveTo(2.190915f, 8.419448f, 2.814621f, 8.414028f, 3.207f, 8.793f),
                    PathNode.LineTo(4.415f, 10.0f),
                    PathNode.LineTo(7.585f, 10.0f),
                    PathNode.LineTo(4.293f, 6.707f),
                    PathNode.CurveTo(4.105451f, 6.519508f, 4.000057f, 6.265195f, 4.0f, 6.0f),
                    PathNode.LineTo(4.0f, 4.0f),
                    PathNode.CurveTo(4.0f, 3.447715f, 4.447716f, 3.0f, 5.0f, 3.0f),
                    PathNode.CurveTo(5.552285f, 3.0f, 6.0f, 3.447715f, 6.0f, 4.0f),
                    PathNode.LineTo(6.0f, 5.585f),
                    PathNode.LineTo(9.025f, 8.61f),
                    PathNode.CurveTo(9.219205f, 7.115116f, 10.492554f, 5.996491f, 12.0f, 5.996491f),
                    PathNode.CurveTo(13.507446f, 5.996491f, 14.780795f, 7.115116f, 14.975f, 8.61f),
                    PathNode.LineTo(18.0f, 5.584f),
                    PathNode.LineTo(18.0f, 4.0f),
                    PathNode.CurveTo(18.000067f, 3.493025f, 18.379507f, 3.066316f, 18.883f, 3.007f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _spider!!
    }

private var _spider: ImageVector? = null
