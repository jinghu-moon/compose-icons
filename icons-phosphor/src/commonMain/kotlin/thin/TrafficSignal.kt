package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.TrafficSignal: ImageVector
    get() {
        if (_trafficSignal != null) return _trafficSignal!!
        _trafficSignal = phosphorThinIcon(
            name = "TrafficSignal",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 60.0f),
                    PathNode.CurveTo(112.536026f, 60.0f, 100.0f, 72.536026f, 100.0f, 88.0f),
                    PathNode.CurveTo(100.0f, 103.463974f, 112.536026f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(143.46397f, 116.0f, 156.0f, 103.463974f, 156.0f, 88.0f),
                    PathNode.CurveTo(156.0f, 72.536026f, 143.46397f, 60.0f, 128.0f, 60.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 108.0f),
                    PathNode.CurveTo(116.95431f, 108.0f, 108.0f, 99.04569f, 108.0f, 88.0f),
                    PathNode.CurveTo(108.0f, 76.95431f, 116.95431f, 68.0f, 128.0f, 68.0f),
                    PathNode.CurveTo(139.0457f, 68.0f, 148.0f, 76.95431f, 148.0f, 88.0f),
                    PathNode.CurveTo(148.0f, 99.04569f, 139.0457f, 108.0f, 128.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 140.0f),
                    PathNode.CurveTo(112.536026f, 140.0f, 100.0f, 152.53603f, 100.0f, 168.0f),
                    PathNode.CurveTo(100.0f, 183.46397f, 112.536026f, 196.0f, 128.0f, 196.0f),
                    PathNode.CurveTo(143.46397f, 196.0f, 156.0f, 183.46397f, 156.0f, 168.0f),
                    PathNode.CurveTo(156.0f, 152.53603f, 143.46397f, 140.0f, 128.0f, 140.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 188.0f),
                    PathNode.CurveTo(116.95431f, 188.0f, 108.0f, 179.0457f, 108.0f, 168.0f),
                    PathNode.CurveTo(108.0f, 156.9543f, 116.95431f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(139.0457f, 148.0f, 148.0f, 156.9543f, 148.0f, 168.0f),
                    PathNode.CurveTo(148.0f, 179.0457f, 139.0457f, 188.0f, 128.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 148.0f),
                    PathNode.LineTo(196.0f, 148.0f),
                    PathNode.LineTo(196.0f, 76.0f),
                    PathNode.LineTo(216.0f, 76.0f),
                    PathNode.CurveTo(218.20914f, 76.0f, 220.0f, 74.20914f, 220.0f, 72.0f),
                    PathNode.CurveTo(220.0f, 69.79086f, 218.20914f, 68.0f, 216.0f, 68.0f),
                    PathNode.LineTo(196.0f, 68.0f),
                    PathNode.LineTo(196.0f, 40.0f),
                    PathNode.CurveTo(196.0f, 33.37258f, 190.62741f, 28.0f, 184.0f, 28.0f),
                    PathNode.LineTo(72.0f, 28.0f),
                    PathNode.CurveTo(65.37258f, 28.0f, 60.0f, 33.37258f, 60.0f, 40.0f),
                    PathNode.LineTo(60.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(37.79086f, 68.0f, 36.0f, 69.79086f, 36.0f, 72.0f),
                    PathNode.CurveTo(36.0f, 74.20914f, 37.79086f, 76.0f, 40.0f, 76.0f),
                    PathNode.LineTo(60.0f, 76.0f),
                    PathNode.LineTo(60.0f, 148.0f),
                    PathNode.LineTo(40.0f, 148.0f),
                    PathNode.CurveTo(37.79086f, 148.0f, 36.0f, 149.79086f, 36.0f, 152.0f),
                    PathNode.CurveTo(36.0f, 154.20914f, 37.79086f, 156.0f, 40.0f, 156.0f),
                    PathNode.LineTo(60.0f, 156.0f),
                    PathNode.LineTo(60.0f, 216.0f),
                    PathNode.CurveTo(60.0f, 222.62741f, 65.37258f, 228.0f, 72.0f, 228.0f),
                    PathNode.LineTo(184.0f, 228.0f),
                    PathNode.CurveTo(190.62741f, 228.0f, 196.0f, 222.62741f, 196.0f, 216.0f),
                    PathNode.LineTo(196.0f, 156.0f),
                    PathNode.LineTo(216.0f, 156.0f),
                    PathNode.CurveTo(218.20914f, 156.0f, 220.0f, 154.20914f, 220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 149.79086f, 218.20914f, 148.0f, 216.0f, 148.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 216.0f),
                    PathNode.CurveTo(188.0f, 218.20914f, 186.20914f, 220.0f, 184.0f, 220.0f),
                    PathNode.LineTo(72.0f, 220.0f),
                    PathNode.CurveTo(69.79086f, 220.0f, 68.0f, 218.20914f, 68.0f, 216.0f),
                    PathNode.LineTo(68.0f, 40.0f),
                    PathNode.CurveTo(68.0f, 37.79086f, 69.79086f, 36.0f, 72.0f, 36.0f),
                    PathNode.LineTo(184.0f, 36.0f),
                    PathNode.CurveTo(186.20914f, 36.0f, 188.0f, 37.79086f, 188.0f, 40.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 8.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _trafficSignal!!
    }

private var _trafficSignal: ImageVector? = null
