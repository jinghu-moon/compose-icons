package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Barbell: ImageVector
    get() {
        if (_barbell != null) return _barbell!!
        _barbell = phosphorFillIcon(
            name = "Barbell",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 64.0f),
                    PathNode.LineTo(200.0f, 192.0f),
                    PathNode.CurveTo(200.0f, 200.83656f, 192.83656f, 208.0f, 184.0f, 208.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.CurveTo(159.16344f, 208.0f, 152.0f, 200.83656f, 152.0f, 192.0f),
                    PathNode.LineTo(152.0f, 136.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.LineTo(104.0f, 192.0f),
                    PathNode.CurveTo(104.0f, 200.83656f, 96.836555f, 208.0f, 88.0f, 208.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.CurveTo(63.163445f, 208.0f, 56.0f, 200.83656f, 56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 64.0f),
                    PathNode.CurveTo(56.0f, 55.163445f, 63.163445f, 48.0f, 72.0f, 48.0f),
                    PathNode.LineTo(88.0f, 48.0f),
                    PathNode.CurveTo(96.836555f, 48.0f, 104.0f, 55.163445f, 104.0f, 64.0f),
                    PathNode.LineTo(104.0f, 120.0f),
                    PathNode.LineTo(152.0f, 120.0f),
                    PathNode.LineTo(152.0f, 64.0f),
                    PathNode.CurveTo(152.0f, 55.163445f, 159.16344f, 48.0f, 168.0f, 48.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.CurveTo(192.83656f, 48.0f, 200.0f, 55.163445f, 200.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(36.0f, 72.0f),
                    PathNode.LineTo(32.0f, 72.0f),
                    PathNode.CurveTo(23.163445f, 72.0f, 16.0f, 79.163445f, 16.0f, 88.0f),
                    PathNode.LineTo(16.0f, 120.0f),
                    PathNode.LineTo(8.270001f, 120.0f),
                    PathNode.CurveTo(3.981197f, 119.93666f, 0.371828f, 123.19688f, 0f, 127.47f),
                    PathNode.CurveTo(-0.146871f, 129.68198f, 0.630689f, 131.85571f, 2.147192f, 133.47269f),
                    PathNode.CurveTo(3.663696f, 135.08966f, 5.783165f, 136.00487f, 8.0f, 136.0f),
                    PathNode.LineTo(16.0f, 136.0f),
                    PathNode.LineTo(16.0f, 168.0f),
                    PathNode.CurveTo(16.0f, 176.83656f, 23.163445f, 184.0f, 32.0f, 184.0f),
                    PathNode.LineTo(36.0f, 184.0f),
                    PathNode.CurveTo(38.20914f, 184.0f, 40.0f, 182.20914f, 40.0f, 180.0f),
                    PathNode.LineTo(40.0f, 76.0f),
                    PathNode.CurveTo(40.0f, 73.79086f, 38.20914f, 72.0f, 36.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(256.0f, 127.47f),
                    PathNode.CurveTo(255.62871f, 123.20465f, 252.03116f, 119.947235f, 247.75f, 120.0f),
                    PathNode.LineTo(240.0f, 120.0f),
                    PathNode.LineTo(240.0f, 88.0f),
                    PathNode.CurveTo(240.0f, 79.163445f, 232.83656f, 72.0f, 224.0f, 72.0f),
                    PathNode.LineTo(220.0f, 72.0f),
                    PathNode.CurveTo(217.79086f, 72.0f, 216.0f, 73.79086f, 216.0f, 76.0f),
                    PathNode.LineTo(216.0f, 180.0f),
                    PathNode.CurveTo(216.0f, 182.20914f, 217.79086f, 184.0f, 220.0f, 184.0f),
                    PathNode.LineTo(224.0f, 184.0f),
                    PathNode.CurveTo(232.83656f, 184.0f, 240.0f, 176.83656f, 240.0f, 168.0f),
                    PathNode.LineTo(240.0f, 136.0f),
                    PathNode.LineTo(248.0f, 136.0f),
                    PathNode.CurveTo(250.21684f, 136.00487f, 252.3363f, 135.08966f, 253.85281f, 133.47269f),
                    PathNode.CurveTo(255.36931f, 131.85571f, 256.14688f, 129.68198f, 256.0f, 127.47f),
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
        return _barbell!!
    }

private var _barbell: ImageVector? = null
