package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.ThreadsLogo: ImageVector
    get() {
        if (_threadsLogo != null) return _threadsLogo!!
        _threadsLogo = phosphorDuotoneIcon(
            name = "ThreadsLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 128c0 48-16 96-80 96C64 224 48 176 48 128 48 80 64 32 128 32c64 0 80 48 80 96Z"),
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
                pathData = parseSvgPathData("M186.42 123.65c-3.472-2.613-7.201-4.865-11.13-6.72-4-29.89-24-39.31-33.1-42.07-19.78-6-42.51 1.19-52.85 16.7-2.452 3.678-1.458 8.648 2.22 11.1 3.678 2.452 8.648 1.458 11.1-2.22 6.37-9.56 22-14.16 34.89-10.27 9.95 3 16.82 10.3 20.15 21-5.04-.96-10.16-1.438-15.29-1.43-13.92 0-26.95 3.59-36.67 10.1C94.3 127.57 88 139 88 152c0 20.58 15.86 35.52 37.71 35.52 12.982-.088 25.374-5.431 34.35-14.81 6.44-6.7 14-18.36 15.61-37.1 .38 .26 .74 .53 1.1 .8C186.88 144.05 192 154.68 192 168c0 19.36-20.34 48-64 48-26.73 0-45.48-8.65-57.34-26.44C60.93 175 56 154.26 56 128 56 101.74 60.93 81 70.66 66.44 82.52 48.65 101.27 40 128 40c32.93 0 54 13.25 64.53 40.52 1.005 2.699 3.382 4.649 6.225 5.107 2.843 .458 5.713-.647 7.514-2.894 1.801-2.247 2.256-5.288 1.191-7.964C194.68 41.56 167.2 24 128 24 96 24 72.19 35.29 57.34 57.56 45.83 74.83 40 98.52 40 128c0 29.48 5.83 53.17 17.34 70.44C72.19 220.71 96 232 128 232c30.07 0 48.9-11.48 59.4-21.1C200.3 199.08 208 183 208 168c0-18.34-7.46-33.68-21.58-44.35ZM148.53 161.65c-5.956 6.248-14.188 9.819-22.82 9.9-10.81 0-21.71-6-21.71-19.52 0-12.63 12-26.21 38.41-26.21 5.947-.016 11.868 .798 17.59 2.42 0 14.08-4 25.62-11.47 33.38Z"),
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
