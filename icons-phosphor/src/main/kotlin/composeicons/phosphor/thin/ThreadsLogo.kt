package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorThinIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 126.84c-3.838-2.876-8.008-5.28-12.42-7.16-3-29.38-22-38.4-30.56-41-18.16-5.5-39 1-48.36 15.09-1.226 1.839-.729 4.324 1.11 5.55 1.839 1.226 4.324 .729 5.55-1.11 7.4-11.1 24.7-16.32 39.38-11.87 8.12 2.45 20.95 9.6 24.41 30.32-6.737-1.912-13.707-2.881-20.71-2.88-13.14 0-25.37 3.34-34.44 9.43-10.45 7-16 17-16 28.78 0 20.7 17 31.52 33.71 31.52 11.894-.087 23.247-4.986 31.47-13.58 9.56-9.94 14.68-24.19 14.82-41.23 2.52 1.298 4.925 2.806 7.19 4.51 11 8.32 16.81 20.34 16.81 34.78 0 11.73-6.25 24.46-16.7 34.05C170.36 210.24 154.21 220 128 220 77.57 220 52 189.05 52 128 52 66.95 77.57 36 128 36c34.29 0 57.26 14.5 68.27 43.08 .47 1.392 1.665 2.414 3.112 2.663 1.448 .249 2.915-.316 3.823-1.471 .908-1.155 1.109-2.715 .525-4.062C191.42 44.22 165.94 28 128 28 73.05 28 44 62.58 44 128c0 65.42 29.05 100 84 100 28.79 0 46.72-10.9 56.7-20.05C196.79 196.87 204 181.95 204 168c0-17-6.91-31.27-20-41.16ZM151.4 164.39c-6.708 7.034-15.98 11.05-25.7 11.13-12.38 0-25.71-7.36-25.71-23.52 0-20.76 22-30.21 42.41-30.21 7.344-.02 14.641 1.166 21.6 3.51 0 .88 .05 1.78 .05 2.7-.05 15.25-4.4 27.83-12.64 36.39Z"),
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
        return _threadsLogo!!
    }

private var _threadsLogo: ImageVector? = null
