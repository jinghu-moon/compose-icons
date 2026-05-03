package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.HandPalm: ImageVector
    get() {
        if (_handPalm != null) return _handPalm!!
        _handPalm = phosphorDuotoneIcon(
            name = "HandPalm",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 116.0f),
                    PathNode.LineTo(208.0f, 152.0f),
                    PathNode.CurveTo(208.0f, 196.18279f, 172.18279f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(83.81722f, 232.0f, 48.0f, 196.18279f, 48.0f, 152.0f),
                    PathNode.LineTo(48.0f, 76.0f),
                    PathNode.CurveTo(48.0f, 64.95431f, 56.954304f, 56.0f, 68.0f, 56.0f),
                    PathNode.CurveTo(79.04569f, 56.0f, 88.0f, 64.95431f, 88.0f, 76.0f),
                    PathNode.LineTo(88.0f, 44.0f),
                    PathNode.CurveTo(88.0f, 32.954304f, 96.95431f, 24.0f, 108.0f, 24.0f),
                    PathNode.CurveTo(119.04569f, 24.0f, 128.0f, 32.954304f, 128.0f, 44.0f),
                    PathNode.LineTo(128.0f, 60.0f),
                    PathNode.CurveTo(128.0f, 48.954304f, 136.9543f, 40.0f, 148.0f, 40.0f),
                    PathNode.CurveTo(159.0457f, 40.0f, 168.0f, 48.954304f, 168.0f, 60.0f),
                    PathNode.LineTo(168.0f, 116.0f),
                    PathNode.CurveTo(168.0f, 104.95431f, 176.9543f, 96.0f, 188.0f, 96.0f),
                    PathNode.CurveTo(199.0457f, 96.0f, 208.0f, 104.95431f, 208.0f, 116.0f),
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
                    PathNode.MoveTo(188.0f, 88.0f),
                    PathNode.CurveTo(183.84763f, 87.99414f, 179.74686f, 88.920235f, 176.0f, 90.71f),
                    PathNode.LineTo(176.0f, 60.0f),
                    PathNode.CurveTo(175.99748f, 50.128754f, 170.79738f, 40.988148f, 162.31337f, 35.94205f),
                    PathNode.CurveTo(153.82936f, 30.895952f, 143.31511f, 30.690004f, 134.64f, 35.4f),
                    PathNode.CurveTo(130.39894f, 22.293549f, 117.25458f, 14.219012f, 103.64656f, 16.36083f),
                    PathNode.CurveTo(90.038536f, 18.50265f, 80.01f, 30.224459f, 80.0f, 44.0f),
                    PathNode.LineTo(80.0f, 50.71f),
                    PathNode.CurveTo(76.253136f, 48.92023f, 72.152374f, 47.994144f, 68.0f, 48.0f),
                    PathNode.CurveTo(52.53603f, 48.0f, 40.0f, 60.53603f, 40.0f, 76.0f),
                    PathNode.LineTo(40.0f, 152.0f),
                    PathNode.CurveTo(40.0f, 200.60106f, 79.39894f, 240.0f, 128.0f, 240.0f),
                    PathNode.CurveTo(176.60106f, 240.0f, 216.0f, 200.60106f, 216.0f, 152.0f),
                    PathNode.LineTo(216.0f, 116.0f),
                    PathNode.CurveTo(216.0f, 100.536026f, 203.46397f, 88.0f, 188.0f, 88.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 152.0f),
                    PathNode.CurveTo(200.0f, 191.7645f, 167.7645f, 224.0f, 128.0f, 224.0f),
                    PathNode.CurveTo(88.2355f, 224.0f, 56.0f, 191.7645f, 56.0f, 152.0f),
                    PathNode.LineTo(56.0f, 76.0f),
                    PathNode.CurveTo(56.0f, 69.37258f, 61.37258f, 64.0f, 68.0f, 64.0f),
                    PathNode.CurveTo(74.62742f, 64.0f, 80.0f, 69.37258f, 80.0f, 76.0f),
                    PathNode.LineTo(80.0f, 120.0f),
                    PathNode.CurveTo(80.0f, 124.41828f, 83.58172f, 128.0f, 88.0f, 128.0f),
                    PathNode.CurveTo(92.41828f, 128.0f, 96.0f, 124.41828f, 96.0f, 120.0f),
                    PathNode.LineTo(96.0f, 44.0f),
                    PathNode.CurveTo(96.0f, 37.37258f, 101.37258f, 32.0f, 108.0f, 32.0f),
                    PathNode.CurveTo(114.62742f, 32.0f, 120.0f, 37.37258f, 120.0f, 44.0f),
                    PathNode.LineTo(120.0f, 112.0f),
                    PathNode.CurveTo(120.0f, 116.41828f, 123.58172f, 120.0f, 128.0f, 120.0f),
                    PathNode.CurveTo(132.41827f, 120.0f, 136.0f, 116.41828f, 136.0f, 112.0f),
                    PathNode.LineTo(136.0f, 60.0f),
                    PathNode.CurveTo(136.0f, 53.37258f, 141.37259f, 48.0f, 148.0f, 48.0f),
                    PathNode.CurveTo(154.62741f, 48.0f, 160.0f, 53.37258f, 160.0f, 60.0f),
                    PathNode.LineTo(160.0f, 128.67f),
                    PathNode.CurveTo(136.92192f, 132.60428f, 120.03224f, 152.58899f, 120.0f, 176.0f),
                    PathNode.CurveTo(120.0f, 180.41827f, 123.58172f, 184.0f, 128.0f, 184.0f),
                    PathNode.CurveTo(132.41827f, 184.0f, 136.0f, 180.41827f, 136.0f, 176.0f),
                    PathNode.CurveTo(136.0f, 158.32689f, 150.32689f, 144.0f, 168.0f, 144.0f),
                    PathNode.CurveTo(172.41827f, 144.0f, 176.0f, 140.41827f, 176.0f, 136.0f),
                    PathNode.LineTo(176.0f, 116.0f),
                    PathNode.CurveTo(176.0f, 109.37258f, 181.37259f, 104.0f, 188.0f, 104.0f),
                    PathNode.CurveTo(194.62741f, 104.0f, 200.0f, 109.37258f, 200.0f, 116.0f),
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
        return _handPalm!!
    }

private var _handPalm: ImageVector? = null
