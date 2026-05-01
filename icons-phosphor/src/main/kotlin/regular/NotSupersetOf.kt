package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.NotSupersetOf: ImageVector
    get() {
        if (_notSupersetOf != null) return _notSupersetOf!!
        _notSupersetOf = phosphorRegularIcon(
            name = "NotSupersetOf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(208.0f, 192.0f),
                    PathNode.LineTo(80.63f, 192.0f),
                    PathNode.LineTo(102.45f, 168.0f),
                    PathNode.LineTo(152.0f, 168.0f),
                    PathNode.CurveTo(177.2631f, 167.98296f, 200.1523f, 153.10625f, 210.42586f, 130.0264f),
                    PathNode.CurveTo(220.6994f, 106.94655f, 216.43472f, 79.9828f, 199.54f, 61.2f),
                    PathNode.LineTo(213.92f, 45.38f),
                    PathNode.CurveTo(216.82726f, 42.102833f, 216.55795f, 37.0969f, 213.31587f, 34.15056f),
                    PathNode.CurveTo(210.0738f, 31.204214f, 205.065f, 31.413485f, 202.08f, 34.62f),
                    PathNode.LineTo(187.43f, 50.73f),
                    PathNode.CurveTo(176.94365f, 43.72265f, 164.61217f, 39.98805f, 152.0f, 40.0f),
                    PathNode.LineTo(56.0f, 40.0f),
                    PathNode.CurveTo(51.581722f, 40.0f, 48.0f, 43.581722f, 48.0f, 48.0f),
                    PathNode.CurveTo(48.0f, 52.418278f, 51.581722f, 56.0f, 56.0f, 56.0f),
                    PathNode.LineTo(152.0f, 56.0f),
                    PathNode.CurveTo(160.63005f, 55.992317f, 169.10066f, 58.325104f, 176.51f, 62.75f),
                    PathNode.LineTo(95.37f, 152.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.CurveTo(51.581722f, 152.0f, 48.0f, 155.58173f, 48.0f, 160.0f),
                    PathNode.CurveTo(48.0f, 164.41827f, 51.581722f, 168.0f, 56.0f, 168.0f),
                    PathNode.LineTo(80.82f, 168.0f),
                    PathNode.LineTo(42.08f, 210.62f),
                    PathNode.CurveTo(40.116978f, 212.7287f, 39.439384f, 215.73003f, 40.30605f, 218.47755f),
                    PathNode.CurveTo(41.17271f, 221.2251f, 43.44975f, 223.29443f, 46.26741f, 223.89514f),
                    PathNode.CurveTo(49.085068f, 224.49586f, 52.008102f, 223.53516f, 53.92f, 221.38f),
                    PathNode.LineTo(66.08f, 208.0f),
                    PathNode.LineTo(208.0f, 208.0f),
                    PathNode.CurveTo(212.41827f, 208.0f, 216.0f, 204.41827f, 216.0f, 200.0f),
                    PathNode.CurveTo(216.0f, 195.58173f, 212.41827f, 192.0f, 208.0f, 192.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.71f, 73.12f),
                    PathNode.CurveTo(200.71048f, 87.40093f, 203.35052f, 107.341064f, 195.47992f, 124.2529f),
                    PathNode.CurveTo(187.60931f, 141.16473f, 170.6536f, 151.98518f, 152.0f, 152.0f),
                    PathNode.LineTo(117.0f, 152.0f),
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
        return _notSupersetOf!!
    }

private var _notSupersetOf: ImageVector? = null
