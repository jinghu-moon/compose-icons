package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Clover: ImageVector
    get() {
        if (_clover != null) return _clover!!
        _clover = phosphorBoldIcon(
            name = "Clover",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M213.25 169.21C228.34 162.67 236 146.11 236 120 236 93.89 228.34 77.32 213.25 70.78c-10.66-4.61-23.59-3.6-39.17 3.14 6.73-15.58 7.75-28.51 3.14-39.17C170.67 19.66 154.12 12 128 12 101.88 12 85.33 19.66 78.78 34.75c-4.61 10.66-3.59 23.59 3.14 39.17C66.34 67.18 53.41 66.17 42.75 70.78 27.66 77.32 20 93.88 20 120c0 26.12 7.66 42.67 22.75 49.21 4.502 1.923 9.355 2.89 14.25 2.84q11.15 0 24.94-6c-6.73 15.59-7.75 28.52-3.14 39.17C85.33 220.34 101.88 228 128 228c26.12 0 42.67-7.66 49.22-22.76 .606-1.407 1.118-2.854 1.53-4.33 7.57 13.18 14 27.41 17.61 42 1.335 5.342 6.134 9.089 11.64 9.09 .984-.003 1.965-.123 2.92-.36 6.428-1.608 10.336-8.122 8.73-14.55-6-24.11-18.23-46.91-31.51-66.33 3.562 .824 7.204 1.256 10.86 1.29 4.895 .05 9.748-.917 14.25-2.84ZM100.81 44.29C103.09 39 113 36 128 36c15 0 24.91 3 27.19 8.29 1.12 2.57 3.44 13-13.53 38.81-4.63 7-9.59 13.51-13.66 18.52-4.07-5-9-11.48-13.66-18.52C97.37 57.26 99.69 46.86 100.81 44.29ZM52.29 147.19C47 144.91 44 135 44 120c0-15 3-24.91 8.29-27.19 1.468-.584 3.041-.859 4.62-.81 5.56 0 16.09 2.45 34.19 14.34 6.399 4.239 12.58 8.798 18.52 13.66-5 4.07-11.48 9-18.52 13.66C65.26 150.63 54.86 148.31 52.29 147.19ZM155.19 195.71C152.91 201 143 204 128 204c-15 0-24.91-3-27.19-8.29-1.12-2.58-3.44-13 13.53-38.81 4.63-7 9.59-13.51 13.66-18.52 4.07 5 9 11.48 13.66 18.52 16.97 25.84 14.65 36.23 13.53 38.81ZM164.9 133.66c-7-4.63-13.51-9.59-18.52-13.66 5.94-4.862 12.121-9.421 18.52-13.66 25.84-17 36.24-14.65 38.81-13.53C209 95.09 212 105 212 120c0 15-3 24.91-8.29 27.19-2.57 1.12-12.97 3.44-38.81-13.53Z"),
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
        return _clover!!
    }

private var _clover: ImageVector? = null
