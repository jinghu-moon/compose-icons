package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HighHeel: ImageVector
    get() {
        if (_highHeel != null) return _highHeel!!
        _highHeel = phosphorFillIcon(
            name = "HighHeel",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(32.0f, 144.0f),
                    PathNode.CurveTo(44.90024f, 143.98965f, 57.66823f, 146.59904f, 69.53f, 151.67f),
                    PathNode.CurveTo(71.0265f, 152.28952f, 72.00169f, 153.75034f, 72.0f, 155.37f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.CurveTo(72.0f, 200.83656f, 64.836555f, 208.0f, 56.0f, 208.0f),
                    PathNode.LineTo(40.0f, 208.0f),
                    PathNode.CurveTo(31.163445f, 208.0f, 24.0f, 200.83656f, 24.0f, 192.0f),
                    PathNode.LineTo(24.0f, 148.0f),
                    PathNode.CurveTo(24.0f, 145.79086f, 25.790861f, 144.0f, 28.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(231.0f, 156.19f),
                    PathNode.LineTo(180.0f, 144.71f),
                    PathNode.LineTo(69.66f, 34.34f),
                    PathNode.CurveTo(68.11567f, 32.796314f, 66.007454f, 31.950966f, 63.824448f, 32.000065f),
                    PathNode.CurveTo(61.64144f, 32.049164f, 59.573368f, 32.98844f, 58.1f, 34.6f),
                    PathNode.CurveTo(36.11f, 58.64f, 24.0f, 89.0f, 24.0f, 120.0f),
                    PathNode.CurveTo(24.0f, 124.41828f, 27.581722f, 128.0f, 32.0f, 128.0f),
                    PathNode.CurveTo(54.625835f, 127.96986f, 76.72252f, 134.84236f, 95.34f, 147.7f),
                    PathNode.CurveTo(113.499825f, 160.16302f, 127.59986f, 177.68463f, 135.89f, 198.09f),
                    PathNode.CurveTo(138.3406f, 204.11604f, 144.21484f, 208.04146f, 150.72f, 208.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(248.83656f, 208.0f, 256.0f, 200.83656f, 256.0f, 192.0f),
                    PathNode.LineTo(256.0f, 187.27f),
                    PathNode.CurveTo(256.03772f, 172.31113f, 245.61938f, 159.35905f, 231.0f, 156.19f),
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
        return _highHeel!!
    }

private var _highHeel: ImageVector? = null
