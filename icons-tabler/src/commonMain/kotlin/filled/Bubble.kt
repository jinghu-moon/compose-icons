package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Bubble: ImageVector
    get() {
        if (_bubble != null) return _bubble!!
        _bubble = tablerFilledIcon(
            name = "Bubble",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(12.4f, 2.0f),
                    PathNode.CurveTo(14.667f, 1.999025f, 16.76144f, 3.210451f, 17.891f, 5.176f),
                    PathNode.LineTo(17.981f, 5.338f),
                    PathNode.LineTo(18.107f, 5.365f),
                    PathNode.CurveTo(20.887909f, 6.0149f, 22.89016f, 8.445123f, 22.996f, 11.299f),
                    PathNode.LineTo(23.0f, 11.533f),
                    PathNode.CurveTo(23.000265f, 13.21279f, 22.333157f, 14.82387f, 21.14546f, 16.011753f),
                    PathNode.CurveTo(19.957764f, 17.199638f, 18.346788f, 17.867f, 16.667f, 17.867f),
                    PathNode.LineTo(16.632f, 17.865f),
                    PathNode.LineTo(16.597f, 17.915f),
                    PathNode.CurveTo(15.652678f, 19.162483f, 14.202022f, 19.92483f, 12.639f, 19.995f),
                    PathNode.LineTo(12.4f, 20.0f),
                    PathNode.QuadTo(11.678f, 20.0f, 10.996f, 19.81f),
                    PathNode.LineTo(10.949f, 19.796f),
                    PathNode.LineTo(7.515f, 21.857f),
                    PathNode.CurveTo(7.223533f, 22.032349f, 6.86292f, 22.047514f, 6.557759f, 21.897259f),
                    PathNode.CurveTo(6.252597f, 21.747004f, 6.044738f, 21.451935f, 6.006f, 21.114f),
                    PathNode.LineTo(6.0f, 21.0f),
                    PathNode.LineTo(6.0f, 18.566f),
                    PathNode.LineTo(5.879f, 18.506f),
                    PathNode.CurveTo(4.744138f, 17.90181f, 4.008189f, 16.747812f, 3.939f, 15.464f),
                    PathNode.LineTo(3.933f, 15.267f),
                    PathNode.QuadTo(3.933f, 14.902f, 4.003f, 14.55f),
                    PathNode.LineTo(4.016f, 14.492f),
                    PathNode.LineTo(3.903f, 14.402f),
                    PathNode.CurveTo(2.638445f, 13.356112f, 1.87613f, 11.823488f, 1.805f, 10.184f),
                    PathNode.LineTo(1.8f, 9.934f),
                    PathNode.CurveTo(1.8f, 6.730749f, 4.396749f, 4.134f, 7.6f, 4.134f),
                    PathNode.LineTo(7.658f, 4.135f),
                    PathNode.LineTo(7.808f, 3.972f),
                    PathNode.CurveTo(8.939684f, 2.778043f, 10.492315f, 2.072399f, 12.136f, 2.005f),
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
        return _bubble!!
    }

private var _bubble: ImageVector? = null
