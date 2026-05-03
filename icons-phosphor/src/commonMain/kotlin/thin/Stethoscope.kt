package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorThinIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 160.0f),
                    PathNode.CurveTo(216.0f, 164.41827f, 212.41827f, 168.0f, 208.0f, 168.0f),
                    PathNode.CurveTo(203.58173f, 168.0f, 200.0f, 164.41827f, 200.0f, 160.0f),
                    PathNode.CurveTo(200.0f, 155.58173f, 203.58173f, 152.0f, 208.0f, 152.0f),
                    PathNode.CurveTo(212.41827f, 152.0f, 216.0f, 155.58173f, 216.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(211.83f, 195.79f),
                    PathNode.CurveTo(209.83617f, 218.52066f, 190.81792f, 235.96817f, 168.0f, 236.0f),
                    PathNode.LineTo(144.0f, 236.0f),
                    PathNode.CurveTo(119.71089f, 235.97244f, 100.02756f, 216.28911f, 100.0f, 192.0f),
                    PathNode.LineTo(100.0f, 147.85f),
                    PathNode.CurveTo(68.4922f, 145.7448f, 44.008694f, 119.57805f, 44.0f, 88.0f),
                    PathNode.LineTo(44.0f, 40.0f),
                    PathNode.CurveTo(44.0f, 37.79086f, 45.79086f, 36.0f, 48.0f, 36.0f),
                    PathNode.LineTo(72.0f, 36.0f),
                    PathNode.CurveTo(74.20914f, 36.0f, 76.0f, 37.79086f, 76.0f, 40.0f),
                    PathNode.CurveTo(76.0f, 42.20914f, 74.20914f, 44.0f, 72.0f, 44.0f),
                    PathNode.LineTo(52.0f, 44.0f),
                    PathNode.LineTo(52.0f, 88.0f),
                    PathNode.CurveTo(51.998775f, 101.91164f, 57.571945f, 115.2437f, 67.47359f, 125.01567f),
                    PathNode.CurveTo(77.37522f, 134.78764f, 90.77958f, 140.1846f, 104.69f, 140.0f),
                    PathNode.CurveTo(133.0f, 139.63f, 156.0f, 115.93f, 156.0f, 87.17f),
                    PathNode.LineTo(156.0f, 44.0f),
                    PathNode.LineTo(136.0f, 44.0f),
                    PathNode.CurveTo(133.79086f, 44.0f, 132.0f, 42.20914f, 132.0f, 40.0f),
                    PathNode.CurveTo(132.0f, 37.79086f, 133.79086f, 36.0f, 136.0f, 36.0f),
                    PathNode.LineTo(160.0f, 36.0f),
                    PathNode.CurveTo(162.20914f, 36.0f, 164.0f, 37.79086f, 164.0f, 40.0f),
                    PathNode.LineTo(164.0f, 87.17f),
                    PathNode.CurveTo(164.0f, 119.17f, 139.16f, 145.76f, 108.0f, 147.86f),
                    PathNode.LineTo(108.0f, 192.0f),
                    PathNode.CurveTo(108.0f, 211.88223f, 124.11775f, 228.0f, 144.0f, 228.0f),
                    PathNode.LineTo(168.0f, 228.0f),
                    PathNode.CurveTo(186.42006f, 227.97488f, 201.85837f, 214.06746f, 203.8f, 195.75f),
                    PathNode.CurveTo(184.81427f, 193.62733f, 170.79279f, 177.04424f, 171.85577f, 157.9698f),
                    PathNode.CurveTo(172.91875f, 138.89539f, 188.69598f, 123.972916f, 207.8f, 123.972916f),
                    PathNode.CurveTo(226.90402f, 123.972916f, 242.68124f, 138.89539f, 243.74425f, 157.9698f),
                    PathNode.CurveTo(244.8072f, 177.04424f, 230.78575f, 193.62733f, 211.8f, 195.75f),
                    PathNode.Close,
                    PathNode.MoveTo(236.0f, 160.0f),
                    PathNode.CurveTo(236.0f, 144.53603f, 223.46397f, 132.0f, 208.0f, 132.0f),
                    PathNode.CurveTo(192.53603f, 132.0f, 180.0f, 144.53603f, 180.0f, 160.0f),
                    PathNode.CurveTo(180.0f, 175.46397f, 192.53603f, 188.0f, 208.0f, 188.0f),
                    PathNode.CurveTo(223.46397f, 188.0f, 236.0f, 175.46397f, 236.0f, 160.0f),
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
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
