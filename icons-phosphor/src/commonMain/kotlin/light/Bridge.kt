package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Bridge: ImageVector
    get() {
        if (_bridge != null) return _bridge!!
        _bridge = phosphorLightIcon(
            name = "Bridge",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(232.0f, 162.0f),
                    PathNode.LineTo(198.0f, 162.0f),
                    PathNode.LineTo(198.0f, 95.28f),
                    PathNode.CurveTo(205.79465f, 106.79468f, 216.85034f, 115.71932f, 229.75f, 120.91f),
                    PathNode.CurveTo(231.74948f, 121.779755f, 234.06343f, 121.49631f, 235.79387f, 120.169655f),
                    PathNode.CurveTo(237.5243f, 118.843f, 238.3988f, 116.682f, 238.07802f, 114.52527f),
                    PathNode.CurveTo(237.75723f, 112.36853f, 236.29164f, 110.555595f, 234.25f, 109.79f),
                    PathNode.CurveTo(212.29654f, 100.969f, 197.93553f, 79.65926f, 198.0f, 56.0f),
                    PathNode.CurveTo(198.0f, 52.68629f, 195.3137f, 50.0f, 192.0f, 50.0f),
                    PathNode.CurveTo(188.6863f, 50.0f, 186.0f, 52.68629f, 186.0f, 56.0f),
                    PathNode.CurveTo(186.0f, 88.03252f, 160.03252f, 114.0f, 128.0f, 114.0f),
                    PathNode.CurveTo(95.96748f, 114.0f, 70.0f, 88.03252f, 70.0f, 56.0f),
                    PathNode.CurveTo(70.0f, 52.68629f, 67.313705f, 50.0f, 64.0f, 50.0f),
                    PathNode.CurveTo(60.68629f, 50.0f, 58.0f, 52.68629f, 58.0f, 56.0f),
                    PathNode.CurveTo(58.064465f, 79.65926f, 43.70347f, 100.969f, 21.75f, 109.79f),
                    PathNode.CurveTo(19.708364f, 110.555595f, 18.242773f, 112.36853f, 17.921982f, 114.52527f),
                    PathNode.CurveTo(17.60119f, 116.682f, 18.475697f, 118.843f, 20.206133f, 120.169655f),
                    PathNode.CurveTo(21.936567f, 121.49631f, 24.250513f, 121.779755f, 26.25f, 120.91f),
                    PathNode.CurveTo(39.149666f, 115.71932f, 50.205353f, 106.79468f, 58.0f, 95.28f),
                    PathNode.LineTo(58.0f, 162.0f),
                    PathNode.LineTo(24.0f, 162.0f),
                    PathNode.CurveTo(20.68629f, 162.0f, 18.0f, 164.6863f, 18.0f, 168.0f),
                    PathNode.CurveTo(18.0f, 171.3137f, 20.68629f, 174.0f, 24.0f, 174.0f),
                    PathNode.LineTo(58.0f, 174.0f),
                    PathNode.LineTo(58.0f, 200.0f),
                    PathNode.CurveTo(58.0f, 203.3137f, 60.68629f, 206.0f, 64.0f, 206.0f),
                    PathNode.CurveTo(67.313705f, 206.0f, 70.0f, 203.3137f, 70.0f, 200.0f),
                    PathNode.LineTo(70.0f, 174.0f),
                    PathNode.LineTo(186.0f, 174.0f),
                    PathNode.LineTo(186.0f, 200.0f),
                    PathNode.CurveTo(186.0f, 203.3137f, 188.6863f, 206.0f, 192.0f, 206.0f),
                    PathNode.CurveTo(195.3137f, 206.0f, 198.0f, 203.3137f, 198.0f, 200.0f),
                    PathNode.LineTo(198.0f, 174.0f),
                    PathNode.LineTo(232.0f, 174.0f),
                    PathNode.CurveTo(235.3137f, 174.0f, 238.0f, 171.3137f, 238.0f, 168.0f),
                    PathNode.CurveTo(238.0f, 164.6863f, 235.3137f, 162.0f, 232.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(146.0f, 123.65f),
                    PathNode.LineTo(146.0f, 162.0f),
                    PathNode.LineTo(110.0f, 162.0f),
                    PathNode.LineTo(110.0f, 123.65f),
                    PathNode.CurveTo(121.795456f, 126.78339f, 134.20454f, 126.78339f, 146.0f, 123.65f),
                    PathNode.Close,
                    PathNode.MoveTo(70.0f, 95.15f),
                    PathNode.CurveTo(77.02615f, 105.52606f, 86.69132f, 113.84155f, 98.0f, 119.24f),
                    PathNode.LineTo(98.0f, 162.0f),
                    PathNode.LineTo(70.0f, 162.0f),
                    PathNode.Close,
                    PathNode.MoveTo(158.0f, 162.0f),
                    PathNode.LineTo(158.0f, 119.24f),
                    PathNode.CurveTo(169.30869f, 113.84155f, 178.97385f, 105.52606f, 186.0f, 95.15f),
                    PathNode.LineTo(186.0f, 162.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _bridge!!
    }

private var _bridge: ImageVector? = null
