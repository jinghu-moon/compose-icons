package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Sailboat: ImageVector
    get() {
        if (_sailboat != null) return _sailboat!!
        _sailboat = phosphorBoldIcon(
            name = "Sailboat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.82f, 170.8f),
                    PathNode.CurveTo(248.82059f, 166.64166f, 244.61404f, 163.998f, 240.0f, 164.0f),
                    PathNode.LineTo(148.0f, 164.0f),
                    PathNode.LineTo(148.0f, 148.0f),
                    PathNode.LineTo(216.0f, 148.0f),
                    PathNode.CurveTo(220.74908f, 147.99954f, 225.05112f, 145.19836f, 226.97267f, 140.8554f),
                    PathNode.CurveTo(228.89423f, 136.5124f, 228.07376f, 131.4448f, 224.88f, 127.93f),
                    PathNode.LineTo(148.0f, 43.36f),
                    PathNode.LineTo(148.0f, 12.0f),
                    PathNode.CurveTo(147.99728f, 6.957127f, 144.842f, 2.453988f, 140.10306f, 0.729723f),
                    PathNode.CurveTo(135.36412f, -0.994542f, 130.05276f, 0.427998f, 126.81f, 4.29f),
                    PathNode.LineTo(22.81f, 128.29f),
                    PathNode.CurveTo(19.814806f, 131.86226f, 19.159548f, 136.84592f, 21.129538f, 141.071f),
                    PathNode.CurveTo(23.09953f, 145.29608f, 27.33822f, 147.9979f, 32.0f, 148.0f),
                    PathNode.LineTo(124.0f, 148.0f),
                    PathNode.LineTo(124.0f, 164.0f),
                    PathNode.LineTo(16.0f, 164.0f),
                    PathNode.CurveTo(11.38584f, 163.99904f, 7.179809f, 166.64378f, 5.181385f, 170.80272f),
                    PathNode.CurveTo(3.182961f, 174.96165f, 3.74615f, 179.89807f, 6.63f, 183.5f),
                    PathNode.LineTo(36.23f, 220.5f),
                    PathNode.CurveTo(40.015667f, 225.25177f, 45.764606f, 228.01392f, 51.84f, 228.0f),
                    PathNode.LineTo(204.16f, 228.0f),
                    PathNode.CurveTo(210.23709f, 228.01149f, 215.98634f, 225.24551f, 219.77f, 220.49f),
                    PathNode.LineTo(249.37f, 183.49f),
                    PathNode.CurveTo(252.25133f, 179.88992f, 252.81496f, 174.95726f, 250.82f, 170.8f),
                    PathNode.Close,
                    PathNode.MoveTo(188.87f, 124.0f),
                    PathNode.LineTo(148.0f, 124.0f),
                    PathNode.LineTo(148.0f, 79.0f),
                    PathNode.Close,
                    PathNode.MoveTo(57.73f, 124.0f),
                    PathNode.LineTo(124.0f, 45.0f),
                    PathNode.LineTo(124.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(202.23f, 204.0f),
                    PathNode.LineTo(53.77f, 204.0f),
                    PathNode.LineTo(41.0f, 188.0f),
                    PathNode.LineTo(215.0f, 188.0f),
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
        return _sailboat!!
    }

private var _sailboat: ImageVector? = null
