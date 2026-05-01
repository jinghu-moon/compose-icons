package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.LinkBreak: ImageVector
    get() {
        if (_linkBreak != null) return _linkBreak!!
        _linkBreak = phosphorFillIcon(
            name = "LinkBreak",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 32.0f),
                    PathNode.LineTo(48.0f, 32.0f),
                    PathNode.CurveTo(39.163445f, 32.0f, 32.0f, 39.163445f, 32.0f, 48.0f),
                    PathNode.LineTo(32.0f, 208.0f),
                    PathNode.CurveTo(32.0f, 216.83656f, 39.163445f, 224.0f, 48.0f, 224.0f),
                    PathNode.LineTo(208.0f, 224.0f),
                    PathNode.CurveTo(216.83656f, 224.0f, 224.0f, 216.83656f, 224.0f, 208.0f),
                    PathNode.LineTo(224.0f, 48.0f),
                    PathNode.CurveTo(224.0f, 39.163445f, 216.83656f, 32.0f, 208.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(96.0f, 64.0f),
                    PathNode.CurveTo(96.0f, 59.581722f, 99.58172f, 56.0f, 104.0f, 56.0f),
                    PathNode.CurveTo(108.41828f, 56.0f, 112.0f, 59.581722f, 112.0f, 64.0f),
                    PathNode.LineTo(112.0f, 80.0f),
                    PathNode.CurveTo(112.0f, 84.41828f, 108.41828f, 88.0f, 104.0f, 88.0f),
                    PathNode.CurveTo(99.58172f, 88.0f, 96.0f, 84.41828f, 96.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 96.0f),
                    PathNode.LineTo(80.0f, 96.0f),
                    PathNode.CurveTo(84.41828f, 96.0f, 88.0f, 99.58172f, 88.0f, 104.0f),
                    PathNode.CurveTo(88.0f, 108.41828f, 84.41828f, 112.0f, 80.0f, 112.0f),
                    PathNode.LineTo(64.0f, 112.0f),
                    PathNode.CurveTo(59.581722f, 112.0f, 56.0f, 108.41828f, 56.0f, 104.0f),
                    PathNode.CurveTo(56.0f, 99.58172f, 59.581722f, 96.0f, 64.0f, 96.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.08f, 181.66f),
                    PathNode.LineTo(120.87f, 188.87f),
                    PathNode.CurveTo(111.27693f, 198.50291f, 97.26859f, 202.27716f, 84.13455f, 198.76764f),
                    PathNode.CurveTo(71.00051f, 195.2581f, 60.741886f, 184.9995f, 57.232357f, 171.86543f),
                    PathNode.CurveTo(53.72282f, 158.7314f, 57.497093f, 144.72307f, 67.13f, 135.13f),
                    PathNode.LineTo(74.34f, 127.92f),
                    PathNode.CurveTo(77.46317f, 124.79407f, 82.52906f, 124.79183f, 85.655f, 127.915f),
                    PathNode.CurveTo(88.78093f, 131.03818f, 88.78317f, 136.10406f, 85.66f, 139.23f),
                    PathNode.LineTo(78.44f, 146.44f),
                    PathNode.CurveTo(69.84645f, 155.03355f, 69.84645f, 168.96645f, 78.44f, 177.56f),
                    PathNode.CurveTo(87.033554f, 186.15355f, 100.966446f, 186.15355f, 109.56f, 177.56f),
                    PathNode.LineTo(116.77f, 170.34f),
                    PathNode.CurveTo(119.895935f, 167.21683f, 124.96183f, 167.21907f, 128.085f, 170.345f),
                    PathNode.CurveTo(131.20818f, 173.47093f, 131.20593f, 178.53683f, 128.08f, 181.66f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 192.0f),
                    PathNode.CurveTo(160.0f, 196.41827f, 156.41827f, 200.0f, 152.0f, 200.0f),
                    PathNode.CurveTo(147.58173f, 200.0f, 144.0f, 196.41827f, 144.0f, 192.0f),
                    PathNode.LineTo(144.0f, 176.0f),
                    PathNode.CurveTo(144.0f, 171.58173f, 147.58173f, 168.0f, 152.0f, 168.0f),
                    PathNode.CurveTo(156.41827f, 168.0f, 160.0f, 171.58173f, 160.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 160.0f),
                    PathNode.LineTo(176.0f, 160.0f),
                    PathNode.CurveTo(171.58173f, 160.0f, 168.0f, 156.41827f, 168.0f, 152.0f),
                    PathNode.CurveTo(168.0f, 147.58173f, 171.58173f, 144.0f, 176.0f, 144.0f),
                    PathNode.LineTo(192.0f, 144.0f),
                    PathNode.CurveTo(196.41827f, 144.0f, 200.0f, 147.58173f, 200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 156.41827f, 196.41827f, 160.0f, 192.0f, 160.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.87f, 120.87f),
                    PathNode.LineTo(181.66f, 128.08f),
                    PathNode.CurveTo(178.53683f, 131.20593f, 173.47093f, 131.20818f, 170.345f, 128.085f),
                    PathNode.CurveTo(167.21907f, 124.96183f, 167.21683f, 119.895935f, 170.34f, 116.77f),
                    PathNode.LineTo(177.56f, 109.56f),
                    PathNode.CurveTo(186.15355f, 100.966446f, 186.15355f, 87.033554f, 177.56f, 78.44f),
                    PathNode.CurveTo(168.96645f, 69.84645f, 155.03355f, 69.84645f, 146.44f, 78.44f),
                    PathNode.LineTo(139.23f, 85.66f),
                    PathNode.CurveTo(136.10406f, 88.78317f, 131.03818f, 88.78093f, 127.915f, 85.655f),
                    PathNode.CurveTo(124.79183f, 82.52906f, 124.79407f, 77.46317f, 127.92f, 74.34f),
                    PathNode.LineTo(135.13f, 67.13f),
                    PathNode.CurveTo(144.72307f, 57.497093f, 158.7314f, 53.72282f, 171.86543f, 57.232357f),
                    PathNode.CurveTo(184.9995f, 60.741886f, 195.2581f, 71.00051f, 198.76764f, 84.13455f),
                    PathNode.CurveTo(202.27716f, 97.26859f, 198.50291f, 111.27693f, 188.87f, 120.87f),
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
        return _linkBreak!!
    }

private var _linkBreak: ImageVector? = null
