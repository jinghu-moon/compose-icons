package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.HandTap: ImageVector
    get() {
        if (_handTap != null) return _handTap!!
        _handTap = phosphorThinIcon(
            name = "HandTap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(60.0f, 76.0f),
                    PathNode.CurveTo(60.0f, 45.072056f, 85.07206f, 20.0f, 116.0f, 20.0f),
                    PathNode.CurveTo(146.92795f, 20.0f, 172.0f, 45.072056f, 172.0f, 76.0f),
                    PathNode.CurveTo(172.0f, 78.20914f, 170.20914f, 80.0f, 168.0f, 80.0f),
                    PathNode.CurveTo(165.79086f, 80.0f, 164.0f, 78.20914f, 164.0f, 76.0f),
                    PathNode.CurveTo(164.0f, 49.490334f, 142.50967f, 28.0f, 116.0f, 28.0f),
                    PathNode.CurveTo(89.49033f, 28.0f, 68.0f, 49.490334f, 68.0f, 76.0f),
                    PathNode.CurveTo(68.0f, 78.20914f, 66.20914f, 80.0f, 64.0f, 80.0f),
                    PathNode.CurveTo(61.79086f, 80.0f, 60.0f, 78.20914f, 60.0f, 76.0f),
                    PathNode.Close,
                    PathNode.MoveTo(196.0f, 124.0f),
                    PathNode.CurveTo(190.05989f, 123.99283f, 184.33035f, 126.19979f, 179.93f, 130.19f),
                    PathNode.CurveTo(179.23404f, 121.08303f, 173.42924f, 113.16046f, 164.95544f, 109.752266f),
                    PathNode.CurveTo(156.48163f, 106.34407f, 146.80782f, 108.04107f, 140.0f, 114.13f),
                    PathNode.LineTo(140.0f, 76.0f),
                    PathNode.CurveTo(140.0f, 62.745167f, 129.25484f, 52.0f, 116.0f, 52.0f),
                    PathNode.CurveTo(102.74516f, 52.0f, 92.0f, 62.745167f, 92.0f, 76.0f),
                    PathNode.LineTo(92.0f, 170.0f),
                    PathNode.LineTo(80.74f, 151.94f),
                    PathNode.CurveTo(73.94511f, 140.80922f, 59.505478f, 137.14119f, 48.222153f, 143.67966f),
                    PathNode.CurveTo(36.938835f, 150.21811f, 32.941402f, 164.57004f, 39.22f, 176.0f),
                    PathNode.LineTo(68.54f, 226.0f),
                    PathNode.CurveTo(69.72504f, 227.71918f, 72.03307f, 228.23764f, 73.839516f, 227.19041f),
                    PathNode.CurveTo(75.645966f, 226.1432f, 76.343f, 223.88268f, 75.44f, 222.0f),
                    PathNode.LineTo(46.13f, 172.0f),
                    PathNode.CurveTo(41.711723f, 164.34534f, 44.335335f, 154.55827f, 51.99f, 150.14f),
                    PathNode.CurveTo(59.644665f, 145.72173f, 69.431725f, 148.34534f, 73.85f, 156.0f),
                    PathNode.LineTo(73.92f, 156.12f),
                    PathNode.LineTo(92.6f, 186.12f),
                    PathNode.CurveTo(93.54273f, 187.6412f, 95.38121f, 188.35109f, 97.101654f, 187.85822f),
                    PathNode.CurveTo(98.82209f, 187.36533f, 100.005775f, 185.78964f, 100.0f, 184.0f),
                    PathNode.LineTo(100.0f, 76.0f),
                    PathNode.CurveTo(100.0f, 67.163445f, 107.163445f, 60.0f, 116.0f, 60.0f),
                    PathNode.CurveTo(124.836555f, 60.0f, 132.0f, 67.163445f, 132.0f, 76.0f),
                    PathNode.LineTo(132.0f, 144.0f),
                    PathNode.CurveTo(132.0f, 146.20914f, 133.79086f, 148.0f, 136.0f, 148.0f),
                    PathNode.CurveTo(138.20914f, 148.0f, 140.0f, 146.20914f, 140.0f, 144.0f),
                    PathNode.LineTo(140.0f, 132.0f),
                    PathNode.CurveTo(140.0f, 123.163445f, 147.16344f, 116.0f, 156.0f, 116.0f),
                    PathNode.CurveTo(164.83656f, 116.0f, 172.0f, 123.163445f, 172.0f, 132.0f),
                    PathNode.LineTo(172.0f, 152.0f),
                    PathNode.CurveTo(172.0f, 154.20914f, 173.79086f, 156.0f, 176.0f, 156.0f),
                    PathNode.CurveTo(178.20914f, 156.0f, 180.0f, 154.20914f, 180.0f, 152.0f),
                    PathNode.LineTo(180.0f, 148.0f),
                    PathNode.CurveTo(180.0f, 139.16344f, 187.16344f, 132.0f, 196.0f, 132.0f),
                    PathNode.CurveTo(204.83656f, 132.0f, 212.0f, 139.16344f, 212.0f, 148.0f),
                    PathNode.LineTo(212.0f, 184.0f),
                    PathNode.CurveTo(212.0f, 206.66f, 204.49f, 222.06f, 204.42f, 222.21f),
                    PathNode.CurveTo(203.94456f, 223.15936f, 203.86607f, 224.25879f, 204.20183f, 225.26605f),
                    PathNode.CurveTo(204.53758f, 226.27333f, 205.26006f, 227.10577f, 206.21f, 227.58f),
                    PathNode.CurveTo(206.76657f, 227.85538f, 207.37903f, 227.99908f, 208.0f, 228.0f),
                    PathNode.CurveTo(209.51566f, 228.00108f, 210.90175f, 227.14543f, 211.58f, 225.79f),
                    PathNode.CurveTo(211.92f, 225.1f, 220.0f, 208.66f, 220.0f, 184.0f),
                    PathNode.LineTo(220.0f, 148.0f),
                    PathNode.CurveTo(220.0f, 134.74516f, 209.25484f, 124.0f, 196.0f, 124.0f),
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
        return _handTap!!
    }

private var _handTap: ImageVector? = null
