package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.FileVue: ImageVector
    get() {
        if (_fileVue != null) return _fileVue!!
        _fileVue = phosphorDuotoneIcon(
            name = "FileVue",
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
                    PathNode.MoveTo(87.54f, 154.69f),
                    PathNode.LineTo(67.54f, 210.69f),
                    PathNode.CurveTo(66.40375f, 213.87549f, 63.38707f, 216.00229f, 60.005f, 216.00229f),
                    PathNode.CurveTo(56.62293f, 216.00229f, 53.60625f, 213.87549f, 52.47f, 210.69f),
                    PathNode.LineTo(32.47f, 154.69f),
                    PathNode.CurveTo(30.984354f, 150.52853f, 33.153534f, 145.95065f, 37.315f, 144.465f),
                    PathNode.CurveTo(41.476467f, 142.97935f, 46.054356f, 145.14853f, 47.54f, 149.31f),
                    PathNode.LineTo(60.0f, 184.21f),
                    PathNode.LineTo(72.47f, 149.31f),
                    PathNode.CurveTo(73.95564f, 145.14853f, 78.53353f, 142.97935f, 82.695f, 144.465f),
                    PathNode.CurveTo(86.85647f, 145.95065f, 89.02564f, 150.52853f, 87.54f, 154.69f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 160.0f),
                    PathNode.CurveTo(212.41827f, 160.0f, 216.0f, 156.41827f, 216.0f, 152.0f),
                    PathNode.CurveTo(216.0f, 147.58173f, 212.41827f, 144.0f, 208.0f, 144.0f),
                    PathNode.LineTo(176.0f, 144.0f),
                    PathNode.CurveTo(171.58173f, 144.0f, 168.0f, 147.58173f, 168.0f, 152.0f),
                    PathNode.LineTo(168.0f, 208.0f),
                    PathNode.CurveTo(168.0f, 212.41827f, 171.58173f, 216.0f, 176.0f, 216.0f),
                    PathNode.LineTo(208.0f, 216.0f),
                    PathNode.CurveTo(212.41827f, 216.0f, 216.0f, 212.41827f, 216.0f, 208.0f),
                    PathNode.CurveTo(216.0f, 203.58173f, 212.41827f, 200.0f, 208.0f, 200.0f),
                    PathNode.LineTo(184.0f, 200.0f),
                    PathNode.LineTo(184.0f, 188.0f),
                    PathNode.LineTo(200.0f, 188.0f),
                    PathNode.CurveTo(204.41827f, 188.0f, 208.0f, 184.41827f, 208.0f, 180.0f),
                    PathNode.CurveTo(208.0f, 175.58173f, 204.41827f, 172.0f, 200.0f, 172.0f),
                    PathNode.LineTo(184.0f, 172.0f),
                    PathNode.LineTo(184.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.0f, 144.0f),
                    PathNode.CurveTo(139.58173f, 144.0f, 136.0f, 147.58173f, 136.0f, 152.0f),
                    PathNode.LineTo(136.0f, 190.0f),
                    PathNode.CurveTo(136.0f, 195.52284f, 131.52284f, 200.0f, 126.0f, 200.0f),
                    PathNode.CurveTo(120.47715f, 200.0f, 116.0f, 195.52284f, 116.0f, 190.0f),
                    PathNode.LineTo(116.0f, 152.0f),
                    PathNode.CurveTo(116.0f, 147.58173f, 112.41828f, 144.0f, 108.0f, 144.0f),
                    PathNode.CurveTo(103.58172f, 144.0f, 100.0f, 147.58173f, 100.0f, 152.0f),
                    PathNode.LineTo(100.0f, 190.0f),
                    PathNode.CurveTo(100.0f, 204.3594f, 111.640594f, 216.0f, 126.0f, 216.0f),
                    PathNode.CurveTo(140.3594f, 216.0f, 152.0f, 204.3594f, 152.0f, 190.0f),
                    PathNode.LineTo(152.0f, 152.0f),
                    PathNode.CurveTo(152.0f, 147.58173f, 148.41827f, 144.0f, 144.0f, 144.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 88.0f),
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
                    PathNode.LineTo(40.0f, 40.0f),
                    PathNode.CurveTo(40.0f, 31.163445f, 47.163445f, 24.0f, 56.0f, 24.0f),
                    PathNode.LineTo(152.0f, 24.0f),
                    PathNode.CurveTo(154.12238f, 23.998331f, 156.15842f, 24.840092f, 157.66f, 26.34f),
                    PathNode.LineTo(213.66f, 82.34f),
                    PathNode.CurveTo(215.15993f, 83.841576f, 216.00166f, 85.87763f, 216.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.69f, 80.0f),
                    PathNode.LineTo(160.0f, 51.31f),
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
        return _fileVue!!
    }

private var _fileVue: ImageVector? = null
