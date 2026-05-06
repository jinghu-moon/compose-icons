package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.RssSimple: ImageVector
    get() {
        if (_rssSimple != null) return _rssSimple!!
        _rssSimple = phosphorRegularIcon(
            name = "RssSimple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 192c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8C208 112.6 143.4 48 64 48c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8 88.22 0 160 71.78 160 160ZM64 104c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8 39.746 .044 71.956 32.254 72 72 0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8-.055-48.578-39.422-87.945-88-88ZM68 176c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12 0-6.627-5.373-12-12-12Z"),
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
        return _rssSimple!!
    }

private var _rssSimple: ImageVector? = null
