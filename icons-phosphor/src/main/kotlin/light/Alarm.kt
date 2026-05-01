package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Alarm: ImageVector
    get() {
        if (_alarm != null) return _alarm!!
        _alarm = phosphorLightIcon(
            name = "Alarm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 42.0f),
                    PathNode.CurveTo(76.085236f, 42.0f, 34.0f, 84.085236f, 34.0f, 136.0f),
                    PathNode.CurveTo(34.0f, 187.91476f, 76.085236f, 230.0f, 128.0f, 230.0f),
                    PathNode.CurveTo(179.91476f, 230.0f, 222.0f, 187.91476f, 222.0f, 136.0f),
                    PathNode.CurveTo(221.93938f, 84.11036f, 179.88963f, 42.060616f, 128.0f, 42.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 218.0f),
                    PathNode.CurveTo(82.712654f, 218.0f, 46.0f, 181.28735f, 46.0f, 136.0f),
                    PathNode.CurveTo(46.0f, 90.712654f, 82.712654f, 54.0f, 128.0f, 54.0f),
                    PathNode.CurveTo(173.28735f, 54.0f, 210.0f, 90.712654f, 210.0f, 136.0f),
                    PathNode.CurveTo(209.9449f, 181.26451f, 173.26451f, 217.9449f, 128.0f, 218.0f),
                    PathNode.Close,
                    PathNode.MoveTo(60.24f, 36.24f),
                    PathNode.LineTo(28.24f, 68.24f),
                    PathNode.CurveTo(26.744236f, 69.84522f, 24.491556f, 70.506f, 22.365688f, 69.96308f),
                    PathNode.CurveTo(20.239822f, 69.42017f, 18.579824f, 67.76018f, 18.036915f, 65.63431f),
                    PathNode.CurveTo(17.494007f, 63.508446f, 18.154774f, 61.255764f, 19.76f, 59.76f),
                    PathNode.LineTo(51.76f, 27.76f),
                    PathNode.CurveTo(53.255764f, 26.154774f, 55.508446f, 25.494007f, 57.63431f, 26.036915f),
                    PathNode.CurveTo(59.760178f, 26.579824f, 61.420174f, 28.239822f, 61.963085f, 30.365688f),
                    PathNode.CurveTo(62.505993f, 32.491554f, 61.845226f, 34.744236f, 60.24f, 36.24f),
                    PathNode.Close,
                    PathNode.MoveTo(236.24f, 68.24f),
                    PathNode.CurveTo(233.89746f, 70.57962f, 230.10254f, 70.57962f, 227.76f, 68.24f),
                    PathNode.LineTo(195.76f, 36.24f),
                    PathNode.CurveTo(193.55713f, 33.875923f, 193.62213f, 30.191923f, 195.90703f, 27.907026f),
                    PathNode.CurveTo(198.19193f, 25.62213f, 201.87592f, 25.557129f, 204.24f, 27.76f),
                    PathNode.LineTo(236.24f, 59.76f),
                    PathNode.CurveTo(238.57962f, 62.10254f, 238.57962f, 65.89746f, 236.24f, 68.24f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 130.0f),
                    PathNode.CurveTo(187.3137f, 130.0f, 190.0f, 132.6863f, 190.0f, 136.0f),
                    PathNode.CurveTo(190.0f, 139.3137f, 187.3137f, 142.0f, 184.0f, 142.0f),
                    PathNode.LineTo(128.0f, 142.0f),
                    PathNode.CurveTo(124.686295f, 142.0f, 122.0f, 139.3137f, 122.0f, 136.0f),
                    PathNode.LineTo(122.0f, 80.0f),
                    PathNode.CurveTo(122.0f, 76.686295f, 124.686295f, 74.0f, 128.0f, 74.0f),
                    PathNode.CurveTo(131.3137f, 74.0f, 134.0f, 76.686295f, 134.0f, 80.0f),
                    PathNode.LineTo(134.0f, 130.0f),
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
        return _alarm!!
    }

private var _alarm: ImageVector? = null
