package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Dumpling: ImageVector
    get() {
        if (_dumpling != null) return _dumpling!!
        _dumpling = tablerFilledIcon(
            name = "Dumpling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(10.003f, 2.04f),
                    PathNode.CurveTo(10.918083f, 1.897332f, 11.852581f, 2.120002f, 12.605f, 2.66f),
                    PathNode.LineTo(12.695f, 2.73f),
                    PathNode.LineTo(12.844f, 2.62f),
                    PathNode.CurveTo(13.734509f, 2.008305f, 14.856096f, 1.838077f, 15.888f, 2.158f),
                    PathNode.LineTo(16.095f, 2.23f),
                    PathNode.CurveTo(16.98858f, 2.568812f, 17.706608f, 3.255448f, 18.085f, 4.133f),
                    PathNode.LineTo(18.099f, 4.164f),
                    PathNode.LineTo(18.144f, 4.16f),
                    PathNode.CurveTo(19.101845f, 4.083655f, 20.049423f, 4.401079f, 20.768f, 5.039f),
                    PathNode.LineTo(20.921f, 5.183f),
                    PathNode.LineTo(21.279f, 5.541f),
                    PathNode.CurveTo(23.255f, 7.518f, 20.959f, 12.289f, 16.624f, 16.624f),
                    PathNode.CurveTo(12.288f, 20.959f, 7.518f, 23.256f, 5.541f, 21.279f),
                    PathNode.LineTo(5.159f, 20.897f),
                    PathNode.LineTo(5.024f, 20.752f),
                    PathNode.CurveTo(4.406748f, 20.048952f, 4.093831f, 19.129625f, 4.154f, 18.196f),
                    PathNode.LineTo(4.164f, 18.096f),
                    PathNode.LineTo(4.002f, 18.024f),
                    PathNode.CurveTo(3.121903f, 17.600727f, 2.456483f, 16.831764f, 2.164f, 15.9f),
                    PathNode.LineTo(2.109f, 15.708f),
                    PathNode.CurveTo(1.851372f, 14.694382f, 2.056472f, 13.618705f, 2.669f, 12.771f),
                    PathNode.LineTo(2.731f, 12.692f),
                    PathNode.LineTo(2.661f, 12.6f),
                    PathNode.CurveTo(2.162311f, 11.904226f, 1.933442f, 11.050944f, 2.017f, 10.199f),
                    PathNode.LineTo(2.042f, 9.999f),
                    PathNode.CurveTo(2.20527f, 8.949758f, 2.832194f, 8.029755f, 3.749f, 7.494f),
                    PathNode.LineTo(3.795f, 7.468f),
                    PathNode.LineTo(3.79f, 7.328f),
                    PathNode.CurveTo(3.788218f, 6.464393f, 4.103082f, 5.630093f, 4.675f, 4.983f),
                    PathNode.LineTo(4.825f, 4.823f),
                    PathNode.LineTo(4.984f, 4.674f),
                    PathNode.CurveTo(5.631498f, 4.102215f, 6.46618f, 3.787697f, 7.33f, 3.79f),
                    PathNode.LineTo(7.47f, 3.794f),
                    PathNode.LineTo(7.496f, 3.748f),
                    PathNode.CurveTo(7.996577f, 2.891829f, 8.834229f, 2.285729f, 9.804f, 2.078f),
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
        return _dumpling!!
    }

private var _dumpling: ImageVector? = null
