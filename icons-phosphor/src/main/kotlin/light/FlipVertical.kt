package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FlipVertical: ImageVector
    get() {
        if (_flipVertical != null) return _flipVertical!!
        _flipVertical = phosphorLightIcon(
            name = "FlipVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.0f, 118.0f),
                    PathNode.LineTo(216.0f, 118.0f),
                    PathNode.CurveTo(222.66614f, 118.0097f, 228.41458f, 113.317795f, 229.74059f, 106.78487f),
                    PathNode.CurveTo(231.0666f, 100.25193f, 227.60239f, 93.6901f, 221.46f, 91.1f),
                    PathNode.LineTo(221.35f, 91.1f),
                    PathNode.LineTo(61.4f, 27.1f),
                    PathNode.CurveTo(57.081272f, 25.294485f, 52.145935f, 25.766825f, 48.248062f, 28.358711f),
                    PathNode.CurveTo(44.350185f, 30.950596f, 42.00557f, 35.319054f, 42.0f, 40.0f),
                    PathNode.LineTo(42.0f, 104.0f),
                    PathNode.CurveTo(42.0f, 111.73199f, 48.268013f, 118.0f, 56.0f, 118.0f),
                    PathNode.Close,
                    PathNode.MoveTo(54.0f, 40.0f),
                    PathNode.CurveTo(54.0f, 38.89543f, 54.89543f, 38.0f, 56.0f, 38.0f),
                    PathNode.CurveTo(56.27146f, 37.999165f, 56.540253f, 38.053604f, 56.79f, 38.16f),
                    PathNode.LineTo(56.9f, 38.21f),
                    PathNode.LineTo(216.82f, 102.21f),
                    PathNode.CurveTo(217.63997f, 102.61727f, 218.07869f, 103.52931f, 217.88509f, 104.42415f),
                    PathNode.CurveTo(217.69147f, 105.31898f, 216.91498f, 105.968094f, 216.0f, 106.0f),
                    PathNode.LineTo(56.0f, 106.0f),
                    PathNode.CurveTo(54.89543f, 106.0f, 54.0f, 105.10457f, 54.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 138.0f),
                    PathNode.LineTo(56.0f, 138.0f),
                    PathNode.CurveTo(48.268013f, 138.0f, 42.0f, 144.26802f, 42.0f, 152.0f),
                    PathNode.LineTo(42.0f, 216.0f),
                    PathNode.CurveTo(42.00028f, 220.68182f, 44.340836f, 225.05363f, 48.23697f, 227.64972f),
                    PathNode.CurveTo(52.133106f, 230.2458f, 57.06906f, 230.72249f, 61.39f, 228.92f),
                    PathNode.LineTo(221.39f, 164.92f),
                    PathNode.LineTo(221.5f, 164.87f),
                    PathNode.CurveTo(227.60956f, 162.25421f, 231.03809f, 155.70354f, 229.70535f, 149.19255f),
                    PathNode.CurveTo(228.37263f, 142.68158f, 222.64598f, 138.00487f, 216.0f, 138.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.82f, 153.83f),
                    PathNode.LineTo(56.9f, 217.83f),
                    PathNode.LineTo(56.79f, 217.88f),
                    PathNode.CurveTo(56.165005f, 218.14891f, 55.44617f, 218.08163f, 54.881924f, 217.70143f),
                    PathNode.CurveTo(54.317677f, 217.32121f, 53.985428f, 216.68024f, 54.0f, 216.0f),
                    PathNode.LineTo(54.0f, 152.0f),
                    PathNode.CurveTo(54.0f, 150.89543f, 54.89543f, 150.0f, 56.0f, 150.0f),
                    PathNode.LineTo(216.0f, 150.0f),
                    PathNode.CurveTo(216.94814f, 149.99374f, 217.77037f, 150.6541f, 217.96889f, 151.58125f),
                    PathNode.CurveTo(218.16737f, 152.5084f, 217.68759f, 153.44751f, 216.82f, 153.83f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _flipVertical!!
    }

private var _flipVertical: ImageVector? = null
