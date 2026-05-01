package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.HandSoap: ImageVector
    get() {
        if (_handSoap != null) return _handSoap!!
        _handSoap = phosphorFillIcon(
            name = "HandSoap",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 96.8f),
                    PathNode.LineTo(184.0f, 88.0f),
                    PathNode.CurveTo(184.0f, 70.32689f, 169.67311f, 56.0f, 152.0f, 56.0f),
                    PathNode.LineTo(136.0f, 56.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.LineTo(168.0f, 32.0f),
                    PathNode.CurveTo(172.41827f, 32.0f, 176.0f, 35.581722f, 176.0f, 40.0f),
                    PathNode.CurveTo(176.0f, 44.418278f, 179.58173f, 48.0f, 184.0f, 48.0f),
                    PathNode.CurveTo(188.41827f, 48.0f, 192.0f, 44.418278f, 192.0f, 40.0f),
                    PathNode.CurveTo(192.0f, 26.745167f, 181.25484f, 16.0f, 168.0f, 16.0f),
                    PathNode.LineTo(104.0f, 16.0f),
                    PathNode.CurveTo(99.58172f, 16.0f, 96.0f, 19.581722f, 96.0f, 24.0f),
                    PathNode.CurveTo(96.0f, 28.418278f, 99.58172f, 32.0f, 104.0f, 32.0f),
                    PathNode.LineTo(120.0f, 32.0f),
                    PathNode.LineTo(120.0f, 56.0f),
                    PathNode.LineTo(104.0f, 56.0f),
                    PathNode.CurveTo(86.32689f, 56.0f, 72.0f, 70.32689f, 72.0f, 88.0f),
                    PathNode.LineTo(72.0f, 96.8f),
                    PathNode.CurveTo(53.38824f, 100.62676f, 40.023216f, 116.99892f, 40.0f, 136.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.CurveTo(40.0f, 224.83656f, 47.163445f, 232.0f, 56.0f, 232.0f),
                    PathNode.LineTo(200.0f, 232.0f),
                    PathNode.CurveTo(208.83656f, 232.0f, 216.0f, 224.83656f, 216.0f, 216.0f),
                    PathNode.LineTo(216.0f, 136.0f),
                    PathNode.CurveTo(215.97679f, 116.99892f, 202.61176f, 100.62676f, 184.0f, 96.8f),
                    PathNode.Close,
                    PathNode.MoveTo(104.0f, 72.0f),
                    PathNode.LineTo(152.0f, 72.0f),
                    PathNode.CurveTo(160.83656f, 72.0f, 168.0f, 79.163445f, 168.0f, 88.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.LineTo(88.0f, 96.0f),
                    PathNode.LineTo(88.0f, 88.0f),
                    PathNode.CurveTo(88.0f, 79.163445f, 95.163445f, 72.0f, 104.0f, 72.0f),
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
        return _handSoap!!
    }

private var _handSoap: ImageVector? = null
