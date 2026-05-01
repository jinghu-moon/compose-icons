package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowArcRight: ImageVector
    get() {
        if (_arrowArcRight != null) return _arrowArcRight!!
        _arrowArcRight = phosphorFillIcon(
            name = "ArrowArcRight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 88.0f),
                    PathNode.LineTo(240.0f, 152.0f),
                    PathNode.CurveTo(240.0f, 156.41827f, 236.41827f, 160.0f, 232.0f, 160.0f),
                    PathNode.LineTo(168.0f, 160.0f),
                    PathNode.CurveTo(164.76236f, 160.00255f, 161.84236f, 158.05338f, 160.60303f, 155.06232f),
                    PathNode.CurveTo(159.36368f, 152.07126f, 160.04936f, 148.6281f, 162.34f, 146.34f),
                    PathNode.LineTo(188.53f, 120.16f),
                    PathNode.CurveTo(163.01164f, 95.97828f, 125.54928f, 89.30494f, 93.25037f, 103.1874f),
                    PathNode.CurveTo(60.95146f, 117.06987f, 40.014305f, 148.84402f, 40.0f, 184.0f),
                    PathNode.CurveTo(40.0f, 188.41827f, 36.418278f, 192.0f, 32.0f, 192.0f),
                    PathNode.CurveTo(27.581722f, 192.0f, 24.0f, 188.41827f, 24.0f, 184.0f),
                    PathNode.CurveTo(24.000288f, 142.3631f, 48.83383f, 104.73944f, 87.11904f, 88.37255f),
                    PathNode.CurveTo(125.40424f, 72.00565f, 169.76105f, 80.0505f, 199.86f, 108.82f),
                    PathNode.LineTo(226.34f, 82.34f),
                    PathNode.CurveTo(228.6281f, 80.04936f, 232.07126f, 79.36368f, 235.06232f, 80.60302f),
                    PathNode.CurveTo(238.05338f, 81.84236f, 240.00255f, 84.762344f, 240.0f, 88.0f),
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
        return _arrowArcRight!!
    }

private var _arrowArcRight: ImageVector? = null
