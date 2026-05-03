package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorFillIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(144.0f, 48.0f),
                    PathNode.CurveTo(144.0f, 30.326887f, 158.32689f, 16.0f, 176.0f, 16.0f),
                    PathNode.CurveTo(193.67311f, 16.0f, 208.0f, 30.326887f, 208.0f, 48.0f),
                    PathNode.CurveTo(208.0f, 65.67311f, 193.67311f, 80.0f, 176.0f, 80.0f),
                    PathNode.CurveTo(158.32689f, 80.0f, 144.0f, 65.67311f, 144.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 160.0f),
                    PathNode.CurveTo(155.58173f, 160.0f, 152.0f, 163.58173f, 152.0f, 168.0f),
                    PathNode.CurveTo(152.0f, 194.50967f, 130.50967f, 216.0f, 104.0f, 216.0f),
                    PathNode.CurveTo(77.49033f, 216.0f, 56.0f, 194.50967f, 56.0f, 168.0f),
                    PathNode.CurveTo(56.0f, 141.49033f, 77.49033f, 120.0f, 104.0f, 120.0f),
                    PathNode.CurveTo(108.41828f, 120.0f, 112.0f, 116.41828f, 112.0f, 112.0f),
                    PathNode.CurveTo(112.0f, 107.58172f, 108.41828f, 104.0f, 104.0f, 104.0f),
                    PathNode.CurveTo(68.65378f, 104.0f, 40.0f, 132.65378f, 40.0f, 168.0f),
                    PathNode.CurveTo(40.0f, 203.34622f, 68.65378f, 232.0f, 104.0f, 232.0f),
                    PathNode.CurveTo(139.34622f, 232.0f, 168.0f, 203.34622f, 168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 163.58173f, 164.41827f, 160.0f, 160.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 128.0f),
                    PathNode.LineTo(141.82f, 128.0f),
                    PathNode.LineTo(158.94f, 98.22f),
                    PathNode.CurveTo(161.05551f, 94.539215f, 159.92743f, 89.84695f, 156.37f, 87.53f),
                    PathNode.CurveTo(121.19867f, 64.664986f, 75.25405f, 67.28495f, 42.91f, 94.0f),
                    PathNode.CurveTo(40.58615f, 95.780556f, 39.420475f, 98.68823f, 39.870834f, 101.58094f),
                    PathNode.CurveTo(40.321194f, 104.473656f, 42.315655f, 106.88934f, 45.070816f, 107.87915f),
                    PathNode.CurveTo(47.825974f, 108.86896f, 50.901745f, 108.27477f, 53.09f, 106.33f),
                    PathNode.CurveTo(77.91988f, 85.877945f, 112.57696f, 82.26652f, 141.09f, 97.16f),
                    PathNode.LineTo(121.06f, 132.0f),
                    PathNode.CurveTo(119.62988f, 134.47704f, 119.631004f, 137.52913f, 121.06294f, 140.0051f),
                    PathNode.CurveTo(122.49489f, 142.4811f, 125.13977f, 144.00423f, 128.0f, 144.0f),
                    PathNode.LineTo(190.24f, 144.0f),
                    PathNode.LineTo(176.16f, 214.43f),
                    PathNode.CurveTo(175.29546f, 218.75941f, 178.10153f, 222.97076f, 182.43f, 223.84f),
                    PathNode.CurveTo(182.94655f, 223.94649f, 183.4726f, 224.00009f, 184.0f, 224.0f),
                    PathNode.CurveTo(187.80762f, 223.99313f, 191.08276f, 221.30357f, 191.83f, 217.57f),
                    PathNode.LineTo(207.83f, 137.57f),
                    PathNode.CurveTo(208.29991f, 135.22215f, 207.69347f, 132.78726f, 206.17723f, 130.93408f),
                    PathNode.CurveTo(204.661f, 129.08092f, 202.39441f, 128.00432f, 200.0f, 128.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
