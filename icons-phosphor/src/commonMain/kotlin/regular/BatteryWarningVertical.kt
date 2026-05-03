package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BatteryWarningVertical: ImageVector
    get() {
        if (_batteryWarningVertical != null) return _batteryWarningVertical!!
        _batteryWarningVertical = phosphorRegularIcon(
            name = "BatteryWarningVertical",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 96.0f),
                    PathNode.CurveTo(120.0f, 91.58172f, 123.58172f, 88.0f, 128.0f, 88.0f),
                    PathNode.CurveTo(132.41827f, 88.0f, 136.0f, 91.58172f, 136.0f, 96.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 140.41827f, 132.41827f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(123.58172f, 144.0f, 120.0f, 140.41827f, 120.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 160.0f),
                    PathNode.CurveTo(121.37258f, 160.0f, 116.0f, 165.37259f, 116.0f, 172.0f),
                    PathNode.CurveTo(116.0f, 178.62741f, 121.37258f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(134.62741f, 184.0f, 140.0f, 178.62741f, 140.0f, 172.0f),
                    PathNode.CurveTo(140.0f, 165.37259f, 134.62741f, 160.0f, 128.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 16.0f),
                    PathNode.LineTo(160.0f, 16.0f),
                    PathNode.CurveTo(164.41827f, 16.0f, 168.0f, 12.418278f, 168.0f, 8.0f),
                    PathNode.CurveTo(168.0f, 3.581722f, 164.41827f, 0f, 160.0f, 0f),
                    PathNode.LineTo(96.0f, 0f),
                    PathNode.CurveTo(91.58172f, 0f, 88.0f, 3.581722f, 88.0f, 8.0f),
                    PathNode.CurveTo(88.0f, 12.418278f, 91.58172f, 16.0f, 96.0f, 16.0f),
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
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _batteryWarningVertical!!
    }

private var _batteryWarningVertical: ImageVector? = null
