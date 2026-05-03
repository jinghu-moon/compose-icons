package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.MouseScroll: ImageVector
    get() {
        if (_mouseScroll != null) return _mouseScroll!!
        _mouseScroll = phosphorBoldIcon(
            name = "MouseScroll",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 12.0f),
                    PathNode.LineTo(112.0f, 12.0f),
                    PathNode.CurveTo(74.46063f, 12.038584f, 44.038586f, 42.460632f, 44.0f, 80.0f),
                    PathNode.LineTo(44.0f, 176.0f),
                    PathNode.CurveTo(44.038586f, 213.53935f, 74.46063f, 243.96141f, 112.0f, 244.0f),
                    PathNode.LineTo(144.0f, 244.0f),
                    PathNode.CurveTo(181.53935f, 243.96141f, 211.96141f, 213.53935f, 212.0f, 176.0f),
                    PathNode.LineTo(212.0f, 80.0f),
                    PathNode.CurveTo(211.96141f, 42.460632f, 181.53935f, 12.038584f, 144.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 176.0f),
                    PathNode.CurveTo(187.97244f, 200.28911f, 168.28911f, 219.97244f, 144.0f, 220.0f),
                    PathNode.LineTo(112.0f, 220.0f),
                    PathNode.CurveTo(87.71089f, 219.97244f, 68.02756f, 200.28911f, 68.0f, 176.0f),
                    PathNode.LineTo(68.0f, 80.0f),
                    PathNode.CurveTo(68.02756f, 55.71089f, 87.71089f, 36.027554f, 112.0f, 36.0f),
                    PathNode.LineTo(144.0f, 36.0f),
                    PathNode.CurveTo(168.28911f, 36.027554f, 187.97244f, 55.71089f, 188.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 93.0f),
                    PathNode.LineTo(140.0f, 163.0f),
                    PathNode.LineTo(143.51f, 159.48f),
                    PathNode.CurveTo(148.20442f, 154.78558f, 155.81558f, 154.78558f, 160.51f, 159.48f),
                    PathNode.CurveTo(165.20442f, 164.17442f, 165.20442f, 171.78558f, 160.51f, 176.48f),
                    PathNode.LineTo(136.51f, 200.48f),
                    PathNode.CurveTo(134.25838f, 202.73946f, 131.19981f, 204.00946f, 128.01f, 204.00946f),
                    PathNode.CurveTo(124.82018f, 204.00946f, 121.76162f, 202.73946f, 119.51f, 200.48f),
                    PathNode.LineTo(95.51f, 176.48f),
                    PathNode.CurveTo(90.81558f, 171.78558f, 90.81558f, 164.17442f, 95.51f, 159.48f),
                    PathNode.CurveTo(100.20442f, 154.78558f, 107.81558f, 154.78558f, 112.51f, 159.48f),
                    PathNode.LineTo(116.0f, 163.0f),
                    PathNode.LineTo(116.0f, 93.0f),
                    PathNode.LineTo(112.49f, 96.52f),
                    PathNode.CurveTo(107.79558f, 101.21442f, 100.18442f, 101.21442f, 95.49f, 96.52f),
                    PathNode.CurveTo(90.79558f, 91.82558f, 90.79558f, 84.214424f, 95.49f, 79.52f),
                    PathNode.LineTo(119.49f, 55.52f),
                    PathNode.CurveTo(121.74162f, 53.260548f, 124.80018f, 51.990536f, 127.99f, 51.990536f),
                    PathNode.CurveTo(131.17982f, 51.990536f, 134.23837f, 53.260548f, 136.49f, 55.52f),
                    PathNode.LineTo(160.49f, 79.52f),
                    PathNode.CurveTo(165.18442f, 84.214424f, 165.18442f, 91.82558f, 160.49f, 96.52f),
                    PathNode.CurveTo(155.79558f, 101.21442f, 148.18442f, 101.21442f, 143.49f, 96.52f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _mouseScroll!!
    }

private var _mouseScroll: ImageVector? = null
