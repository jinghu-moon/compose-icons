package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Seatbelt: ImageVector
    get() {
        if (_seatbelt != null) return _seatbelt!!
        _seatbelt = phosphorThinIcon(
            name = "Seatbelt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 108.0f),
                    PathNode.CurveTo(150.09138f, 108.0f, 168.0f, 90.09139f, 168.0f, 68.0f),
                    PathNode.CurveTo(168.0f, 45.90861f, 150.09138f, 28.0f, 128.0f, 28.0f),
                    PathNode.CurveTo(105.90861f, 28.0f, 88.0f, 45.90861f, 88.0f, 68.0f),
                    PathNode.CurveTo(88.0f, 90.09139f, 105.90861f, 108.0f, 128.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 36.0f),
                    PathNode.CurveTo(145.67311f, 36.0f, 160.0f, 50.32689f, 160.0f, 68.0f),
                    PathNode.CurveTo(160.0f, 85.67311f, 145.67311f, 100.0f, 128.0f, 100.0f),
                    PathNode.CurveTo(110.32689f, 100.0f, 96.0f, 85.67311f, 96.0f, 68.0f),
                    PathNode.CurveTo(96.0f, 50.32689f, 110.32689f, 36.0f, 128.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.0f, 224.0f),
                    PathNode.CurveTo(204.0f, 226.20914f, 202.20914f, 228.0f, 200.0f, 228.0f),
                    PathNode.LineTo(56.0f, 228.0f),
                    PathNode.CurveTo(54.335644f, 228.00177f, 52.84411f, 226.97275f, 52.254845f, 225.4162f),
                    PathNode.CurveTo(51.665577f, 223.85965f, 52.10173f, 222.10086f, 53.35f, 221.0f),
                    PathNode.LineTo(156.35f, 130.16f),
                    PathNode.CurveTo(137.04527f, 121.32141f, 114.720116f, 122.007034f, 95.99413f, 132.01358f),
                    PathNode.CurveTo(77.26815f, 142.02013f, 64.29081f, 160.199f, 60.91f, 181.16f),
                    PathNode.CurveTo(60.60097f, 183.09764f, 58.93212f, 184.52505f, 56.97f, 184.53f),
                    PathNode.CurveTo(56.755745f, 184.52866f, 56.541862f, 184.51195f, 56.33f, 184.48f),
                    PathNode.CurveTo(55.278545f, 184.31537f, 54.33605f, 183.7385f, 53.71108f, 182.87706f),
                    PathNode.CurveTo(53.086113f, 182.01562f, 52.83021f, 180.94063f, 53.0f, 179.89f),
                    PathNode.CurveTo(56.881214f, 155.86115f, 72.036736f, 135.14503f, 93.76284f, 124.17117f),
                    PathNode.CurveTo(115.488945f, 113.19731f, 141.15678f, 113.29354f, 162.8f, 124.43f),
                    PathNode.LineTo(189.35f, 101.0f),
                    PathNode.CurveTo(191.00685f, 99.536446f, 193.53644f, 99.693146f, 195.0f, 101.35f),
                    PathNode.CurveTo(196.46356f, 103.00685f, 196.30685f, 105.536446f, 194.65f, 107.0f),
                    PathNode.LineTo(66.58f, 220.0f),
                    PathNode.LineTo(200.0f, 220.0f),
                    PathNode.CurveTo(202.20914f, 220.0f, 204.0f, 221.79086f, 204.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(190.44f, 148.67f),
                    PathNode.CurveTo(199.29741f, 161.38057f, 204.0314f, 176.5077f, 204.0f, 192.0f),
                    PathNode.CurveTo(204.0f, 194.20914f, 202.20914f, 196.0f, 200.0f, 196.0f),
                    PathNode.CurveTo(197.79086f, 196.0f, 196.0f, 194.20914f, 196.0f, 192.0f),
                    PathNode.CurveTo(196.03041f, 178.1382f, 191.79553f, 164.60263f, 183.87f, 153.23f),
                    PathNode.CurveTo(183.01118f, 152.05754f, 182.85588f, 150.5115f, 183.46437f, 149.19165f),
                    PathNode.CurveTo(184.07283f, 147.87181f, 185.34932f, 146.98584f, 186.79863f, 146.87746f),
                    PathNode.CurveTo(188.24794f, 146.76907f, 189.642f, 147.45534f, 190.44f, 148.67f),
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
        return _seatbelt!!
    }

private var _seatbelt: ImageVector? = null
