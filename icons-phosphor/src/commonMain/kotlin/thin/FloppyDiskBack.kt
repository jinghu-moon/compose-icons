package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FloppyDiskBack: ImageVector
    get() {
        if (_floppyDiskBack != null) return _floppyDiskBack!!
        _floppyDiskBack = phosphorThinIcon(
            name = "FloppyDiskBack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 36.0f),
                    PathNode.LineTo(83.31f, 36.0f),
                    PathNode.CurveTo(80.129906f, 36.00015f, 77.07992f, 37.26259f, 74.83f, 39.51f),
                    PathNode.LineTo(39.52f, 74.83f),
                    PathNode.CurveTo(37.259533f, 77.07198f, 35.99172f, 80.12627f, 36.0f, 83.31f),
                    PathNode.LineTo(36.0f, 208.0f),
                    PathNode.CurveTo(36.0f, 214.62741f, 41.37258f, 220.0f, 48.0f, 220.0f),
                    PathNode.LineTo(208.0f, 220.0f),
                    PathNode.CurveTo(214.62741f, 220.0f, 220.0f, 214.62741f, 220.0f, 208.0f),
                    PathNode.LineTo(220.0f, 48.0f),
                    PathNode.CurveTo(220.0f, 41.37258f, 214.62741f, 36.0f, 208.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 44.0f),
                    PathNode.LineTo(172.0f, 44.0f),
                    PathNode.LineTo(172.0f, 80.0f),
                    PathNode.CurveTo(172.0f, 82.20914f, 170.20914f, 84.0f, 168.0f, 84.0f),
                    PathNode.LineTo(88.0f, 84.0f),
                    PathNode.CurveTo(85.79086f, 84.0f, 84.0f, 82.20914f, 84.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 208.0f),
                    PathNode.CurveTo(212.0f, 210.20914f, 210.20914f, 212.0f, 208.0f, 212.0f),
                    PathNode.LineTo(48.0f, 212.0f),
                    PathNode.CurveTo(45.79086f, 212.0f, 44.0f, 210.20914f, 44.0f, 208.0f),
                    PathNode.LineTo(44.0f, 83.31f),
                    PathNode.CurveTo(44.001812f, 82.25228f, 44.422493f, 81.238335f, 45.17f, 80.49f),
                    PathNode.LineTo(76.0f, 49.66f),
                    PathNode.LineTo(76.0f, 80.0f),
                    PathNode.CurveTo(76.0f, 86.62742f, 81.37258f, 92.0f, 88.0f, 92.0f),
                    PathNode.LineTo(168.0f, 92.0f),
                    PathNode.CurveTo(174.62741f, 92.0f, 180.0f, 86.62742f, 180.0f, 80.0f),
                    PathNode.LineTo(180.0f, 44.0f),
                    PathNode.LineTo(208.0f, 44.0f),
                    PathNode.CurveTo(210.20914f, 44.0f, 212.0f, 45.79086f, 212.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 116.0f),
                    PathNode.CurveTo(108.11775f, 116.0f, 92.0f, 132.11775f, 92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 171.88223f, 108.11775f, 188.0f, 128.0f, 188.0f),
                    PathNode.CurveTo(147.88223f, 188.0f, 164.0f, 171.88223f, 164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 132.11775f, 147.88223f, 116.0f, 128.0f, 116.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 180.0f),
                    PathNode.CurveTo(112.536026f, 180.0f, 100.0f, 167.46397f, 100.0f, 152.0f),
                    PathNode.CurveTo(100.0f, 136.53603f, 112.536026f, 124.0f, 128.0f, 124.0f),
                    PathNode.CurveTo(143.46397f, 124.0f, 156.0f, 136.53603f, 156.0f, 152.0f),
                    PathNode.CurveTo(156.0f, 167.46397f, 143.46397f, 180.0f, 128.0f, 180.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _floppyDiskBack!!
    }

private var _floppyDiskBack: ImageVector? = null
