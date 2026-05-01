package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Stethoscope: ImageVector
    get() {
        if (_stethoscope != null) return _stethoscope!!
        _stethoscope = phosphorFillIcon(
            name = "Stethoscope",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(240.0f, 160.0f),
                    PathNode.CurveTo(240.00096f, 143.36101f, 227.25029f, 129.49762f, 210.6693f, 128.10966f),
                    PathNode.CurveTo(194.0883f, 126.72172f, 179.21028f, 138.2724f, 176.445f, 154.68f),
                    PathNode.CurveTo(173.67973f, 171.08759f, 183.95001f, 186.87663f, 200.07f, 191.0f),
                    PathNode.CurveTo(200.02579f, 191.33154f, 200.00241f, 191.66553f, 200.0f, 192.0f),
                    PathNode.CurveTo(200.0f, 209.67311f, 185.67311f, 224.0f, 168.0f, 224.0f),
                    PathNode.LineTo(144.0f, 224.0f),
                    PathNode.CurveTo(126.32689f, 224.0f, 112.0f, 209.67311f, 112.0f, 192.0f),
                    PathNode.LineTo(112.0f, 151.48f),
                    PathNode.CurveTo(143.47f, 147.48f, 168.0f, 120.01f, 168.0f, 87.17f),
                    PathNode.LineTo(168.0f, 40.0f),
                    PathNode.CurveTo(168.0f, 35.581722f, 164.41827f, 32.0f, 160.0f, 32.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.CurveTo(131.58173f, 32.0f, 128.0f, 35.581722f, 128.0f, 40.0f),
                    PathNode.CurveTo(128.0f, 44.418278f, 131.58173f, 48.0f, 136.0f, 48.0f),
                    PathNode.LineTo(152.0f, 48.0f),
                    PathNode.LineTo(152.0f, 87.17f),
                    PathNode.CurveTo(152.0f, 113.75f, 130.75f, 135.66f, 104.64f, 136.0f),
                    PathNode.CurveTo(91.79908f, 136.17123f, 79.42503f, 131.18979f, 70.284386f, 122.16942f),
                    PathNode.CurveTo(61.143745f, 113.14905f, 55.99886f, 100.84206f, 56.0f, 88.0f),
                    PathNode.LineTo(56.0f, 48.0f),
                    PathNode.LineTo(72.0f, 48.0f),
                    PathNode.CurveTo(76.41828f, 48.0f, 80.0f, 44.418278f, 80.0f, 40.0f),
                    PathNode.CurveTo(80.0f, 35.581722f, 76.41828f, 32.0f, 72.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(43.581722f, 32.0f, 40.0f, 35.581722f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 88.0f),
                    PathNode.CurveTo(40.004047f, 120.24991f, 64.00304f, 147.45876f, 96.0f, 151.49f),
                    PathNode.LineTo(96.0f, 192.0f),
                    PathNode.CurveTo(96.02756f, 218.49825f, 117.501755f, 239.97244f, 144.0f, 240.0f),
                    PathNode.LineTo(168.0f, 240.0f),
                    PathNode.CurveTo(194.49825f, 239.97244f, 215.97244f, 218.49825f, 216.0f, 192.0f),
                    PathNode.CurveTo(215.99759f, 191.66553f, 215.97421f, 191.33154f, 215.93f, 191.0f),
                    PathNode.CurveTo(230.0922f, 187.37744f, 239.99915f, 174.61816f, 240.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 168.0f),
                    PathNode.CurveTo(203.58173f, 168.0f, 200.0f, 164.41827f, 200.0f, 160.0f),
                    PathNode.CurveTo(200.0f, 155.58173f, 203.58173f, 152.0f, 208.0f, 152.0f),
                    PathNode.CurveTo(212.41827f, 152.0f, 216.0f, 155.58173f, 216.0f, 160.0f),
                    PathNode.CurveTo(216.0f, 164.41827f, 212.41827f, 168.0f, 208.0f, 168.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _stethoscope!!
    }

private var _stethoscope: ImageVector? = null
