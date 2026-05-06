package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Footprints: ImageVector
    get() {
        if (_footprints != null) return _footprints!!
        _footprints = phosphorRegularIcon(
            name = "Footprints",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208.06 184h-56.06c-4.418 0-8 3.582-8 8v12c0 19.896 16.129 36.025 36.025 36.025 19.896 0 36.025-16.129 36.025-36.025v-12c0-4.414-3.576-7.994-7.99-8ZM200.06 204c0 11.046-8.954 20-20 20-11.046 0-20-8.954-20-20v-4h40ZM104 160h-56c-4.418 0-8 3.582-8 8v12c0 19.882 16.118 36 36 36 19.882 0 36-16.118 36-36v-12c0-4.418-3.582-8-8-8ZM96 180c0 11.046-8.954 20-20 20C64.954 200 56 191.046 56 180v-4h40ZM76 16C64.36 16 53.07 26.31 44.2 45c-13.93 29.38-18.56 73 .29 96 1.522 1.858 3.798 2.934 6.2 2.93h50.55c2.402 .004 4.678-1.072 6.2-2.93 18.85-23 14.22-66.65 .29-96C98.85 26.31 87.57 16 76 16ZM97.15 128h-42.37C43.38 109.9 47.57 75.3 58.67 51.89 65.14 38.22 72.17 32 76 32c3.83 0 10.82 6.22 17.3 19.89 11.06 23.41 15.25 58.01 3.85 76.11ZM154.76 168h50.55c2.402 .004 4.678-1.072 6.2-2.93 18.85-23 14.22-66.65 .29-96C202.93 50.31 191.64 40 180 40c-11.64 0-22.89 10.31-31.77 29-13.93 29.38-18.56 73 .29 96 1.522 1.889 3.814 2.991 6.24 3ZM162.76 75.89C169.22 62.22 176.25 56 180 56c3.75 0 10.82 6.22 17.29 19.89 11.1 23.41 15.29 58 3.9 76.11h-42.34c-11.4-18.1-7.21-52.7 3.89-76.11Z"),
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
        return _footprints!!
    }

private var _footprints: ImageVector? = null
