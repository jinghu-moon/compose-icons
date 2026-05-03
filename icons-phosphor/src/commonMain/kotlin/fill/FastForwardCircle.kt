package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FastForwardCircle: ImageVector
    get() {
        if (_fastForwardCircle != null) return _fastForwardCircle!!
        _fastForwardCircle = phosphorFillIcon(
            name = "FastForwardCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.8f, 134.4f),
                    PathNode.LineTo(148.8f, 170.4f),
                    PathNode.CurveTo(147.41524f, 171.43858f, 145.73096f, 172.0f, 144.0f, 172.0f),
                    PathNode.CurveTo(139.58173f, 172.0f, 136.0f, 168.41827f, 136.0f, 164.0f),
                    PathNode.LineTo(136.0f, 128.0f),
                    PathNode.CurveTo(136.0f, 130.51805f, 134.81445f, 132.88916f, 132.8f, 134.4f),
                    PathNode.LineTo(84.8f, 170.4f),
                    PathNode.CurveTo(83.41523f, 171.43858f, 81.730965f, 172.0f, 80.0f, 172.0f),
                    PathNode.CurveTo(75.58172f, 172.0f, 72.0f, 168.41827f, 72.0f, 164.0f),
                    PathNode.LineTo(72.0f, 92.0f),
                    PathNode.CurveTo(72.0f, 88.969826f, 73.71202f, 86.19972f, 76.422295f, 84.84458f),
                    PathNode.CurveTo(79.13256f, 83.48945f, 82.37586f, 83.78189f, 84.8f, 85.6f),
                    PathNode.LineTo(132.8f, 121.6f),
                    PathNode.CurveTo(134.81445f, 123.11083f, 136.0f, 125.48194f, 136.0f, 128.0f),
                    PathNode.LineTo(136.0f, 92.0f),
                    PathNode.CurveTo(136.0f, 88.969826f, 137.71202f, 86.19972f, 140.42229f, 84.84458f),
                    PathNode.CurveTo(143.13258f, 83.48945f, 146.37585f, 83.78189f, 148.8f, 85.6f),
                    PathNode.LineTo(196.8f, 121.6f),
                    PathNode.CurveTo(198.81445f, 123.11083f, 200.0f, 125.48194f, 200.0f, 128.0f),
                    PathNode.CurveTo(200.0f, 130.51805f, 198.81445f, 132.88916f, 196.8f, 134.4f),
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
        return _fastForwardCircle!!
    }

private var _fastForwardCircle: ImageVector? = null
