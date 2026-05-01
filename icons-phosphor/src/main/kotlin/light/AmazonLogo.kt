package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.AmazonLogo: ImageVector
    get() {
        if (_amazonLogo != null) return _amazonLogo!!
        _amazonLogo = phosphorLightIcon(
            name = "AmazonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(246.0f, 168.0f),
                    PathNode.LineTo(246.0f, 200.0f),
                    PathNode.CurveTo(246.0f, 203.3137f, 243.3137f, 206.0f, 240.0f, 206.0f),
                    PathNode.CurveTo(236.6863f, 206.0f, 234.0f, 203.3137f, 234.0f, 200.0f),
                    PathNode.LineTo(234.0f, 182.48f),
                    PathNode.LineTo(228.34f, 188.14f),
                    PathNode.CurveTo(225.6f, 191.15f, 188.86f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(66.0f, 230.0f, 29.08f, 189.73f, 27.54f, 188.0f),
                    PathNode.CurveTo(25.967722f, 186.42955f, 25.392216f, 184.1187f, 26.044302f, 181.99428f),
                    PathNode.CurveTo(26.696388f, 179.86986f, 28.469261f, 178.27985f, 30.65186f, 177.86194f),
                    PathNode.CurveTo(32.834457f, 177.44405f, 35.069283f, 178.26671f, 36.46f, 180.0f),
                    PathNode.CurveTo(36.8f, 180.37f, 71.55f, 218.0f, 128.0f, 218.0f),
                    PathNode.CurveTo(184.45f, 218.0f, 219.2f, 180.36f, 219.55f, 180.0f),
                    PathNode.LineTo(219.76f, 179.78f),
                    PathNode.LineTo(225.52f, 174.02f),
                    PathNode.LineTo(208.0f, 174.02f),
                    PathNode.CurveTo(204.6863f, 174.02f, 202.0f, 171.33371f, 202.0f, 168.02f),
                    PathNode.CurveTo(202.0f, 164.7063f, 204.6863f, 162.02f, 208.0f, 162.02f),
                    PathNode.LineTo(240.0f, 162.02f),
                    PathNode.CurveTo(243.30591f, 162.01999f, 245.98898f, 164.6941f, 246.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 99.56f),
                    PathNode.LineTo(162.0f, 84.0f),
                    PathNode.CurveTo(162.01009f, 66.42554f, 149.96754f, 51.136936f, 132.87965f, 47.030224f),
                    PathNode.CurveTo(115.79174f, 42.923515f, 98.11704f, 51.070225f, 90.14f, 66.73f),
                    PathNode.CurveTo(89.20297f, 68.70491f, 87.26605f, 70.013954f, 85.084175f, 70.14692f),
                    PathNode.CurveTo(82.90229f, 70.279884f, 80.82075f, 69.21572f, 79.65084f, 67.36921f),
                    PathNode.CurveTo(78.48094f, 65.52269f, 78.40783f, 63.186043f, 79.46f, 61.27f),
                    PathNode.CurveTo(89.963646f, 40.678577f, 113.21311f, 29.971483f, 135.6883f, 35.37513f),
                    PathNode.CurveTo(158.16347f, 40.77878f, 174.00473f, 60.88435f, 174.0f, 84.0f),
                    PathNode.LineTo(174.0f, 176.0f),
                    PathNode.CurveTo(174.0f, 179.3137f, 171.3137f, 182.0f, 168.0f, 182.0f),
                    PathNode.CurveTo(164.6863f, 182.0f, 162.0f, 179.3137f, 162.0f, 176.0f),
                    PathNode.LineTo(162.0f, 164.44f),
                    PathNode.CurveTo(148.40907f, 180.38042f, 126.32231f, 186.15895f, 106.66618f, 178.91693f),
                    PathNode.CurveTo(87.010056f, 171.67491f, 73.95205f, 152.94778f, 73.95205f, 132.0f),
                    PathNode.CurveTo(73.95205f, 111.05221f, 87.010056f, 92.32508f, 106.66618f, 85.08307f),
                    PathNode.CurveTo(126.32231f, 77.84105f, 148.40907f, 83.61959f, 162.0f, 99.56f),
                    PathNode.Close,
                    PathNode.MoveTo(162.0f, 132.0f),
                    PathNode.CurveTo(162.0f, 111.013176f, 144.98682f, 94.0f, 124.0f, 94.0f),
                    PathNode.CurveTo(103.013176f, 94.0f, 86.0f, 111.013176f, 86.0f, 132.0f),
                    PathNode.CurveTo(86.0f, 152.98682f, 103.013176f, 170.0f, 124.0f, 170.0f),
                    PathNode.CurveTo(144.98682f, 170.0f, 162.0f, 152.98682f, 162.0f, 132.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _amazonLogo!!
    }

private var _amazonLogo: ImageVector? = null
