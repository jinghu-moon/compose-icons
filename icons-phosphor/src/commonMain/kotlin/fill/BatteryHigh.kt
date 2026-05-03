package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BatteryHigh: ImageVector
    get() {
        if (_batteryHigh != null) return _batteryHigh!!
        _batteryHigh = phosphorFillIcon(
            name = "BatteryHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(152.0f, 96.0f),
                    PathNode.LineTo(152.0f, 160.0f),
                    PathNode.CurveTo(152.0f, 164.41827f, 148.41827f, 168.0f, 144.0f, 168.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.CurveTo(43.581722f, 168.0f, 40.0f, 164.41827f, 40.0f, 160.0f),
                    PathNode.LineTo(40.0f, 96.0f),
                    PathNode.CurveTo(40.0f, 91.58172f, 43.581722f, 88.0f, 48.0f, 88.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(148.41827f, 88.0f, 152.0f, 91.58172f, 152.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 80.0f),
                    PathNode.LineTo(224.0f, 176.0f),
                    PathNode.CurveTo(224.0f, 189.25484f, 213.25484f, 200.0f, 200.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.CurveTo(18.745167f, 200.0f, 8.0f, 189.25484f, 8.0f, 176.0f),
                    PathNode.LineTo(8.0f, 80.0f),
                    PathNode.CurveTo(8.0f, 66.74516f, 18.745167f, 56.0f, 32.0f, 56.0f),
                    PathNode.LineTo(200.0f, 56.0f),
                    PathNode.CurveTo(213.25484f, 56.0f, 224.0f, 66.74516f, 224.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 80.0f),
                    PathNode.CurveTo(208.0f, 75.58172f, 204.41827f, 72.0f, 200.0f, 72.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.CurveTo(27.581722f, 72.0f, 24.0f, 75.58172f, 24.0f, 80.0f),
                    PathNode.LineTo(24.0f, 176.0f),
                    PathNode.CurveTo(24.0f, 180.41827f, 27.581722f, 184.0f, 32.0f, 184.0f),
                    PathNode.LineTo(200.0f, 184.0f),
                    PathNode.CurveTo(204.41827f, 184.0f, 208.0f, 180.41827f, 208.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(248.0f, 88.0f),
                    PathNode.CurveTo(243.58173f, 88.0f, 240.0f, 91.58172f, 240.0f, 96.0f),
                    PathNode.LineTo(240.0f, 160.0f),
                    PathNode.CurveTo(240.0f, 164.41827f, 243.58173f, 168.0f, 248.0f, 168.0f),
                    PathNode.CurveTo(252.41827f, 168.0f, 256.0f, 164.41827f, 256.0f, 160.0f),
                    PathNode.LineTo(256.0f, 96.0f),
                    PathNode.CurveTo(256.0f, 91.58172f, 252.41827f, 88.0f, 248.0f, 88.0f),
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
        return _batteryHigh!!
    }

private var _batteryHigh: ImageVector? = null
