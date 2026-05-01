package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Bomb: ImageVector
    get() {
        if (_bomb != null) return _bomb!!
        _bomb = phosphorThinIcon(
            name = "Bomb",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(248.0f, 36.0f),
                    PathNode.LineTo(248.0f, 36.0f),
                    PathNode.CurveTo(245.79086f, 36.0f, 244.0f, 37.79086f, 244.0f, 40.0f),
                    PathNode.CurveTo(244.0f, 41.47f, 243.58f, 76.0f, 216.0f, 76.0f),
                    PathNode.CurveTo(202.06f, 76.0f, 192.92f, 63.21f, 183.25f, 49.67f),
                    PathNode.CurveTo(172.83f, 35.09f, 162.06f, 20.0f, 144.0f, 20.0f),
                    PathNode.CurveTo(129.14f, 20.0f, 118.18f, 27.79f, 112.29f, 42.51f),
                    PathNode.CurveTo(110.114655f, 48.118687f, 108.744385f, 54.007126f, 108.22f, 60.0f),
                    PathNode.LineTo(88.0f, 60.0f),
                    PathNode.CurveTo(81.37258f, 60.0f, 76.0f, 65.37258f, 76.0f, 72.0f),
                    PathNode.LineTo(76.0f, 84.08f),
                    PathNode.CurveTo(40.47654f, 100.8996f, 21.365414f, 140.10324f, 29.99726f, 178.44781f),
                    PathNode.CurveTo(38.629105f, 216.79239f, 72.69587f, 244.02502f, 112.0f, 244.0f),
                    PathNode.LineTo(113.51f, 244.0f),
                    PathNode.CurveTo(152.53615f, 243.33516f, 185.96245f, 215.87585f, 194.19125f, 177.72131f),
                    PathNode.CurveTo(202.42004f, 139.56677f, 183.28299f, 100.77111f, 148.0f, 84.08f),
                    PathNode.LineTo(148.0f, 72.0f),
                    PathNode.CurveTo(148.0f, 65.37258f, 142.62741f, 60.0f, 136.0f, 60.0f),
                    PathNode.LineTo(116.24f, 60.0f),
                    PathNode.CurveTo(117.16f, 50.58f, 121.69f, 28.0f, 144.0f, 28.0f),
                    PathNode.CurveTo(157.94f, 28.0f, 167.08f, 40.79f, 176.75f, 54.33f),
                    PathNode.CurveTo(187.17f, 68.91f, 197.94f, 84.0f, 216.0f, 84.0f),
                    PathNode.CurveTo(230.86f, 84.0f, 241.82f, 76.21f, 247.71f, 61.49f),
                    PathNode.CurveTo(250.3597f, 54.625076f, 251.81079f, 47.3561f, 252.0f, 40.0f),
                    PathNode.CurveTo(252.0f, 37.79086f, 250.20914f, 36.0f, 248.0f, 36.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 72.0f),
                    PathNode.LineTo(140.0f, 86.66f),
                    PathNode.CurveTo(140.00241f, 88.24829f, 140.9443f, 89.684685f, 142.4f, 90.32f),
                    PathNode.CurveTo(175.38446f, 104.7156f, 193.74979f, 140.27283f, 186.39688f, 175.50269f),
                    PathNode.CurveTo(179.04396f, 210.73254f, 147.989f, 235.97514f, 112.0f, 235.97514f),
                    PathNode.CurveTo(76.011f, 235.97514f, 44.95602f, 210.73254f, 37.60312f, 175.50269f),
                    PathNode.CurveTo(30.250221f, 140.27283f, 48.61554f, 104.7156f, 81.6f, 90.32f),
                    PathNode.CurveTo(83.055695f, 89.684685f, 83.99759f, 88.24829f, 84.0f, 86.66f),
                    PathNode.LineTo(84.0f, 72.0f),
                    PathNode.CurveTo(84.0f, 69.79086f, 85.79086f, 68.0f, 88.0f, 68.0f),
                    PathNode.LineTo(136.0f, 68.0f),
                    PathNode.CurveTo(138.20914f, 68.0f, 140.0f, 69.79086f, 140.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(104.66f, 204.05f),
                    PathNode.CurveTo(106.72637f, 204.37944f, 108.18964f, 206.24577f, 108.016525f, 208.33105f),
                    PathNode.CurveTo(107.84341f, 210.41634f, 106.0924f, 212.01582f, 104.0f, 212.0f),
                    PathNode.CurveTo(103.77914f, 211.99792f, 103.558655f, 211.98123f, 103.34f, 211.95f),
                    PathNode.CurveTo(81.258095f, 208.02895f, 63.971058f, 190.74191f, 60.05f, 168.66f),
                    PathNode.CurveTo(59.685493f, 166.47847f, 61.15847f, 164.4145f, 63.34f, 164.05f),
                    PathNode.CurveTo(65.52152f, 163.68549f, 67.585495f, 165.15848f, 67.95f, 167.34f),
                    PathNode.CurveTo(71.26847f, 186.06894f, 85.93107f, 200.73154f, 104.66f, 204.05f),
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
        return _bomb!!
    }

private var _bomb: ImageVector? = null
