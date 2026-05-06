package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Rabbit: ImageVector
    get() {
        if (_rabbit != null) return _rabbit!!
        _rabbit = phosphorBoldIcon(
            name = "Rabbit",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M120 160c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM152 144c-8.837 0-16 7.163-16 16 0 8.837 7.163 16 16 16 8.837 0 16-7.163 16-16 0-8.837-7.163-16-16-16ZM220 188c-.002 21.763-12.613 41.554-32.338 50.75-19.725 9.196-42.992 6.131-59.662-7.86-23.11 18.914-56.996 16.366-77.018-5.791C30.96 202.941 31.848 168.971 53 147.89c1.043-6.463 2.922-12.762 5.59-18.74C49.535 110.663 42.881 91.095 38.79 70.92 35.55 54.21 33.54 31.35 42.21 17 46.896 8.834 55.646 3.856 65.06 4c22.63 0 40.6 27.11 53.48 80.6 6.281-.8 12.639-.8 18.92 0C150.34 31.11 168.31 4 190.94 4c9.414-.144 18.164 4.834 22.85 13 8.67 14.34 6.66 37.2 3.45 53.86-4.091 20.175-10.745 39.743-19.8 58.23 2.657 5.983 4.526 12.286 5.56 18.75 10.884 10.524 17.02 25.021 17 40.16ZM160.53 91.32c6.831 3.231 13.141 7.464 18.72 12.56 .78 .71 1.53 1.43 2.28 2.17 5.344-12.812 9.41-26.12 12.14-39.73 3.9-20.23 2.34-32.33-.42-36.9C192.43 28.07 192 28 190.94 28c-6.17 0-19.43 17.4-30.41 63.32ZM74.47 106.05c.74-.73 1.5-1.46 2.28-2.17C82.329 98.784 88.639 94.551 95.47 91.32 84.49 45.4 71.23 28 65.06 28c-1.08 0-1.49 .07-2.31 1.42-6.21 10.28-2.02 43.42 11.72 76.63ZM196 188c.015-9.658-4.346-18.803-11.86-24.87-2.495-2.027-4.073-4.97-4.38-8.17C177.189 128.298 154.786 107.95 128 107.95c-26.786 0-49.189 20.348-51.76 47.01-.307 3.2-1.885 6.143-4.38 8.17-13.274 10.879-15.603 30.292-5.278 44.001 10.325 13.709 29.627 16.832 43.748 7.079l-6-5c-5.098-4.236-5.796-11.802-1.56-16.9 4.236-5.098 11.802-5.796 16.9-1.56l8.33 6.95 8.33-6.93c5.098-4.236 12.664-3.538 16.9 1.56 4.236 5.098 3.538 12.664-1.56 16.9l-6 5c9.777 6.832 22.542 7.66 33.119 2.147C189.366 210.865 196 199.927 196 188Z"),
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
        return _rabbit!!
    }

private var _rabbit: ImageVector? = null
