package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Affiliate: ImageVector
    get() {
        if (_affiliate != null) return _affiliate!!
        _affiliate = tablerFilledIcon(
            name = "Affiliate",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(18.5f, 3.0f),
                    PathNode.CurveTo(19.505127f, 3.000293f, 20.412338f, 3.602514f, 20.80286f, 4.528674f),
                    PathNode.CurveTo(21.193384f, 5.454834f, 20.991266f, 6.524812f, 20.289808f, 7.244699f),
                    PathNode.CurveTo(19.588352f, 7.964586f, 18.523973f, 8.194377f, 17.588f, 7.828f),
                    PathNode.LineTo(13.032f, 12.383f),
                    PathNode.CurveTo(13.780979f, 13.467931f, 14.113331f, 14.786685f, 13.968f, 16.097f),
                    PathNode.LineTo(16.592f, 16.884f),
                    PathNode.CurveTo(17.357487f, 15.98099f, 18.651382f, 15.738665f, 19.691765f, 16.303463f),
                    PathNode.CurveTo(20.73215f, 16.868263f, 21.233774f, 18.085333f, 20.893501f, 19.21918f),
                    PathNode.CurveTo(20.553228f, 20.353027f, 19.464354f, 21.092781f, 18.284897f, 20.991396f),
                    PathNode.CurveTo(17.10544f, 20.89001f, 16.158781f, 19.975285f, 16.017f, 18.8f),
                    PathNode.LineTo(13.394f, 18.012f),
                    PathNode.CurveTo(12.253707f, 20.236372f, 9.75686f, 21.412077f, 7.315827f, 20.874062f),
                    PathNode.CurveTo(4.874794f, 20.336048f, 3.103542f, 18.219637f, 3.004f, 15.722f),
                    PathNode.LineTo(3.0f, 15.5f),
                    PathNode.LineTo(3.004f, 15.279f),
                    PathNode.CurveTo(3.08335f, 13.297244f, 4.223529f, 11.511702f, 5.988f, 10.606f),
                    PathNode.LineTo(5.2f, 7.982f),
                    PathNode.CurveTo(4.010917f, 7.839236f, 3.09047f, 6.87264f, 3.006f, 5.678f),
                    PathNode.LineTo(3.0f, 5.5f),
                    PathNode.LineTo(3.005f, 5.336f),
                    PathNode.CurveTo(3.079486f, 4.201731f, 3.909803f, 3.260495f, 5.025923f, 3.045109f),
                    PathNode.CurveTo(6.142042f, 2.829723f, 7.262969f, 3.394412f, 7.754166f, 4.419517f),
                    PathNode.CurveTo(8.245363f, 5.444622f, 7.983166f, 6.67206f, 7.116f, 7.407f),
                    PathNode.LineTo(7.903f, 10.032f),
                    PathNode.CurveTo(9.213315f, 9.886669f, 10.532069f, 10.219021f, 11.617f, 10.968f),
                    PathNode.LineTo(16.172f, 6.412f),
                    PathNode.CurveTo(16.078018f, 6.172794f, 16.021683f, 5.920465f, 16.005f, 5.664f),
                    PathNode.LineTo(16.0f, 5.5f),
                    PathNode.LineTo(16.005f, 5.336f),
                    PathNode.CurveTo(16.091408f, 4.021642f, 17.182804f, 2.999797f, 18.5f, 3.0f),
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
        return _affiliate!!
    }

private var _affiliate: ImageVector? = null
