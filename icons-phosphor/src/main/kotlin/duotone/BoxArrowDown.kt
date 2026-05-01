package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.BoxArrowDown: ImageVector
    get() {
        if (_boxArrowDown != null) return _boxArrowDown!!
        _boxArrowDown = phosphorDuotoneIcon(
            name = "BoxArrowDown",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 72.0f),
                    PathNode.LineTo(216.0f, 208.0f),
                    PathNode.CurveTo(216.0f, 212.41827f, 212.41827f, 216.0f, 208.0f, 216.0f),
                    PathNode.LineTo(48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 72.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(223.16f, 68.42f),
                    PathNode.LineTo(207.16f, 36.42f),
                    PathNode.CurveTo(205.80348f, 33.70914f, 203.03131f, 31.99783f, 200.0f, 32.0f),
                    PathNode.LineTo(56.0f, 32.0f),
                    PathNode.CurveTo(52.96868f, 31.99783f, 50.196514f, 33.70914f, 48.84f, 36.42f),
                    PathNode.LineTo(32.84f, 68.42f),
                    PathNode.CurveTo(32.288567f, 69.53291f, 32.001125f, 70.757965f, 32.0f, 72.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(223.99887f, 70.757965f, 223.71143f, 69.53291f, 223.16f, 68.42f),
                    PathNode.Close,
                    PathNode.MoveTo(60.94f, 48.0f),
                    PathNode.LineTo(195.06f, 48.0f),
                    PathNode.LineTo(203.06f, 64.0f),
                    PathNode.LineTo(52.94f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 208.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(48.0f, 80.0f),
                    PathNode.LineTo(208.0f, 80.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(165.66f, 146.34f),
                    PathNode.CurveTo(167.16223f, 147.84055f, 168.00629f, 149.87672f, 168.00629f, 152.0f),
                    PathNode.CurveTo(168.00629f, 154.12328f, 167.16223f, 156.15945f, 165.66f, 157.66f),
                    PathNode.LineTo(133.66f, 189.66f),
                    PathNode.CurveTo(132.15945f, 191.16223f, 130.12328f, 192.00629f, 128.0f, 192.00629f),
                    PathNode.CurveTo(125.876724f, 192.00629f, 123.840546f, 191.16223f, 122.34f, 189.66f),
                    PathNode.LineTo(90.34f, 157.66f),
                    PathNode.CurveTo(87.214066f, 154.53407f, 87.214066f, 149.46593f, 90.34f, 146.34f),
                    PathNode.CurveTo(93.465935f, 143.21407f, 98.534065f, 143.21407f, 101.66f, 146.34f),
                    PathNode.LineTo(120.0f, 164.69f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 99.58172f, 123.58172f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(132.41827f, 96.0f, 136.0f, 99.58172f, 136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 164.69f),
                    PathNode.LineTo(154.34f, 146.34f),
                    PathNode.CurveTo(155.84055f, 144.83777f, 157.87672f, 143.99371f, 160.0f, 143.99371f),
                    PathNode.CurveTo(162.12328f, 143.99371f, 164.15945f, 144.83777f, 165.66f, 146.34f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _boxArrowDown!!
    }

private var _boxArrowDown: ImageVector? = null
