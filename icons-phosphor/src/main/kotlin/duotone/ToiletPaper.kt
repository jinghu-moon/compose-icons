package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ToiletPaper: ImageVector
    get() {
        if (_toiletPaper != null) return _toiletPaper!!
        _toiletPaper = phosphorDuotoneIcon(
            name = "ToiletPaper",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(104.0f, 120.0f),
                    PathNode.CurveTo(104.0f, 164.18f, 86.09f, 200.0f, 64.0f, 200.0f),
                    PathNode.CurveTo(41.91f, 200.0f, 24.0f, 164.18f, 24.0f, 120.0f),
                    PathNode.CurveTo(24.0f, 75.82f, 41.91f, 40.0f, 64.0f, 40.0f),
                    PathNode.CurveTo(86.09f, 40.0f, 104.0f, 75.82f, 104.0f, 120.0f),
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
                    PathNode.MoveTo(76.0f, 120.0f),
                    PathNode.CurveTo(76.0f, 126.62742f, 70.62742f, 132.0f, 64.0f, 132.0f),
                    PathNode.CurveTo(57.37258f, 132.0f, 52.0f, 126.62742f, 52.0f, 120.0f),
                    PathNode.CurveTo(52.0f, 113.37258f, 57.37258f, 108.0f, 64.0f, 108.0f),
                    PathNode.CurveTo(70.62742f, 108.0f, 76.0f, 113.37258f, 76.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(240.0f, 120.0f),
                    PathNode.LineTo(240.0f, 208.0f),
                    PathNode.CurveTo(240.0f, 216.83656f, 232.83656f, 224.0f, 224.0f, 224.0f),
                    PathNode.LineTo(112.0f, 224.0f),
                    PathNode.CurveTo(103.163445f, 224.0f, 96.0f, 216.83656f, 96.0f, 208.0f),
                    PathNode.LineTo(96.0f, 186.35f),
                    PathNode.CurveTo(87.37f, 200.37f, 76.18f, 208.0f, 64.0f, 208.0f),
                    PathNode.CurveTo(50.13f, 208.0f, 37.54f, 198.11f, 28.56f, 180.15f),
                    PathNode.CurveTo(20.46f, 164.0f, 16.0f, 142.59f, 16.0f, 120.0f),
                    PathNode.CurveTo(16.0f, 97.41f, 20.46f, 76.05f, 28.56f, 59.85f),
                    PathNode.CurveTo(37.54f, 41.89f, 50.13f, 32.0f, 64.0f, 32.0f),
                    PathNode.LineTo(192.0f, 32.0f),
                    PathNode.CurveTo(205.87f, 32.0f, 218.46f, 41.89f, 227.44f, 59.85f),
                    PathNode.CurveTo(235.54f, 76.05f, 240.0f, 97.41f, 240.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 120.0f),
                    PathNode.CurveTo(96.0f, 77.57f, 79.14f, 48.0f, 64.0f, 48.0f),
                    PathNode.CurveTo(48.86f, 48.0f, 32.0f, 77.57f, 32.0f, 120.0f),
                    PathNode.CurveTo(32.0f, 162.43f, 48.86f, 192.0f, 64.0f, 192.0f),
                    PathNode.CurveTo(79.14f, 192.0f, 96.0f, 162.43f, 96.0f, 120.0f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 128.0f),
                    PathNode.LineTo(208.0f, 128.0f),
                    PathNode.CurveTo(203.58173f, 128.0f, 200.0f, 124.41828f, 200.0f, 120.0f),
                    PathNode.CurveTo(200.0f, 115.58172f, 203.58173f, 112.0f, 208.0f, 112.0f),
                    PathNode.LineTo(223.79f, 112.0f),
                    PathNode.CurveTo(221.84f, 73.9f, 206.16f, 48.0f, 192.0f, 48.0f),
                    PathNode.LineTo(92.12f, 48.0f),
                    PathNode.CurveTo(94.929115f, 51.709717f, 97.38009f, 55.677483f, 99.44f, 59.85f),
                    PathNode.CurveTo(106.58f, 74.13f, 110.88f, 92.41f, 111.81f, 112.0f),
                    PathNode.LineTo(128.0f, 112.0f),
                    PathNode.CurveTo(132.41827f, 112.0f, 136.0f, 115.58172f, 136.0f, 120.0f),
                    PathNode.CurveTo(136.0f, 124.41828f, 132.41827f, 128.0f, 128.0f, 128.0f),
                    PathNode.LineTo(112.0f, 128.0f),
                    PathNode.LineTo(112.0f, 208.0f),
                    PathNode.Close,
                    PathNode.MoveTo(176.0f, 112.0f),
                    PathNode.LineTo(160.0f, 112.0f),
                    PathNode.CurveTo(155.58173f, 112.0f, 152.0f, 115.58172f, 152.0f, 120.0f),
                    PathNode.CurveTo(152.0f, 124.41828f, 155.58173f, 128.0f, 160.0f, 128.0f),
                    PathNode.LineTo(176.0f, 128.0f),
                    PathNode.CurveTo(180.41827f, 128.0f, 184.0f, 124.41828f, 184.0f, 120.0f),
                    PathNode.CurveTo(184.0f, 115.58172f, 180.41827f, 112.0f, 176.0f, 112.0f),
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
        return _toiletPaper!!
    }

private var _toiletPaper: ImageVector? = null
