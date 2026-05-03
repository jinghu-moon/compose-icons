package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.KeyframeAlignHorizontal: ImageVector
    get() {
        if (_keyframeAlignHorizontal != null) return _keyframeAlignHorizontal!!
        _keyframeAlignHorizontal = tablerFilledIcon(
            name = "KeyframeAlignHorizontal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
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
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(5.0f, 11.0f),
                    PathNode.CurveTo(5.529094f, 11.000587f, 5.966165f, 11.413211f, 5.997172f, 11.941395f),
                    PathNode.CurveTo(6.028179f, 12.469579f, 5.642391f, 12.93051f, 5.117f, 12.993f),
                    PathNode.LineTo(5.0f, 13.0f),
                    PathNode.LineTo(3.0f, 13.0f),
                    PathNode.CurveTo(2.470907f, 12.999413f, 2.033835f, 12.586789f, 2.002828f, 12.058605f),
                    PathNode.CurveTo(1.971821f, 11.530421f, 2.35761f, 11.06949f, 2.883f, 11.007f),
                    PathNode.LineTo(3.0f, 11.0f),
                    PathNode.LineTo(5.0f, 11.0f),
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
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(21.0f, 11.0f),
                    PathNode.CurveTo(21.529093f, 11.000587f, 21.966166f, 11.413211f, 21.997171f, 11.941395f),
                    PathNode.CurveTo(22.02818f, 12.469579f, 21.642391f, 12.93051f, 21.117f, 12.993f),
                    PathNode.LineTo(21.0f, 13.0f),
                    PathNode.LineTo(19.0f, 13.0f),
                    PathNode.CurveTo(18.470907f, 12.999413f, 18.033834f, 12.586789f, 18.002829f, 12.058605f),
                    PathNode.CurveTo(17.97182f, 11.530421f, 18.357609f, 11.06949f, 18.883f, 11.007f),
                    PathNode.LineTo(19.0f, 11.0f),
                    PathNode.LineTo(21.0f, 11.0f),
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
        return _keyframeAlignHorizontal!!
    }

private var _keyframeAlignHorizontal: ImageVector? = null
