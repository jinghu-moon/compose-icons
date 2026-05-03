package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.WheelchairMotion: ImageVector
    get() {
        if (_wheelchairMotion != null) return _wheelchairMotion!!
        _wheelchairMotion = phosphorDuotoneIcon(
            name = "WheelchairMotion",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 48.0f),
                    PathNode.CurveTo(200.0f, 61.254833f, 189.25484f, 72.0f, 176.0f, 72.0f),
                    PathNode.CurveTo(162.74516f, 72.0f, 152.0f, 61.254833f, 152.0f, 48.0f),
                    PathNode.CurveTo(152.0f, 34.745167f, 162.74516f, 24.0f, 176.0f, 24.0f),
                    PathNode.CurveTo(189.25484f, 24.0f, 200.0f, 34.745167f, 200.0f, 48.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 0.2f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 80.0f),
                    PathNode.CurveTo(193.67311f, 80.0f, 208.0f, 65.67311f, 208.0f, 48.0f),
                    PathNode.CurveTo(208.0f, 30.326887f, 193.67311f, 16.0f, 176.0f, 16.0f),
                    PathNode.CurveTo(158.32689f, 16.0f, 144.0f, 30.326887f, 144.0f, 48.0f),
                    PathNode.CurveTo(144.0f, 65.67311f, 158.32689f, 80.0f, 176.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 32.0f),
                    PathNode.CurveTo(184.83656f, 32.0f, 192.0f, 39.163445f, 192.0f, 48.0f),
                    PathNode.CurveTo(192.0f, 56.836555f, 184.83656f, 64.0f, 176.0f, 64.0f),
                    PathNode.CurveTo(167.16344f, 64.0f, 160.0f, 56.836555f, 160.0f, 48.0f),
                    PathNode.CurveTo(160.0f, 39.163445f, 167.16344f, 32.0f, 176.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(168.0f, 168.0f),
                    PathNode.CurveTo(168.0f, 203.34622f, 139.34622f, 232.0f, 104.0f, 232.0f),
                    PathNode.CurveTo(68.65378f, 232.0f, 40.0f, 203.34622f, 40.0f, 168.0f),
                    PathNode.CurveTo(40.0f, 132.65378f, 68.65378f, 104.0f, 104.0f, 104.0f),
                    PathNode.CurveTo(108.41828f, 104.0f, 112.0f, 107.58172f, 112.0f, 112.0f),
                    PathNode.CurveTo(112.0f, 116.41828f, 108.41828f, 120.0f, 104.0f, 120.0f),
                    PathNode.CurveTo(77.49033f, 120.0f, 56.0f, 141.49033f, 56.0f, 168.0f),
                    PathNode.CurveTo(56.0f, 194.50967f, 77.49033f, 216.0f, 104.0f, 216.0f),
                    PathNode.CurveTo(130.50967f, 216.0f, 152.0f, 194.50967f, 152.0f, 168.0f),
                    PathNode.CurveTo(152.0f, 163.58173f, 155.58173f, 160.0f, 160.0f, 160.0f),
                    PathNode.CurveTo(164.41827f, 160.0f, 168.0f, 163.58173f, 168.0f, 168.0f),
                    PathNode.Close,
                    PathNode.MoveTo(206.19f, 130.93f),
                    PathNode.CurveTo(207.70647f, 132.78464f, 208.31195f, 135.22125f, 207.84f, 137.57f),
                    PathNode.LineTo(191.84f, 217.57f),
                    PathNode.CurveTo(191.09203f, 221.30725f, 187.81137f, 223.9979f, 184.0f, 224.0f),
                    PathNode.CurveTo(183.46925f, 224.00076f, 182.93982f, 223.94716f, 182.42f, 223.84f),
                    PathNode.CurveTo(178.09154f, 222.97076f, 175.28546f, 218.75941f, 176.15f, 214.43f),
                    PathNode.LineTo(190.24f, 144.0f),
                    PathNode.LineTo(128.0f, 144.0f),
                    PathNode.CurveTo(125.13977f, 144.00423f, 122.49489f, 142.4811f, 121.06294f, 140.0051f),
                    PathNode.CurveTo(119.631004f, 137.52913f, 119.62988f, 134.47704f, 121.06f, 132.0f),
                    PathNode.LineTo(141.12f, 97.1f),
                    PathNode.CurveTo(112.60696f, 82.20652f, 77.949875f, 85.81795f, 53.12f, 106.27f),
                    PathNode.CurveTo(50.958687f, 108.33503f, 47.826393f, 109.022835f, 44.998737f, 108.05331f),
                    PathNode.CurveTo(42.17108f, 107.08377f, 40.11984f, 104.61867f, 39.680374f, 101.661896f),
                    PathNode.CurveTo(39.24091f, 98.70512f, 40.486546f, 95.75f, 42.91f, 94.0f),
                    PathNode.CurveTo(75.265274f, 67.30058f, 121.20938f, 64.70089f, 156.37f, 87.58f),
                    PathNode.CurveTo(159.92743f, 89.89694f, 161.05551f, 94.58922f, 158.94f, 98.27f),
                    PathNode.LineTo(141.82f, 128.0f),
                    PathNode.LineTo(200.0f, 128.0f),
                    PathNode.CurveTo(202.39821f, 127.99949f, 204.67014f, 129.07489f, 206.19f, 130.93f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 16.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _wheelchairMotion!!
    }

private var _wheelchairMotion: ImageVector? = null
