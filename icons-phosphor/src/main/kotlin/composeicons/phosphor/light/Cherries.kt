package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Cherries: ImageVector
    get() {
        if (_cherries != null) return _cherries!!
        _cherries = phosphorLightIcon(
            name = "Cherries",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M176 74c-2.953-.001-5.902 .189-8.83 .57C161.589 64.708 154.192 55.991 145.37 48.88 108.19 18.88 57.3 25.75 55.15 26.06c-2.467 .348-4.462 2.185-5.013 4.615-.551 2.43 .457 4.947 2.533 6.325C71.39 49.47 79.54 70.31 82.72 90.22 51.015 92.596 24.893 116.04 19.116 147.304c-5.777 31.264 10.241 62.496 39.003 76.045 28.762 13.549 63.043 6.013 83.471-18.35 25.555 14.385 57.368 11.316 79.702-7.69 22.334-19.005 30.453-49.917 20.343-77.445C231.524 92.338 205.326 74.031 176 74ZM137.9 58.27c6.625 5.364 12.322 11.784 16.86 19C142.123 81.31 130.887 88.844 122.35 99 113.916 94.222 104.576 91.262 94.93 90.31 91.71 68.18 83.73 50.17 71.47 37.21c16.76 .22 44.72 3.51 66.43 21.06ZM146.1 121c-3.833-5.68-8.472-10.774-13.77-15.12 7.477-8.541 17.291-14.708 28.23-17.74 4.604 10.592 7.565 21.825 8.78 33.31-8.61-1.5-12.92-5.51-13.1-5.68-1.847-1.826-4.66-2.256-6.968-1.065-2.308 1.191-3.589 3.731-3.172 6.295ZM88 218C56.825 217.87 31.329 193.119 30.275 161.962 29.221 130.804 52.985 104.387 84.08 102.15c.808 11.849 .423 23.748-1.15 35.52-9.66-1.25-14.5-5.73-14.69-5.91-2.364-2.203-6.048-2.138-8.333 .147-2.285 2.285-2.35 5.969-.147 8.333C60.16 140.64 69.76 150 88 150c18.24 0 27.84-9.36 28.24-9.76 1.613-1.487 2.286-3.735 1.755-5.863-.531-2.128-2.18-3.797-4.302-4.353-2.122-.556-4.378 .091-5.883 1.686-.22 .2-4.41 4.08-12.72 5.64 1.452-11.527 1.824-23.164 1.11-34.76 30.108 4.327 51.758 31.18 49.603 61.521C143.647 194.452 118.418 217.973 88 218ZM176 202c-9.588 .013-19.029-2.362-27.47-6.91 12.607-21.673 12.607-48.447 0-70.12 2.65 2.26 11.88 9 27.44 9 18.28 0 27.84-9.36 28.24-9.76 1.133-1.126 1.77-2.658 1.77-4.255 0-1.597-.637-3.129-1.77-4.255-2.34-2.326-6.12-2.326-8.46 0-.23 .22-5 4.59-14.36 5.91-1.187-12.191-4.102-24.151-8.66-35.52 1.06-.06 2.14-.1 3.21-.1 32.033 0 58 25.967 58 58 0 32.033-25.967 58-58 58Z"),
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
        return _cherries!!
    }

private var _cherries: ImageVector? = null
