package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Popsicle: ImageVector
    get() {
        if (_popsicle != null) return _popsicle!!
        _popsicle = phosphorThinIcon(
            name = "Popsicle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 12.0f),
                    PathNode.CurveTo(90.46063f, 12.038584f, 60.038586f, 42.460632f, 60.0f, 80.0f),
                    PathNode.LineTo(60.0f, 176.0f),
                    PathNode.CurveTo(60.0f, 182.62741f, 65.37258f, 188.0f, 72.0f, 188.0f),
                    PathNode.LineTo(108.0f, 188.0f),
                    PathNode.LineTo(108.0f, 232.0f),
                    PathNode.CurveTo(108.0f, 243.0457f, 116.95431f, 252.0f, 128.0f, 252.0f),
                    PathNode.CurveTo(139.0457f, 252.0f, 148.0f, 243.0457f, 148.0f, 232.0f),
                    PathNode.LineTo(148.0f, 188.0f),
                    PathNode.LineTo(184.0f, 188.0f),
                    PathNode.CurveTo(190.62741f, 188.0f, 196.0f, 182.62741f, 196.0f, 176.0f),
                    PathNode.LineTo(196.0f, 80.0f),
                    PathNode.CurveTo(195.96141f, 42.460632f, 165.53935f, 12.038584f, 128.0f, 12.0f),
                    PathNode.Close,
                    PathNode.MoveTo(140.0f, 232.0f),
                    PathNode.CurveTo(140.0f, 238.62741f, 134.62741f, 244.0f, 128.0f, 244.0f),
                    PathNode.CurveTo(121.37258f, 244.0f, 116.0f, 238.62741f, 116.0f, 232.0f),
                    PathNode.LineTo(116.0f, 188.0f),
                    PathNode.LineTo(140.0f, 188.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 176.0f),
                    PathNode.CurveTo(188.0f, 178.20914f, 186.20914f, 180.0f, 184.0f, 180.0f),
                    PathNode.LineTo(72.0f, 180.0f),
                    PathNode.CurveTo(69.79086f, 180.0f, 68.0f, 178.20914f, 68.0f, 176.0f),
                    PathNode.LineTo(68.0f, 80.0f),
                    PathNode.CurveTo(68.0f, 46.862915f, 94.862915f, 20.0f, 128.0f, 20.0f),
                    PathNode.CurveTo(161.13708f, 20.0f, 188.0f, 46.862915f, 188.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(116.0f, 72.0f),
                    PathNode.LineTo(116.0f, 152.0f),
                    PathNode.CurveTo(116.0f, 154.20914f, 114.20914f, 156.0f, 112.0f, 156.0f),
                    PathNode.CurveTo(109.79086f, 156.0f, 108.0f, 154.20914f, 108.0f, 152.0f),
                    PathNode.LineTo(108.0f, 72.0f),
                    PathNode.CurveTo(108.0f, 69.79086f, 109.79086f, 68.0f, 112.0f, 68.0f),
                    PathNode.CurveTo(114.20914f, 68.0f, 116.0f, 69.79086f, 116.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 72.0f),
                    PathNode.LineTo(148.0f, 152.0f),
                    PathNode.CurveTo(148.0f, 154.20914f, 146.20914f, 156.0f, 144.0f, 156.0f),
                    PathNode.CurveTo(141.79086f, 156.0f, 140.0f, 154.20914f, 140.0f, 152.0f),
                    PathNode.LineTo(140.0f, 72.0f),
                    PathNode.CurveTo(140.0f, 69.79086f, 141.79086f, 68.0f, 144.0f, 68.0f),
                    PathNode.CurveTo(146.20914f, 68.0f, 148.0f, 69.79086f, 148.0f, 72.0f),
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
        return _popsicle!!
    }

private var _popsicle: ImageVector? = null
