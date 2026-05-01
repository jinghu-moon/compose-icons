package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileCloud: ImageVector
    get() {
        if (_fileCloud != null) return _fileCloud!!
        _fileCloud = phosphorDuotoneIcon(
            name = "FileCloud",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 88.0f),
                    PathNode.LineTo(152.0f, 88.0f),
                    PathNode.LineTo(152.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 136.0f),
                    PathNode.CurveTo(88.318085f, 135.99643f, 71.027794f, 149.0642f, 65.66f, 168.0f),
                    PathNode.LineTo(65.66f, 168.0f),
                    PathNode.LineTo(60.0f, 168.0f),
                    PathNode.CurveTo(44.53603f, 168.0f, 32.0f, 180.53603f, 32.0f, 196.0f),
                    PathNode.CurveTo(32.0f, 211.46397f, 44.53603f, 224.0f, 60.0f, 224.0f),
                    PathNode.LineTo(108.0f, 224.0f),
                    PathNode.CurveTo(132.30052f, 224.0f, 152.0f, 204.30052f, 152.0f, 180.0f),
                    PathNode.CurveTo(152.0f, 155.69948f, 132.30052f, 136.0f, 108.0f, 136.0f),
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
                    PathNode.MoveTo(213.66f, 82.34f),
                    PathNode.LineTo(157.66f, 26.34f),
                    PathNode.CurveTo(156.15842f, 24.840092f, 154.12238f, 23.998331f, 152.0f, 24.0f),
                    PathNode.LineTo(56.0f, 24.0f),
                    PathNode.CurveTo(47.163445f, 24.0f, 40.0f, 31.163445f, 40.0f, 40.0f),
                    PathNode.LineTo(40.0f, 128.0f),
                    PathNode.CurveTo(40.0f, 132.41827f, 43.581722f, 136.0f, 48.0f, 136.0f),
                    PathNode.CurveTo(52.418278f, 136.0f, 56.0f, 132.41827f, 56.0f, 128.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(144.0f, 88.0f),
                    PathNode.CurveTo(144.0f, 92.41828f, 147.58173f, 96.0f, 152.0f, 96.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(200.0f, 216.0f),
                    PathNode.LineTo(176.0f, 216.0f),
                    PathNode.CurveTo(171.58173f, 216.0f, 168.0f, 219.58173f, 168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 228.41827f, 171.58173f, 232.0f, 176.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 88.0f),
                    PathNode.CurveTo(216.00166f, 85.87763f, 215.15993f, 83.841576f, 213.66f, 82.34f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 51.31f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 128.0f),
                    PathNode.CurveTo(87.00755f, 128.0f, 68.07402f, 140.62238f, 60.0f, 160.0f),
                    PathNode.CurveTo(40.11775f, 160.0f, 24.0f, 176.11777f, 24.0f, 196.0f),
                    PathNode.CurveTo(24.0f, 215.88223f, 40.11775f, 232.0f, 60.0f, 232.0f),
                    PathNode.LineTo(108.0f, 232.0f),
                    PathNode.CurveTo(136.71881f, 232.0f, 160.0f, 208.71881f, 160.0f, 180.0f),
                    PathNode.CurveTo(160.0f, 151.28119f, 136.71881f, 128.0f, 108.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(108.0f, 216.0f),
                    PathNode.LineTo(60.0f, 216.0f),
                    PathNode.CurveTo(49.683052f, 216.01677f, 41.04629f, 208.18315f, 40.059227f, 197.91351f),
                    PathNode.CurveTo(39.07216f, 187.64388f, 46.05873f, 178.30861f, 56.19f, 176.36f),
                    PathNode.CurveTo(56.090588f, 180.77827f, 59.59172f, 184.44058f, 64.01f, 184.54f),
                    PathNode.CurveTo(68.42828f, 184.6394f, 72.09059f, 181.13828f, 72.19f, 176.72f),
                    PathNode.CurveTo(72.37736f, 174.66458f, 72.731865f, 172.62784f, 73.25f, 170.63f),
                    PathNode.CurveTo(73.362755f, 170.30324f, 73.452965f, 169.96912f, 73.52f, 169.63f),
                    PathNode.CurveTo(78.8564f, 151.88965f, 96.78518f, 141.09554f, 114.960594f, 144.6805f),
                    PathNode.CurveTo(133.136f, 148.26544f, 145.62337f, 165.0589f, 143.82385f, 183.49689f),
                    PathNode.CurveTo(142.02435f, 201.93488f, 126.52559f, 215.99696f, 108.0f, 216.0f),
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
        return _fileCloud!!
    }

private var _fileCloud: ImageVector? = null
