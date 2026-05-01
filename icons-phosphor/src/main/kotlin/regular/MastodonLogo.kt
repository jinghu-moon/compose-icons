package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.PathNode
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) return _mastodonLogo!!
        _mastodonLogo = phosphorRegularIcon(
            name = "MastodonLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256.0f, height = 256.0f),
        ) {
            addPath(
                pathData = listOf(
                    PathNode.MoveTo(184.0f, 32.0f),
                    PathNode.LineTo(72.0f, 32.0f),
                    PathNode.CurveTo(49.90861f, 32.0f, 32.0f, 49.90861f, 32.0f, 72.0f),
                    PathNode.LineTo(32.0f, 192.0f),
                    PathNode.CurveTo(32.0f, 214.09138f, 49.90861f, 232.0f, 72.0f, 232.0f),
                    PathNode.LineTo(160.0f, 232.0f),
                    PathNode.CurveTo(164.41827f, 232.0f, 168.0f, 228.41827f, 168.0f, 224.0f),
                    PathNode.CurveTo(168.0f, 219.58173f, 164.41827f, 216.0f, 160.0f, 216.0f),
                    PathNode.LineTo(72.0f, 216.0f),
                    PathNode.CurveTo(58.745167f, 216.0f, 48.0f, 205.25484f, 48.0f, 192.0f),
                    PathNode.LineTo(48.0f, 184.0f),
                    PathNode.LineTo(184.0f, 184.0f),
                    PathNode.CurveTo(206.09138f, 184.0f, 224.0f, 166.09138f, 224.0f, 144.0f),
                    PathNode.LineTo(224.0f, 72.0f),
                    PathNode.CurveTo(224.0f, 49.90861f, 206.09138f, 32.0f, 184.0f, 32.0f),
                    PathNode.Close,
                    PathNode.MoveTo(208.0f, 144.0f),
                    PathNode.CurveTo(208.0f, 157.25484f, 197.25484f, 168.0f, 184.0f, 168.0f),
                    PathNode.LineTo(48.0f, 168.0f),
                    PathNode.LineTo(48.0f, 72.0f),
                    PathNode.CurveTo(48.0f, 58.745167f, 58.745167f, 48.0f, 72.0f, 48.0f),
                    PathNode.LineTo(184.0f, 48.0f),
                    PathNode.CurveTo(197.25484f, 48.0f, 208.0f, 58.745167f, 208.0f, 72.0f),
                    PathNode.Close,
                    PathNode.MoveTo(184.0f, 104.0f),
                    PathNode.LineTo(184.0f, 136.0f),
                    PathNode.CurveTo(184.0f, 140.41827f, 180.41827f, 144.0f, 176.0f, 144.0f),
                    PathNode.CurveTo(171.58173f, 144.0f, 168.0f, 140.41827f, 168.0f, 136.0f),
                    PathNode.LineTo(168.0f, 104.0f),
                    PathNode.CurveTo(168.0f, 95.163445f, 160.83656f, 88.0f, 152.0f, 88.0f),
                    PathNode.CurveTo(143.16344f, 88.0f, 136.0f, 95.163445f, 136.0f, 104.0f),
                    PathNode.LineTo(136.0f, 136.0f),
                    PathNode.CurveTo(136.0f, 140.41827f, 132.41827f, 144.0f, 128.0f, 144.0f),
                    PathNode.CurveTo(123.58172f, 144.0f, 120.0f, 140.41827f, 120.0f, 136.0f),
                    PathNode.LineTo(120.0f, 104.0f),
                    PathNode.CurveTo(120.0f, 95.163445f, 112.836555f, 88.0f, 104.0f, 88.0f),
                    PathNode.CurveTo(95.163445f, 88.0f, 88.0f, 95.163445f, 88.0f, 104.0f),
                    PathNode.LineTo(88.0f, 136.0f),
                    PathNode.CurveTo(88.0f, 140.41827f, 84.41828f, 144.0f, 80.0f, 144.0f),
                    PathNode.CurveTo(75.58172f, 144.0f, 72.0f, 140.41827f, 72.0f, 136.0f),
                    PathNode.LineTo(72.0f, 104.0f),
                    PathNode.CurveTo(72.01496f, 90.69795f, 80.257545f, 78.79235f, 92.70312f, 74.09637f),
                    PathNode.CurveTo(105.1487f, 69.40038f, 119.20153f, 72.89345f, 128.0f, 82.87f),
                    PathNode.CurveTo(136.79848f, 72.89345f, 150.8513f, 69.40038f, 163.29688f, 74.09637f),
                    PathNode.CurveTo(175.74246f, 78.79235f, 183.98505f, 90.69795f, 184.0f, 104.0f),
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
        return _mastodonLogo!!
    }

private var _mastodonLogo: ImageVector? = null
