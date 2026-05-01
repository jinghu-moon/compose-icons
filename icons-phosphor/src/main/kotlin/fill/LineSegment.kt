package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LineSegment: ImageVector
    get() {
        if (_lineSegment != null) return _lineSegment!!
        _lineSegment = phosphorFillIcon(
            name = "LineSegment",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(211.81f, 83.79f),
                    PathNode.CurveTo(203.05304f, 92.54738f, 189.58328f, 94.51172f, 178.69f, 88.62f),
                    PathNode.LineTo(88.62f, 178.69f),
                    PathNode.CurveTo(95.477806f, 191.37273f, 91.58342f, 207.18976f, 79.62115f, 215.2387f),
                    PathNode.CurveTo(67.65888f, 223.28763f, 51.54f, 220.93672f, 42.374977f, 209.80644f),
                    PathNode.CurveTo(33.209957f, 198.67615f, 33.995434f, 182.40569f, 44.19f, 172.21f),
                    PathNode.LineTo(44.19f, 172.21f),
                    PathNode.CurveTo(52.946957f, 163.45262f, 66.41672f, 161.48828f, 77.31f, 167.38f),
                    PathNode.LineTo(167.38f, 77.31f),
                    PathNode.CurveTo(160.52219f, 64.62727f, 164.4166f, 48.810238f, 176.37886f, 40.761303f),
                    PathNode.CurveTo(188.34111f, 32.71237f, 204.46f, 35.06327f, 213.62502f, 46.19356f),
                    PathNode.CurveTo(222.79004f, 57.323853f, 222.00456f, 73.59432f, 211.81f, 83.79f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _lineSegment!!
    }

private var _lineSegment: ImageVector? = null
