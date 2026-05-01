package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileDoc: ImageVector
    get() {
        if (_fileDoc != null) return _fileDoc!!
        _fileDoc = phosphorDuotoneIcon(
            name = "FileDoc",
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
                    PathNode.MoveTo(52.0f, 144.0f),
                    PathNode.LineTo(36.0f, 144.0f),
                    PathNode.CurveTo(31.581722f, 144.0f, 28.0f, 147.58173f, 28.0f, 152.0f),
                    PathNode.LineTo(28.0f, 208.0f),
                    PathNode.CurveTo(28.0f, 212.41827f, 31.581722f, 216.0f, 36.0f, 216.0f),
                    PathNode.LineTo(52.0f, 216.0f),
                    PathNode.CurveTo(71.88225f, 216.0f, 88.0f, 199.88223f, 88.0f, 180.0f),
                    PathNode.CurveTo(88.0f, 160.11777f, 71.88225f, 144.0f, 52.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(52.0f, 200.0f),
                    PathNode.LineTo(44.0f, 200.0f),
                    PathNode.LineTo(44.0f, 160.0f),
                    PathNode.LineTo(52.0f, 160.0f),
                    PathNode.CurveTo(63.045696f, 160.0f, 72.0f, 168.9543f, 72.0f, 180.0f),
                    PathNode.CurveTo(72.0f, 191.0457f, 63.045696f, 200.0f, 52.0f, 200.0f),
                    PathNode.Close,
                    PathNode.MoveTo(221.53f, 195.09f),
                    PathNode.CurveTo(224.72185f, 198.1443f, 224.83376f, 203.20766f, 221.78f, 206.4f),
                    PathNode.CurveTo(216.1501f, 212.4604f, 208.27162f, 215.93301f, 200.0f, 216.0f),
                    PathNode.CurveTo(182.35f, 216.0f, 168.0f, 199.85f, 168.0f, 180.0f),
                    PathNode.CurveTo(168.0f, 160.15f, 182.35f, 144.0f, 200.0f, 144.0f),
                    PathNode.CurveTo(208.27162f, 144.06699f, 216.1501f, 147.5396f, 221.78f, 153.6f),
                    PathNode.CurveTo(224.76535f, 156.80219f, 224.62227f, 161.80923f, 221.45895f, 164.83574f),
                    PathNode.CurveTo(218.29561f, 167.86224f, 213.28716f, 167.78392f, 210.22f, 164.66f),
                    PathNode.CurveTo(207.59573f, 161.77197f, 203.90126f, 160.0874f, 200.0f, 160.0f),
                    PathNode.CurveTo(191.18f, 160.0f, 184.0f, 169.0f, 184.0f, 180.0f),
                    PathNode.CurveTo(184.0f, 191.0f, 191.18f, 200.0f, 200.0f, 200.0f),
                    PathNode.CurveTo(203.90288f, 199.91965f, 207.6f, 198.23387f, 210.22f, 195.34f),
                    PathNode.CurveTo(213.27429f, 192.14816f, 218.33765f, 192.03624f, 221.53f, 195.09f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 144.0f),
                    PathNode.CurveTo(110.36f, 144.0f, 96.0f, 160.15f, 96.0f, 180.0f),
                    PathNode.CurveTo(96.0f, 199.85f, 110.36f, 216.0f, 128.0f, 216.0f),
                    PathNode.CurveTo(145.64f, 216.0f, 160.0f, 199.85f, 160.0f, 180.0f),
                    PathNode.CurveTo(160.0f, 160.15f, 145.64f, 144.0f, 128.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 200.0f),
                    PathNode.CurveTo(119.18f, 200.0f, 112.0f, 191.0f, 112.0f, 180.0f),
                    PathNode.CurveTo(112.0f, 169.0f, 119.18f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(136.82f, 160.0f, 144.0f, 169.0f, 144.0f, 180.0f),
                    PathNode.CurveTo(144.0f, 191.0f, 136.82f, 200.0f, 128.0f, 200.0f),
                    PathNode.Close,
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
        return _fileDoc!!
    }

private var _fileDoc: ImageVector? = null
