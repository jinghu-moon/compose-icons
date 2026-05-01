package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bolt: ImageVector
    get() {
        if (_bolt != null) return _bolt!!
        _bolt = tablerFilledIcon(
            name = "Bolt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 2.0f),
                    PathNode.LineTo(13.018f, 2.001f),
                    PathNode.LineTo(13.034f, 2.002f),
                    PathNode.LineTo(13.117f, 2.007f),
                    PathNode.LineTo(13.128f, 2.009f),
                    PathNode.LineTo(13.139f, 2.009f),
                    PathNode.LineTo(13.177f, 2.018f),
                    PathNode.LineTo(13.229f, 2.026f),
                    PathNode.LineTo(13.245f, 2.032f),
                    PathNode.LineTo(13.256f, 2.033f),
                    PathNode.LineTo(13.285f, 2.044f),
                    PathNode.LineTo(13.337f, 2.058f),
                    PathNode.LineTo(13.356f, 2.067f),
                    PathNode.LineTo(13.371f, 2.071f),
                    PathNode.LineTo(13.399f, 2.085f),
                    PathNode.LineTo(13.439f, 2.102f),
                    PathNode.LineTo(13.46f, 2.114f),
                    PathNode.LineTo(13.482f, 2.124f),
                    PathNode.LineTo(13.505f, 2.139f),
                    PathNode.LineTo(13.536f, 2.156f),
                    PathNode.LineTo(13.57f, 2.18f),
                    PathNode.LineTo(13.588f, 2.191f),
                    PathNode.LineTo(13.601f, 2.203f),
                    PathNode.LineTo(13.625f, 2.22f),
                    PathNode.LineTo(13.663f, 2.254f),
                    PathNode.LineTo(13.685f, 2.271f),
                    PathNode.LineTo(13.693f, 2.281f),
                    PathNode.LineTo(13.707f, 2.293f),
                    PathNode.LineTo(13.743f, 2.334f),
                    PathNode.LineTo(13.769f, 2.361f),
                    PathNode.LineTo(13.775f, 2.37f),
                    PathNode.CurveTo(13.895f, 2.517f, 13.971f, 2.692f, 13.993f, 2.883f),
                    PathNode.LineTo(13.994f, 2.895f),
                    PathNode.LineTo(13.996f, 2.936f),
                    PathNode.LineTo(14.0f, 3.0f),
                    PathNode.LineTo(14.0f, 9.0f),
                    PathNode.LineTo(19.0f, 9.0f),
                    PathNode.CurveTo(19.356691f, 8.999911f, 19.686428f, 9.189821f, 19.865347f, 9.498394f),
                    PathNode.CurveTo(20.044264f, 9.806968f, 20.045277f, 10.18748f, 19.868f, 10.497f),
                    PathNode.LineTo(19.808f, 10.588f),
                    PathNode.LineTo(11.808f, 21.588f),
                    PathNode.CurveTo(11.24f, 22.371f, 10.0f, 21.968f, 10.0f, 21.0f),
                    PathNode.LineTo(10.0f, 15.0f),
                    PathNode.LineTo(5.0f, 15.0f),
                    PathNode.CurveTo(4.643308f, 15.000089f, 4.313573f, 14.810179f, 4.134654f, 14.501606f),
                    PathNode.CurveTo(3.955736f, 14.193032f, 3.954724f, 13.81252f, 4.132f, 13.503f),
                    PathNode.LineTo(4.192f, 13.412f),
                    PathNode.LineTo(12.192f, 2.412f),
                    PathNode.LineTo(12.202f, 2.399f),
                    PathNode.LineTo(12.22f, 2.375f),
                    PathNode.LineTo(12.253f, 2.337f),
                    PathNode.LineTo(12.271f, 2.315f),
                    PathNode.LineTo(12.28f, 2.307f),
                    PathNode.LineTo(12.293f, 2.293f),
                    PathNode.LineTo(12.333f, 2.257f),
                    PathNode.LineTo(12.361f, 2.231f),
                    PathNode.LineTo(12.369f, 2.225f),
                    PathNode.CurveTo(12.486202f, 2.129081f, 12.62366f, 2.061036f, 12.771f, 2.026f),
                    PathNode.LineTo(12.782f, 2.025f),
                    PathNode.LineTo(12.809f, 2.02f),
                    PathNode.LineTo(12.883f, 2.007f),
                    PathNode.LineTo(12.894f, 2.006f),
                    PathNode.LineTo(12.935f, 2.004f),
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
        return _bolt!!
    }

private var _bolt: ImageVector? = null
