package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Stamp: ImageVector
    get() {
        if (_stamp != null) return _stamp!!
        _stamp = phosphorDuotoneIcon(
            name = "Stamp",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M159.46 53l-17.78 83h-27.36L96.54 53c-1.508-7.081 .261-14.465 4.814-20.094C105.908 27.276 112.76 24.004 120 24h16c7.24 .004 14.092 3.276 18.646 8.906 4.554 5.629 6.323 13.013 4.814 20.094Z"),
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
                pathData = parseSvgPathData("M224 224c0 4.418-3.582 8-8 8h-176c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h176c4.418 0 8 3.582 8 8ZM224 144v40c0 8.837-7.163 16-16 16h-160c-8.837 0-16-7.163-16-16v-40c0-8.837 7.163-16 16-16h56.43L88.72 54.71c-2.026-9.448 .326-19.306 6.399-26.822C101.192 20.372 110.337 16.003 120 16h16c9.665-0 18.812 4.367 24.888 11.884 6.076 7.516 8.429 17.376 6.402 26.826L151.57 128h56.43c8.837 0 16 7.163 16 16ZM120.79 128h14.42L151.64 51.35c1.011-4.723-.165-9.651-3.202-13.408C145.402 34.185 140.83 32.002 136 32h-16c-4.832-.001-9.406 2.181-12.445 5.938-3.039 3.757-4.217 8.686-3.205 13.412ZM208 184v-40h-160v40h160Z"),
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
        return _stamp!!
    }

private var _stamp: ImageVector? = null
