package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.BatteryPlus: ImageVector
    get() {
        if (_batteryPlus != null) return _batteryPlus!!
        _batteryPlus = phosphorFillIcon(
            name = "BatteryPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 56.0f),
                    PathNode.LineTo(32.0f, 56.0f),
                    PathNode.CurveTo(18.745167f, 56.0f, 8.0f, 66.74516f, 8.0f, 80.0f),
                    PathNode.LineTo(8.0f, 176.0f),
                    PathNode.CurveTo(8.0f, 189.25484f, 18.745167f, 200.0f, 32.0f, 200.0f),
                    PathNode.LineTo(200.0f, 200.0f),
                    PathNode.CurveTo(213.25484f, 200.0f, 224.0f, 189.25484f, 224.0f, 176.0f),
                    PathNode.LineTo(224.0f, 80.0f),
                    PathNode.CurveTo(224.0f, 66.74516f, 213.25484f, 56.0f, 200.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 136.0f),
                    PathNode.LineTo(124.0f, 136.0f),
                    PathNode.LineTo(124.0f, 156.0f),
                    PathNode.CurveTo(124.0f, 160.41827f, 120.41828f, 164.0f, 116.0f, 164.0f),
                    PathNode.CurveTo(111.58172f, 164.0f, 108.0f, 160.41827f, 108.0f, 156.0f),
                    PathNode.LineTo(108.0f, 136.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.CurveTo(83.58172f, 136.0f, 80.0f, 132.41827f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 123.58172f, 83.58172f, 120.0f, 88.0f, 120.0f),
                    PathNode.LineTo(108.0f, 120.0f),
                    PathNode.LineTo(108.0f, 100.0f),
                    PathNode.CurveTo(108.0f, 95.58172f, 111.58172f, 92.0f, 116.0f, 92.0f),
                    PathNode.CurveTo(120.41828f, 92.0f, 124.0f, 95.58172f, 124.0f, 100.0f),
                    PathNode.LineTo(124.0f, 120.0f),
                    PathNode.LineTo(144.0f, 120.0f),
                    PathNode.CurveTo(148.41827f, 120.0f, 152.0f, 123.58172f, 152.0f, 128.0f),
                    PathNode.CurveTo(152.0f, 132.41827f, 148.41827f, 136.0f, 144.0f, 136.0f),
                    PathNode.Close,
                    PathNode.MoveTo(256.0f, 96.0f),
                    PathNode.LineTo(256.0f, 160.0f),
                    PathNode.CurveTo(256.0f, 164.41827f, 252.41827f, 168.0f, 248.0f, 168.0f),
                    PathNode.CurveTo(243.58173f, 168.0f, 240.0f, 164.41827f, 240.0f, 160.0f),
                    PathNode.LineTo(240.0f, 96.0f),
                    PathNode.CurveTo(240.0f, 91.58172f, 243.58173f, 88.0f, 248.0f, 88.0f),
                    PathNode.CurveTo(252.41827f, 88.0f, 256.0f, 91.58172f, 256.0f, 96.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _batteryPlus!!
    }

private var _batteryPlus: ImageVector? = null
