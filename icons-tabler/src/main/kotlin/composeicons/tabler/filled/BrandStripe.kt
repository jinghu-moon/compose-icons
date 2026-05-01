package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandStripe: ImageVector
    get() {
        if (_brandStripe != null) return _brandStripe!!
        _brandStripe = tablerFilledIcon(
            name = "BrandStripe",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.5f, 2.0f),
                    PathNode.CurveTo(14.95f, 2.0f, 17.043f, 2.44f, 18.428f, 3.096f),
                    PathNode.CurveTo(18.81825f, 3.280937f, 19.045694f, 3.695498f, 18.992f, 4.124f),
                    PathNode.LineTo(18.492f, 8.124f),
                    PathNode.CurveTo(18.452127f, 8.444064f, 18.260326f, 8.725246f, 17.976885f, 8.879166f),
                    PathNode.CurveTo(17.693441f, 9.033085f, 17.353163f, 9.040843f, 17.063f, 8.9f),
                    PathNode.CurveTo(16.016f, 8.391f, 14.445f, 8.077f, 12.895f, 8.077f),
                    PathNode.QuadTo(12.689f, 8.078f, 12.563f, 8.103f),
                    PathNode.LineTo(12.591f, 8.127f),
                    PathNode.LineTo(12.661f, 8.174f),
                    PathNode.CurveTo(12.975f, 8.381f, 13.493f, 8.611f, 14.333f, 8.92f),
                    PathNode.CurveTo(18.157f, 10.271f, 20.0f, 12.16f, 20.0f, 15.5f),
                    PathNode.CurveTo(20.0f, 17.63f, 19.242f, 19.232f, 17.705f, 20.424f),
                    PathNode.CurveTo(16.412f, 21.447f, 14.283f, 22.0f, 12.0f, 22.0f),
                    PathNode.CurveTo(9.6f, 22.0f, 7.28f, 21.356f, 5.514f, 20.374f),
                    PathNode.CurveTo(5.157583f, 20.175661f, 4.957347f, 19.78073f, 5.008f, 19.376f),
                    PathNode.LineTo(5.508f, 15.376f),
                    PathNode.CurveTo(5.549611f, 15.043095f, 5.755388f, 14.75324f, 6.055946f, 14.604168f),
                    PathNode.CurveTo(6.356503f, 14.455096f, 6.711787f, 14.466675f, 7.002f, 14.635f),
                    PathNode.CurveTo(8.294f, 15.385f, 10.642f, 16.0f, 12.0f, 16.0f),
                    PathNode.CurveTo(12.39f, 16.0f, 12.704f, 15.853f, 12.87f, 15.705f),
                    PathNode.LineTo(12.905f, 15.67f),
                    PathNode.LineTo(12.815f, 15.635f),
                    PathNode.CurveTo(12.648f, 15.575f, 11.232f, 15.142f, 10.662f, 14.941f),
                    PathNode.CurveTo(7.036f, 13.637f, 5.0f, 11.332f, 5.0f, 8.0f),
                    PathNode.CurveTo(5.0f, 6.113f, 5.882f, 4.437f, 7.37f, 3.223f),
                    PathNode.CurveTo(8.59f, 2.236f, 9.887f, 2.0f, 12.5f, 2.0f)
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
        return _brandStripe!!
    }

private var _brandStripe: ImageVector? = null
