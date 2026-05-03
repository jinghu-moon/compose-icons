package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.InstagramLogo: ImageVector
    get() {
        if (_instagramLogo != null) return _instagramLogo!!
        _instagramLogo = phosphorFillIcon(
            name = "InstagramLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(176.0f, 24.0f),
                    PathNode.LineTo(80.0f, 24.0f),
                    PathNode.CurveTo(49.085766f, 24.03307f, 24.03307f, 49.085766f, 24.0f, 80.0f),
                    PathNode.LineTo(24.0f, 176.0f),
                    PathNode.CurveTo(24.03307f, 206.91423f, 49.085766f, 231.96693f, 80.0f, 232.0f),
                    PathNode.LineTo(176.0f, 232.0f),
                    PathNode.CurveTo(206.91423f, 231.96693f, 231.96693f, 206.91423f, 232.0f, 176.0f),
                    PathNode.LineTo(232.0f, 80.0f),
                    PathNode.CurveTo(231.96693f, 49.085766f, 206.91423f, 24.03307f, 176.0f, 24.0f),
                    PathNode.Close,
                    PathNode.MoveTo(128.0f, 176.0f),
                    PathNode.CurveTo(101.49033f, 176.0f, 80.0f, 154.50967f, 80.0f, 128.0f),
                    PathNode.CurveTo(80.0f, 101.49033f, 101.49033f, 80.0f, 128.0f, 80.0f),
                    PathNode.CurveTo(154.50967f, 80.0f, 176.0f, 101.49033f, 176.0f, 128.0f),
                    PathNode.CurveTo(175.97244f, 154.49825f, 154.49825f, 175.97244f, 128.0f, 176.0f),
                    PathNode.Close,
                    PathNode.MoveTo(188.0f, 80.0f),
                    PathNode.CurveTo(181.37259f, 80.0f, 176.0f, 74.62742f, 176.0f, 68.0f),
                    PathNode.CurveTo(176.0f, 61.37258f, 181.37259f, 56.0f, 188.0f, 56.0f),
                    PathNode.CurveTo(194.62741f, 56.0f, 200.0f, 61.37258f, 200.0f, 68.0f),
                    PathNode.CurveTo(200.0f, 74.62742f, 194.62741f, 80.0f, 188.0f, 80.0f),
                    PathNode.Close,
                    PathNode.MoveTo(160.0f, 128.0f),
                    PathNode.CurveTo(160.0f, 145.67311f, 145.67311f, 160.0f, 128.0f, 160.0f),
                    PathNode.CurveTo(110.32689f, 160.0f, 96.0f, 145.67311f, 96.0f, 128.0f),
                    PathNode.CurveTo(96.0f, 110.32689f, 110.32689f, 96.0f, 128.0f, 96.0f),
                    PathNode.CurveTo(145.67311f, 96.0f, 160.0f, 110.32689f, 160.0f, 128.0f),
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
        return _instagramLogo!!
    }

private var _instagramLogo: ImageVector? = null
