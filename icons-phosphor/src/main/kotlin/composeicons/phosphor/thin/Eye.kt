package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Eye: ImageVector
    get() {
        if (_eye != null) return _eye!!
        _eye = phosphorThinIcon(
            name = "Eye",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M243.66 126.38c-.34-.76-8.52-18.89-26.83-37.2C199.87 72.22 170.7 52 128 52 85.3 52 56.13 72.22 39.17 89.18 20.86 107.49 12.68 125.62 12.34 126.38c-.45 1.037-.45 2.213 0 3.25 .34 .77 8.52 18.89 26.83 37.2 17 17 46.14 37.17 88.83 37.17 42.69 0 71.87-20.21 88.83-37.17 18.31-18.31 26.49-36.43 26.83-37.2 .45-1.037 .45-2.213 0-3.25ZM210.96 161.38c-23.07 23-51 34.62-83 34.62-32 0-59.89-11.65-83-34.62C35.127 151.573 26.857 140.316 20.44 128 26.869 115.681 35.152 104.423 45 94.62 68.11 71.65 96 60 128 60c32 0 59.89 11.65 83 34.62 9.846 9.805 18.129 21.062 24.56 33.38-6.429 12.318-14.713 23.576-24.56 33.38ZM128 84c-24.301 0-44 19.699-44 44 0 24.301 19.699 44 44 44 24.301 0 44-19.699 44-44C171.972 103.711 152.289 84.028 128 84ZM128 164C108.118 164 92 147.882 92 128c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _eye!!
    }

private var _eye: ImageVector? = null
