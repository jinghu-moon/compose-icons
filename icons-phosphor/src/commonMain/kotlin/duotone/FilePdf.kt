package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FilePdf: ImageVector
    get() {
        if (_filePdf != null) return _filePdf!!
        _filePdf = phosphorDuotoneIcon(
            name = "FilePdf",
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
                    PathNode.MoveTo(224.0f, 152.0f),
                    PathNode.CurveTo(224.0f, 156.41827f, 220.41827f, 160.0f, 216.0f, 160.0f),
                    PathNode.LineTo(192.0f, 160.0f),
                    PathNode.LineTo(192.0f, 176.0f),
                    PathNode.LineTo(208.0f, 176.0f),
                    PathNode.CurveTo(212.41827f, 176.0f, 216.0f, 179.58173f, 216.0f, 184.0f),
                    PathNode.CurveTo(216.0f, 188.41827f, 212.41827f, 192.0f, 208.0f, 192.0f),
                    PathNode.LineTo(192.0f, 192.0f),
                    PathNode.LineTo(192.0f, 208.0f),
                    PathNode.CurveTo(192.0f, 212.41827f, 188.41827f, 216.0f, 184.0f, 216.0f),
                    PathNode.CurveTo(179.58173f, 216.0f, 176.0f, 212.41827f, 176.0f, 208.0f),
                    PathNode.LineTo(176.0f, 152.0f),
                    PathNode.CurveTo(176.0f, 147.58173f, 179.58173f, 144.0f, 184.0f, 144.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.CurveTo(220.41827f, 144.0f, 224.0f, 147.58173f, 224.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(92.0f, 172.0f),
                    PathNode.CurveTo(92.0f, 187.46397f, 79.463974f, 200.0f, 64.0f, 200.0f),
                    PathNode.LineTo(56.0f, 200.0f),
                    PathNode.LineTo(56.0f, 208.0f),
                    PathNode.CurveTo(56.0f, 212.41827f, 52.418278f, 216.0f, 48.0f, 216.0f),
                    PathNode.CurveTo(43.581722f, 216.0f, 40.0f, 212.41827f, 40.0f, 208.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.CurveTo(40.0f, 147.58173f, 43.581722f, 144.0f, 48.0f, 144.0f),
                    PathNode.LineTo(64.0f, 144.0f),
                    PathNode.CurveTo(79.463974f, 144.0f, 92.0f, 156.53603f, 92.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(76.0f, 172.0f),
                    PathNode.CurveTo(76.0f, 165.37259f, 70.62742f, 160.0f, 64.0f, 160.0f),
                    PathNode.LineTo(56.0f, 160.0f),
                    PathNode.LineTo(56.0f, 184.0f),
                    PathNode.LineTo(64.0f, 184.0f),
                    PathNode.CurveTo(70.62742f, 184.0f, 76.0f, 178.62741f, 76.0f, 172.0f),
                    PathNode.Close,
                    PathNode.MoveTo(164.0f, 180.0f),
                    PathNode.CurveTo(164.0f, 199.88223f, 147.88223f, 216.0f, 128.0f, 216.0f),
                    PathNode.LineTo(112.0f, 216.0f),
                    PathNode.CurveTo(107.58172f, 216.0f, 104.0f, 212.41827f, 104.0f, 208.0f),
                    PathNode.LineTo(104.0f, 152.0f),
                    PathNode.CurveTo(104.0f, 147.58173f, 107.58172f, 144.0f, 112.0f, 144.0f),
                    PathNode.LineTo(128.0f, 144.0f),
                    PathNode.CurveTo(147.88223f, 144.0f, 164.0f, 160.11777f, 164.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(148.0f, 180.0f),
                    PathNode.CurveTo(148.0f, 168.9543f, 139.0457f, 160.0f, 128.0f, 160.0f),
                    PathNode.LineTo(120.0f, 160.0f),
                    PathNode.LineTo(120.0f, 200.0f),
                    PathNode.LineTo(128.0f, 200.0f),
                    PathNode.CurveTo(139.0457f, 200.0f, 148.0f, 191.0457f, 148.0f, 180.0f),
                    PathNode.Close,
                    PathNode.MoveTo(40.0f, 112.0f),
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(154.12238f, 23.998331f, 156.15842f, 24.840092f, 157.66f, 26.34f),
                    PathNode.LineTo(213.66f, 82.34f),
                    PathNode.CurveTo(215.15993f, 83.841576f, 216.00166f, 85.87763f, 216.0f, 88.0f),
                    PathNode.LineTo(216.0f, 112.0f),
                    PathNode.CurveTo(216.0f, 116.41828f, 212.41827f, 120.0f, 208.0f, 120.0f),
                    PathNode.CurveTo(203.58173f, 120.0f, 200.0f, 116.41828f, 200.0f, 112.0f),
                    PathNode.LineTo(200.0f, 96.0f),
                    PathNode.LineTo(152.0f, 96.0f),
                    PathNode.CurveTo(147.58173f, 96.0f, 144.0f, 92.41828f, 144.0f, 88.0f),
                    PathNode.LineTo(144.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.LineTo(56.0f, 112.0f),
                    PathNode.CurveTo(56.0f, 116.41828f, 52.418278f, 120.0f, 48.0f, 120.0f),
                    PathNode.CurveTo(43.581722f, 120.0f, 40.0f, 116.41828f, 40.0f, 112.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 80.0f),
                    PathNode.LineTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 51.31f),
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
        return _filePdf!!
    }

private var _filePdf: ImageVector? = null
