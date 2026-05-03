package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.GraduationCap: ImageVector
    get() {
        if (_graduationCap != null) return _graduationCap!!
        _graduationCap = phosphorFillIcon(
            name = "GraduationCap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 207.24f),
                    PathNode.CurveTo(181.51852f, 205.06569f, 186.86678f, 202.48181f, 192.0f, 199.51f),
                    PathNode.LineTo(192.0f, 240.0f),
                    PathNode.CurveTo(192.0f, 244.41827f, 188.41827f, 248.0f, 184.0f, 248.0f),
                    PathNode.CurveTo(179.58173f, 248.0f, 176.0f, 244.41827f, 176.0f, 240.0f),
                    PathNode.Close,
                    PathNode.MoveTo(187.76f, 118.81f),
                    PathNode.LineTo(131.76f, 88.94f),
                    PathNode.CurveTo(127.87288f, 86.95456f, 123.11175f, 88.45138f, 121.05998f, 92.3039f),
                    PathNode.CurveTo(119.00822f, 96.156425f, 120.42321f, 100.942505f, 124.24f, 103.06f),
                    PathNode.LineTo(171.0f, 128.0f),
                    PathNode.LineTo(188.0f, 118.94f),
                    PathNode.Close,
                    PathNode.MoveTo(251.76f, 88.94f),
                    PathNode.LineTo(131.76f, 24.94f),
                    PathNode.CurveTo(129.40956f, 23.688442f, 126.59045f, 23.688442f, 124.24f, 24.94f),
                    PathNode.LineTo(4.24f, 88.94f),
                    PathNode.CurveTo(1.631866f, 90.32996f, 0.002499f, 93.04461f, 0.002499f, 96.0f),
                    PathNode.CurveTo(0.002499f, 98.95539f, 1.631866f, 101.67004f, 4.24f, 103.06f),
                    PathNode.LineTo(32.0f, 117.87f),
                    PathNode.LineTo(32.0f, 166.29f),
                    PathNode.CurveTo(31.991684f, 170.21957f, 33.437893f, 174.0132f, 36.06f, 176.94f),
                    PathNode.CurveTo(49.16f, 191.53f, 78.51f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(144.40948f, 216.13571f, 160.6963f, 213.16338f, 176.0f, 207.24f),
                    PathNode.LineTo(176.0f, 130.67f),
                    PathNode.LineTo(171.0f, 128.0f),
                    PathNode.LineTo(128.0f, 150.93f),
                    PathNode.LineTo(43.83f, 106.0f),
                    PathNode.LineTo(43.83f, 106.0f),
                    PathNode.LineTo(25.0f, 96.0f),
                    PathNode.LineTo(128.0f, 41.07f),
                    PathNode.LineTo(231.0f, 96.0f),
                    PathNode.LineTo(212.22f, 106.0f),
                    PathNode.LineTo(212.16f, 106.0f),
                    PathNode.LineTo(188.0f, 118.94f),
                    PathNode.CurveTo(190.47577f, 120.369385f, 192.00064f, 123.01123f, 192.0f, 125.87f),
                    PathNode.LineTo(192.0f, 199.51f),
                    PathNode.CurveTo(202.43207f, 193.48788f, 211.8591f, 185.87268f, 219.94f, 176.94f),
                    PathNode.CurveTo(222.5621f, 174.0132f, 224.00832f, 170.21957f, 224.0f, 166.29f),
                    PathNode.LineTo(224.0f, 117.87f),
                    PathNode.LineTo(251.76f, 103.06f),
                    PathNode.CurveTo(254.36813f, 101.67004f, 255.9975f, 98.95539f, 255.9975f, 96.0f),
                    PathNode.CurveTo(255.9975f, 93.04461f, 254.36813f, 90.32996f, 251.76f, 88.94f),
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
        return _graduationCap!!
    }

private var _graduationCap: ImageVector? = null
