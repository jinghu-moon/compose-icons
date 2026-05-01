package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.CellSignalX: ImageVector
    get() {
        if (_cellSignalX != null) return _cellSignalX!!
        _cellSignalX = phosphorDuotoneIcon(
            name = "CellSignalX",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(200.0f, 40.0f),
                    PathNode.LineTo(200.0f, 160.0f),
                    PathNode.LineTo(154.34f, 205.66f),
                    PathNode.CurveTo(152.84088f, 207.15746f, 150.8089f, 207.99902f, 148.69f, 208.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(28.762346f, 208.00255f, 25.842361f, 206.05338f, 24.60302f, 203.06232f),
                    PathNode.CurveTo(23.36368f, 200.07126f, 24.049358f, 196.6281f, 26.34f, 194.34f),
                    PathNode.LineTo(186.34f, 34.34f),
                    PathNode.CurveTo(188.6281f, 32.04936f, 192.07126f, 31.36368f, 195.06232f, 32.60302f),
                    PathNode.CurveTo(198.05338f, 33.84236f, 200.00255f, 36.76235f, 200.0f, 40.0f),
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
                    PathNode.MoveTo(213.66f, 194.34f),
                    PathNode.CurveTo(216.78593f, 197.46593f, 216.78593f, 202.53407f, 213.66f, 205.66f),
                    PathNode.CurveTo(210.53407f, 208.78593f, 205.46593f, 208.78593f, 202.34f, 205.66f),
                    PathNode.LineTo(184.0f, 187.31f),
                    PathNode.LineTo(165.65f, 205.66f),
                    PathNode.CurveTo(162.52406f, 208.78317f, 157.45818f, 208.78093f, 154.335f, 205.655f),
                    PathNode.CurveTo(151.21182f, 202.52907f, 151.21407f, 197.46317f, 154.34f, 194.34f),
                    PathNode.LineTo(172.68f, 176.0f),
                    PathNode.LineTo(154.34f, 157.65f),
                    PathNode.CurveTo(151.35178f, 154.50468f, 151.41518f, 149.55075f, 154.48297f, 146.48297f),
                    PathNode.CurveTo(157.55075f, 143.41518f, 162.50468f, 143.35178f, 165.65f, 146.34f),
                    PathNode.LineTo(184.0f, 164.68f),
                    PathNode.LineTo(202.34f, 146.34f),
                    PathNode.CurveTo(205.46317f, 143.21407f, 210.52907f, 143.21182f, 213.655f, 146.335f),
                    PathNode.CurveTo(216.78093f, 149.45818f, 216.78317f, 154.52406f, 213.66f, 157.65f),
                    PathNode.LineTo(195.31f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(120.0f, 200.0f),
                    PathNode.LineTo(32.0f, 200.0f),
                    PathNode.LineTo(192.0f, 40.0f),
                    PathNode.LineTo(192.0f, 112.0f),
                    PathNode.CurveTo(192.0f, 116.41828f, 195.58173f, 120.0f, 200.0f, 120.0f),
                    PathNode.CurveTo(204.41827f, 120.0f, 208.0f, 116.41828f, 208.0f, 112.0f),
                    PathNode.LineTo(208.0f, 40.0f),
                    PathNode.CurveTo(208.00104f, 33.529087f, 204.1043f, 27.694614f, 198.12656f, 25.21684f),
                    PathNode.CurveTo(192.14882f, 22.739067f, 185.26712f, 24.105873f, 180.69f, 28.68f),
                    PathNode.LineTo(20.69f, 188.68f),
                    PathNode.CurveTo(16.110008f, 193.2549f, 14.738017f, 200.13881f, 17.214132f, 206.12003f),
                    PathNode.CurveTo(19.690248f, 212.10123f, 25.526514f, 216.00105f, 32.0f, 216.0f),
                    PathNode.LineTo(120.0f, 216.0f),
                    PathNode.CurveTo(124.41828f, 216.0f, 128.0f, 212.41827f, 128.0f, 208.0f),
                    PathNode.CurveTo(128.0f, 203.58173f, 124.41828f, 200.0f, 120.0f, 200.0f),
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
        return _cellSignalX!!
    }

private var _cellSignalX: ImageVector? = null
