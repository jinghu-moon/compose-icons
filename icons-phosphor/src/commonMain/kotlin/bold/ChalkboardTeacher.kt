package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.ChalkboardTeacher: ImageVector
    get() {
        if (_chalkboardTeacher != null) return _chalkboardTeacher!!
        _chalkboardTeacher = phosphorBoldIcon(
            name = "ChalkboardTeacher",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(56.0f, 84.0f),
                    PathNode.CurveTo(56.0f, 77.37258f, 61.37258f, 72.0f, 68.0f, 72.0f),
                    PathNode.LineTo(188.0f, 72.0f),
                    PathNode.CurveTo(194.62741f, 72.0f, 200.0f, 77.37258f, 200.0f, 84.0f),
                    PathNode.LineTo(200.0f, 172.0f),
                    PathNode.CurveTo(200.0f, 178.62741f, 194.62741f, 184.0f, 188.0f, 184.0f),
                    PathNode.CurveTo(181.37259f, 184.0f, 176.0f, 178.62741f, 176.0f, 172.0f),
                    PathNode.LineTo(176.0f, 96.0f),
                    PathNode.LineTo(68.0f, 96.0f),
                    PathNode.CurveTo(61.37258f, 96.0f, 56.0f, 90.62742f, 56.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 56.0f),
                    PathNode.LineTo(236.0f, 200.0f),
                    PathNode.CurveTo(236.0f, 211.0457f, 227.0457f, 220.0f, 216.0f, 220.0f),
                    PathNode.LineTo(149.26f, 220.0f),
                    PathNode.CurveTo(144.07445f, 219.99901f, 139.47617f, 216.66727f, 137.86f, 211.74f),
                    PathNode.CurveTo(132.71645f, 197.4595f, 119.16856f, 187.9393f, 103.99f, 187.9393f),
                    PathNode.CurveTo(88.81144f, 187.9393f, 75.26355f, 197.4595f, 70.12f, 211.74f),
                    PathNode.CurveTo(68.50614f, 216.66026f, 63.918175f, 219.99037f, 58.74f, 220.0f),
                    PathNode.LineTo(40.0f, 220.0f),
                    PathNode.CurveTo(28.954306f, 220.0f, 20.0f, 211.0457f, 20.0f, 200.0f),
                    PathNode.LineTo(20.0f, 56.0f),
                    PathNode.CurveTo(20.0f, 44.954304f, 28.954306f, 36.0f, 40.0f, 36.0f),
                    PathNode.LineTo(216.0f, 36.0f),
                    PathNode.CurveTo(227.0457f, 36.0f, 236.0f, 44.954304f, 236.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 164.0f),
                    PathNode.CurveTo(112.836555f, 164.0f, 120.0f, 156.83656f, 120.0f, 148.0f),
                    PathNode.CurveTo(120.0f, 139.16344f, 112.836555f, 132.0f, 104.0f, 132.0f),
                    PathNode.CurveTo(95.163445f, 132.0f, 88.0f, 139.16344f, 88.0f, 148.0f),
                    PathNode.CurveTo(88.0f, 156.83656f, 95.163445f, 164.0f, 104.0f, 164.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 60.0f),
                    PathNode.LineTo(44.0f, 60.0f),
                    PathNode.LineTo(44.0f, 196.0f),
                    PathNode.LineTo(50.92f, 196.0f),
                    PathNode.CurveTo(55.967182f, 186.46976f, 63.482555f, 178.47084f, 72.68f, 172.84f),
                    PathNode.CurveTo(59.671944f, 156.46548f, 61.47256f, 132.8346f, 76.81143f, 118.62005f),
                    PathNode.CurveTo(92.15031f, 104.405495f, 115.84969f, 104.405495f, 131.18857f, 118.62005f),
                    PathNode.CurveTo(146.52744f, 132.8346f, 148.32806f, 156.46548f, 135.32f, 172.84f),
                    PathNode.CurveTo(144.51744f, 178.47084f, 152.03282f, 186.46976f, 157.08f, 196.0f),
                    PathNode.LineTo(212.0f, 196.0f),
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
        return _chalkboardTeacher!!
    }

private var _chalkboardTeacher: ImageVector? = null
