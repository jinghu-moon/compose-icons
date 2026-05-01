package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorLightIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(112.6f, 158.43f),
                    PathNode.CurveTo(135.51225f, 145.44322f, 146.79826f, 118.64916f, 140.08289f, 93.18288f),
                    PathNode.CurveTo(133.36754f, 67.71659f, 110.336815f, 49.9717f, 84.0f, 49.9717f),
                    PathNode.CurveTo(57.663185f, 49.9717f, 34.63246f, 67.71659f, 27.917109f, 93.18288f),
                    PathNode.CurveTo(21.201756f, 118.64916f, 32.487743f, 145.44322f, 55.4f, 158.43f),
                    PathNode.CurveTo(34.749733f, 165.01343f, 17.015455f, 178.54292f, 5.21f, 196.72f),
                    PathNode.CurveTo(3.398506f, 199.49521f, 4.179769f, 203.2135f, 6.955f, 205.025f),
                    PathNode.CurveTo(9.730231f, 206.83649f, 13.448506f, 206.05524f, 15.26f, 203.28f),
                    PathNode.CurveTo(30.388206f, 180.01991f, 56.253048f, 165.98808f, 84.0f, 165.98808f),
                    PathNode.CurveTo(111.74695f, 165.98808f, 137.61179f, 180.01991f, 152.74f, 203.28f),
                    PathNode.CurveTo(154.66124f, 205.74228f, 158.15007f, 206.31894f, 160.76146f, 204.60588f),
                    PathNode.CurveTo(163.37283f, 202.8928f, 164.23338f, 199.46294f, 162.74f, 196.72f),
                    PathNode.CurveTo(150.94708f, 178.55206f, 133.23181f, 165.02357f, 112.6f, 158.43f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 108.0f),
                    PathNode.CurveTo(38.0f, 82.5949f, 58.594906f, 62.0f, 84.0f, 62.0f),
                    PathNode.CurveTo(109.4051f, 62.0f, 130.0f, 82.5949f, 130.0f, 108.0f),
                    PathNode.CurveTo(130.0f, 133.4051f, 109.4051f, 154.0f, 84.0f, 154.0f),
                    PathNode.CurveTo(58.608604f, 153.96695f, 38.033054f, 133.39139f, 38.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(249.0f, 205.0f),
                    PathNode.CurveTo(246.22716f, 206.80948f, 242.51265f, 206.03078f, 240.7f, 203.26f),
                    PathNode.CurveTo(225.59782f, 179.99614f, 199.73595f, 165.96973f, 172.0f, 166.0f),
                    PathNode.CurveTo(168.6863f, 166.0f, 166.0f, 163.3137f, 166.0f, 160.0f),
                    PathNode.CurveTo(166.0f, 156.6863f, 168.6863f, 154.0f, 172.0f, 154.0f),
                    PathNode.CurveTo(190.52502f, 153.98134f, 207.23122f, 142.85214f, 214.38516f, 125.7642f),
                    PathNode.CurveTo(221.53912f, 108.67625f, 217.7447f, 88.96438f, 204.75838f, 75.75332f),
                    PathNode.CurveTo(191.77203f, 62.542255f, 172.12816f, 58.41024f, 154.92f, 65.27f),
                    PathNode.CurveTo(152.92592f, 66.086494f, 150.64714f, 65.771f, 148.94989f, 64.44347f),
                    PathNode.CurveTo(147.25264f, 63.11592f, 146.39758f, 60.980206f, 146.70976f, 58.84817f),
                    PathNode.CurveTo(147.02194f, 56.716137f, 148.45338f, 54.91522f, 150.46f, 54.13f),
                    PathNode.CurveTo(178.77867f, 42.839924f, 211.00415f, 55.400524f, 224.21278f, 82.87679f),
                    PathNode.CurveTo(237.42142f, 110.35306f, 227.10406f, 143.36522f, 200.6f, 158.43f),
                    PathNode.CurveTo(221.25026f, 165.01343f, 238.98454f, 178.54292f, 250.79f, 196.72f),
                    PathNode.CurveTo(252.57635f, 199.5018f, 251.7759f, 203.20448f, 249.0f, 205.0f),
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
        return _users!!
    }

private var _users: ImageVector? = null
