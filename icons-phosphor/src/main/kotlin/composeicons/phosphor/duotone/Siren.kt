package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.Siren: ImageVector
    get() {
        if (_siren != null) return _siren!!
        _siren = phosphorDuotoneIcon(
            name = "Siren",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 129v39h-160v-40C47.999 106.677 56.512 86.235 71.647 71.215 86.782 56.194 107.287 47.837 128.61 48 172.72 48.33 208 84.89 208 129Z"),
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
                pathData = parseSvgPathData("M120 16v-8C120 3.582 123.582 0 128 0c4.418 0 8 3.582 8 8v8c0 4.418-3.582 8-8 8-4.418 0-8-3.582-8-8ZM200 48c2.122 .002 4.158-.84 5.66-2.34l8-8c3.126-3.126 3.126-8.194 0-11.32-3.126-3.126-8.194-3.126-11.32 0l-8 8c-2.291 2.288-2.976 5.731-1.737 8.722 1.239 2.991 4.159 4.94 7.397 4.938ZM50.34 45.66c3.126 3.126 8.194 3.126 11.32 0 3.126-3.126 3.126-8.194 0-11.32l-8-8c-3.126-3.126-8.194-3.126-11.32 0-3.126 3.126-3.126 8.194 0 11.32ZM137.34 72.11c-2.832-.501-5.715 .557-7.551 2.77-1.836 2.213-2.343 5.242-1.327 7.933 1.016 2.691 3.397 4.629 6.238 5.077C153.67 91.08 168 108.32 168 128c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8C184 100.6 163.93 76.57 137.32 72.11ZM232 176v24c0 8.837-7.163 16-16 16h-176c-8.837 0-16-7.163-16-16v-24c0-8.837 7.163-16 16-16v-32C40 79.399 79.399 40 128 40h.68c48.15 .36 87.33 40.29 87.33 89v31c8.833 .006 15.99 7.167 15.99 16ZM56 160h144v-31C200 89 167.95 56.29 128.55 56h-.55C88.235 56 56 88.235 56 128ZM216 200v-24h-176v24h176Z"),
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
        return _siren!!
    }

private var _siren: ImageVector? = null
