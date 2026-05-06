package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) return _smileyMelting!!
        _smileyMelting = phosphorRegularIcon(
            name = "SmileyMelting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 140c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM128 92c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12ZM201 54C160.936 15.048 97.252 14.718 56.785 53.251 16.319 91.785 13.534 155.409 50.48 197.33c1.892 2.183 4.814 3.176 7.644 2.598 2.83-.577 5.129-2.635 6.015-5.385 .886-2.749 .221-5.763-1.739-7.884C30.85 151.381 32.854 97.466 66.936 64.627c34.083-32.839 88.035-32.839 122.117 0 34.083 32.839 36.087 86.754 4.536 122.033-2.946 3.294-2.664 8.354 .63 11.3 3.294 2.946 8.354 2.664 11.3-.63C242.458 155.986 240.47 92.935 201 54ZM152 168h-16C114.26 168 88 150.16 88 128c.002-2.238 .186-4.472 .55-6.68 .501-2.832-.557-5.715-2.77-7.551-2.213-1.836-5.242-2.343-7.933-1.327-2.691 1.016-4.629 3.397-5.077 6.238-.512 3.08-.769 6.197-.77 9.32 0 14.88 7.46 29.13 21 40.15C105.4 178.22 121.07 184 136 184h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-56c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24Z"),
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
        return _smileyMelting!!
    }

private var _smileyMelting: ImageVector? = null
