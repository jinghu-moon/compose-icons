package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bottle: ImageVector
    get() {
        if (_bottle != null) return _bottle!!
        _bottle = tablerFilledIcon(
            name = "Bottle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(13.0f, 1.0f),
                    PathNode.CurveTo(14.046625f, 0.999669f, 14.916503f, 1.806323f, 14.995f, 2.85f),
                    PathNode.LineTo(15.0f, 3.0f),
                    PathNode.LineTo(15.0f, 3.5f),
                    PathNode.CurveTo(15.0f, 4.817f, 15.381f, 6.104f, 16.094f, 7.205f),
                    PathNode.LineTo(16.264f, 7.455f),
                    PathNode.LineTo(16.314f, 7.527f),
                    PathNode.CurveTo(17.340893f, 8.968548f, 17.92476f, 10.678449f, 17.994f, 12.447f),
                    PathNode.LineTo(18.0f, 12.801f),
                    PathNode.LineTo(18.0f, 19.0f),
                    PathNode.CurveTo(18.000088f, 20.588558f, 16.761822f, 21.901804f, 15.176f, 21.995f),
                    PathNode.LineTo(15.0f, 22.0f),
                    PathNode.LineTo(9.0f, 22.0f),
                    PathNode.CurveTo(7.411443f, 22.000088f, 6.098196f, 20.761822f, 6.005f, 19.176f),
                    PathNode.LineTo(6.0f, 19.0f),
                    PathNode.LineTo(6.0f, 12.8f),
                    PathNode.CurveTo(6.000326f, 11.030163f, 6.516737f, 9.298829f, 7.486f, 7.818f),
                    PathNode.LineTo(7.686f, 7.526f),
                    PathNode.LineTo(7.736f, 7.457f),
                    PathNode.CurveTo(8.558369f, 6.301436f, 9.000184f, 4.918316f, 9.0f, 3.5f),
                    PathNode.LineTo(9.0f, 3.0f),
                    PathNode.CurveTo(8.999669f, 1.953375f, 9.806323f, 1.083497f, 10.85f, 1.005f),
                    PathNode.LineTo(11.0f, 1.0f),
                    PathNode.LineTo(13.0f, 1.0f),
                    PathNode.Close,
                    PathNode.MoveTo(13.362f, 6.0f),
                    PathNode.LineTo(10.638f, 6.0f),
                    PathNode.CurveTo(10.393874f, 6.826553f, 10.030013f, 7.612897f, 9.558f, 8.334f),
                    PathNode.LineTo(9.364f, 8.618f),
                    PathNode.LineTo(9.314f, 8.687f),
                    PathNode.CurveTo(8.521391f, 9.800573f, 8.067514f, 11.119492f, 8.007f, 12.485f),
                    PathNode.LineTo(8.004f, 12.61f),
                    PathNode.CurveTo(8.58096f, 12.202315f, 9.272628f, 11.988687f, 9.979f, 12.0f),
                    PathNode.CurveTo(11.099119f, 11.976722f, 12.158808f, 12.506753f, 12.812f, 13.417f),
                    PathNode.CurveTo(13.082f, 13.792f, 13.518f, 14.01f, 14.021f, 14.0f),
                    PathNode.CurveTo(14.481954f, 14.009517f, 14.918041f, 13.791473f, 15.187f, 13.417f),
                    PathNode.CurveTo(15.410118f, 13.106704f, 15.683956f, 12.836246f, 15.997f, 12.617f),
                    PathNode.LineTo(16.0f, 12.8f),
                    PathNode.CurveTo(16.0f, 11.43f, 15.604f, 10.093f, 14.863f, 8.948f),
                    PathNode.LineTo(14.635f, 8.616f),
                    PathNode.CurveTo(14.068897f, 7.820412f, 13.638722f, 6.936407f, 13.362f, 6.0f),
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
        return _bottle!!
    }

private var _bottle: ImageVector? = null
