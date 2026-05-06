package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Strategy: ImageVector
    get() {
        if (_strategy != null) return _strategy!!
        _strategy = phosphorFillIcon(
            name = "Strategy",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M108 188c0 17.673-14.327 32-32 32C58.327 220 44 205.673 44 188c0-17.673 14.327-32 32-32 17.673 0 32 14.327 32 32ZM53.66 117.66 68 103.31l14.34 14.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32L79.31 92 93.66 77.66c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L68 80.69 53.66 66.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L56.69 92 42.34 106.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0ZM215.31 188l14.35-14.34c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0L204 176.69 189.66 162.34c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32L192.69 188l-14.35 14.34c-3.126 3.126-3.126 8.194 0 11.32 3.126 3.126 8.194 3.126 11.32 0L204 199.31l14.34 14.35c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32ZM165.66 50.34 163.31 48h20.69c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-40c-4.418 0-8 3.582-8 8v40c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-20.69l2.34 2.35c17.93 17.93 17.9 35.4 14.71 46.9-4.64 16.77-19.36 31.77-35 35.68-3.919 .982-6.491 4.733-5.995 8.742 .496 4.01 3.904 7.02 7.945 7.018 .657-.001 1.312-.081 1.95-.24 21.21-5.3 40.35-24.6 46.53-46.93 6.1-22.05-.58-44.24-18.82-62.49Z"),
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
        return _strategy!!
    }

private var _strategy: ImageVector? = null
