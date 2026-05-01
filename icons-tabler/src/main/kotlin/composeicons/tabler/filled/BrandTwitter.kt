package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.BrandTwitter: ImageVector
    get() {
        if (_brandTwitter != null) return _brandTwitter!!
        _brandTwitter = tablerFilledIcon(
            name = "BrandTwitter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(14.058f, 3.41f),
                    PathNode.CurveTo(12.251f, 4.177f, 11.063f, 5.863f, 11.002f, 7.79f),
                    PathNode.LineTo(11.0f, 7.972f),
                    PathNode.LineTo(10.757f, 7.949f),
                    PathNode.CurveTo(8.365f, 7.68f, 6.259f, 6.437f, 4.813f, 4.418f),
                    PathNode.CurveTo(4.614002f, 4.139903f, 4.286697f, 3.982775f, 3.945243f, 4.001418f),
                    PathNode.CurveTo(3.60379f, 4.020061f, 3.295538f, 4.211891f, 3.128f, 4.51f),
                    PathNode.LineTo(3.031f, 4.696f),
                    PathNode.LineTo(2.982f, 4.795f),
                    PathNode.CurveTo(2.263f, 6.28f, 1.792f, 8.085f, 1.965f, 9.998f),
                    PathNode.LineTo(1.995f, 10.271f),
                    PathNode.CurveTo(2.278f, 12.534f, 3.495f, 14.486f, 5.774f, 15.95f),
                    PathNode.LineTo(5.947f, 16.057f),
                    PathNode.LineTo(5.866f, 16.1f),
                    PathNode.CurveTo(4.551f, 16.763f, 3.348f, 17.052f, 2.039f, 17.0f),
                    PathNode.CurveTo(0.983f, 16.96f, 0.593f, 18.372f, 1.521f, 18.878f),
                    PathNode.CurveTo(5.119f, 20.839f, 8.982f, 21.444f, 12.313f, 20.478f),
                    PathNode.CurveTo(16.373f, 19.298f, 19.465f, 16.255f, 20.648f, 12.045f),
                    PathNode.LineTo(20.775f, 11.55f),
                    PathNode.CurveTo(21.013f, 10.557f, 21.147f, 9.544f, 21.176f, 8.526f),
                    PathNode.LineTo(21.179f, 8.194f),
                    PathNode.LineTo(21.572f, 7.415f),
                    PathNode.LineTo(22.012f, 6.553f),
                    PathNode.LineTo(22.226f, 6.119f),
                    PathNode.LineTo(22.344f, 5.872f),
                    PathNode.CurveTo(22.609f, 5.307f, 22.8f, 4.839f, 22.918f, 4.442f),
                    PathNode.LineTo(22.932f, 4.386f),
                    PathNode.LineTo(22.94f, 4.368f),
                    PathNode.CurveTo(23.16f, 3.775f, 22.774f, 3.01f, 21.999f, 3.01f),
                    PathNode.LineTo(21.877f, 3.017f),
                    PathNode.CurveTo(21.798f, 3.026711f, 21.72045f, 3.045848f, 21.646f, 3.074f),
                    PathNode.LineTo(21.56f, 3.112f),
                    PathNode.CurveTo(21.27462f, 3.25059f, 20.98069f, 3.370834f, 20.68f, 3.472f),
                    PathNode.LineTo(20.324f, 3.587f),
                    PathNode.LineTo(20.053f, 3.667f),
                    PathNode.LineTo(19.281f, 3.881f),
                    PathNode.CurveTo(17.945f, 2.763f, 16.137f, 2.627f, 14.269f, 3.327f),
                    PathNode.LineTo(14.058f, 3.411f),
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
        return _brandTwitter!!
    }

private var _brandTwitter: ImageVector? = null
