package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hammer: ImageVector
    get() {
        if (_hammer != null) return _hammer!!
        _hammer = phosphorBoldIcon(
            name = "Hammer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(250.18f, 105.17f),
                    PathNode.LineTo(186.71f, 41.25f),
                    PathNode.CurveTo(147.63148f, 2.252458f, 84.35852f, 2.252458f, 45.28f, 41.25f),
                    PathNode.LineTo(45.15f, 41.39f),
                    PathNode.LineTo(31.37f, 55.61f),
                    PathNode.CurveTo(26.758423f, 60.370693f, 26.879305f, 67.96842f, 31.64f, 72.58f),
                    PathNode.CurveTo(36.400696f, 77.191574f, 43.99842f, 77.070694f, 48.61f, 72.31f),
                    PathNode.LineTo(62.32f, 58.16f),
                    PathNode.CurveTo(66.85884f, 53.622585f, 71.95642f, 49.68095f, 77.49f, 46.43f),
                    PathNode.LineTo(119.0f, 88.0f),
                    PathNode.LineTo(25.85f, 181.16f),
                    PathNode.CurveTo(22.097519f, 184.91096f, 19.989271f, 189.99927f, 19.989271f, 195.305f),
                    PathNode.CurveTo(19.989271f, 200.61073f, 22.097519f, 205.69904f, 25.85f, 209.45f),
                    PathNode.LineTo(46.54f, 230.14f),
                    PathNode.CurveTo(54.35f, 237.94763f, 67.01f, 237.94763f, 74.82f, 230.14f),
                    PathNode.LineTo(168.0f, 137.0f),
                    PathNode.LineTo(169.51f, 138.51f),
                    PathNode.LineTo(169.51f, 138.51f),
                    PathNode.LineTo(193.16f, 162.17f),
                    PathNode.CurveTo(196.91096f, 165.92249f, 201.99927f, 168.03073f, 207.305f, 168.03073f),
                    PathNode.CurveTo(212.61073f, 168.03073f, 217.69904f, 165.92249f, 221.45f, 162.17f),
                    PathNode.LineTo(250.14f, 133.47f),
                    PathNode.CurveTo(253.90085f, 129.72395f, 256.01825f, 124.636475f, 256.02573f, 119.32829f),
                    PathNode.CurveTo(256.03323f, 114.0201f, 253.93024f, 108.926674f, 250.18f, 105.17f),
                    PathNode.Close,
                    PathNode.MoveTo(60.68f, 210.34f),
                    PathNode.LineTo(45.68f, 195.34f),
                    PathNode.LineTo(108.0f, 133.0f),
                    PathNode.LineTo(123.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 131.0f),
                    PathNode.LineTo(125.0f, 116.0f),
                    PathNode.LineTo(144.51f, 96.49f),
                    PathNode.CurveTo(146.76945f, 94.23838f, 148.03946f, 91.17982f, 148.03946f, 87.99f),
                    PathNode.CurveTo(148.03946f, 84.80018f, 146.76945f, 81.74162f, 144.51f, 79.49f),
                    PathNode.LineTo(102.24f, 37.24f),
                    PathNode.CurveTo(126.80692f, 32.699986f, 152.03525f, 40.533592f, 169.71f, 58.19f),
                    PathNode.LineTo(201.15f, 89.86f),
                    PathNode.LineTo(178.0f, 113.0f),
                    PathNode.LineTo(176.49f, 111.49f),
                    PathNode.CurveTo(174.23837f, 109.230545f, 171.17982f, 107.96054f, 167.99f, 107.96054f),
                    PathNode.CurveTo(164.80019f, 107.96054f, 161.74162f, 109.230545f, 159.49f, 111.49f),
                    PathNode.Close,
                    PathNode.MoveTo(207.32f, 142.31f),
                    PathNode.LineTo(195.0f, 130.0f),
                    PathNode.LineTo(218.09f, 106.91f),
                    PathNode.LineTo(230.39f, 119.3f),
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
        return _hammer!!
    }

private var _hammer: ImageVector? = null
