package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.GenderIntersex: ImageVector
    get() {
        if (_genderIntersex != null) return _genderIntersex!!
        _genderIntersex = phosphorBoldIcon(
            name = "GenderIntersex",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 20.0f),
                    PathNode.LineTo(168.0f, 20.0f),
                    PathNode.CurveTo(161.37259f, 20.0f, 156.0f, 25.372583f, 156.0f, 32.0f),
                    PathNode.CurveTo(156.0f, 38.62742f, 161.37259f, 44.0f, 168.0f, 44.0f),
                    PathNode.LineTo(179.0f, 44.0f),
                    PathNode.LineTo(163.36f, 59.67f),
                    PathNode.CurveTo(141.41273f, 41.432095f, 110.413185f, 38.837215f, 85.73931f, 53.17261f),
                    PathNode.CurveTo(61.065437f, 67.508f, 47.9667f, 95.723755f, 52.941006f, 123.82286f),
                    PathNode.CurveTo(57.91531f, 151.92197f, 79.90434f, 173.92624f, 108.0f, 178.92f),
                    PathNode.LineTo(108.0f, 192.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.CurveTo(81.37258f, 192.0f, 76.0f, 197.37259f, 76.0f, 204.0f),
                    PathNode.CurveTo(76.0f, 210.62741f, 81.37258f, 216.0f, 88.0f, 216.0f),
                    PathNode.LineTo(108.0f, 216.0f),
                    PathNode.LineTo(108.0f, 232.0f),
                    PathNode.CurveTo(108.0f, 238.62741f, 113.37258f, 244.0f, 120.0f, 244.0f),
                    PathNode.CurveTo(126.62742f, 244.0f, 132.0f, 238.62741f, 132.0f, 232.0f),
                    PathNode.LineTo(132.0f, 216.0f),
                    PathNode.LineTo(152.0f, 216.0f),
                    PathNode.CurveTo(158.62741f, 216.0f, 164.0f, 210.62741f, 164.0f, 204.0f),
                    PathNode.CurveTo(164.0f, 197.37259f, 158.62741f, 192.0f, 152.0f, 192.0f),
                    PathNode.LineTo(132.0f, 192.0f),
                    PathNode.LineTo(132.0f, 178.92f),
                    PathNode.CurveTo(153.79541f, 175.03223f, 172.32883f, 160.76704f, 181.66533f, 140.69257f),
                    PathNode.CurveTo(191.00183f, 120.6181f, 189.96991f, 97.253204f, 178.9f, 78.08f),
                    PathNode.LineTo(196.0f, 61.0f),
                    PathNode.LineTo(196.0f, 72.0f),
                    PathNode.CurveTo(196.0f, 78.62742f, 201.37259f, 84.0f, 208.0f, 84.0f),
                    PathNode.CurveTo(214.62741f, 84.0f, 220.0f, 78.62742f, 220.0f, 72.0f),
                    PathNode.LineTo(220.0f, 32.0f),
                    PathNode.CurveTo(220.0f, 25.372583f, 214.62741f, 20.0f, 208.0f, 20.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 156.0f),
                    PathNode.CurveTo(95.69947f, 156.0f, 76.0f, 136.30052f, 76.0f, 112.0f),
                    PathNode.CurveTo(76.0f, 87.69947f, 95.69947f, 68.0f, 120.0f, 68.0f),
                    PathNode.CurveTo(144.30052f, 68.0f, 164.0f, 87.69947f, 164.0f, 112.0f),
                    PathNode.CurveTo(163.97244f, 136.28911f, 144.28911f, 155.97244f, 120.0f, 156.0f),
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
        return _genderIntersex!!
    }

private var _genderIntersex: ImageVector? = null
