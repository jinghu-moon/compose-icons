package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.BatteryWarning: ImageVector
    get() {
        if (_batteryWarning != null) return _batteryWarning!!
        _batteryWarning = phosphorRegularIcon(
            name = "BatteryWarning",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(256.0f, 96.0f),
                    PathNode.LineTo(256.0f, 160.0f),
                    PathNode.CurveTo(256.0f, 164.41827f, 252.41827f, 168.0f, 248.0f, 168.0f),
                    PathNode.CurveTo(243.58173f, 168.0f, 240.0f, 164.41827f, 240.0f, 160.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(240.0f, 91.58172f, 243.58173f, 88.0f, 248.0f, 88.0f),
                    PathNode.CurveTo(252.41827f, 88.0f, 256.0f, 91.58172f, 256.0f, 96.0f),
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
                    PathNode.MoveTo(116.0f, 132.0f),
                    PathNode.CurveTo(120.41828f, 132.0f, 124.0f, 128.41827f, 124.0f, 124.0f),
                    PathNode.LineTo(124.0f, 96.0f),
                    PathNode.CurveTo(124.0f, 91.58172f, 120.41828f, 88.0f, 116.0f, 88.0f),
                    PathNode.CurveTo(111.58172f, 88.0f, 108.0f, 91.58172f, 108.0f, 96.0f),
                    PathNode.LineTo(108.0f, 124.0f),
                    PathNode.CurveTo(108.0f, 128.41827f, 111.58172f, 132.0f, 116.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 144.0f),
                    PathNode.CurveTo(109.37258f, 144.0f, 104.0f, 149.37259f, 104.0f, 156.0f),
                    PathNode.CurveTo(104.0f, 162.62741f, 109.37258f, 168.0f, 116.0f, 168.0f),
                    PathNode.CurveTo(122.62742f, 168.0f, 128.0f, 162.62741f, 128.0f, 156.0f),
                    PathNode.CurveTo(128.0f, 149.37259f, 122.62742f, 144.0f, 116.0f, 144.0f),
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
        return _batteryWarning!!
    }

private var _batteryWarning: ImageVector? = null
