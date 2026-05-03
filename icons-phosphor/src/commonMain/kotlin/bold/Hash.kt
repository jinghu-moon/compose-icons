package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Hash: ImageVector
    get() {
        if (_hash != null) return _hash!!
        _hash = phosphorBoldIcon(
            name = "Hash",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 84.0f),
                    PathNode.LineTo(180.2f, 84.0f),
                    PathNode.LineTo(187.81f, 42.15f),
                    PathNode.CurveTo(188.9974f, 35.627518f, 184.67249f, 29.377413f, 178.15f, 28.19f),
                    PathNode.CurveTo(171.62752f, 27.002588f, 165.37741f, 31.327517f, 164.19f, 37.85f),
                    PathNode.LineTo(155.8f, 84.0f),
                    PathNode.LineTo(116.2f, 84.0f),
                    PathNode.LineTo(123.81f, 42.15f),
                    PathNode.CurveTo(124.99741f, 35.627518f, 120.672485f, 29.377413f, 114.15f, 28.19f),
                    PathNode.CurveTo(107.62752f, 27.002588f, 101.37741f, 31.327517f, 100.19f, 37.85f),
                    PathNode.LineTo(91.8f, 84.0f),
                    PathNode.LineTo(48.0f, 84.0f),
                    PathNode.CurveTo(41.37258f, 84.0f, 36.0f, 89.37258f, 36.0f, 96.0f),
                    PathNode.CurveTo(36.0f, 102.62742f, 41.37258f, 108.0f, 48.0f, 108.0f),
                    PathNode.LineTo(87.44f, 108.0f),
                    PathNode.LineTo(80.17f, 148.0f),
                    PathNode.LineTo(32.0f, 148.0f),
                    PathNode.CurveTo(25.372583f, 148.0f, 20.0f, 153.37259f, 20.0f, 160.0f),
                    PathNode.CurveTo(20.0f, 166.62741f, 25.372583f, 172.0f, 32.0f, 172.0f),
                    PathNode.LineTo(75.8f, 172.0f),
                    PathNode.LineTo(68.19f, 213.85f),
                    PathNode.CurveTo(67.6069f, 216.98839f, 68.29826f, 220.22977f, 70.11114f, 222.85712f),
                    PathNode.CurveTo(71.924f, 225.48447f, 74.708984f, 227.28125f, 77.85f, 227.85f),
                    PathNode.CurveTo(78.56034f, 227.9676f, 79.280205f, 228.01782f, 80.0f, 228.0f),
                    PathNode.CurveTo(85.79909f, 227.9963f, 90.76583f, 223.84613f, 91.8f, 218.14f),
                    PathNode.LineTo(100.2f, 172.0f),
                    PathNode.LineTo(139.8f, 172.0f),
                    PathNode.LineTo(132.19f, 213.85f),
                    PathNode.CurveTo(131.6069f, 216.98839f, 132.29826f, 220.22977f, 134.11113f, 222.85712f),
                    PathNode.CurveTo(135.92401f, 225.48447f, 138.70898f, 227.28125f, 141.85f, 227.85f),
                    PathNode.CurveTo(142.56203f, 227.98499f, 143.2853f, 228.05196f, 144.01f, 228.05f),
                    PathNode.CurveTo(149.8091f, 228.04631f, 154.77583f, 223.89613f, 155.81f, 218.19f),
                    PathNode.LineTo(164.2f, 172.0f),
                    PathNode.LineTo(208.0f, 172.0f),
                    PathNode.CurveTo(214.62741f, 172.0f, 220.0f, 166.62741f, 220.0f, 160.0f),
                    PathNode.CurveTo(220.0f, 153.37259f, 214.62741f, 148.0f, 208.0f, 148.0f),
                    PathNode.LineTo(168.56f, 148.0f),
                    PathNode.LineTo(175.83f, 108.0f),
                    PathNode.LineTo(224.0f, 108.0f),
                    PathNode.CurveTo(230.62741f, 108.0f, 236.0f, 102.62742f, 236.0f, 96.0f),
                    PathNode.CurveTo(236.0f, 89.37258f, 230.62741f, 84.0f, 224.0f, 84.0f),
                    PathNode.Close,
                    PathNode.MoveTo(144.17f, 148.0f),
                    PathNode.LineTo(104.56f, 148.0f),
                    PathNode.LineTo(111.83f, 108.0f),
                    PathNode.LineTo(151.44f, 108.0f),
                    PathNode.Close
                ),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color.Black),
                fillAlpha = 1.0f,
                stroke = null,
                strokeAlpha = 1.0f,
                strokeLineWidth = 24.0f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 4f,
            )
        }
        return _hash!!
    }

private var _hash: ImageVector? = null
