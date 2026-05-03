package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Subway: ImageVector
    get() {
        if (_subway != null) return _subway!!
        _subway = phosphorFillIcon(
            name = "Subway",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(156.0f, 176.0f),
                    PathNode.LineTo(156.0f, 152.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.LineTo(176.0f, 168.0f),
                    PathNode.CurveTo(176.0f, 172.41827f, 172.41827f, 176.0f, 168.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 176.0f),
                    PathNode.LineTo(140.0f, 152.0f),
                    PathNode.LineTo(116.0f, 152.0f),
                    PathNode.LineTo(116.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 88.0f),
                    PathNode.CurveTo(176.0f, 83.58172f, 172.41827f, 80.0f, 168.0f, 80.0f),
                    PathNode.LineTo(88.0f, 80.0f),
                    PathNode.CurveTo(83.58172f, 80.0f, 80.0f, 83.58172f, 80.0f, 88.0f),
                    PathNode.LineTo(80.0f, 136.0f),
                    PathNode.LineTo(176.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 24.0f),
                    PathNode.LineTo(104.0f, 24.0f),
                    PathNode.CurveTo(64.2355f, 24.0f, 32.0f, 56.235497f, 32.0f, 96.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 212.41827f, 35.581722f, 216.0f, 40.0f, 216.0f),
                    PathNode.LineTo(76.58f, 216.0f),
                    PathNode.CurveTo(78.09566f, 216.00108f, 79.48174f, 215.14543f, 80.16f, 213.79f),
                    PathNode.LineTo(91.06f, 192.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.CurveTo(74.74516f, 192.0f, 64.0f, 181.25484f, 64.0f, 168.0f),
                    PathNode.LineTo(64.0f, 88.0f),
                    PathNode.CurveTo(64.0f, 74.74516f, 74.74516f, 64.0f, 88.0f, 64.0f),
                    PathNode.LineTo(168.0f, 64.0f),
                    PathNode.CurveTo(181.25484f, 64.0f, 192.0f, 74.74516f, 192.0f, 88.0f),
                    PathNode.LineTo(192.0f, 168.0f),
                    PathNode.CurveTo(192.0f, 181.25484f, 181.25484f, 192.0f, 168.0f, 192.0f),
                    PathNode.LineTo(164.94f, 192.0f),
                    PathNode.LineTo(175.84f, 213.79f),
                    PathNode.CurveTo(176.51825f, 215.14543f, 177.90434f, 216.00108f, 179.42f, 216.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(220.41827f, 216.0f, 224.0f, 212.41827f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 96.0f),
                    PathNode.CurveTo(224.0f, 56.235497f, 191.7645f, 24.0f, 152.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(147.06f, 192.0f),
                    PathNode.LineTo(108.94f, 192.0f),
                    PathNode.LineTo(99.84f, 210.21f),
                    PathNode.CurveTo(99.2193f, 211.45041f, 99.2855f, 212.92384f, 100.014946f, 214.10358f),
                    PathNode.CurveTo(100.74439f, 215.28334f, 102.03295f, 216.00099f, 103.42f, 216.0f),
                    PathNode.LineTo(152.58f, 216.0f),
                    PathNode.CurveTo(153.96704f, 216.00099f, 155.2556f, 215.28334f, 155.98505f, 214.10358f),
                    PathNode.CurveTo(156.7145f, 212.92384f, 156.7807f, 211.45041f, 156.16f, 210.21f),
                    PathNode.Close,
                    PathNode.MoveTo(80.0f, 168.0f),
                    PathNode.CurveTo(80.0f, 172.41827f, 83.58172f, 176.0f, 88.0f, 176.0f),
                    PathNode.LineTo(100.0f, 176.0f),
                    PathNode.LineTo(100.0f, 152.0f),
                    PathNode.LineTo(80.0f, 152.0f),
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
        return _subway!!
    }

private var _subway: ImageVector? = null
