package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BatteryPlusVertical: ImageVector
    get() {
        if (_batteryPlusVertical != null) return _batteryPlusVertical!!
        _batteryPlusVertical = phosphorRegularIcon(
            name = "BatteryPlusVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(88.0f, 8.0f),
                    PathNode.CurveTo(88.0f, 3.581722f, 91.58172f, 0f, 96.0f, 0f),
                    PathNode.LineTo(160.0f, 0f),
                    PathNode.CurveTo(164.41827f, 0f, 168.0f, 3.581722f, 168.0f, 8.0f),
                    PathNode.CurveTo(168.0f, 12.418278f, 164.41827f, 16.0f, 160.0f, 16.0f),
                    PathNode.LineTo(96.0f, 16.0f),
                    PathNode.CurveTo(91.58172f, 16.0f, 88.0f, 12.418278f, 88.0f, 8.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.LineTo(200.0f, 224.0f),
                    PathNode.CurveTo(200.0f, 237.25484f, 189.25484f, 248.0f, 176.0f, 248.0f),
                    PathNode.LineTo(80.0f, 248.0f),
                    PathNode.CurveTo(66.74516f, 248.0f, 56.0f, 237.25484f, 56.0f, 224.0f),
                    PathNode.LineTo(56.0f, 56.0f),
                    PathNode.CurveTo(56.0f, 42.745167f, 66.74516f, 32.0f, 80.0f, 32.0f),
                    PathNode.LineTo(176.0f, 32.0f),
                    PathNode.CurveTo(189.25484f, 32.0f, 200.0f, 42.745167f, 200.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 56.0f),
                    PathNode.CurveTo(184.0f, 51.581722f, 180.41827f, 48.0f, 176.0f, 48.0f),
                    PathNode.LineTo(80.0f, 48.0f),
                    PathNode.CurveTo(75.58172f, 48.0f, 72.0f, 51.581722f, 72.0f, 56.0f),
                    PathNode.LineTo(72.0f, 224.0f),
                    PathNode.CurveTo(72.0f, 228.41827f, 75.58172f, 232.0f, 80.0f, 232.0f),
                    PathNode.LineTo(176.0f, 232.0f),
                    PathNode.CurveTo(180.41827f, 232.0f, 184.0f, 228.41827f, 184.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(156.0f, 132.0f),
                    PathNode.LineTo(136.0f, 132.0f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.CurveTo(136.0f, 107.58172f, 132.41827f, 104.0f, 128.0f, 104.0f),
                    PathNode.CurveTo(123.58172f, 104.0f, 120.0f, 107.58172f, 120.0f, 112.0f),
                    PathNode.LineTo(120.0f, 132.0f),
                    PathNode.LineTo(100.0f, 132.0f),
                    PathNode.CurveTo(95.58172f, 132.0f, 92.0f, 135.58173f, 92.0f, 140.0f),
                    PathNode.CurveTo(92.0f, 144.41827f, 95.58172f, 148.0f, 100.0f, 148.0f),
                    PathNode.LineTo(120.0f, 148.0f),
                    PathNode.LineTo(120.0f, 168.0f),
                    PathNode.CurveTo(120.0f, 172.41827f, 123.58172f, 176.0f, 128.0f, 176.0f),
                    PathNode.CurveTo(132.41827f, 176.0f, 136.0f, 172.41827f, 136.0f, 168.0f),
                    PathNode.LineTo(136.0f, 148.0f),
                    PathNode.LineTo(156.0f, 148.0f),
                    PathNode.CurveTo(160.41827f, 148.0f, 164.0f, 144.41827f, 164.0f, 140.0f),
                    PathNode.CurveTo(164.0f, 135.58173f, 160.41827f, 132.0f, 156.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _batteryPlusVertical!!
    }

private var _batteryPlusVertical: ImageVector? = null
