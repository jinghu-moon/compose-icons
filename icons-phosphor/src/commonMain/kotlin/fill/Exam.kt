package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Exam: ImageVector
    get() {
        if (_exam != null) return _exam!!
        _exam = phosphorFillIcon(
            name = "Exam",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 113.89f),
                    PathNode.LineTo(107.06f, 136.0f),
                    PathNode.LineTo(84.94f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 56.0f),
                    PathNode.LineTo(232.0f, 216.0f),
                    PathNode.CurveTo(232.00198f, 218.7741f, 230.56671f, 221.35121f, 228.2072f, 222.81012f),
                    PathNode.CurveTo(225.8477f, 224.269f, 222.90083f, 224.40141f, 220.42f, 223.16f),
                    PathNode.LineTo(192.0f, 208.94f),
                    PathNode.LineTo(163.58f, 223.16f),
                    PathNode.CurveTo(161.32652f, 224.28764f, 158.67348f, 224.28764f, 156.42f, 223.16f),
                    PathNode.LineTo(128.0f, 208.94f),
                    PathNode.LineTo(99.58f, 223.16f),
                    PathNode.CurveTo(97.32653f, 224.28764f, 94.67347f, 224.28764f, 92.42f, 223.16f),
                    PathNode.LineTo(64.0f, 208.94f),
                    PathNode.LineTo(35.58f, 223.16f),
                    PathNode.CurveTo(33.09917f, 224.40141f, 30.152302f, 224.269f, 27.792803f, 222.81012f),
                    PathNode.CurveTo(25.433304f, 221.35121f, 23.998013f, 218.7741f, 24.0f, 216.0f),
                    PathNode.LineTo(24.0f, 56.0f),
                    PathNode.CurveTo(24.0f, 47.163445f, 31.163445f, 40.0f, 40.0f, 40.0f),
                    PathNode.LineTo(216.0f, 40.0f),
                    PathNode.CurveTo(224.83656f, 40.0f, 232.0f, 47.163445f, 232.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(135.16f, 156.42f),
                    PathNode.LineTo(103.16f, 92.42f),
                    PathNode.CurveTo(101.806694f, 89.70468f, 99.033875f, 87.988525f, 96.0f, 87.988525f),
                    PathNode.CurveTo(92.966125f, 87.988525f, 90.193306f, 89.70468f, 88.84f, 92.42f),
                    PathNode.LineTo(56.84f, 156.42f),
                    PathNode.CurveTo(54.86282f, 160.37436f, 56.46564f, 165.18282f, 60.42f, 167.16f),
                    PathNode.CurveTo(64.37436f, 169.13718f, 69.18282f, 167.53436f, 71.16f, 163.58f),
                    PathNode.LineTo(76.94f, 152.0f),
                    PathNode.LineTo(115.06f, 152.0f),
                    PathNode.LineTo(120.84f, 163.58f),
                    PathNode.CurveTo(122.81718f, 167.53436f, 127.62564f, 169.13718f, 131.58f, 167.16f),
                    PathNode.CurveTo(135.53436f, 165.18282f, 137.13718f, 160.37436f, 135.16f, 156.42f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 123.58172f, 204.41827f, 120.0f, 200.0f, 120.0f),
                    PathNode.LineTo(184.0f, 120.0f),
                    PathNode.LineTo(184.0f, 104.0f),
                    PathNode.CurveTo(184.0f, 99.58172f, 180.41827f, 96.0f, 176.0f, 96.0f),
                    PathNode.CurveTo(171.58173f, 96.0f, 168.0f, 99.58172f, 168.0f, 104.0f),
                    PathNode.LineTo(168.0f, 120.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.CurveTo(147.58173f, 120.0f, 144.0f, 123.58172f, 144.0f, 128.0f),
                    PathNode.CurveTo(144.0f, 132.41827f, 147.58173f, 136.0f, 152.0f, 136.0f),
                    PathNode.LineTo(168.0f, 136.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 156.41827f, 171.58173f, 160.0f, 176.0f, 160.0f),
                    PathNode.CurveTo(180.41827f, 160.0f, 184.0f, 156.41827f, 184.0f, 152.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.CurveTo(204.41827f, 136.0f, 208.0f, 132.41827f, 208.0f, 128.0f),
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
        return _exam!!
    }

private var _exam: ImageVector? = null
