package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.SmileyWink: ImageVector
    get() {
        if (_smileyWink != null) return _smileyWink!!
        _smileyWink = phosphorThinIcon(
            name = "SmileyWink",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 28.0f),
                    PathNode.CurveTo(72.77152f, 28.0f, 28.0f, 72.77152f, 28.0f, 128.0f),
                    PathNode.CurveTo(28.0f, 183.22847f, 72.77152f, 228.0f, 128.0f, 228.0f),
                    PathNode.CurveTo(183.22847f, 228.0f, 228.0f, 183.22847f, 228.0f, 128.0f),
                    PathNode.CurveTo(227.93938f, 72.79665f, 183.20334f, 28.060623f, 128.0f, 28.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 220.0f),
                    PathNode.CurveTo(77.18981f, 220.0f, 36.0f, 178.8102f, 36.0f, 128.0f),
                    PathNode.CurveTo(36.0f, 77.18981f, 77.18981f, 36.0f, 128.0f, 36.0f),
                    PathNode.CurveTo(178.8102f, 36.0f, 220.0f, 77.18981f, 220.0f, 128.0f),
                    PathNode.CurveTo(219.94489f, 178.78735f, 178.78735f, 219.94489f, 128.0f, 220.0f),
                    PathNode.Close,
                    PathNode.MoveTo(84.0f, 108.0f),
                    PathNode.CurveTo(84.0f, 103.58172f, 87.58172f, 100.0f, 92.0f, 100.0f),
                    PathNode.CurveTo(96.41828f, 100.0f, 100.0f, 103.58172f, 100.0f, 108.0f),
                    PathNode.CurveTo(100.0f, 112.41828f, 96.41828f, 116.0f, 92.0f, 116.0f),
                    PathNode.CurveTo(87.58172f, 116.0f, 84.0f, 112.41828f, 84.0f, 108.0f),
                    PathNode.Close,
                    PathNode.MoveTo(180.0f, 108.0f),
                    PathNode.CurveTo(180.0f, 110.20914f, 178.20914f, 112.0f, 176.0f, 112.0f),
                    PathNode.LineTo(152.0f, 112.0f),
                    PathNode.CurveTo(149.79086f, 112.0f, 148.0f, 110.20914f, 148.0f, 108.0f),
                    PathNode.CurveTo(148.0f, 105.79086f, 149.79086f, 104.0f, 152.0f, 104.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.CurveTo(178.20914f, 104.0f, 180.0f, 105.79086f, 180.0f, 108.0f),
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
        return _smileyWink!!
    }

private var _smileyWink: ImageVector? = null
