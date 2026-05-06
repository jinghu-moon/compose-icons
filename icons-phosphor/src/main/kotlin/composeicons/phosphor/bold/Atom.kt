package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Atom: ImageVector
    get() {
        if (_atom != null) return _atom!!
        _atom = phosphorBoldIcon(
            name = "Atom",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M219.23 159.2c-5.033-10.929-11.058-21.373-18-31.2 6.942-9.827 12.967-20.271 18-31.2 11.84-26.31 11.69-47.48-.43-59.6C206.68 25.08 185.51 24.93 159.2 36.77c-10.929 5.033-21.373 11.058-31.2 18-9.827-6.942-20.271-12.967-31.2-18C70.49 24.93 49.32 25.08 37.2 37.2 25.08 49.32 24.93 70.49 36.77 96.8c5.033 10.929 11.058 21.373 18 31.2-6.942 9.827-12.967 20.271-18 31.2-11.84 26.31-11.69 47.48 .43 59.6h0C43.33 224.93 51.78 228 62 228c10 0 21.77-2.92 34.76-8.77 10.929-5.033 21.373-11.058 31.2-18 9.827 6.942 20.271 12.967 31.2 18 13 5.85 24.74 8.77 34.76 8.77 10.26 0 18.71-3.07 24.84-9.2h0c12.16-12.12 12.31-33.29 .47-59.6ZM201.82 54.2c5.25 5.26 1.79 26-16 53.78C180.21 101.32 174.17 94.73 167.75 88.31 161.33 81.89 154.7 75.83 148 70.22 175.82 52.39 196.56 48.93 201.82 54.18ZM171.24 128c-6.43 7.934-13.276 15.522-20.51 22.73-7.208 7.234-14.796 14.08-22.73 20.51-7.934-6.43-15.522-13.276-22.73-20.51C98.036 143.522 91.19 135.934 84.76 128 97.655 112.145 112.145 97.655 128 84.76c7.936 6.427 15.524 13.274 22.73 20.51 7.236 7.206 14.083 14.794 20.51 22.73ZM54.18 54.18c1.46-1.45 4.1-2.24 7.75-2.24 9.53 0 25.94 5.39 46 18.28C101.27 75.83 94.68 81.87 88.26 88.29 81.84 94.71 75.83 101.3 70.22 108 52.39 80.18 48.93 59.44 54.18 54.18ZM54.18 201.82c-5.25-5.26-1.79-26 16-53.78 5.61 6.66 11.65 13.25 18.07 19.67 6.42 6.42 13 12.46 19.67 18.07C80.18 203.61 59.44 207.07 54.18 201.82ZM201.82 201.82c-5.26 5.25-26 1.79-53.78-16 6.66-5.61 13.25-11.65 19.67-18.07 6.42-6.42 12.46-13 18.07-19.67 17.83 27.74 21.29 48.48 16.04 53.74ZM144 128c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _atom!!
    }

private var _atom: ImageVector? = null
