package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorThinIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(220.0f, 224.0f),
                    PathNode.CurveTo(220.0f, 226.20914f, 218.20914f, 228.0f, 216.0f, 228.0f),
                    PathNode.LineTo(40.0f, 228.0f),
                    PathNode.CurveTo(37.79086f, 228.0f, 36.0f, 226.20914f, 36.0f, 224.0f),
                    PathNode.CurveTo(36.0f, 221.79086f, 37.79086f, 220.0f, 40.0f, 220.0f),
                    PathNode.LineTo(216.0f, 220.0f),
                    PathNode.CurveTo(218.20914f, 220.0f, 220.0f, 221.79086f, 220.0f, 224.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 144.0f),
                    PathNode.LineTo(220.0f, 184.0f),
                    PathNode.CurveTo(220.0f, 190.62741f, 214.62741f, 196.0f, 208.0f, 196.0f),
                    PathNode.LineTo(48.0f, 196.0f),
                    PathNode.CurveTo(41.37258f, 196.0f, 36.0f, 190.62741f, 36.0f, 184.0f),
                    PathNode.LineTo(36.0f, 144.0f),
                    PathNode.CurveTo(36.0f, 137.37259f, 41.37258f, 132.0f, 48.0f, 132.0f),
                    PathNode.LineTo(109.37f, 132.0f),
                    PathNode.LineTo(92.63f, 53.87f),
                    PathNode.CurveTo(90.85747f, 45.602894f, 92.9155f, 36.97753f, 98.22967f, 30.401321f),
                    PathNode.CurveTo(103.54383f, 23.825113f, 111.545006f, 20.00235f, 120.0f, 20.0f),
                    PathNode.LineTo(136.0f, 20.0f),
                    PathNode.CurveTo(144.45674f, 19.99933f, 152.46075f, 23.820812f, 157.77719f, 30.397434f),
                    PathNode.CurveTo(163.09364f, 36.974056f, 165.1529f, 45.60118f, 163.38f, 53.87f),
                    PathNode.LineTo(146.63f, 132.0f),
                    PathNode.LineTo(208.0f, 132.0f),
                    PathNode.CurveTo(214.62741f, 132.0f, 220.0f, 137.37259f, 220.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(117.55f, 132.0f),
                    PathNode.LineTo(138.45f, 132.0f),
                    PathNode.LineTo(155.55f, 52.19f),
                    PathNode.CurveTo(156.8151f, 46.285347f, 155.34462f, 40.12521f, 151.5489f, 35.428616f),
                    PathNode.CurveTo(147.75319f, 30.732027f, 142.03867f, 28.001863f, 136.0f, 28.0f),
                    PathNode.LineTo(120.0f, 28.0f),
                    PathNode.CurveTo(113.95959f, 27.998844f, 108.24223f, 30.727726f, 104.444244f, 35.42473f),
                    PathNode.CurveTo(100.64625f, 40.121735f, 99.17453f, 46.283634f, 100.44f, 52.19f),
                    PathNode.Close,
                    PathNode.MoveTo(212.0f, 144.0f),
                    PathNode.CurveTo(212.0f, 141.79086f, 210.20914f, 140.0f, 208.0f, 140.0f),
                    PathNode.LineTo(48.0f, 140.0f),
                    PathNode.CurveTo(45.79086f, 140.0f, 44.0f, 141.79086f, 44.0f, 144.0f),
                    PathNode.LineTo(44.0f, 184.0f),
                    PathNode.CurveTo(44.0f, 186.20914f, 45.79086f, 188.0f, 48.0f, 188.0f),
                    PathNode.LineTo(208.0f, 188.0f),
                    PathNode.CurveTo(210.20914f, 188.0f, 212.0f, 186.20914f, 212.0f, 184.0f),
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null
