package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.TriangleInverted: ImageVector
    get() {
        if (_triangleInverted != null) return _triangleInverted!!
        _triangleInverted = tablerFilledIcon(
            name = "TriangleInverted",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(20.118f, 3.0f),
                    PathNode.LineTo(3.893f, 3.0f),
                    PathNode.CurveTo(2.85561f, 3.007318f, 1.900337f, 3.565614f, 1.384814f, 4.465874f),
                    PathNode.CurveTo(0.869291f, 5.366134f, 0.871266f, 6.472587f, 1.39f, 7.371f),
                    PathNode.LineTo(9.506f, 20.92f),
                    PathNode.CurveTo(10.034045f, 21.791803f, 10.978843f, 22.32476f, 11.998093f, 22.325783f),
                    PathNode.CurveTo(13.017344f, 22.326803f, 13.963207f, 21.795742f, 14.493f, 20.925f),
                    PathNode.LineTo(22.603f, 7.386f),
                    PathNode.CurveTo(23.127928f, 6.48929f, 23.135662f, 5.380907f, 22.6233f, 4.476957f),
                    PathNode.CurveTo(22.11094f, 3.573007f, 21.156006f, 3.010268f, 20.117f, 3.0f),
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
        return _triangleInverted!!
    }

private var _triangleInverted: ImageVector? = null
