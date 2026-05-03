package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Toilet: ImageVector
    get() {
        if (_toilet != null) return _toilet!!
        _toilet = phosphorFillIcon(
            name = "Toilet",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(60.0f, 88.0f),
                    PathNode.LineTo(196.0f, 88.0f),
                    PathNode.CurveTo(198.20914f, 88.0f, 200.0f, 86.20914f, 200.0f, 84.0f),
                    PathNode.LineTo(200.0f, 40.0f),
                    PathNode.CurveTo(200.0f, 31.163445f, 192.83656f, 24.0f, 184.0f, 24.0f),
                    PathNode.LineTo(72.0f, 24.0f),
                    PathNode.CurveTo(63.163445f, 24.0f, 56.0f, 31.163445f, 56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 84.0f),
                    PathNode.CurveTo(56.0f, 86.20914f, 57.79086f, 88.0f, 60.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 48.0f),
                    PathNode.LineTo(103.73f, 48.0f),
                    PathNode.CurveTo(108.01881f, 47.93666f, 111.628174f, 51.196877f, 112.0f, 55.47f),
                    PathNode.CurveTo(112.14687f, 57.68197f, 111.36931f, 59.855713f, 109.852806f, 61.472687f),
                    PathNode.CurveTo(108.3363f, 63.089657f, 106.216835f, 64.00487f, 104.0f, 64.0f),
                    PathNode.LineTo(88.27f, 64.0f),
                    PathNode.CurveTo(83.98119f, 64.06334f, 80.371826f, 60.803123f, 80.0f, 56.53f),
                    PathNode.CurveTo(79.85313f, 54.31803f, 80.63069f, 52.144287f, 82.147194f, 50.527313f),
                    PathNode.CurveTo(83.6637f, 48.910343f, 85.783165f, 47.99513f, 88.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 112.06f),
                    PathNode.CurveTo(224.01599f, 109.927895f, 223.1802f, 107.87761f, 221.67818f, 106.36432f),
                    PathNode.CurveTo(220.17615f, 104.85103f, 218.13217f, 103.99994f, 216.0f, 104.0f),
                    PathNode.LineTo(40.0f, 104.0f),
                    PathNode.CurveTo(37.867832f, 103.99994f, 35.823853f, 104.85103f, 34.321827f, 106.36432f),
                    PathNode.CurveTo(32.819798f, 107.87761f, 31.984009f, 109.927895f, 32.0f, 112.06f),
                    PathNode.CurveTo(32.051308f, 147.82759f, 51.96262f, 180.60728f, 83.68f, 197.14f),
                    PathNode.LineTo(80.21f, 221.41f),
                    PathNode.CurveTo(79.68631f, 224.83182f, 80.256775f, 228.33162f, 81.84f, 231.41f),
                    PathNode.CurveTo(84.59561f, 236.68349f, 90.04995f, 239.99231f, 96.0f, 240.0f),
                    PathNode.LineTo(159.66f, 240.0f),
                    PathNode.CurveTo(163.13487f, 240.04726f, 166.5362f, 238.99748f, 169.38f, 237.0f),
                    PathNode.CurveTo(174.19444f, 233.51683f, 176.68192f, 227.65239f, 175.84f, 221.77f),
                    PathNode.LineTo(172.32f, 197.17f),
                    PathNode.CurveTo(204.04692f, 180.6323f, 223.95985f, 147.83838f, 224.0f, 112.06f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 224.0f),
                    PathNode.LineTo(98.93f, 203.5f),
                    PathNode.CurveTo(117.84564f, 209.49974f, 138.15436f, 209.49974f, 157.07f, 203.5f),
                    PathNode.LineTo(160.0f, 224.0f),
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
        return _toilet!!
    }

private var _toilet: ImageVector? = null
