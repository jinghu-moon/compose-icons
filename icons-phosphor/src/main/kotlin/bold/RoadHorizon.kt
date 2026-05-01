package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorBoldIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(237.88f, 202.46f),
                    PathNode.CurveTo(232.10306f, 205.70709f, 224.78764f, 203.65663f, 221.54f, 197.88f),
                    PathNode.LineTo(153.0f, 76.0f),
                    PathNode.LineTo(140.0f, 76.0f),
                    PathNode.LineTo(140.0f, 80.0f),
                    PathNode.CurveTo(140.0f, 86.62742f, 134.62741f, 92.0f, 128.0f, 92.0f),
                    PathNode.CurveTo(121.37258f, 92.0f, 116.0f, 86.62742f, 116.0f, 80.0f),
                    PathNode.LineTo(116.0f, 76.0f),
                    PathNode.LineTo(103.0f, 76.0f),
                    PathNode.LineTo(34.46f, 197.88f),
                    PathNode.CurveTo(32.382553f, 201.66243f, 28.434143f, 204.0381f, 24.119234f, 204.10184f),
                    PathNode.CurveTo(19.804323f, 204.16556f, 15.787477f, 201.90753f, 13.599233f, 198.18811f),
                    PathNode.CurveTo(11.410989f, 194.46867f, 11.388371f, 189.86072f, 13.54f, 186.12f),
                    PathNode.LineTo(75.48f, 76.0f),
                    PathNode.LineTo(24.0f, 76.0f),
                    PathNode.CurveTo(17.372583f, 76.0f, 12.0f, 70.62742f, 12.0f, 64.0f),
                    PathNode.CurveTo(12.0f, 57.37258f, 17.372583f, 52.0f, 24.0f, 52.0f),
                    PathNode.LineTo(232.0f, 52.0f),
                    PathNode.CurveTo(238.62741f, 52.0f, 244.0f, 57.37258f, 244.0f, 64.0f),
                    PathNode.CurveTo(244.0f, 70.62742f, 238.62741f, 76.0f, 232.0f, 76.0f),
                    PathNode.LineTo(180.52f, 76.0f),
                    PathNode.LineTo(242.46f, 186.12f),
                    PathNode.CurveTo(245.70709f, 191.89694f, 243.65663f, 199.21236f, 237.88f, 202.46f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 108.0f),
                    PathNode.CurveTo(121.37258f, 108.0f, 116.0f, 113.37258f, 116.0f, 120.0f),
                    PathNode.LineTo(116.0f, 136.0f),
                    PathNode.CurveTo(116.0f, 142.62741f, 121.37258f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(134.62741f, 148.0f, 140.0f, 142.62741f, 140.0f, 136.0f),
                    PathNode.LineTo(140.0f, 120.0f),
                    PathNode.CurveTo(140.0f, 113.37258f, 134.62741f, 108.0f, 128.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 164.0f),
                    PathNode.CurveTo(121.37258f, 164.0f, 116.0f, 169.37259f, 116.0f, 176.0f),
                    PathNode.LineTo(116.0f, 192.0f),
                    PathNode.CurveTo(116.0f, 198.62741f, 121.37258f, 204.0f, 128.0f, 204.0f),
                    PathNode.CurveTo(134.62741f, 204.0f, 140.0f, 198.62741f, 140.0f, 192.0f),
                    PathNode.LineTo(140.0f, 176.0f),
                    PathNode.CurveTo(140.0f, 169.37259f, 134.62741f, 164.0f, 128.0f, 164.0f),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
