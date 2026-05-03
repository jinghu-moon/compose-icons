package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorFillIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 216.0f),
                    PathNode.CurveTo(224.0f, 220.41827f, 220.41827f, 224.0f, 216.0f, 224.0f),
                    PathNode.LineTo(72.0f, 224.0f),
                    PathNode.CurveTo(67.58172f, 224.0f, 64.0f, 220.41827f, 64.0f, 216.0f),
                    PathNode.CurveTo(64.0f, 211.58173f, 67.58172f, 208.0f, 72.0f, 208.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(220.41827f, 208.0f, 224.0f, 211.58173f, 224.0f, 216.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 96.0f),
                    PathNode.LineTo(147.32f, 96.0f),
                    PathNode.LineTo(101.66f, 50.34f),
                    PathNode.CurveTo(100.158424f, 48.84009f, 98.12237f, 47.998333f, 96.0f, 48.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.CurveTo(82.85839f, 48.00283f, 78.0314f, 50.476406f, 75.02625f, 54.64836f),
                    PathNode.CurveTo(72.0211f, 58.820312f, 71.203964f, 64.18228f, 72.83f, 69.06f),
                    PathNode.LineTo(81.83f, 96.0f),
                    PathNode.LineTo(59.32f, 96.0f),
                    PathNode.LineTo(37.66f, 74.34f),
                    PathNode.CurveTo(36.158424f, 72.84009f, 34.12237f, 71.99833f, 32.0f, 72.0f),
                    PathNode.LineTo(24.0f, 72.0f),
                    PathNode.CurveTo(18.94441f, 72.00458f, 14.188396f, 74.39827f, 11.172718f, 78.45594f),
                    PathNode.CurveTo(8.157041f, 82.51361f, 7.236515f, 87.75785f, 8.69f, 92.6f),
                    PathNode.LineTo(22.76f, 139.49f),
                    PathNode.CurveTo(27.762486f, 156.45985f, 43.378353f, 168.08107f, 61.07f, 168.0f),
                    PathNode.LineTo(240.0f, 168.0f),
                    PathNode.CurveTo(244.41827f, 168.0f, 248.0f, 164.41827f, 248.0f, 160.0f),
                    PathNode.LineTo(248.0f, 136.0f),
                    PathNode.CurveTo(248.0f, 113.90861f, 230.09138f, 96.0f, 208.0f, 96.0f),
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
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
