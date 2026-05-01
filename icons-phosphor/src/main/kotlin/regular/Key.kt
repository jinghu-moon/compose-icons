package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Key: ImageVector
    get() {
        if (_key != null) return _key!!
        _key = phosphorRegularIcon(
            name = "Key",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.57f, 39.43f),
                    PathNode.CurveTo(190.41203f, 13.235638f, 149.69908f, 8.408906f, 118.14138f, 27.760777f),
                    PathNode.CurveTo(86.58368f, 47.112648f, 72.424576f, 85.58812f, 83.91f, 120.78f),
                    PathNode.LineTo(28.69f, 176.0f),
                    PathNode.CurveTo(25.675812f, 178.99025f, 23.986435f, 183.06421f, 24.0f, 187.31f),
                    PathNode.LineTo(24.0f, 216.0f),
                    PathNode.CurveTo(24.0f, 224.83656f, 31.163445f, 232.0f, 40.0f, 232.0f),
                    PathNode.LineTo(72.0f, 232.0f),
                    PathNode.CurveTo(76.41828f, 232.0f, 80.0f, 228.41827f, 80.0f, 224.0f),
                    PathNode.LineTo(80.0f, 208.0f),
                    PathNode.LineTo(96.0f, 208.0f),
                    PathNode.CurveTo(100.41828f, 208.0f, 104.0f, 204.41827f, 104.0f, 200.0f),
                    PathNode.LineTo(104.0f, 184.0f),
                    PathNode.LineTo(120.0f, 184.0f),
                    PathNode.CurveTo(122.12237f, 184.00166f, 124.158424f, 183.15993f, 125.66f, 181.66f),
                    PathNode.LineTo(135.22f, 172.09f),
                    PathNode.CurveTo(143.22192f, 174.6928f, 151.58542f, 176.01245f, 160.0f, 176.0f),
                    PathNode.LineTo(160.1f, 176.0f),
                    PathNode.CurveTo(192.43968f, 175.96078f, 221.57495f, 156.45457f, 233.9323f, 126.56892f),
                    PathNode.CurveTo(246.28964f, 96.68325f, 239.43823f, 62.297016f, 216.57f, 39.43f),
                    PathNode.Close,
                    PathNode.MoveTo(224.0f, 98.1f),
                    PathNode.CurveTo(222.91f, 132.19f, 194.25f, 159.96f, 160.11f, 160.0f),
                    PathNode.LineTo(160.0f, 160.0f),
                    PathNode.CurveTo(151.90166f, 160.01366f, 143.87498f, 158.48302f, 136.35f, 155.49f),
                    PathNode.CurveTo(133.3378f, 154.18271f, 129.83264f, 154.84885f, 127.51f, 157.17f),
                    PathNode.LineTo(116.69f, 168.0f),
                    PathNode.LineTo(96.0f, 168.0f),
                    PathNode.CurveTo(91.58172f, 168.0f, 88.0f, 171.58173f, 88.0f, 176.0f),
                    PathNode.LineTo(88.0f, 192.0f),
                    PathNode.LineTo(72.0f, 192.0f),
                    PathNode.CurveTo(67.58172f, 192.0f, 64.0f, 195.58173f, 64.0f, 200.0f),
                    PathNode.LineTo(64.0f, 216.0f),
                    PathNode.LineTo(40.0f, 216.0f),
                    PathNode.LineTo(40.0f, 187.31f),
                    PathNode.LineTo(98.83f, 128.49f),
                    PathNode.CurveTo(101.151146f, 126.167366f, 101.81728f, 122.6622f, 100.51f, 119.65f),
                    PathNode.CurveTo(97.507454f, 112.09989f, 95.97662f, 104.0452f, 96.0f, 95.92f),
                    PathNode.CurveTo(96.0f, 61.78f, 123.81f, 33.12f, 157.9f, 32.03f),
                    PathNode.CurveTo(175.60004f, 31.439306f, 192.75359f, 38.209347f, 205.2792f, 50.729286f),
                    PathNode.CurveTo(217.80486f, 63.249226f, 224.58266f, 80.3997f, 224.0f, 98.1f),
                    PathNode.Close,
                    PathNode.MoveTo(192.0f, 76.0f),
                    PathNode.CurveTo(192.0f, 82.62742f, 186.62741f, 88.0f, 180.0f, 88.0f),
                    PathNode.CurveTo(173.37259f, 88.0f, 168.0f, 82.62742f, 168.0f, 76.0f),
                    PathNode.CurveTo(168.0f, 69.37258f, 173.37259f, 64.0f, 180.0f, 64.0f),
                    PathNode.CurveTo(186.62741f, 64.0f, 192.0f, 69.37258f, 192.0f, 76.0f),
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
        return _key!!
    }

private var _key: ImageVector? = null
