package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorLightIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M185.22 125.25c-3.656-2.761-7.607-5.109-11.78-7-3.53-29.6-23-38.82-31.83-41.5-19-5.74-40.73 1.09-50.6 15.9-1.839 2.761-1.091 6.491 1.67 8.33 2.761 1.839 6.491 1.091 8.33-1.67 6.94-10.41 23.25-15.28 37.14-11.07 7.22 2.18 18.39 8.34 22.39 25.61-5.936-1.392-12.013-2.09-18.11-2.08-13.53 0-26.16 3.46-35.55 9.77C96 128.85 90 139.66 90 152c0 22 18 33.52 35.71 33.52 12.437-.086 24.309-5.205 32.91-14.19 6.58-6.85 14.35-19.11 15.29-39.26 1.406 .841 2.765 1.759 4.07 2.75 10.48 7.92 16 19.4 16 33.18 0 20.16-21 50-66 50-27.07 0-46.92-9.19-59-27.33C59 175.75 54 154.66 54 128 54 101.34 59 80.25 69 65.33 81.08 47.19 100.93 38 128 38c33.85 0 55.57 13.67 66.4 41.8 1.19 3.093 4.662 4.635 7.755 3.445 3.093-1.19 4.635-4.662 3.445-7.755C193 42.65 166.85 26 128 26 96.67 26 73.46 37 59 58.67 47.72 75.6 42 98.93 42 128c0 29.07 5.72 52.4 17 69.33C73.46 219 96.67 230 128 230c29.43 0 47.81-11.19 58.05-20.58C198.54 198 206 182.49 206 168c0-17.69-7.19-32.48-20.78-42.75ZM150 163c-6.334 6.638-15.085 10.43-24.26 10.51C109.33 173.52 102 162.71 102 152c0-13.59 12.64-28.21 40.41-28.21 6.641-.001 13.244 1.011 19.58 3 0 .41 0 .82 0 1.24C162 142.72 157.84 154.82 150 163Z"),
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
