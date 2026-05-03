package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Belt: ImageVector
    get() {
        if (_belt != null) return _belt!!
        _belt = phosphorBoldIcon(
            name = "Belt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(244.0f, 156.0f),
                    PathNode.LineTo(196.0f, 156.0f),
                    PathNode.LineTo(196.0f, 100.0f),
                    PathNode.LineTo(244.0f, 100.0f),
                    PathNode.CurveTo(250.62741f, 100.0f, 256.0f, 94.62742f, 256.0f, 88.0f),
                    PathNode.CurveTo(256.0f, 81.37258f, 250.62741f, 76.0f, 244.0f, 76.0f),
                    PathNode.LineTo(192.0f, 76.0f),
                    PathNode.CurveTo(188.22292f, 70.96388f, 182.29515f, 68.0f, 176.0f, 68.0f),
                    PathNode.LineTo(112.0f, 68.0f),
                    PathNode.CurveTo(105.70486f, 68.0f, 99.777084f, 70.96388f, 96.0f, 76.0f),
                    PathNode.LineTo(67.3f, 76.0f),
                    PathNode.CurveTo(65.59358f, 71.225395f, 61.070377f, 68.03857f, 56.0f, 68.03857f),
                    PathNode.CurveTo(50.929623f, 68.03857f, 46.40642f, 71.225395f, 44.7f, 76.0f),
                    PathNode.LineTo(12.0f, 76.0f),
                    PathNode.CurveTo(5.372583f, 76.0f, 0f, 81.37258f, 0f, 88.0f),
                    PathNode.CurveTo(0f, 94.62742f, 5.372583f, 100.0f, 12.0f, 100.0f),
                    PathNode.LineTo(44.0f, 100.0f),
                    PathNode.LineTo(44.0f, 156.0f),
                    PathNode.LineTo(12.0f, 156.0f),
                    PathNode.CurveTo(5.372583f, 156.0f, 0f, 161.37259f, 0f, 168.0f),
                    PathNode.CurveTo(0f, 174.62741f, 5.372583f, 180.0f, 12.0f, 180.0f),
                    PathNode.LineTo(44.7f, 180.0f),
                    PathNode.CurveTo(46.40642f, 184.77461f, 50.929623f, 187.96144f, 56.0f, 187.96144f),
                    PathNode.CurveTo(61.070377f, 187.96144f, 65.59358f, 184.77461f, 67.3f, 180.0f),
                    PathNode.LineTo(96.0f, 180.0f),
                    PathNode.CurveTo(99.777084f, 185.03612f, 105.70486f, 188.0f, 112.0f, 188.0f),
                    PathNode.LineTo(176.0f, 188.0f),
                    PathNode.CurveTo(182.29515f, 188.0f, 188.22292f, 185.03612f, 192.0f, 180.0f),
                    PathNode.LineTo(244.0f, 180.0f),
                    PathNode.CurveTo(250.62741f, 180.0f, 256.0f, 174.62741f, 256.0f, 168.0f),
                    PathNode.CurveTo(256.0f, 161.37259f, 250.62741f, 156.0f, 244.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(68.0f, 100.0f),
                    PathNode.LineTo(92.0f, 100.0f),
                    PathNode.LineTo(92.0f, 156.0f),
                    PathNode.LineTo(68.0f, 156.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 92.0f),
                    PathNode.LineTo(172.0f, 92.0f),
                    PathNode.LineTo(172.0f, 116.0f),
                    PathNode.LineTo(144.0f, 116.0f),
                    PathNode.CurveTo(137.37259f, 116.0f, 132.0f, 121.37258f, 132.0f, 128.0f),
                    PathNode.CurveTo(132.0f, 134.62741f, 137.37259f, 140.0f, 144.0f, 140.0f),
                    PathNode.LineTo(172.0f, 140.0f),
                    PathNode.LineTo(172.0f, 164.0f),
                    PathNode.LineTo(116.0f, 164.0f),
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
        return _belt!!
    }

private var _belt: ImageVector? = null
