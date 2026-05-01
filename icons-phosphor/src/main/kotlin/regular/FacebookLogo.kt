package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.FacebookLogo: ImageVector
    get() {
        if (_facebookLogo != null) return _facebookLogo!!
        _facebookLogo = phosphorRegularIcon(
            name = "FacebookLogo",
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
                    PathNode.MoveTo(136.0f, 215.63f),
                    PathNode.LineTo(136.0f, 152.0f),
                    PathNode.LineTo(160.0f, 152.0f),
                    PathNode.CurveTo(164.41827f, 152.0f, 168.0f, 148.41827f, 168.0f, 144.0f),
                    PathNode.CurveTo(168.0f, 139.58173f, 164.41827f, 136.0f, 160.0f, 136.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.LineTo(136.0f, 112.0f),
                    PathNode.CurveTo(136.0f, 103.163445f, 143.16344f, 96.0f, 152.0f, 96.0f),
                    PathNode.LineTo(168.0f, 96.0f),
                    PathNode.CurveTo(172.41827f, 96.0f, 176.0f, 92.41828f, 176.0f, 88.0f),
                    PathNode.CurveTo(176.0f, 83.58172f, 172.41827f, 80.0f, 168.0f, 80.0f),
                    PathNode.LineTo(152.0f, 80.0f),
                    PathNode.CurveTo(134.32689f, 80.0f, 120.0f, 94.32689f, 120.0f, 112.0f),
                    PathNode.LineTo(120.0f, 136.0f),
                    PathNode.LineTo(96.0f, 136.0f),
                    PathNode.CurveTo(91.58172f, 136.0f, 88.0f, 139.58173f, 88.0f, 144.0f),
                    PathNode.CurveTo(88.0f, 148.41827f, 91.58172f, 152.0f, 96.0f, 152.0f),
                    PathNode.LineTo(120.0f, 152.0f),
                    PathNode.LineTo(120.0f, 215.63f),
                    PathNode.CurveTo(73.15073f, 211.35327f, 37.95056f, 170.9856f, 40.091145f, 123.99024f),
                    PathNode.CurveTo(42.231728f, 76.994896f, 80.955925f, 39.994392f, 128.0f, 39.994392f),
                    PathNode.CurveTo(175.04407f, 39.994392f, 213.76826f, 76.994896f, 215.90886f, 123.99024f),
                    PathNode.CurveTo(218.04944f, 170.9856f, 182.84927f, 211.35327f, 136.0f, 215.63f),
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
        return _facebookLogo!!
    }

private var _facebookLogo: ImageVector? = null
