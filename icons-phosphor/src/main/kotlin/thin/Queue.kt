package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Queue: ImageVector
    get() {
        if (_queue != null) return _queue!!
        _queue = phosphorThinIcon(
            name = "Queue",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(36.0f, 64.0f),
                    PathNode.CurveTo(36.0f, 61.79086f, 37.79086f, 60.0f, 40.0f, 60.0f),
                    PathNode.LineTo(216.0f, 60.0f),
                    PathNode.CurveTo(218.20914f, 60.0f, 220.0f, 61.79086f, 220.0f, 64.0f),
                    PathNode.CurveTo(220.0f, 66.20914f, 218.20914f, 68.0f, 216.0f, 68.0f),
                    PathNode.LineTo(40.0f, 68.0f),
                    PathNode.CurveTo(37.79086f, 68.0f, 36.0f, 66.20914f, 36.0f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 124.0f),
                    PathNode.LineTo(40.0f, 124.0f),
                    PathNode.CurveTo(37.79086f, 124.0f, 36.0f, 125.79086f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 130.20914f, 37.79086f, 132.0f, 40.0f, 132.0f),
                    PathNode.LineTo(136.0f, 132.0f),
                    PathNode.CurveTo(138.20914f, 132.0f, 140.0f, 130.20914f, 140.0f, 128.0f),
                    PathNode.CurveTo(140.0f, 125.79086f, 138.20914f, 124.0f, 136.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 188.0f),
                    PathNode.LineTo(40.0f, 188.0f),
                    PathNode.CurveTo(37.79086f, 188.0f, 36.0f, 189.79086f, 36.0f, 192.0f),
                    PathNode.CurveTo(36.0f, 194.20914f, 37.79086f, 196.0f, 40.0f, 196.0f),
                    PathNode.LineTo(136.0f, 196.0f),
                    PathNode.CurveTo(138.20914f, 196.0f, 140.0f, 194.20914f, 140.0f, 192.0f),
                    PathNode.CurveTo(140.0f, 189.79086f, 138.20914f, 188.0f, 136.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(244.0f, 160.0f),
                    PathNode.CurveTo(243.99931f, 161.37845f, 243.28893f, 162.65942f, 242.12f, 163.39f),
                    PathNode.LineTo(178.12f, 203.39f),
                    PathNode.CurveTo(177.48448f, 203.78802f, 176.74988f, 203.9994f, 176.0f, 204.0f),
                    PathNode.CurveTo(175.32172f, 203.998f, 174.65475f, 203.8261f, 174.06f, 203.5f),
                    PathNode.CurveTo(172.78809f, 202.7946f, 171.9993f, 201.45442f, 172.0f, 200.0f),
                    PathNode.LineTo(172.0f, 120.0f),
                    PathNode.CurveTo(172.00072f, 118.54626f, 172.79012f, 117.20735f, 174.0618f, 116.50294f),
                    PathNode.CurveTo(175.33348f, 115.79852f, 176.88722f, 115.839516f, 178.12f, 116.61f),
                    PathNode.LineTo(242.12f, 156.61f),
                    PathNode.CurveTo(243.28893f, 157.34058f, 243.99931f, 158.62155f, 244.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(232.45f, 160.0f),
                    PathNode.LineTo(180.0f, 127.22f),
                    PathNode.LineTo(180.0f, 192.78f),
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
        return _queue!!
    }

private var _queue: ImageVector? = null
