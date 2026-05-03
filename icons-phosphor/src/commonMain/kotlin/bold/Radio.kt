package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Radio: ImageVector
    get() {
        if (_radio != null) return _radio!!
        _radio = phosphorBoldIcon(
            name = "Radio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(160.0f, 172.0f),
                    PathNode.CurveTo(179.88223f, 172.0f, 196.0f, 155.88223f, 196.0f, 136.0f),
                    PathNode.CurveTo(196.0f, 116.11775f, 179.88223f, 100.0f, 160.0f, 100.0f),
                    PathNode.CurveTo(140.11777f, 100.0f, 124.0f, 116.11775f, 124.0f, 136.0f),
                    PathNode.CurveTo(124.0f, 155.88223f, 140.11777f, 172.0f, 160.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 124.0f),
                    PathNode.CurveTo(166.62741f, 124.0f, 172.0f, 129.37259f, 172.0f, 136.0f),
                    PathNode.CurveTo(172.0f, 142.62741f, 166.62741f, 148.0f, 160.0f, 148.0f),
                    PathNode.CurveTo(153.37259f, 148.0f, 148.0f, 142.62741f, 148.0f, 136.0f),
                    PathNode.CurveTo(148.0f, 129.37259f, 153.37259f, 124.0f, 160.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 60.0f),
                    PathNode.LineTo(113.76f, 60.0f),
                    PathNode.LineTo(195.45f, 35.5f),
                    PathNode.CurveTo(201.80127f, 33.594616f, 205.40538f, 26.901274f, 203.5f, 20.55f),
                    PathNode.CurveTo(201.59462f, 14.198726f, 194.90128f, 10.594618f, 188.55f, 12.5f),
                    PathNode.LineTo(28.55f, 60.5f),
                    PathNode.CurveTo(23.47276f, 62.02405f, 19.99707f, 66.69895f, 20.0f, 72.0f),
                    PathNode.LineTo(20.0f, 192.0f),
                    PathNode.CurveTo(20.0f, 203.0457f, 28.954306f, 212.0f, 40.0f, 212.0f),
                    PathNode.LineTo(216.0f, 212.0f),
                    PathNode.CurveTo(227.0457f, 212.0f, 236.0f, 203.0457f, 236.0f, 192.0f),
                    PathNode.LineTo(236.0f, 80.0f),
                    PathNode.CurveTo(236.0f, 68.95431f, 227.0457f, 60.0f, 216.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 188.0f),
                    PathNode.LineTo(44.0f, 188.0f),
                    PathNode.LineTo(44.0f, 84.0f),
                    PathNode.LineTo(212.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 116.0f),
                    PathNode.CurveTo(60.0f, 109.37258f, 65.37258f, 104.0f, 72.0f, 104.0f),
                    PathNode.LineTo(96.0f, 104.0f),
                    PathNode.CurveTo(102.62742f, 104.0f, 108.0f, 109.37258f, 108.0f, 116.0f),
                    PathNode.CurveTo(108.0f, 122.62742f, 102.62742f, 128.0f, 96.0f, 128.0f),
                    PathNode.LineTo(72.0f, 128.0f),
                    PathNode.CurveTo(65.37258f, 128.0f, 60.0f, 122.62742f, 60.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.0f, 156.0f),
                    PathNode.CurveTo(60.0f, 149.37259f, 65.37258f, 144.0f, 72.0f, 144.0f),
                    PathNode.LineTo(96.0f, 144.0f),
                    PathNode.CurveTo(102.62742f, 144.0f, 108.0f, 149.37259f, 108.0f, 156.0f),
                    PathNode.CurveTo(108.0f, 162.62741f, 102.62742f, 168.0f, 96.0f, 168.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.CurveTo(65.37258f, 168.0f, 60.0f, 162.62741f, 60.0f, 156.0f),
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
        return _radio!!
    }

private var _radio: ImageVector? = null
