package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Receipt: ImageVector
    get() {
        if (_receipt != null) return _receipt!!
        _receipt = phosphorThinIcon(
            name = "Receipt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(180.0f, 104.0f),
                    PathNode.CurveTo(180.0f, 106.20914f, 178.20914f, 108.0f, 176.0f, 108.0f),
                    PathNode.LineTo(80.0f, 108.0f),
                    PathNode.CurveTo(77.79086f, 108.0f, 76.0f, 106.20914f, 76.0f, 104.0f),
                    PathNode.CurveTo(76.0f, 101.79086f, 77.79086f, 100.0f, 80.0f, 100.0f),
                    PathNode.LineTo(176.0f, 100.0f),
                    PathNode.CurveTo(178.20914f, 100.0f, 180.0f, 101.79086f, 180.0f, 104.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 132.0f),
                    PathNode.LineTo(80.0f, 132.0f),
                    PathNode.CurveTo(77.79086f, 132.0f, 76.0f, 133.79086f, 76.0f, 136.0f),
                    PathNode.CurveTo(76.0f, 138.20914f, 77.79086f, 140.0f, 80.0f, 140.0f),
                    PathNode.LineTo(176.0f, 140.0f),
                    PathNode.CurveTo(178.20914f, 140.0f, 180.0f, 138.20914f, 180.0f, 136.0f),
                    PathNode.CurveTo(180.0f, 133.79086f, 178.20914f, 132.0f, 176.0f, 132.0f),
                    PathNode.Close,
                    PathNode.MoveTo(228.0f, 56.0f),
                    PathNode.LineTo(228.0f, 208.0f),
                    PathNode.CurveTo(228.0f, 210.20914f, 226.20914f, 212.0f, 224.0f, 212.0f),
                    PathNode.CurveTo(223.37903f, 211.99908f, 222.76657f, 211.85538f, 222.21f, 211.58f),
                    PathNode.LineTo(192.0f, 196.47f),
                    PathNode.LineTo(161.79f, 211.58f),
                    PathNode.CurveTo(160.66327f, 212.14381f, 159.33673f, 212.14381f, 158.21f, 211.58f),
                    PathNode.LineTo(128.0f, 196.47f),
                    PathNode.LineTo(97.79f, 211.58f),
                    PathNode.CurveTo(96.66326f, 212.14381f, 95.33674f, 212.14381f, 94.21f, 211.58f),
                    PathNode.LineTo(64.0f, 196.47f),
                    PathNode.LineTo(33.79f, 211.58f),
                    PathNode.CurveTo(32.549583f, 212.2007f, 31.07615f, 212.1345f, 29.8964f, 211.40504f),
                    PathNode.CurveTo(28.716652f, 210.6756f, 27.999006f, 209.38705f, 28.0f, 208.0f),
                    PathNode.LineTo(28.0f, 56.0f),
                    PathNode.CurveTo(28.0f, 49.37258f, 33.37258f, 44.0f, 40.0f, 44.0f),
                    PathNode.LineTo(216.0f, 44.0f),
                    PathNode.CurveTo(222.62741f, 44.0f, 228.0f, 49.37258f, 228.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 56.0f),
                    PathNode.CurveTo(220.0f, 53.79086f, 218.20914f, 52.0f, 216.0f, 52.0f),
                    PathNode.LineTo(40.0f, 52.0f),
                    PathNode.CurveTo(37.79086f, 52.0f, 36.0f, 53.79086f, 36.0f, 56.0f),
                    PathNode.LineTo(36.0f, 201.53f),
                    PathNode.LineTo(62.21f, 188.42f),
                    PathNode.CurveTo(63.336735f, 187.85619f, 64.66326f, 187.85619f, 65.79f, 188.42f),
                    PathNode.LineTo(96.0f, 203.53f),
                    PathNode.LineTo(126.21f, 188.42f),
                    PathNode.CurveTo(127.33674f, 187.85619f, 128.66327f, 187.85619f, 129.79f, 188.42f),
                    PathNode.LineTo(160.0f, 203.53f),
                    PathNode.LineTo(190.21f, 188.42f),
                    PathNode.CurveTo(191.33673f, 187.85619f, 192.66327f, 187.85619f, 193.79f, 188.42f),
                    PathNode.LineTo(220.0f, 201.53f),
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
        return _receipt!!
    }

private var _receipt: ImageVector? = null
