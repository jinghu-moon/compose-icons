package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileySticker: ImageVector
    get() {
        if (_smileySticker != null) return _smileySticker!!
        _smileySticker = phosphorThinIcon(
            name = "SmileySticker",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(88.71769f, 28.033808f, 53.09368f, 51.06334f, 36.93649f, 86.86901f),
                    PathNode.CurveTo(20.779293f, 122.674675f, 27.082022f, 164.62352f, 53.047768f, 194.10031f),
                    PathNode.CurveTo(79.01352f, 223.57709f, 119.83216f, 235.12126f, 157.39f, 223.61f),
                    PathNode.CurveTo(158.01796f, 223.42007f, 158.58855f, 223.07634f, 159.05f, 222.61f),
                    PathNode.LineTo(222.62f, 159.0f),
                    PathNode.CurveTo(223.08298f, 158.53984f, 223.42628f, 157.97336f, 223.62f, 157.35f),
                    PathNode.CurveTo(232.90022f, 127.02115f, 227.25328f, 94.08854f, 208.39932f, 68.58384f),
                    PathNode.CurveTo(189.54536f, 43.07914f, 159.71689f, 28.022367f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.25f, 154.1f),
                    PathNode.LineTo(154.1f, 216.25f),
                    PathNode.CurveTo(113.8038f, 228.12909f, 70.58296f, 211.16399f, 49.126762f, 175.04573f),
                    PathNode.CurveTo(27.670563f, 138.92749f, 33.44466f, 92.85672f, 63.150692f, 63.150692f),
                    PathNode.CurveTo(92.85672f, 33.44466f, 138.92749f, 27.670563f, 175.04573f, 49.126762f),
                    PathNode.CurveTo(211.16399f, 70.58296f, 228.12909f, 113.8038f, 216.25f, 154.1f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 108.0f),
                    PathNode.CurveTo(84.0f, 103.58172f, 87.58172f, 100.0f, 92.0f, 100.0f),
                    PathNode.CurveTo(96.41828f, 100.0f, 100.0f, 103.58172f, 100.0f, 108.0f),
                    PathNode.CurveTo(100.0f, 112.41828f, 96.41828f, 116.0f, 92.0f, 116.0f),
                    PathNode.CurveTo(87.58172f, 116.0f, 84.0f, 112.41828f, 84.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(172.0f, 108.0f),
                    PathNode.CurveTo(172.0f, 112.41828f, 168.41827f, 116.0f, 164.0f, 116.0f),
                    PathNode.CurveTo(159.58173f, 116.0f, 156.0f, 112.41828f, 156.0f, 108.0f),
                    PathNode.CurveTo(156.0f, 103.58172f, 159.58173f, 100.0f, 164.0f, 100.0f),
                    PathNode.CurveTo(168.41827f, 100.0f, 172.0f, 103.58172f, 172.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(171.46f, 154.0f),
                    PathNode.CurveTo(161.91f, 170.52f, 146.07f, 180.0f, 128.0f, 180.0f),
                    PathNode.CurveTo(109.93f, 180.0f, 94.09f, 170.52f, 84.54f, 154.0f),
                    PathNode.CurveTo(83.546394f, 152.1006f, 84.22671f, 149.75557f, 86.08256f, 148.68283f),
                    PathNode.CurveTo(87.938416f, 147.61008f, 90.31001f, 148.191f, 91.46f, 150.0f),
                    PathNode.CurveTo(99.67f, 164.19f, 112.65f, 172.0f, 128.0f, 172.0f),
                    PathNode.CurveTo(143.35f, 172.0f, 156.33f, 164.19f, 164.54f, 150.0f),
                    PathNode.CurveTo(165.22105f, 148.69809f, 166.56105f, 147.87433f, 168.0302f, 147.85446f),
                    PathNode.CurveTo(169.49936f, 147.83458f, 170.86115f, 148.62175f, 171.5772f, 149.90475f),
                    PathNode.CurveTo(172.29323f, 151.18776f, 172.24823f, 152.76006f, 171.46f, 154.0f),
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
        return _smileySticker!!
    }

private var _smileySticker: ImageVector? = null
