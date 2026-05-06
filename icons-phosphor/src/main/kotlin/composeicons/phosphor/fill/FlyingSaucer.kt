package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.FlyingSaucer: ImageVector
    get() {
        if (_flyingSaucer != null) return _flyingSaucer!!
        _flyingSaucer = phosphorFillIcon(
            name = "FlyingSaucer",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M183.59 213.47c1.397 4.192-.868 8.723-5.06 10.12-4.192 1.397-8.723-.868-10.12-5.06l-8-24c-1.397-4.192 .868-8.723 5.06-10.12 4.192-1.397 8.723 .868 10.12 5.06ZM128 184c-4.418 0-8 3.582-8 8v32c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-32c0-4.418-3.582-8-8-8ZM90.53 184.41c-2.013-.671-4.21-.515-6.108 .434-1.898 .949-3.341 2.613-4.012 4.626l-8 24c-1.397 4.192 .868 8.723 5.06 10.12 4.192 1.397 8.723-.868 10.12-5.06l8-24c.671-2.013 .515-4.21-.434-6.108-.949-1.898-2.613-3.341-4.626-4.012ZM248 112c0 16.22-13.37 30.89-37.65 41.29C188.22 162.78 159 168 128 168 97 168 67.78 162.78 45.65 153.29 21.37 142.89 8 128.22 8 112 8 103.63 11.67 91.21 29.17 79.5 40.54 71.89 56.11 65.74 74.35 61.65 84.653 45.326 101.808 34.561 120.988 32.383c19.18-2.178 38.312 4.468 52.012 18.067 3.45 3.414 6.506 7.204 9.11 11.3C223.43 71.09 248 89.74 248 112ZM176 96c.016-8.174-2.071-16.215-6.06-23.35l-.06-.09C161.272 57.206 144.961 47.784 127.36 48 101.25 48.34 80 70.25 80 96.83v3c-.021 3.701 2.524 6.924 6.13 7.76 13.748 3.031 27.792 4.51 41.87 4.41 14.07 .113 28.107-1.353 41.85-4.37 3.611-.832 6.165-4.054 6.15-7.76Z"),
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
        return _flyingSaucer!!
    }

private var _flyingSaucer: ImageVector? = null
