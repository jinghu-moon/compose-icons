package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Export: ImageVector
    get() {
        if (_export != null) return _export!!
        _export = phosphorBoldIcon(
            name = "Export",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 112.0f),
                    PathNode.LineTo(220.0f, 208.0f),
                    PathNode.CurveTo(220.0f, 219.0457f, 211.0457f, 228.0f, 200.0f, 228.0f),
                    PathNode.LineTo(56.0f, 228.0f),
                    PathNode.CurveTo(44.954304f, 228.0f, 36.0f, 219.0457f, 36.0f, 208.0f),
                    PathNode.LineTo(36.0f, 112.0f),
                    PathNode.CurveTo(36.0f, 100.95431f, 44.954304f, 92.0f, 56.0f, 92.0f),
                    PathNode.LineTo(76.0f, 92.0f),
                    PathNode.CurveTo(82.62742f, 92.0f, 88.0f, 97.37258f, 88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 110.62742f, 82.62742f, 116.0f, 76.0f, 116.0f),
                    PathNode.LineTo(60.0f, 116.0f),
                    PathNode.LineTo(60.0f, 204.0f),
                    PathNode.LineTo(196.0f, 204.0f),
                    PathNode.LineTo(196.0f, 116.0f),
                    PathNode.LineTo(180.0f, 116.0f),
                    PathNode.CurveTo(173.37259f, 116.0f, 168.0f, 110.62742f, 168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 97.37258f, 173.37259f, 92.0f, 180.0f, 92.0f),
                    PathNode.LineTo(200.0f, 92.0f),
                    PathNode.CurveTo(211.0457f, 92.0f, 220.0f, 100.95431f, 220.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.49f, 72.49f),
                    PathNode.LineTo(116.0f, 53.0f),
                    PathNode.LineTo(116.0f, 136.0f),
                    PathNode.CurveTo(116.0f, 142.62741f, 121.37258f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(134.62741f, 148.0f, 140.0f, 142.62741f, 140.0f, 136.0f),
                    PathNode.LineTo(140.0f, 53.0f),
                    PathNode.LineTo(159.51f, 72.52f),
                    PathNode.CurveTo(164.20442f, 77.214424f, 171.81558f, 77.214424f, 176.51f, 72.52f),
                    PathNode.CurveTo(181.20442f, 67.82558f, 181.20442f, 60.21442f, 176.51f, 55.52f),
                    PathNode.LineTo(136.51f, 15.52f),
                    PathNode.CurveTo(134.25838f, 13.260546f, 131.19981f, 11.990538f, 128.01f, 11.990538f),
                    PathNode.CurveTo(124.82018f, 11.990538f, 121.76162f, 13.260546f, 119.51f, 15.52f),
                    PathNode.LineTo(79.51f, 55.52f),
                    PathNode.CurveTo(74.81558f, 60.21442f, 74.81558f, 67.82558f, 79.51f, 72.52f),
                    PathNode.CurveTo(84.20442f, 77.214424f, 91.81558f, 77.214424f, 96.51f, 72.52f),
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
        return _export!!
    }

private var _export: ImageVector? = null
