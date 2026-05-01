package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FileC: ImageVector
    get() {
        if (_fileC != null) return _fileC!!
        _fileC = phosphorRegularIcon(
            name = "FileC",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(48.0f, 180.0f),
                    PathNode.CurveTo(48.0f, 191.0f, 55.18f, 200.0f, 64.0f, 200.0f),
                    PathNode.CurveTo(67.901276f, 199.9126f, 71.59573f, 198.22803f, 74.22f, 195.34f),
                    PathNode.CurveTo(77.28715f, 192.21608f, 82.29563f, 192.13776f, 85.458954f, 195.16426f),
                    PathNode.CurveTo(88.62228f, 198.19077f, 88.76534f, 203.19781f, 85.78f, 206.4f),
                    PathNode.CurveTo(80.1501f, 212.4604f, 72.27162f, 215.93301f, 64.0f, 216.0f),
                    PathNode.CurveTo(46.35f, 216.0f, 32.0f, 199.85f, 32.0f, 180.0f),
                    PathNode.CurveTo(32.0f, 160.15f, 46.35f, 144.0f, 64.0f, 144.0f),
                    PathNode.CurveTo(72.27162f, 144.06699f, 80.1501f, 147.5396f, 85.78f, 153.6f),
                    PathNode.CurveTo(88.76534f, 156.80219f, 88.62228f, 161.80923f, 85.458954f, 164.83574f),
                    PathNode.CurveTo(82.29563f, 167.86224f, 77.28715f, 167.78392f, 74.22f, 164.66f),
                    PathNode.CurveTo(71.59573f, 161.77197f, 67.901276f, 160.0874f, 64.0f, 160.0f),
                    PathNode.CurveTo(55.18f, 160.0f, 48.0f, 169.0f, 48.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 216.0f),
                    PathNode.CurveTo(216.0f, 224.83656f, 208.83656f, 232.0f, 200.0f, 232.0f),
                    PathNode.LineTo(120.0f, 232.0f),
                    PathNode.CurveTo(115.58172f, 232.0f, 112.0f, 228.41827f, 112.0f, 224.0f),
                    PathNode.CurveTo(112.0f, 219.58173f, 115.58172f, 216.0f, 120.0f, 216.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(147.58173f, 96.0f, 144.0f, 92.41828f, 144.0f, 88.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 116.41828f, 52.418278f, 120.0f, 48.0f, 120.0f),
                    PathNode.CurveTo(43.581722f, 120.0f, 40.0f, 116.41828f, 40.0f, 112.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(154.12238f, 23.998331f, 156.15842f, 24.840092f, 157.66f, 26.34f),
                    PathNode.LineTo(213.66f, 82.34f),
                    PathNode.CurveTo(215.15993f, 83.841576f, 216.00166f, 85.87763f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 51.31f),
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
        return _fileC!!
    }

private var _fileC: ImageVector? = null
