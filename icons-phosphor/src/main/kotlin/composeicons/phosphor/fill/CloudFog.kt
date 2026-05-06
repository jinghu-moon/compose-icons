package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.CloudFog: ImageVector
    get() {
        if (_cloudFog != null) return _cloudFog!!
        _cloudFog = phosphorFillIcon(
            name = "CloudFog",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 232c0 4.418-3.582 8-8 8h-56c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c4.418 0 8 3.582 8 8ZM128 200c0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h48c4.418 0 8-3.582 8-8ZM184 192h-24c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h24c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8ZM231.87 95.55C229.512 55.227 196.025 23.793 155.634 23.987 115.243 24.181 82.06 55.936 80.09 96.28c-.242 4.303-3.781 7.679-8.09 7.72h-.6C67.009 103.608 63.728 99.79 64 95.39c.278-5.562 1.058-11.088 2.33-16.51 .334-1.385-.094-2.844-1.124-3.829-1.03-.985-2.506-1.347-3.876-.951C39.084 80.673 23.864 101.164 24 124.36 24.2 153.07 48.12 176 76.84 176h79.16c20.922-.023 40.91-8.661 55.265-23.882 14.354-15.221 21.807-35.681 20.605-56.568Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
        }
        return _cloudFog!!
    }

private var _cloudFog: ImageVector? = null
