package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Upload: ImageVector
    get() {
        if (_upload != null) return _upload!!
        _upload = phosphorBoldIcon(
            name = "Upload",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.0f, 184.0f),
                    PathNode.CurveTo(179.16344f, 184.0f, 172.0f, 176.83656f, 172.0f, 168.0f),
                    PathNode.CurveTo(172.0f, 159.16344f, 179.16344f, 152.0f, 188.0f, 152.0f),
                    PathNode.CurveTo(196.83656f, 152.0f, 204.0f, 159.16344f, 204.0f, 168.0f),
                    PathNode.CurveTo(204.0f, 176.83656f, 196.83656f, 184.0f, 188.0f, 184.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 116.0f),
                    PathNode.LineTo(180.0f, 116.0f),
                    PathNode.CurveTo(173.37259f, 116.0f, 168.0f, 121.37258f, 168.0f, 128.0f),
                    PathNode.CurveTo(168.0f, 134.62741f, 173.37259f, 140.0f, 180.0f, 140.0f),
                    PathNode.LineTo(220.0f, 140.0f),
                    PathNode.LineTo(220.0f, 196.0f),
                    PathNode.LineTo(36.0f, 196.0f),
                    PathNode.LineTo(36.0f, 140.0f),
                    PathNode.LineTo(76.0f, 140.0f),
                    PathNode.CurveTo(82.62742f, 140.0f, 88.0f, 134.62741f, 88.0f, 128.0f),
                    PathNode.CurveTo(88.0f, 121.37258f, 82.62742f, 116.0f, 76.0f, 116.0f),
                    PathNode.LineTo(32.0f, 116.0f),
                    PathNode.CurveTo(20.954306f, 116.0f, 12.0f, 124.95431f, 12.0f, 136.0f),
                    PathNode.LineTo(12.0f, 200.0f),
                    PathNode.CurveTo(12.0f, 211.0457f, 20.954306f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(224.0f, 220.0f),
                    PathNode.CurveTo(235.0457f, 220.0f, 244.0f, 211.0457f, 244.0f, 200.0f),
                    PathNode.LineTo(244.0f, 136.0f),
                    PathNode.CurveTo(244.0f, 124.95431f, 235.0457f, 116.0f, 224.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.49f, 80.49f),
                    PathNode.LineTo(116.0f, 53.0f),
                    PathNode.LineTo(116.0f, 128.0f),
                    PathNode.CurveTo(116.0f, 134.62741f, 121.37258f, 140.0f, 128.0f, 140.0f),
                    PathNode.CurveTo(134.62741f, 140.0f, 140.0f, 134.62741f, 140.0f, 128.0f),
                    PathNode.LineTo(140.0f, 53.0f),
                    PathNode.LineTo(167.51f, 80.52f),
                    PathNode.CurveTo(172.20442f, 85.214424f, 179.81558f, 85.214424f, 184.51f, 80.52f),
                    PathNode.CurveTo(189.20442f, 75.82558f, 189.20442f, 68.214424f, 184.51f, 63.52f),
                    PathNode.LineTo(136.51f, 15.52f),
                    PathNode.CurveTo(134.25838f, 13.260546f, 131.19981f, 11.990538f, 128.01f, 11.990538f),
                    PathNode.CurveTo(124.82018f, 11.990538f, 121.76162f, 13.260546f, 119.51f, 15.52f),
                    PathNode.LineTo(71.51f, 63.52f),
                    PathNode.CurveTo(66.81558f, 68.214424f, 66.81558f, 75.82558f, 71.51f, 80.52f),
                    PathNode.CurveTo(76.20442f, 85.214424f, 83.81558f, 85.214424f, 88.51f, 80.52f),
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
        return _upload!!
    }

private var _upload: ImageVector? = null
