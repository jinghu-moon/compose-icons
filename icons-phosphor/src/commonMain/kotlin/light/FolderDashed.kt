package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.FolderDashed: ImageVector
    get() {
        if (_folderDashed != null) return _folderDashed!!
        _folderDashed = phosphorLightIcon(
            name = "FolderDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(94.0f, 208.0f),
                    PathNode.CurveTo(94.0f, 211.3137f, 91.313705f, 214.0f, 88.0f, 214.0f),
                    PathNode.LineTo(39.38f, 214.0f),
                    PathNode.CurveTo(31.992716f, 213.99449f, 26.005514f, 208.00728f, 26.0f, 200.62f),
                    PathNode.LineTo(26.0f, 192.0f),
                    PathNode.CurveTo(26.0f, 188.6863f, 28.68629f, 186.0f, 32.0f, 186.0f),
                    PathNode.CurveTo(35.31371f, 186.0f, 38.0f, 188.6863f, 38.0f, 192.0f),
                    PathNode.LineTo(38.0f, 200.62f),
                    PathNode.CurveTo(38.01075f, 201.37766f, 38.622345f, 201.98926f, 39.38f, 202.0f),
                    PathNode.LineTo(88.0f, 202.0f),
                    PathNode.CurveTo(91.313705f, 202.0f, 94.0f, 204.6863f, 94.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 202.0f),
                    PathNode.LineTo(128.0f, 202.0f),
                    PathNode.CurveTo(124.686295f, 202.0f, 122.0f, 204.6863f, 122.0f, 208.0f),
                    PathNode.CurveTo(122.0f, 211.3137f, 124.686295f, 214.0f, 128.0f, 214.0f),
                    PathNode.LineTo(160.0f, 214.0f),
                    PathNode.CurveTo(163.3137f, 214.0f, 166.0f, 211.3137f, 166.0f, 208.0f),
                    PathNode.CurveTo(166.0f, 204.6863f, 163.3137f, 202.0f, 160.0f, 202.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 146.0f),
                    PathNode.CurveTo(220.6863f, 146.0f, 218.0f, 148.6863f, 218.0f, 152.0f),
                    PathNode.LineTo(218.0f, 200.89f),
                    PathNode.CurveTo(218.0f, 201.50304f, 217.50304f, 202.0f, 216.89f, 202.0f),
                    PathNode.LineTo(200.0f, 202.0f),
                    PathNode.CurveTo(196.6863f, 202.0f, 194.0f, 204.6863f, 194.0f, 208.0f),
                    PathNode.CurveTo(194.0f, 211.3137f, 196.6863f, 214.0f, 200.0f, 214.0f),
                    PathNode.LineTo(216.89f, 214.0f),
                    PathNode.CurveTo(224.12817f, 213.99449f, 229.99449f, 208.12817f, 230.0f, 200.89f),
                    PathNode.LineTo(230.0f, 152.0f),
                    PathNode.CurveTo(230.0f, 148.6863f, 227.3137f, 146.0f, 224.0f, 146.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 74.0f),
                    PathNode.LineTo(168.0f, 74.0f),
                    PathNode.CurveTo(164.6863f, 74.0f, 162.0f, 76.686295f, 162.0f, 80.0f),
                    PathNode.CurveTo(162.0f, 83.313705f, 164.6863f, 86.0f, 168.0f, 86.0f),
                    PathNode.LineTo(216.0f, 86.0f),
                    PathNode.CurveTo(217.10457f, 86.0f, 218.0f, 86.89543f, 218.0f, 88.0f),
                    PathNode.LineTo(218.0f, 112.0f),
                    PathNode.CurveTo(218.0f, 115.313705f, 220.6863f, 118.0f, 224.0f, 118.0f),
                    PathNode.CurveTo(227.3137f, 118.0f, 230.0f, 115.313705f, 230.0f, 112.0f),
                    PathNode.LineTo(230.0f, 88.0f),
                    PathNode.CurveTo(230.0f, 80.26801f, 223.73198f, 74.0f, 216.0f, 74.0f),
                    PathNode.Close,
                    PathNode.MoveTo(26.0f, 80.0f),
                    PathNode.LineTo(26.0f, 56.0f),
                    PathNode.CurveTo(26.0f, 48.268013f, 32.268013f, 42.0f, 40.0f, 42.0f),
                    PathNode.LineTo(92.69f, 42.0f),
                    PathNode.CurveTo(96.40445f, 41.993107f, 99.96804f, 43.468937f, 102.59f, 46.1f),
                    PathNode.LineTo(132.24f, 75.76f),
                    PathNode.CurveTo(133.95377f, 77.47589f, 134.46606f, 80.05473f, 133.5383f, 82.29539f),
                    PathNode.CurveTo(132.61052f, 84.53604f, 130.42514f, 85.99786f, 128.0f, 86.0f),
                    PathNode.LineTo(32.0f, 86.0f),
                    PathNode.CurveTo(28.68629f, 86.0f, 26.0f, 83.313705f, 26.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(38.0f, 74.0f),
                    PathNode.LineTo(113.51f, 74.0f),
                    PathNode.LineTo(94.1f, 54.59f),
                    PathNode.CurveTo(93.72665f, 54.214413f, 93.219574f, 54.00223f, 92.69f, 54.0f),
                    PathNode.LineTo(40.0f, 54.0f),
                    PathNode.CurveTo(38.89543f, 54.0f, 38.0f, 54.89543f, 38.0f, 56.0f),
                    PathNode.Close,
                    PathNode.MoveTo(32.0f, 158.0f),
                    PathNode.CurveTo(35.31371f, 158.0f, 38.0f, 155.3137f, 38.0f, 152.0f),
                    PathNode.LineTo(38.0f, 120.0f),
                    PathNode.CurveTo(38.0f, 116.686295f, 35.31371f, 114.0f, 32.0f, 114.0f),
                    PathNode.CurveTo(28.68629f, 114.0f, 26.0f, 116.686295f, 26.0f, 120.0f),
                    PathNode.LineTo(26.0f, 152.0f),
                    PathNode.CurveTo(26.0f, 155.3137f, 28.68629f, 158.0f, 32.0f, 158.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 12.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _folderDashed!!
    }

private var _folderDashed: ImageVector? = null
