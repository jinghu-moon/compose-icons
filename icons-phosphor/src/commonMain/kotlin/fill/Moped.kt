package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Moped: ImageVector
    get() {
        if (_moped != null) return _moped!!
        _moped = phosphorFillIcon(
            name = "Moped",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(216.0f, 128.0f),
                    PathNode.CurveTo(213.9f, 127.99888f, 211.80328f, 128.16608f, 209.73f, 128.5f),
                    PathNode.LineTo(175.49f, 37.19f),
                    PathNode.CurveTo(174.31883f, 34.068188f, 171.33427f, 32.000107f, 168.0f, 32.0f),
                    PathNode.LineTo(136.0f, 32.0f),
                    PathNode.CurveTo(131.58173f, 32.0f, 128.0f, 35.581722f, 128.0f, 40.0f),
                    PathNode.CurveTo(128.0f, 44.418278f, 131.58173f, 48.0f, 136.0f, 48.0f),
                    PathNode.LineTo(162.46f, 48.0f),
                    PathNode.LineTo(194.76f, 134.13f),
                    PathNode.CurveTo(185.48322f, 139.9379f, 178.98111f, 149.28285f, 176.76f, 160.0f),
                    PathNode.LineTo(136.54f, 160.0f),
                    PathNode.LineTo(111.54f, 93.19f),
                    PathNode.CurveTo(110.36246f, 90.05099f, 107.35255f, 87.97918f, 104.0f, 88.0f),
                    PathNode.LineTo(24.0f, 88.0f),
                    PathNode.CurveTo(19.581722f, 88.0f, 16.0f, 91.58172f, 16.0f, 96.0f),
                    PathNode.CurveTo(16.0f, 100.41828f, 19.581722f, 104.0f, 24.0f, 104.0f),
                    PathNode.LineTo(32.0f, 104.0f),
                    PathNode.LineTo(32.0f, 117.39f),
                    PathNode.CurveTo(12.472735f, 126.68496f, 0.024007f, 146.3734f, 0f, 168.0f),
                    PathNode.CurveTo(0f, 172.41827f, 3.581722f, 176.0f, 8.0f, 176.0f),
                    PathNode.LineTo(16.8f, 176.0f),
                    PathNode.CurveTo(20.585539f, 194.6426f, 36.976948f, 208.0401f, 56.0f, 208.0401f),
                    PathNode.CurveTo(75.023056f, 208.0401f, 91.41446f, 194.6426f, 95.2f, 176.0f),
                    PathNode.LineTo(176.8f, 176.0f),
                    PathNode.CurveTo(181.0098f, 196.62373f, 200.48274f, 210.45619f, 221.34258f, 207.6405f),
                    PathNode.CurveTo(242.2024f, 204.82481f, 257.311f, 186.32448f, 255.90213f, 165.32268f),
                    PathNode.CurveTo(254.49326f, 144.32086f, 237.04901f, 128.0043f, 216.0f, 128.0f),
                    PathNode.Close,
                    PathNode.MoveTo(56.0f, 192.0f),
                    PathNode.CurveTo(45.831932f, 191.99686f, 36.769356f, 185.58655f, 33.38f, 176.0f),
                    PathNode.LineTo(78.62f, 176.0f),
                    PathNode.CurveTo(75.230644f, 185.58655f, 66.16807f, 191.99686f, 56.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(216.0f, 192.0f),
                    PathNode.CurveTo(205.92247f, 191.98878f, 196.92531f, 185.68315f, 193.47618f, 176.21425f),
                    PathNode.CurveTo(190.02704f, 166.74533f, 192.86069f, 156.13023f, 200.57f, 149.64f),
                    PathNode.LineTo(208.51f, 170.81f),
                    PathNode.CurveTo(210.06192f, 174.95213f, 214.67787f, 177.05193f, 218.82f, 175.5f),
                    PathNode.CurveTo(222.96214f, 173.94807f, 225.06192f, 169.33214f, 223.51f, 165.19f),
                    PathNode.LineTo(215.55f, 144.0f),
                    PathNode.LineTo(216.0f, 144.0f),
                    PathNode.CurveTo(229.25484f, 144.0f, 240.0f, 154.74516f, 240.0f, 168.0f),
                    PathNode.CurveTo(240.0f, 181.25484f, 229.25484f, 192.0f, 216.0f, 192.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
                strokeLineMiter = 4f,
            )
        }
        return _moped!!
    }

private var _moped: ImageVector? = null
