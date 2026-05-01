package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandOpenSource: ImageVector
    get() {
        if (_brandOpenSource != null) return _brandOpenSource!!
        _brandOpenSource = tablerFilledIcon(
            name = "BrandOpenSource",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.283f, 2.004f),
                    PathNode.CurveTo(16.961462f, 2.134276f, 20.923744f, 5.492075f, 21.819706f, 10.085793f),
                    PathNode.CurveTo(22.715666f, 14.679509f, 20.305607f, 19.280172f, 16.019f, 21.159f),
                    PathNode.CurveTo(15.769859f, 21.268064f, 15.487044f, 21.270948f, 15.23573f, 21.16699f),
                    PathNode.CurveTo(14.984417f, 21.06303f, 14.786286f, 20.861197f, 14.687f, 20.608f),
                    PathNode.LineTo(12.494f, 15.006f),
                    PathNode.CurveTo(12.309492f, 14.535397f, 12.505184f, 14.001104f, 12.95f, 13.761f),
                    PathNode.CurveTo(13.755952f, 13.325962f, 14.163419f, 12.399066f, 13.939065f, 11.511102f),
                    PathNode.CurveTo(13.71471f, 10.623137f, 12.915869f, 10.001028f, 12.0f, 10.001028f),
                    PathNode.CurveTo(11.084131f, 10.001028f, 10.28529f, 10.623137f, 10.060935f, 11.511102f),
                    PathNode.CurveTo(9.836581f, 12.399066f, 10.244048f, 13.325962f, 11.05f, 13.761f),
                    PathNode.CurveTo(11.494686f, 14.000707f, 11.690756f, 14.534427f, 11.507f, 15.005f),
                    PathNode.LineTo(9.314f, 20.608f),
                    PathNode.CurveTo(9.214911f, 20.861376f, 9.016863f, 21.06344f, 8.765527f, 21.167599f),
                    PathNode.CurveTo(8.514192f, 21.271755f, 8.231268f, 21.269012f, 7.982f, 21.16f),
                    PathNode.CurveTo(3.645518f, 19.260765f, 1.235016f, 14.58093f, 2.206669f, 9.947565f),
                    PathNode.CurveTo(3.178321f, 5.314202f, 7.265852f, 1.997055f, 12.0f, 2.0f),
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
        return _brandOpenSource!!
    }

private var _brandOpenSource: ImageVector? = null
