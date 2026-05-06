package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.SmileyMelting: ImageVector
    get() {
        if (_smileyMelting != null) return _smileyMelting!!
        _smileyMelting = phosphorDuotoneIcon(
            name = "SmileyMelting",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224 128c.037 23.619-8.669 46.417-24.44 64h-143.12C40.217 173.92 31.48 150.346 32 126.06 33 74.58 75.15 32.73 126.63 32c25.697-.367 50.469 9.585 68.77 27.629C213.701 77.672 224.003 102.3 224 128Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M176 140c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12ZM128 92c0-6.627-5.373-12-12-12-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12ZM201 54C181.6 34.727 155.346 23.937 128 24h-1.49C85.778 24.595 49.143 48.917 32.784 86.224c-16.359 37.308-9.43 80.732 17.726 111.096 1.837 2.358 4.836 3.496 7.775 2.949 2.939-.547 5.328-2.687 6.194-5.548 .866-2.861 .064-5.967-2.078-8.051C30.85 151.391 32.854 97.476 66.936 64.637c34.083-32.839 88.035-32.839 122.117 0 34.083 32.839 36.087 86.754 4.536 122.033-2.877 3.302-2.565 8.303 .701 11.221 3.266 2.918 8.271 2.668 11.229-.561C242.458 155.986 240.47 92.935 201 54ZM152 168h-16C114.26 168 88 150.16 88 128c.002-2.238 .186-4.472 .55-6.68 .501-2.832-.557-5.715-2.77-7.551-2.213-1.836-5.242-2.343-7.933-1.327-2.691 1.016-4.629 3.397-5.077 6.238-.512 3.08-.769 6.197-.77 9.32 0 14.88 7.46 29.13 21 40.15C105.4 178.22 121.07 184 136 184h16c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-56c-13.255 0-24 10.745-24 24 0 13.255 10.745 24 24 24 4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h56c13.255 0 24-10.745 24-24 0-13.255-10.745-24-24-24Z"),
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
