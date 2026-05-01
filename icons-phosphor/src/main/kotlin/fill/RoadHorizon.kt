package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.RoadHorizon: ImageVector
    get() {
        if (_roadHorizon != null) return _roadHorizon!!
        _roadHorizon = phosphorFillIcon(
            name = "RoadHorizon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(239.0f, 188.08f),
                    PathNode.LineTo(173.68f, 72.0f),
                    PathNode.LineTo(231.68f, 72.0f),
                    PathNode.CurveTo(235.98975f, 72.09491f, 239.6317f, 68.825035f, 240.0f, 64.53f),
                    PathNode.CurveTo(240.14687f, 62.31803f, 239.36931f, 60.144287f, 237.85281f, 58.527313f),
                    PathNode.CurveTo(236.3363f, 56.910343f, 234.21684f, 55.99513f, 232.0f, 56.0f),
                    PathNode.LineTo(24.27f, 56.0f),
                    PathNode.CurveTo(19.979347f, 55.931744f, 16.367125f, 59.19454f, 16.0f, 63.47f),
                    PathNode.CurveTo(15.853129f, 65.68197f, 16.630688f, 67.85571f, 18.147192f, 69.47269f),
                    PathNode.CurveTo(19.663696f, 71.08966f, 21.783163f, 72.00487f, 24.0f, 72.0f),
                    PathNode.LineTo(82.32f, 72.0f),
                    PathNode.LineTo(17.0f, 188.08f),
                    PathNode.CurveTo(15.278749f, 191.13957f, 15.753235f, 194.96384f, 18.17f, 197.51f),
                    PathNode.CurveTo(19.744638f, 199.12662f, 21.913408f, 200.02666f, 24.17f, 200.0f),
                    PathNode.LineTo(116.0f, 200.0f),
                    PathNode.CurveTo(118.20914f, 200.0f, 120.0f, 198.20914f, 120.0f, 196.0f),
                    PathNode.LineTo(120.0f, 176.27f),
                    PathNode.CurveTo(119.94234f, 171.987f, 123.20232f, 168.38661f, 127.47f, 168.02f),
                    PathNode.CurveTo(129.68198f, 167.87312f, 131.85571f, 168.65068f, 133.47269f, 170.16719f),
                    PathNode.CurveTo(135.08966f, 171.6837f, 136.00487f, 173.80316f, 136.0f, 176.02f),
                    PathNode.LineTo(136.0f, 196.02f),
                    PathNode.CurveTo(136.0f, 198.22914f, 137.79086f, 200.02f, 140.0f, 200.02f),
                    PathNode.LineTo(231.77f, 200.02f),
                    PathNode.CurveTo(234.0266f, 200.04665f, 236.19536f, 199.1466f, 237.77f, 197.53f),
                    PathNode.CurveTo(240.21611f, 194.99448f, 240.71556f, 191.1572f, 239.0f, 188.08f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 140.0f),
                    PathNode.CurveTo(136.0f, 144.41827f, 132.41827f, 148.0f, 128.0f, 148.0f),
                    PathNode.CurveTo(123.58172f, 148.0f, 120.0f, 144.41827f, 120.0f, 140.0f),
                    PathNode.LineTo(120.0f, 124.0f),
                    PathNode.CurveTo(120.0f, 119.58172f, 123.58172f, 116.0f, 128.0f, 116.0f),
                    PathNode.CurveTo(132.41827f, 116.0f, 136.0f, 119.58172f, 136.0f, 124.0f),
                    PathNode.Close,
                    PathNode.MoveTo(136.0f, 88.0f),
                    PathNode.CurveTo(136.0f, 92.41828f, 132.41827f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(123.58172f, 96.0f, 120.0f, 92.41828f, 120.0f, 88.0f),
                    PathNode.LineTo(120.0f, 80.0f),
                    PathNode.CurveTo(120.0f, 75.58172f, 123.58172f, 72.0f, 128.0f, 72.0f),
                    PathNode.CurveTo(132.41827f, 72.0f, 136.0f, 75.58172f, 136.0f, 80.0f),
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
        return _roadHorizon!!
    }

private var _roadHorizon: ImageVector? = null
