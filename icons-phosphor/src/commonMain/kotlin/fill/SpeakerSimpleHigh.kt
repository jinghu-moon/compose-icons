package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.SpeakerSimpleHigh: ImageVector
    get() {
        if (_speakerSimpleHigh != null) return _speakerSimpleHigh!!
        _speakerSimpleHigh = phosphorFillIcon(
            name = "SpeakerSimpleHigh",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(168.0f, 32.0f),
                    PathNode.LineTo(168.0f, 224.0f),
                    PathNode.CurveTo(167.99771f, 227.05403f, 166.25682f, 229.84032f, 163.51299f, 231.18141f),
                    PathNode.CurveTo(160.76915f, 232.5225f, 157.50114f, 232.18442f, 155.09f, 230.31f),
                    PathNode.LineTo(85.25f, 176.0f),
                    PathNode.LineTo(40.0f, 176.0f),
                    PathNode.CurveTo(31.163445f, 176.0f, 24.0f, 168.83656f, 24.0f, 160.0f),
                    PathNode.LineTo(24.0f, 96.0f),
                    PathNode.CurveTo(24.0f, 87.163445f, 31.163445f, 80.0f, 40.0f, 80.0f),
                    PathNode.LineTo(85.25f, 80.0f),
                    PathNode.LineTo(155.09f, 25.69f),
                    PathNode.CurveTo(157.50114f, 23.815582f, 160.76915f, 23.477488f, 163.51299f, 24.818584f),
                    PathNode.CurveTo(166.25682f, 26.159683f, 167.99771f, 28.94596f, 168.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 96.0f),
                    PathNode.CurveTo(195.58173f, 96.0f, 192.0f, 99.58172f, 192.0f, 104.0f),
                    PathNode.LineTo(192.0f, 152.0f),
                    PathNode.CurveTo(192.0f, 156.41827f, 195.58173f, 160.0f, 200.0f, 160.0f),
                    PathNode.CurveTo(204.41827f, 160.0f, 208.0f, 156.41827f, 208.0f, 152.0f),
                    PathNode.LineTo(208.0f, 104.0f),
                    PathNode.CurveTo(208.0f, 99.58172f, 204.41827f, 96.0f, 200.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.0f, 80.0f),
                    PathNode.CurveTo(227.58173f, 80.0f, 224.0f, 83.58172f, 224.0f, 88.0f),
                    PathNode.LineTo(224.0f, 168.0f),
                    PathNode.CurveTo(224.0f, 172.41827f, 227.58173f, 176.0f, 232.0f, 176.0f),
                    PathNode.CurveTo(236.41827f, 176.0f, 240.0f, 172.41827f, 240.0f, 168.0f),
                    PathNode.LineTo(240.0f, 88.0f),
                    PathNode.CurveTo(240.0f, 83.58172f, 236.41827f, 80.0f, 232.0f, 80.0f),
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
        return _speakerSimpleHigh!!
    }

private var _speakerSimpleHigh: ImageVector? = null
