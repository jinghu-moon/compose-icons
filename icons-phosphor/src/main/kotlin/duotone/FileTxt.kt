package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileTxt: ImageVector
    get() {
        if (_fileTxt != null) return _fileTxt!!
        _fileTxt = phosphorDuotoneIcon(
            name = "FileTxt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.LineTo(152.0f, 32.0f),
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
                    PathNode.MoveTo(48.0f, 120.0f),
                    PathNode.CurveTo(52.418278f, 120.0f, 56.0f, 116.41828f, 56.0f, 112.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(144.0f, 92.41828f, 147.58173f, 96.0f, 152.0f, 96.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 112.0f),
                    PathNode.CurveTo(200.0f, 116.41828f, 203.58173f, 120.0f, 208.0f, 120.0f),
                    PathNode.CurveTo(212.41827f, 120.0f, 216.0f, 116.41828f, 216.0f, 112.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.00166f, 85.87763f, 215.15993f, 83.841576f, 213.66f, 82.34f),
                    PathNode.LineTo(157.66f, 26.34f),
                    PathNode.CurveTo(156.15842f, 24.840092f, 154.12238f, 23.998331f, 152.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 112.0f),
                    PathNode.CurveTo(40.0f, 116.41828f, 43.581722f, 120.0f, 48.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 51.31f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(154.51f, 156.65f),
                    PathNode.LineTo(137.83f, 180.0f),
                    PathNode.LineTo(154.51f, 203.35f),
                    PathNode.CurveTo(156.84207f, 206.93817f, 155.93738f, 211.72618f, 152.45688f, 214.21608f),
                    PathNode.CurveTo(148.97638f, 216.70596f, 144.15276f, 216.0159f, 141.51f, 212.65f),
                    PathNode.LineTo(128.0f, 193.76f),
                    PathNode.LineTo(114.51f, 212.65f),
                    PathNode.CurveTo(112.90601f, 215.11792f, 110.07639f, 216.50574f, 107.14303f, 216.2632f),
                    PathNode.CurveTo(104.20967f, 216.02066f, 101.646416f, 214.18695f, 100.46955f, 211.4891f),
                    PathNode.CurveTo(99.29269f, 208.79124f, 99.692314f, 205.66505f, 101.51f, 203.35f),
                    PathNode.LineTo(118.17f, 180.0f),
                    PathNode.LineTo(101.49f, 156.65f),
                    PathNode.CurveTo(99.67232f, 154.33495f, 99.27269f, 151.20876f, 100.449554f, 148.5109f),
                    PathNode.CurveTo(101.62642f, 145.81305f, 104.189674f, 143.97934f, 107.12303f, 143.7368f),
                    PathNode.CurveTo(110.0564f, 143.49426f, 112.88602f, 144.88208f, 114.49f, 147.35f),
                    PathNode.LineTo(128.0f, 166.24f),
                    PathNode.LineTo(141.49f, 147.35f),
                    PathNode.CurveTo(144.13277f, 143.9841f, 148.95639f, 143.29404f, 152.43689f, 145.78392f),
                    PathNode.CurveTo(155.91739f, 148.27382f, 156.82207f, 153.06183f, 154.49f, 156.65f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 152.0f),
                    PathNode.CurveTo(92.0f, 156.41827f, 88.41828f, 160.0f, 84.0f, 160.0f),
                    PathNode.LineTo(72.0f, 160.0f),
                    PathNode.LineTo(72.0f, 208.0f),
                    PathNode.CurveTo(72.0f, 212.41827f, 68.41828f, 216.0f, 64.0f, 216.0f),
                    PathNode.CurveTo(59.581722f, 216.0f, 56.0f, 212.41827f, 56.0f, 208.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.LineTo(44.0f, 160.0f),
                    PathNode.CurveTo(39.581722f, 160.0f, 36.0f, 156.41827f, 36.0f, 152.0f),
                    PathNode.CurveTo(36.0f, 147.58173f, 39.581722f, 144.0f, 44.0f, 144.0f),
                    PathNode.LineTo(84.0f, 144.0f),
                    PathNode.CurveTo(88.41828f, 144.0f, 92.0f, 147.58173f, 92.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(220.0f, 152.0f),
                    PathNode.CurveTo(220.0f, 156.41827f, 216.41827f, 160.0f, 212.0f, 160.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.LineTo(200.0f, 208.0f),
                    PathNode.CurveTo(200.0f, 212.41827f, 196.41827f, 216.0f, 192.0f, 216.0f),
                    PathNode.CurveTo(187.58173f, 216.0f, 184.0f, 212.41827f, 184.0f, 208.0f),
                    PathNode.LineTo(184.0f, 160.0f),
                    PathNode.LineTo(172.0f, 160.0f),
                    PathNode.CurveTo(167.58173f, 160.0f, 164.0f, 156.41827f, 164.0f, 152.0f),
                    PathNode.CurveTo(164.0f, 147.58173f, 167.58173f, 144.0f, 172.0f, 144.0f),
                    PathNode.LineTo(212.0f, 144.0f),
                    PathNode.CurveTo(216.41827f, 144.0f, 220.0f, 147.58173f, 220.0f, 152.0f),
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
        return _fileTxt!!
    }

private var _fileTxt: ImageVector? = null
