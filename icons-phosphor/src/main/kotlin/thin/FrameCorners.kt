package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.FrameCorners: ImageVector
    get() {
        if (_frameCorners != null) return _frameCorners!!
        _frameCorners = phosphorThinIcon(
            name = "FrameCorners",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(196.0f, 80.0f),
                    PathNode.LineTo(196.0f, 112.0f),
                    PathNode.CurveTo(196.0f, 114.20914f, 194.20914f, 116.0f, 192.0f, 116.0f),
                    PathNode.CurveTo(189.79086f, 116.0f, 188.0f, 114.20914f, 188.0f, 112.0f),
                    PathNode.LineTo(188.0f, 84.0f),
                    PathNode.LineTo(160.0f, 84.0f),
                    PathNode.CurveTo(157.79086f, 84.0f, 156.0f, 82.20914f, 156.0f, 80.0f),
                    PathNode.CurveTo(156.0f, 77.79086f, 157.79086f, 76.0f, 160.0f, 76.0f),
                    PathNode.LineTo(192.0f, 76.0f),
                    PathNode.CurveTo(194.20914f, 76.0f, 196.0f, 77.79086f, 196.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 172.0f),
                    PathNode.LineTo(68.0f, 172.0f),
                    PathNode.LineTo(68.0f, 144.0f),
                    PathNode.CurveTo(68.0f, 141.79086f, 66.20914f, 140.0f, 64.0f, 140.0f),
                    PathNode.CurveTo(61.79086f, 140.0f, 60.0f, 141.79086f, 60.0f, 144.0f),
                    PathNode.LineTo(60.0f, 176.0f),
                    PathNode.CurveTo(60.0f, 178.20914f, 61.79086f, 180.0f, 64.0f, 180.0f),
                    PathNode.LineTo(96.0f, 180.0f),
                    PathNode.CurveTo(98.20914f, 180.0f, 100.0f, 178.20914f, 100.0f, 176.0f),
                    PathNode.CurveTo(100.0f, 173.79086f, 98.20914f, 172.0f, 96.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(228.0f, 200.0f),
                    PathNode.CurveTo(228.0f, 206.62741f, 222.62741f, 212.0f, 216.0f, 212.0f),
                    PathNode.LineTo(40.0f, 212.0f),
                    PathNode.CurveTo(33.37258f, 212.0f, 28.0f, 206.62741f, 28.0f, 200.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 49.37258f, 33.37258f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(222.62741f, 44.0f, 228.0f, 49.37258f, 228.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 218.20914f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 200.0f),
                    PathNode.CurveTo(36.0f, 202.20914f, 37.79086f, 204.0f, 40.0f, 204.0f),
                    PathNode.LineTo(216.0f, 204.0f),
                    PathNode.CurveTo(218.20914f, 204.0f, 220.0f, 202.20914f, 220.0f, 200.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _frameCorners!!
    }

private var _frameCorners: ImageVector? = null
