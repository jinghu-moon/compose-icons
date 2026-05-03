package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Password: ImageVector
    get() {
        if (_password != null) return _password!!
        _password = phosphorFillIcon(
            name = "Password",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(224.0f, 48.0f),
                    PathNode.LineTo(32.0f, 48.0f),
                    PathNode.CurveTo(23.163445f, 48.0f, 16.0f, 55.163445f, 16.0f, 64.0f),
                    PathNode.LineTo(16.0f, 192.0f),
                    PathNode.CurveTo(16.0f, 200.83656f, 23.163445f, 208.0f, 32.0f, 208.0f),
                    PathNode.LineTo(224.0f, 208.0f),
                    PathNode.CurveTo(232.83656f, 208.0f, 240.0f, 200.83656f, 240.0f, 192.0f),
                    PathNode.LineTo(240.0f, 64.0f),
                    PathNode.CurveTo(240.0f, 55.163445f, 232.83656f, 48.0f, 224.0f, 48.0f),
                    PathNode.Close,
                    PathNode.MoveTo(204.58f, 142.71f),
                    PathNode.CurveTo(207.1785f, 146.29985f, 206.37485f, 151.3165f, 202.785f, 153.915f),
                    PathNode.CurveTo(199.19514f, 156.5135f, 194.1785f, 155.70985f, 191.58f, 152.12f),
                    PathNode.LineTo(184.0f, 141.61f),
                    PathNode.LineTo(176.37f, 152.12f),
                    PathNode.CurveTo(173.7715f, 155.70985f, 168.75485f, 156.5135f, 165.165f, 153.915f),
                    PathNode.CurveTo(161.57515f, 151.3165f, 160.7715f, 146.29985f, 163.37f, 142.71f),
                    PathNode.LineTo(171.01f, 132.21f),
                    PathNode.LineTo(158.65f, 128.21f),
                    PathNode.CurveTo(154.44987f, 126.829285f, 152.16429f, 122.30512f, 153.545f, 118.105f),
                    PathNode.CurveTo(154.9257f, 113.90488f, 159.44987f, 111.619286f, 163.65f, 113.0f),
                    PathNode.LineTo(176.0f, 117.0f),
                    PathNode.LineTo(176.0f, 104.0f),
                    PathNode.CurveTo(176.0f, 99.58172f, 179.58173f, 96.0f, 184.0f, 96.0f),
                    PathNode.CurveTo(188.41827f, 96.0f, 192.0f, 99.58172f, 192.0f, 104.0f),
                    PathNode.LineTo(192.0f, 117.0f),
                    PathNode.LineTo(204.35f, 113.0f),
                    PathNode.CurveTo(208.55013f, 111.619286f, 213.0743f, 113.90488f, 214.455f, 118.105f),
                    PathNode.CurveTo(215.83571f, 122.30512f, 213.55013f, 126.829285f, 209.35f, 128.21f),
                    PathNode.LineTo(196.99f, 132.21f),
                    PathNode.Close,
                    PathNode.MoveTo(132.58f, 142.71f),
                    PathNode.CurveTo(135.1785f, 146.29985f, 134.37485f, 151.3165f, 130.785f, 153.915f),
                    PathNode.CurveTo(127.19515f, 156.5135f, 122.1785f, 155.70985f, 119.58f, 152.12f),
                    PathNode.LineTo(112.0f, 141.61f),
                    PathNode.LineTo(104.37f, 152.12f),
                    PathNode.CurveTo(101.7715f, 155.70985f, 96.75485f, 156.5135f, 93.165f, 153.915f),
                    PathNode.CurveTo(89.57515f, 151.3165f, 88.7715f, 146.29985f, 91.37f, 142.71f),
                    PathNode.LineTo(99.01f, 132.21f),
                    PathNode.LineTo(86.65f, 128.21f),
                    PathNode.CurveTo(82.449875f, 126.829285f, 80.16429f, 122.30512f, 81.545f, 118.105f),
                    PathNode.CurveTo(82.92571f, 113.90488f, 87.449875f, 111.619286f, 91.65f, 113.0f),
                    PathNode.LineTo(104.0f, 117.0f),
                    PathNode.LineTo(104.0f, 104.0f),
                    PathNode.CurveTo(104.0f, 99.58172f, 107.58172f, 96.0f, 112.0f, 96.0f),
                    PathNode.CurveTo(116.41828f, 96.0f, 120.0f, 99.58172f, 120.0f, 104.0f),
                    PathNode.LineTo(120.0f, 117.0f),
                    PathNode.LineTo(132.35f, 113.0f),
                    PathNode.CurveTo(136.55013f, 111.619286f, 141.0743f, 113.90488f, 142.455f, 118.105f),
                    PathNode.CurveTo(143.83571f, 122.30512f, 141.55013f, 126.829285f, 137.35f, 128.21f),
                    PathNode.LineTo(124.99f, 132.21f),
                    PathNode.Close,
                    PathNode.MoveTo(64.0f, 88.0f),
                    PathNode.LineTo(64.0f, 168.0f),
                    PathNode.CurveTo(64.0f, 172.41827f, 60.418278f, 176.0f, 56.0f, 176.0f),
                    PathNode.CurveTo(51.581722f, 176.0f, 48.0f, 172.41827f, 48.0f, 168.0f),
                    PathNode.LineTo(48.0f, 88.0f),
                    PathNode.CurveTo(48.0f, 83.58172f, 51.581722f, 80.0f, 56.0f, 80.0f),
                    PathNode.CurveTo(60.418278f, 80.0f, 64.0f, 83.58172f, 64.0f, 88.0f),
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
        return _password!!
    }

private var _password: ImageVector? = null
