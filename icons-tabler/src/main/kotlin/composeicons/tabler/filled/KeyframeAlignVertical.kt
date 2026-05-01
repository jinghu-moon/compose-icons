package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.KeyframeAlignVertical: ImageVector
    get() {
        if (_keyframeAlignVertical != null) return _keyframeAlignVertical!!
        _keyframeAlignVertical = tablerFilledIcon(
            name = "KeyframeAlignVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 1.0f),
                    PathNode.CurveTo(12.506975f, 1.000067f, 12.933684f, 1.379507f, 12.993f, 1.883f),
                    PathNode.LineTo(13.0f, 2.0f),
                    PathNode.LineTo(13.0f, 4.0f),
                    PathNode.CurveTo(12.999413f, 4.529094f, 12.586789f, 4.966165f, 12.058605f, 4.997172f),
                    PathNode.CurveTo(11.530421f, 5.028179f, 11.06949f, 4.642391f, 11.007f, 4.117f),
                    PathNode.LineTo(11.0f, 4.0f),
                    PathNode.LineTo(11.0f, 2.0f),
                    PathNode.CurveTo(11.0f, 1.447715f, 11.447715f, 1.0f, 12.0f, 1.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 6.0f),
                    PathNode.CurveTo(11.371f, 6.0f, 10.786f, 6.301f, 10.394f, 6.807f),
                    PathNode.LineTo(7.486f, 10.555f),
                    PathNode.CurveTo(6.843069f, 11.404514f, 6.838586f, 12.576592f, 7.475f, 13.431f),
                    PathNode.LineTo(10.394f, 17.193f),
                    PathNode.CurveTo(10.784f, 17.698f, 11.371f, 18.0f, 12.0f, 18.0f),
                    PathNode.CurveTo(12.629f, 18.0f, 13.214f, 17.699f, 13.606f, 17.193f),
                    PathNode.LineTo(16.514f, 13.445f),
                    PathNode.CurveTo(17.15693f, 12.595486f, 17.161415f, 11.423408f, 16.525f, 10.569f),
                    PathNode.LineTo(13.606f, 6.807f),
                    PathNode.CurveTo(13.225203f, 6.302995f, 12.631668f, 6.00475f, 12.0f, 6.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.0f, 19.0f),
                    PathNode.CurveTo(12.506975f, 19.000067f, 12.933684f, 19.379507f, 12.993f, 19.883f),
                    PathNode.LineTo(13.0f, 20.0f),
                    PathNode.LineTo(13.0f, 22.0f),
                    PathNode.CurveTo(12.999413f, 22.529093f, 12.586789f, 22.966166f, 12.058605f, 22.997171f),
                    PathNode.CurveTo(11.530421f, 23.02818f, 11.06949f, 22.642391f, 11.007f, 22.117f),
                    PathNode.LineTo(11.0f, 22.0f),
                    PathNode.LineTo(11.0f, 20.0f),
                    PathNode.CurveTo(11.0f, 19.447716f, 11.447715f, 19.0f, 12.0f, 19.0f),
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
        return _keyframeAlignVertical!!
    }

private var _keyframeAlignVertical: ImageVector? = null
