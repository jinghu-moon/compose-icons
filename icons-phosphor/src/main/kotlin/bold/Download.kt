package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Download: ImageVector
    get() {
        if (_download != null) return _download!!
        _download = phosphorBoldIcon(
            name = "Download",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(71.51f, 88.49f),
                    PathNode.CurveTo(66.81558f, 83.79558f, 66.81558f, 76.18442f, 71.51f, 71.49f),
                    PathNode.CurveTo(76.20442f, 66.79558f, 83.81558f, 66.79558f, 88.51f, 71.49f),
                    PathNode.LineTo(116.0f, 99.0f),
                    PathNode.LineTo(116.0f, 24.0f),
                    PathNode.CurveTo(116.0f, 17.372583f, 121.37258f, 12.0f, 128.0f, 12.0f),
                    PathNode.CurveTo(134.62741f, 12.0f, 140.0f, 17.372583f, 140.0f, 24.0f),
                    PathNode.LineTo(140.0f, 99.0f),
                    PathNode.LineTo(167.51f, 71.48f),
                    PathNode.CurveTo(172.20442f, 66.78558f, 179.81558f, 66.78558f, 184.51f, 71.48f),
                    PathNode.CurveTo(189.20442f, 76.17442f, 189.20442f, 83.785576f, 184.51f, 88.48f),
                    PathNode.LineTo(136.51f, 136.48f),
                    PathNode.CurveTo(134.25838f, 138.73946f, 131.19981f, 140.00946f, 128.01f, 140.00946f),
                    PathNode.CurveTo(124.82018f, 140.00946f, 121.76162f, 138.73946f, 119.51f, 136.48f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 116.0f),
                    PathNode.LineTo(188.0f, 116.0f),
                    PathNode.CurveTo(181.37259f, 116.0f, 176.0f, 121.37258f, 176.0f, 128.0f),
                    PathNode.CurveTo(176.0f, 134.62741f, 181.37259f, 140.0f, 188.0f, 140.0f),
                    PathNode.LineTo(220.0f, 140.0f),
                    PathNode.LineTo(220.0f, 196.0f),
                    PathNode.LineTo(36.0f, 196.0f),
                    PathNode.LineTo(36.0f, 140.0f),
                    PathNode.LineTo(68.0f, 140.0f),
                    PathNode.CurveTo(74.62742f, 140.0f, 80.0f, 134.62741f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 121.37258f, 74.62742f, 116.0f, 68.0f, 116.0f),
                    PathNode.LineTo(32.0f, 116.0f),
                    PathNode.CurveTo(20.954306f, 116.0f, 12.0f, 124.95431f, 12.0f, 136.0f),
                    PathNode.LineTo(12.0f, 200.0f),
                    PathNode.CurveTo(12.0f, 211.0457f, 20.954306f, 220.0f, 32.0f, 220.0f),
                    PathNode.LineTo(224.0f, 220.0f),
                    PathNode.CurveTo(235.0457f, 220.0f, 244.0f, 211.0457f, 244.0f, 200.0f),
                    PathNode.LineTo(244.0f, 136.0f),
                    PathNode.CurveTo(244.0f, 124.95431f, 235.0457f, 116.0f, 224.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 168.0f),
                    PathNode.CurveTo(204.0f, 159.16344f, 196.83656f, 152.0f, 188.0f, 152.0f),
                    PathNode.CurveTo(179.16344f, 152.0f, 172.0f, 159.16344f, 172.0f, 168.0f),
                    PathNode.CurveTo(172.0f, 176.83656f, 179.16344f, 184.0f, 188.0f, 184.0f),
                    PathNode.CurveTo(196.83656f, 184.0f, 204.0f, 176.83656f, 204.0f, 168.0f),
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
        return _download!!
    }

private var _download: ImageVector? = null
