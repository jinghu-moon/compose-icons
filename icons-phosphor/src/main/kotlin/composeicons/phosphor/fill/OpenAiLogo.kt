package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.OpenAiLogo: ImageVector
    get() {
        if (_openAiLogo != null) return _openAiLogo!!
        _openAiLogo = phosphorFillIcon(
            name = "OpenAiLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.32 114.24c7.61-18.629 4.64-39.91-7.782-55.743C204.117 42.664 184.156 34.713 164.25 37.67 151.914 21.78 132.004 13.727 112.09 16.574 92.176 19.421 75.319 32.73 67.93 51.44 47.991 54.169 31.05 67.388 23.554 86.064c-7.496 18.677-4.394 39.939 8.126 55.696-6.071 14.878-5.459 31.646 1.682 46.041C40.502 202.197 53.482 212.831 69 217c4.755 1.302 9.66 1.974 14.59 2 2.735-.003 5.465-.207 8.17-.61 12.338 15.884 32.247 23.932 52.157 21.083 19.91-2.849 36.764-16.156 44.153-34.863 19.939-2.729 36.88-15.948 44.376-34.624 7.496-18.677 4.394-39.939-8.126-55.696ZM144 137.24l-16 9.24-16-9.24v-18.48l16-9.24 16 9.24ZM182.85 54.43c20.964 5.604 33.636 26.902 28.56 48-.95-.63-1.91-1.24-2.91-1.81L164 74.88c-2.475-1.429-5.525-1.429-8 0l-44 25.41v-18.48L152.5 58.43c9.177-5.331 20.105-6.771 30.35-4ZM40.85 86.93C45.949 78.039 54.286 71.461 64.12 68.57 64.05 69.71 64 70.85 64 72v51.38c-.001 2.859 1.524 5.501 4 6.93l44 25.4L96 165 55.5 141.57C36.369 130.524 29.815 106.061 40.86 86.93ZM136 224c-10.241 .027-20.098-3.895-27.52-10.95 1-.51 2-1.05 3-1.63L156 185.73c2.473-1.428 3.997-4.065 4-6.92v-50.81l16 9.24v46.76c0 22.091-17.909 40-40 40Z"),
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
        return _openAiLogo!!
    }

private var _openAiLogo: ImageVector? = null
