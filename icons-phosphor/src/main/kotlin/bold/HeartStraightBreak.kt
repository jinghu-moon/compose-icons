package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeartStraightBreak: ImageVector
    get() {
        if (_heartStraightBreak != null) return _heartStraightBreak!!
        _heartStraightBreak = phosphorBoldIcon(
            name = "HeartStraightBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(225.84f, 54.16f),
                    PathNode.CurveTo(201.65889f, 29.979486f, 162.46524f, 29.943693f, 138.24f, 54.08f),
                    PathNode.LineTo(128.0f, 63.94f),
                    PathNode.LineTo(117.76f, 54.08f),
                    PathNode.CurveTo(93.505104f, 30.092531f, 54.42851f, 30.205296f, 30.312458f, 54.33235f),
                    PathNode.CurveTo(6.196406f, 78.4594f, 6.101468f, 117.53605f, 30.1f, 141.78f),
                    PathNode.LineTo(119.45f, 232.42f),
                    PathNode.CurveTo(121.70549f, 234.7103f, 124.78555f, 235.99994f, 128.0f, 235.99994f),
                    PathNode.CurveTo(131.21445f, 235.99994f, 134.29451f, 234.7103f, 136.55f, 232.42f),
                    PathNode.LineTo(225.84f, 141.84f),
                    PathNode.CurveTo(250.05168f, 117.62763f, 250.05168f, 78.37237f, 225.84f, 54.16f),
                    PathNode.Close,
                    PathNode.MoveTo(208.84f, 124.93f),
                    PathNode.LineTo(128.03f, 206.93f),
                    PathNode.LineTo(47.16f, 124.93f),
                    PathNode.CurveTo(37.527092f, 115.33693f, 33.752823f, 101.3286f, 37.262356f, 88.19455f),
                    PathNode.CurveTo(40.771893f, 75.06051f, 51.030506f, 64.80189f, 64.16455f, 61.29236f),
                    PathNode.CurveTo(77.2986f, 57.78282f, 91.30693f, 61.55709f, 100.9f, 71.19f),
                    PathNode.LineTo(101.06f, 71.35f),
                    PathNode.LineTo(110.73f, 80.66f),
                    PathNode.LineTo(103.73f, 87.42f),
                    PathNode.CurveTo(101.407845f, 89.653694f, 100.08153f, 92.7274f, 100.04955f, 95.94932f),
                    PathNode.CurveTo(100.01758f, 99.171234f, 101.28264f, 102.27066f, 103.56f, 104.55f),
                    PathNode.LineTo(127.0f, 128.0f),
                    PathNode.LineTo(119.48f, 135.51f),
                    PathNode.CurveTo(114.785576f, 140.20442f, 114.785576f, 147.81558f, 119.48f, 152.51f),
                    PathNode.CurveTo(124.17442f, 157.20442f, 131.78558f, 157.20442f, 136.48f, 152.51f),
                    PathNode.LineTo(152.48f, 136.51f),
                    PathNode.CurveTo(154.73946f, 134.25838f, 156.00946f, 131.19981f, 156.00946f, 128.01f),
                    PathNode.CurveTo(156.00946f, 124.82018f, 154.73946f, 121.76162f, 152.48f, 119.51f),
                    PathNode.LineTo(129.13f, 96.16f),
                    PathNode.LineTo(155.0f, 71.29f),
                    PathNode.LineTo(155.16f, 71.13f),
                    PathNode.CurveTo(164.76488f, 61.513035f, 178.77483f, 57.75837f, 191.9017f, 61.28323f),
                    PathNode.CurveTo(205.02858f, 64.80809f, 215.27325f, 75.07566f, 218.76878f, 88.21038f),
                    PathNode.CurveTo(222.26434f, 101.34509f, 218.4784f, 115.34663f, 208.84f, 124.93f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _heartStraightBreak!!
    }

private var _heartStraightBreak: ImageVector? = null
