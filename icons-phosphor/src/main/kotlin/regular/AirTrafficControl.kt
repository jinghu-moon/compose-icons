package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorRegularIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.11f, 70.82f),
                    PathNode.CurveTo(226.11447f, 66.54385f, 221.22098f, 63.998203f, 216.0f, 64.0f),
                    PathNode.LineTo(136.0f, 64.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.CurveTo(156.41827f, 32.0f, 160.0f, 28.418278f, 160.0f, 24.0f),
                    PathNode.CurveTo(160.0f, 19.581722f, 156.41827f, 16.0f, 152.0f, 16.0f),
                    PathNode.LineTo(104.0f, 16.0f),
                    PathNode.CurveTo(99.58172f, 16.0f, 96.0f, 19.581722f, 96.0f, 24.0f),
                    PathNode.CurveTo(96.0f, 28.418278f, 99.58172f, 32.0f, 104.0f, 32.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 64.0f),
                    PathNode.LineTo(40.0f, 64.0f),
                    PathNode.CurveTo(34.786552f, 64.0117f, 29.905733f, 66.56271f, 26.919884f, 70.83646f),
                    PathNode.CurveTo(23.934036f, 75.1102f, 23.217634f, 80.57068f, 25.0f, 85.47f),
                    PathNode.LineTo(51.19f, 157.47f),
                    PathNode.CurveTo(53.485374f, 163.77957f, 59.47589f, 167.98492f, 66.19f, 168.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.LineTo(96.0f, 232.0f),
                    PathNode.CurveTo(96.0f, 236.41827f, 99.58172f, 240.0f, 104.0f, 240.0f),
                    PathNode.CurveTo(108.41828f, 240.0f, 112.0f, 236.41827f, 112.0f, 232.0f),
                    PathNode.LineTo(112.0f, 168.0f),
                    PathNode.LineTo(144.0f, 168.0f),
                    PathNode.LineTo(144.0f, 232.0f),
                    PathNode.CurveTo(144.0f, 236.41827f, 147.58173f, 240.0f, 152.0f, 240.0f),
                    PathNode.CurveTo(156.41827f, 240.0f, 160.0f, 236.41827f, 160.0f, 232.0f),
                    PathNode.LineTo(160.0f, 168.0f),
                    PathNode.LineTo(189.82f, 168.0f),
                    PathNode.CurveTo(196.5341f, 167.98492f, 202.52463f, 163.77957f, 204.82f, 157.47f),
                    PathNode.LineTo(231.01f, 85.47f),
                    PathNode.CurveTo(232.80386f, 80.569046f, 232.09473f, 75.1012f, 229.11f, 70.82f),
                    PathNode.Close,
                    PathNode.MoveTo(110.68f, 152.0f),
                    PathNode.LineTo(97.58f, 80.0f),
                    PathNode.LineTo(158.42f, 80.0f),
                    PathNode.LineTo(145.32f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 80.0f),
                    PathNode.LineTo(81.32f, 80.0f),
                    PathNode.LineTo(94.41f, 152.0f),
                    PathNode.LineTo(66.18f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(189.82f, 152.0f),
                    PathNode.LineTo(161.59f, 152.0f),
                    PathNode.LineTo(174.68f, 80.0f),
                    PathNode.LineTo(216.0f, 80.0f),
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
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
