package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.TrafficCone: ImageVector
    get() {
        if (_trafficCone != null) return _trafficCone!!
        _trafficCone = phosphorDuotoneIcon(
            name = "TrafficCone",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(188.52f, 160.0f),
                    PathNode.LineTo(67.52f, 160.0f),
                    PathNode.LineTo(89.74f, 96.0f),
                    PathNode.LineTo(166.26f, 96.0f),
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
                    PathNode.MoveTo(232.0f, 208.0f),
                    PathNode.LineTo(213.69f, 208.0f),
                    PathNode.LineTo(153.42f, 34.75f),
                    PathNode.CurveTo(151.185f, 28.315693f, 145.12143f, 24.001766f, 138.31f, 24.0f),
                    PathNode.LineTo(117.69f, 24.0f),
                    PathNode.CurveTo(110.88119f, 24.000286f, 104.8184f, 28.30964f, 102.58f, 34.74f),
                    PathNode.LineTo(42.31f, 208.0f),
                    PathNode.LineTo(24.0f, 208.0f),
                    PathNode.CurveTo(19.581722f, 208.0f, 16.0f, 211.58173f, 16.0f, 216.0f),
                    PathNode.CurveTo(16.0f, 220.41827f, 19.581722f, 224.0f, 24.0f, 224.0f),
                    PathNode.LineTo(232.0f, 224.0f),
                    PathNode.CurveTo(236.41827f, 224.0f, 240.0f, 220.41827f, 240.0f, 216.0f),
                    PathNode.CurveTo(240.0f, 211.58173f, 236.41827f, 208.0f, 232.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(117.69f, 40.0f),
                    PathNode.LineTo(138.31f, 40.0f),
                    PathNode.LineTo(155.0f, 88.0f),
                    PathNode.LineTo(101.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(95.43f, 104.0f),
                    PathNode.LineTo(160.57f, 104.0f),
                    PathNode.LineTo(177.27f, 152.0f),
                    PathNode.LineTo(78.73f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(59.25f, 208.0f),
                    PathNode.LineTo(73.17f, 168.0f),
                    PathNode.LineTo(182.83f, 168.0f),
                    PathNode.LineTo(196.75f, 208.0f),
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
        return _trafficCone!!
    }

private var _trafficCone: ImageVector? = null
