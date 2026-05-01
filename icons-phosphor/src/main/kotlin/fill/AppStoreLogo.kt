package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.AppStoreLogo: ImageVector
    get() {
        if (_appStoreLogo != null) return _appStoreLogo!!
        _appStoreLogo = phosphorFillIcon(
            name = "AppStoreLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(128.0f, 24.0f),
                    PathNode.CurveTo(70.562386f, 24.0f, 24.0f, 70.562386f, 24.0f, 128.0f),
                    PathNode.CurveTo(24.0f, 185.4376f, 70.562386f, 232.0f, 128.0f, 232.0f),
                    PathNode.CurveTo(185.4376f, 232.0f, 232.0f, 185.4376f, 232.0f, 128.0f),
                    PathNode.CurveTo(231.93938f, 70.58752f, 185.41248f, 24.060629f, 128.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(83.66f, 180.12f),
                    PathNode.LineTo(78.86f, 188.12f),
                    PathNode.CurveTo(76.58459f, 191.90868f, 71.66867f, 193.1354f, 67.88f, 190.86f),
                    PathNode.CurveTo(64.091324f, 188.58458f, 62.864586f, 183.66867f, 65.14f, 179.88f),
                    PathNode.LineTo(69.94f, 171.88f),
                    PathNode.CurveTo(72.215416f, 168.09132f, 77.131325f, 166.8646f, 80.92f, 169.14f),
                    PathNode.CurveTo(84.70867f, 171.41542f, 85.93541f, 176.33133f, 83.66f, 180.12f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 152.0f),
                    PathNode.LineTo(56.0f, 152.0f),
                    PathNode.CurveTo(51.581722f, 152.0f, 48.0f, 148.41827f, 48.0f, 144.0f),
                    PathNode.CurveTo(48.0f, 139.58173f, 51.581722f, 136.0f, 56.0f, 136.0f),
                    PathNode.LineTo(91.47f, 136.0f),
                    PathNode.LineTo(118.67f, 90.67f),
                    PathNode.LineTo(105.14f, 68.12f),
                    PathNode.CurveTo(102.864586f, 64.33133f, 104.09132f, 59.415413f, 107.88f, 57.14f),
                    PathNode.CurveTo(111.66867f, 54.864586f, 116.58459f, 56.091328f, 118.86f, 59.88f),
                    PathNode.LineTo(128.0f, 75.12f),
                    PathNode.LineTo(137.14f, 59.88f),
                    PathNode.CurveTo(139.41542f, 56.091328f, 144.33133f, 54.864586f, 148.12f, 57.14f),
                    PathNode.CurveTo(151.90868f, 59.415413f, 153.1354f, 64.33133f, 150.86f, 68.12f),
                    PathNode.LineTo(110.13f, 136.0f),
                    PathNode.LineTo(128.0f, 136.0f),
                    PathNode.CurveTo(132.41827f, 136.0f, 136.0f, 139.58173f, 136.0f, 144.0f),
                    PathNode.CurveTo(136.0f, 148.41827f, 132.41827f, 152.0f, 128.0f, 152.0f),
                    PathNode.Close,
                    PathNode.MoveTo(200.0f, 152.0f),
                    PathNode.LineTo(174.13f, 152.0f),
                    PathNode.LineTo(190.86f, 179.88f),
                    PathNode.CurveTo(193.1354f, 183.66867f, 191.90868f, 188.58458f, 188.12f, 190.86f),
                    PathNode.CurveTo(184.33133f, 193.1354f, 179.41542f, 191.90868f, 177.14f, 188.12f),
                    PathNode.LineTo(138.74f, 124.12f),
                    PathNode.CurveTo(136.4646f, 120.33133f, 137.69133f, 115.41541f, 141.48f, 113.14f),
                    PathNode.CurveTo(145.26868f, 110.864586f, 150.18459f, 112.09132f, 152.46f, 115.88f),
                    PathNode.LineTo(164.53f, 136.0f),
                    PathNode.LineTo(200.0f, 136.0f),
                    PathNode.CurveTo(204.41827f, 136.0f, 208.0f, 139.58173f, 208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 148.41827f, 204.41827f, 152.0f, 200.0f, 152.0f),
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
        return _appStoreLogo!!
    }

private var _appStoreLogo: ImageVector? = null
