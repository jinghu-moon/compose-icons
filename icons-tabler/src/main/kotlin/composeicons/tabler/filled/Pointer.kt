package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Pointer: ImageVector
    get() {
        if (_pointer != null) return _pointer!!
        _pointer = tablerFilledIcon(
            name = "Pointer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(3.039f, 4.277f),
                    PathNode.LineTo(6.943f, 17.84f),
                    PathNode.CurveTo(7.128f, 18.677f, 7.863f, 19.356f, 8.774f, 19.482f),
                    PathNode.LineTo(8.944f, 19.498f),
                    PathNode.CurveTo(9.737944f, 19.545597f, 10.495757f, 19.160957f, 10.926f, 18.492f),
                    PathNode.LineTo(10.971f, 18.414f),
                    PathNode.LineTo(12.371f, 16.342f),
                    PathNode.LineTo(16.421f, 20.392f),
                    PathNode.CurveTo(16.808672f, 20.779888f, 17.334597f, 20.99782f, 17.883f, 20.99782f),
                    PathNode.CurveTo(18.431404f, 20.99782f, 18.957329f, 20.779888f, 19.345f, 20.392f),
                    PathNode.LineTo(20.392f, 19.345f),
                    PathNode.CurveTo(20.78f, 18.957f, 20.998f, 18.432f, 20.998f, 17.884f),
                    PathNode.LineTo(20.99f, 17.702f),
                    PathNode.CurveTo(20.947193f, 17.21834f, 20.735485f, 16.765186f, 20.392f, 16.422f),
                    PathNode.LineTo(16.345f, 12.374f),
                    PathNode.LineTo(18.448f, 10.962f),
                    PathNode.CurveTo(19.174f, 10.577f, 19.628f, 9.684f, 19.501f, 8.773f),
                    PathNode.CurveTo(19.374739f, 7.863214f, 18.696552f, 7.127615f, 17.8f, 6.928f),
                    PathNode.LineTo(4.276f, 3.038f),
                    PathNode.CurveTo(3.926019f, 2.937647f, 3.54915f, 3.035437f, 3.292119f, 3.2933f),
                    PathNode.CurveTo(3.035089f, 3.551162f, 2.938516f, 3.928345f, 3.04f, 4.278f),
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
        return _pointer!!
    }

private var _pointer: ImageVector? = null
