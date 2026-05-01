package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.BrandRumble: ImageVector
    get() {
        if (_brandRumble != null) return _brandRumble!!
        _brandRumble = tablerOutlineIcon(
            name = "BrandRumble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(19.993f, 9.108f),
                    PathNode.CurveTo(20.376f, 9.508f, 20.68f, 9.971f, 20.886f, 10.476f),
                    PathNode.CurveTo(21.301447f, 11.490041f, 21.303598f, 12.626391f, 20.892f, 13.642f),
                    PathNode.CurveTo(20.685211f, 14.151027f, 20.384287f, 14.616493f, 20.005f, 15.014f),
                    PathNode.CurveTo(19.319147f, 15.734019f, 18.581148f, 16.402498f, 17.797f, 17.014f),
                    PathNode.CurveTo(17.006996f, 17.630224f, 16.173119f, 18.188036f, 15.302f, 18.683f),
                    PathNode.CurveTo(13.541939f, 19.679962f, 11.648964f, 20.421394f, 9.68f, 20.885f),
                    PathNode.CurveTo(8.663853f, 21.12716f, 7.593977f, 20.98318f, 6.678f, 20.481f),
                    PathNode.CurveTo(6.232087f, 20.235968f, 5.837292f, 19.90771f, 5.515f, 19.514f),
                    PathNode.CurveTo(5.199232f, 19.126677f, 4.963049f, 18.680817f, 4.82f, 18.202f),
                    PathNode.CurveTo(3.621f, 14.3f, 3.798f, 9.89f, 4.954f, 5.972f),
                    PathNode.CurveTo(5.563f, 3.915f, 7.597f, 2.623f, 9.691f, 3.098f),
                    PathNode.CurveTo(13.571f, 3.978f, 17.211f, 6.245f, 19.993f, 9.108f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.044f, 13.034f),
                    PathNode.CurveTo(14.714f, 12.529f, 14.714f, 11.545f, 14.044f, 11.024f),
                    PathNode.CurveTo(13.566593f, 10.64555f, 13.066311f, 10.296888f, 12.546f, 9.98f),
                    PathNode.CurveTo(12.023247f, 9.660468f, 11.482331f, 9.371646f, 10.926f, 9.115f),
                    PathNode.CurveTo(10.156f, 8.765f, 9.296f, 9.254f, 9.173f, 10.088f),
                    PathNode.CurveTo(8.983868f, 11.341065f, 8.95028f, 12.612698f, 9.073f, 13.874f),
                    PathNode.CurveTo(9.106584f, 14.268619f, 9.32783f, 14.623031f, 9.66761f, 14.826503f),
                    PathNode.CurveTo(10.007391f, 15.029975f, 10.424272f, 15.057694f, 10.788f, 14.901f),
                    PathNode.CurveTo(11.369686f, 14.661654f, 11.935502f, 14.385425f, 12.482f, 14.074f),
                    PathNode.CurveTo(13.024496f, 13.763133f, 13.546258f, 13.417408f, 14.044f, 13.039f),
                    PathNode.LineTo(14.044f, 13.034f)
                ),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color.Black),
                strokeAlpha = 1f,
                strokeLineWidth = 2.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _brandRumble!!
    }

private var _brandRumble: ImageVector? = null
