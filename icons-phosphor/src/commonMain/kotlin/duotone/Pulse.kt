package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Pulse: ImageVector
    get() {
        if (_pulse != null) return _pulse!!
        _pulse = phosphorDuotoneIcon(
            name = "Pulse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(96.0f, 40.0f),
                    PathNode.LineTo(129.52f, 128.0f),
                    PathNode.LineTo(56.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 128.0f),
                    PathNode.LineTo(129.52f, 128.0f),
                    PathNode.LineTo(160.0f, 208.0f),
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
                    PathNode.MoveTo(240.0f, 128.0f),
                    PathNode.CurveTo(240.0f, 132.41827f, 236.41827f, 136.0f, 232.0f, 136.0f),
                    PathNode.LineTo(204.94f, 136.0f),
                    PathNode.LineTo(167.16f, 211.58f),
                    PathNode.CurveTo(165.80348f, 214.29086f, 163.03131f, 216.00217f, 160.0f, 216.0f),
                    PathNode.LineTo(159.6f, 216.0f),
                    PathNode.CurveTo(156.42918f, 215.84323f, 153.65108f, 213.82637f, 152.52f, 210.86f),
                    PathNode.LineTo(95.35f, 60.76f),
                    PathNode.LineTo(63.28f, 131.31f),
                    PathNode.CurveTo(61.982403f, 134.16515f, 59.136185f, 135.99878f, 56.0f, 136.0f),
                    PathNode.LineTo(24.0f, 136.0f),
                    PathNode.CurveTo(19.581722f, 136.0f, 16.0f, 132.41827f, 16.0f, 128.0f),
                    PathNode.CurveTo(16.0f, 123.58172f, 19.581722f, 120.0f, 24.0f, 120.0f),
                    PathNode.LineTo(50.85f, 120.0f),
                    PathNode.LineTo(88.72f, 36.69f),
                    PathNode.CurveTo(90.055f, 33.7503f, 93.026215f, 31.901215f, 96.25328f, 32.001785f),
                    PathNode.CurveTo(99.48034f, 32.10236f, 102.33064f, 34.132874f, 103.48f, 37.15f),
                    PathNode.LineTo(160.99f, 188.15f),
                    PathNode.LineTo(192.84f, 124.44f),
                    PathNode.CurveTo(194.19092f, 121.72137f, 196.96422f, 120.00161f, 200.0f, 120.0f),
                    PathNode.LineTo(232.0f, 120.0f),
                    PathNode.CurveTo(236.41827f, 120.0f, 240.0f, 123.58172f, 240.0f, 128.0f),
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
        return _pulse!!
    }

private var _pulse: ImageVector? = null
