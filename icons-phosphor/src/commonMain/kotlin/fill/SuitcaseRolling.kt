package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SuitcaseRolling: ImageVector
    get() {
        if (_suitcaseRolling != null) return _suitcaseRolling!!
        _suitcaseRolling = phosphorFillIcon(
            name = "SuitcaseRolling",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(192.0f, 48.0f),
                    PathNode.LineTo(168.0f, 48.0f),
                    PathNode.LineTo(168.0f, 24.0f),
                    PathNode.CurveTo(168.0f, 10.745166f, 157.25484f, 0f, 144.0f, 0f),
                    PathNode.LineTo(112.0f, 0f),
                    PathNode.CurveTo(98.74516f, 0f, 88.0f, 10.745166f, 88.0f, 24.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.LineTo(64.0f, 48.0f),
                    PathNode.CurveTo(55.163445f, 48.0f, 48.0f, 55.163445f, 48.0f, 64.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.CurveTo(48.0f, 216.83656f, 55.163445f, 224.0f, 64.0f, 224.0f),
                    PathNode.LineTo(80.0f, 224.0f),
                    PathNode.LineTo(80.0f, 240.0f),
                    PathNode.CurveTo(80.0f, 244.41827f, 83.58172f, 248.0f, 88.0f, 248.0f),
                    PathNode.CurveTo(92.41828f, 248.0f, 96.0f, 244.41827f, 96.0f, 240.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.LineTo(160.0f, 224.0f),
                    PathNode.LineTo(160.0f, 240.0f),
                    PathNode.CurveTo(160.0f, 244.41827f, 163.58173f, 248.0f, 168.0f, 248.0f),
                    PathNode.CurveTo(172.41827f, 248.0f, 176.0f, 244.41827f, 176.0f, 240.0f),
                    PathNode.LineTo(176.0f, 224.0f),
                    PathNode.LineTo(192.0f, 224.0f),
                    PathNode.CurveTo(200.83656f, 224.0f, 208.0f, 216.83656f, 208.0f, 208.0f),
                    PathNode.LineTo(208.0f, 64.0f),
                    PathNode.CurveTo(208.0f, 55.163445f, 200.83656f, 48.0f, 192.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 192.0f),
                    PathNode.CurveTo(96.0f, 196.41827f, 92.41828f, 200.0f, 88.0f, 200.0f),
                    PathNode.CurveTo(83.58172f, 200.0f, 80.0f, 196.41827f, 80.0f, 192.0f),
                    PathNode.LineTo(80.0f, 80.0f),
                    PathNode.CurveTo(80.0f, 75.58172f, 83.58172f, 72.0f, 88.0f, 72.0f),
                    PathNode.CurveTo(92.41828f, 72.0f, 96.0f, 75.58172f, 96.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 192.0f),
                    PathNode.CurveTo(136.0f, 196.41827f, 132.41827f, 200.0f, 128.0f, 200.0f),
                    PathNode.CurveTo(123.58172f, 200.0f, 120.0f, 196.41827f, 120.0f, 192.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 75.58172f, 123.58172f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(132.41827f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 48.0f),
                    PathNode.LineTo(104.0f, 48.0f),
                    PathNode.LineTo(104.0f, 24.0f),
                    PathNode.CurveTo(104.0f, 19.581722f, 107.58172f, 16.0f, 112.0f, 16.0f),
                    PathNode.LineTo(144.0f, 16.0f),
                    PathNode.CurveTo(148.41827f, 16.0f, 152.0f, 19.581722f, 152.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 192.0f),
                    PathNode.CurveTo(176.0f, 196.41827f, 172.41827f, 200.0f, 168.0f, 200.0f),
                    PathNode.CurveTo(163.58173f, 200.0f, 160.0f, 196.41827f, 160.0f, 192.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.CurveTo(160.0f, 75.58172f, 163.58173f, 72.0f, 168.0f, 72.0f),
                    PathNode.CurveTo(172.41827f, 72.0f, 176.0f, 75.58172f, 176.0f, 80.0f),
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
        return _suitcaseRolling!!
    }

private var _suitcaseRolling: ImageVector? = null
