package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileAudio: ImageVector
    get() {
        if (_fileAudio != null) return _fileAudio!!
        _fileAudio = phosphorDuotoneIcon(
            name = "FileAudio",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(72.0f, 160.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.LineTo(96.0f, 224.0f),
                    PathNode.LineTo(72.0f, 200.0f),
                    PathNode.LineTo(48.0f, 200.0f),
                    PathNode.LineTo(48.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 32.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.LineTo(208.0f, 88.0f),
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
                    PathNode.MoveTo(99.06f, 128.61f),
                    PathNode.CurveTo(96.07096f, 127.369934f, 92.62924f, 128.05275f, 90.34f, 130.34f),
                    PathNode.LineTo(68.69f, 152.0f),
                    PathNode.LineTo(48.0f, 152.0f),
                    PathNode.CurveTo(43.581722f, 152.0f, 40.0f, 155.58173f, 40.0f, 160.0f),
                    PathNode.LineTo(40.0f, 200.0f),
                    PathNode.CurveTo(40.0f, 204.41827f, 43.581722f, 208.0f, 48.0f, 208.0f),
                    PathNode.LineTo(68.69f, 208.0f),
                    PathNode.LineTo(90.34f, 229.66f),
                    PathNode.CurveTo(92.62809f, 231.95064f, 96.07126f, 232.63632f, 99.062325f, 231.39697f),
                    PathNode.CurveTo(102.05338f, 230.15764f, 104.00255f, 227.23764f, 104.0f, 224.0f),
                    PathNode.LineTo(104.0f, 136.0f),
                    PathNode.CurveTo(103.99934f, 132.76433f, 102.04962f, 129.84764f, 99.06f, 128.61f),
                    PathNode.Close,
                    PathNode.MoveTo(88.0f, 204.69f),
                    PathNode.LineTo(77.66f, 194.34f),
                    PathNode.CurveTo(76.158424f, 192.84007f, 74.12237f, 191.99834f, 72.0f, 192.0f),
                    PathNode.LineTo(56.0f, 192.0f),
                    PathNode.LineTo(56.0f, 168.0f),
                    PathNode.LineTo(72.0f, 168.0f),
                    PathNode.CurveTo(74.12237f, 168.00166f, 76.158424f, 167.15993f, 77.66f, 165.66f),
                    PathNode.LineTo(88.0f, 155.31f),
                    PathNode.Close,
                    PathNode.MoveTo(152.0f, 180.0f),
                    PathNode.CurveTo(151.9833f, 194.35666f, 144.37653f, 207.63431f, 132.0f, 214.91f),
                    PathNode.CurveTo(128.2193f, 216.79239f, 123.626595f, 215.4116f, 121.51073f, 211.75645f),
                    PathNode.CurveTo(119.39486f, 208.10127f, 120.48479f, 203.43102f, 124.0f, 201.09f),
                    PathNode.CurveTo(131.46219f, 196.6853f, 136.04123f, 188.66518f, 136.04123f, 180.0f),
                    PathNode.CurveTo(136.04123f, 171.33482f, 131.46219f, 163.3147f, 124.0f, 158.91f),
                    PathNode.CurveTo(120.48479f, 156.56898f, 119.39486f, 151.89873f, 121.51073f, 148.24355f),
                    PathNode.CurveTo(123.626595f, 144.5884f, 128.2193f, 143.20761f, 132.0f, 145.09f),
                    PathNode.CurveTo(144.37653f, 152.36569f, 151.9833f, 165.64334f, 152.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(213.66f, 82.34f),
                    PathNode.LineTo(157.66f, 26.34f),
                    PathNode.CurveTo(156.15842f, 24.840092f, 154.12238f, 23.998331f, 152.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 120.0f),
                    PathNode.CurveTo(40.0f, 124.41828f, 43.581722f, 128.0f, 48.0f, 128.0f),
                    PathNode.CurveTo(52.418278f, 128.0f, 56.0f, 124.41828f, 56.0f, 120.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(144.0f, 92.41828f, 147.58173f, 96.0f, 152.0f, 96.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.LineTo(168.0f, 216.0f),
                    PathNode.CurveTo(163.58173f, 216.0f, 160.0f, 219.58173f, 160.0f, 224.0f),
                    PathNode.CurveTo(160.0f, 228.41827f, 163.58173f, 232.0f, 168.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.00166f, 85.87763f, 215.15993f, 83.841576f, 213.66f, 82.34f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 51.31f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
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
        return _fileAudio!!
    }

private var _fileAudio: ImageVector? = null
