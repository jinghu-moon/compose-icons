package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorDuotoneIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 88.0f),
                    PathNode.LineTo(232.0f, 152.0f),
                    PathNode.LineTo(168.0f, 152.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(235.06f, 80.61f),
                    PathNode.CurveTo(232.07097f, 79.369934f, 228.62924f, 80.05276f, 226.34f, 82.34f),
                    PathNode.LineTo(199.86f, 108.83f),
                    PathNode.CurveTo(169.76236f, 80.06175f, 125.40796f, 72.01624f, 87.123634f, 88.380585f),
                    PathNode.CurveTo(48.839314f, 104.74492f, 24.004292f, 142.36491f, 24.0f, 184.0f),
                    PathNode.CurveTo(24.0f, 188.41827f, 27.581722f, 192.0f, 32.0f, 192.0f),
                    PathNode.CurveTo(36.418278f, 192.0f, 40.0f, 188.41827f, 40.0f, 184.0f),
                    PathNode.CurveTo(40.014305f, 148.84402f, 60.95146f, 117.06987f, 93.25037f, 103.1874f),
                    PathNode.CurveTo(125.54928f, 89.30494f, 163.01164f, 95.97828f, 188.53f, 120.16f),
                    PathNode.LineTo(162.34f, 146.34f),
                    PathNode.CurveTo(160.04936f, 148.6281f, 159.36368f, 152.07126f, 160.60303f, 155.06232f),
                    PathNode.CurveTo(161.84236f, 158.05338f, 164.76236f, 160.00255f, 168.0f, 160.0f),
                    PathNode.LineTo(232.0f, 160.0f),
                    PathNode.CurveTo(236.41827f, 160.0f, 240.0f, 156.41827f, 240.0f, 152.0f),
                    PathNode.LineTo(240.0f, 88.0f),
                    PathNode.CurveTo(239.99933f, 84.76432f, 238.04962f, 81.84765f, 235.06f, 80.61f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 144.0f),
                    PathNode.LineTo(187.31f, 144.0f),
                    PathNode.LineTo(224.0f, 107.31f),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
