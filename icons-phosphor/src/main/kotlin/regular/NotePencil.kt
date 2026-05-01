package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NotePencil: ImageVector
    get() {
        if (_notePencil != null) return _notePencil!!
        _notePencil = phosphorRegularIcon(
            name = "NotePencil",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(229.66f, 58.34f),
                    PathNode.LineTo(197.66f, 26.34f),
                    PathNode.CurveTo(196.15945f, 24.837784f, 194.12328f, 23.993708f, 192.0f, 23.993708f),
                    PathNode.CurveTo(189.87672f, 23.993708f, 187.84055f, 24.837784f, 186.34f, 26.34f),
                    PathNode.LineTo(90.34f, 122.34f),
                    PathNode.CurveTo(88.84009f, 123.841576f, 87.99833f, 125.87763f, 88.0f, 128.0f),
                    PathNode.LineTo(88.0f, 160.0f),
                    PathNode.CurveTo(88.0f, 164.41827f, 91.58172f, 168.0f, 96.0f, 168.0f),
                    PathNode.LineTo(128.0f, 168.0f),
                    PathNode.CurveTo(130.12238f, 168.00166f, 132.15842f, 167.15993f, 133.66f, 165.66f),
                    PathNode.LineTo(229.66f, 69.66f),
                    PathNode.CurveTo(231.16223f, 68.159454f, 232.00629f, 66.123276f, 232.00629f, 64.0f),
                    PathNode.CurveTo(232.00629f, 61.876724f, 231.16223f, 59.840546f, 229.66f, 58.34f),
                    PathNode.Close,
                    PathNode.MoveTo(124.69f, 152.0f),
                    PathNode.LineTo(104.0f, 152.0f),
                    PathNode.LineTo(104.0f, 131.31f),
                    PathNode.LineTo(168.0f, 67.31f),
                    PathNode.LineTo(188.69f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 76.69f),
                    PathNode.LineTo(179.31f, 56.0f),
                    PathNode.LineTo(192.0f, 43.31f),
                    PathNode.LineTo(212.69f, 64.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 128.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(224.0f, 216.83656f, 216.83656f, 224.0f, 208.0f, 224.0f),
                    PathNode.LineTo(48.0f, 224.0f),
                    PathNode.CurveTo(39.163445f, 224.0f, 32.0f, 216.83656f, 32.0f, 208.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(32.0f, 39.163445f, 39.163445f, 32.0f, 48.0f, 32.0f),
                    PathNode.LineTo(128.0f, 32.0f),
                    PathNode.CurveTo(132.41827f, 32.0f, 136.0f, 35.581722f, 136.0f, 40.0f),
                    PathNode.CurveTo(136.0f, 44.418278f, 132.41827f, 48.0f, 128.0f, 48.0f),
                    PathNode.LineTo(48.0f, 48.0f),
                    PathNode.LineTo(48.0f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.LineTo(208.0f, 128.0f),
                    PathNode.CurveTo(208.0f, 123.58172f, 211.58173f, 120.0f, 216.0f, 120.0f),
                    PathNode.CurveTo(220.41827f, 120.0f, 224.0f, 123.58172f, 224.0f, 128.0f),
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
        return _notePencil!!
    }

private var _notePencil: ImageVector? = null
