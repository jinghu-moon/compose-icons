package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.OpenAiLogo: ImageVector
    get() {
        if (_openAiLogo != null) return _openAiLogo!!
        _openAiLogo = phosphorDuotoneIcon(
            name = "OpenAiLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96 174.19l56-32.33v36.95l-44.5 25.69c-18.541 10.71-41.934 7.844-57.341-7.025C34.752 182.606 31.056 159.33 41.1 140.42h0c3.079 3.158 6.579 5.877 10.4 8.08ZM204.5 107.5 160 81.81l-32 18.48 56 32.33v51.38c-.005 4.396-.614 8.77-1.81 13h0c21.371-.782 39.648-15.607 44.821-36.358 5.173-20.751-4.007-42.42-22.511-53.142ZM104 77.19 148.5 51.5c3.813-2.222 7.915-3.904 12.19-5h0C149.33 28.346 127.318 19.913 106.736 25.831 86.155 31.749 71.983 50.585 72 72v51.38l32 18.48Z"),
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
                pathData = parseSvgPathData("M224.32 114.24c7.61-18.629 4.64-39.91-7.782-55.743C204.117 42.664 184.156 34.713 164.25 37.67 151.914 21.78 132.004 13.727 112.09 16.574 92.176 19.421 75.319 32.73 67.93 51.44 47.991 54.169 31.05 67.388 23.554 86.064c-7.496 18.677-4.394 39.939 8.126 55.696-6.071 14.878-5.459 31.646 1.682 46.041C40.502 202.197 53.482 212.831 69 217c4.755 1.302 9.66 1.974 14.59 2 2.735-.003 5.465-.207 8.17-.61 12.338 15.884 32.247 23.932 52.157 21.083 19.91-2.849 36.764-16.156 44.153-34.863 19.939-2.729 36.88-15.948 44.376-34.624 7.496-18.677 4.394-39.939-8.126-55.696ZM182.85 54.43c20.964 5.604 33.636 26.902 28.56 48-.95-.63-1.91-1.24-2.91-1.81L164 74.88c-2.475-1.429-5.525-1.429-8 0l-44 25.41v-18.48L152.5 58.43c9.177-5.331 20.105-6.771 30.35-4ZM144 137.24l-16 9.24-16-9.24v-18.48l16-9.24 16 9.24ZM80 72c.008-15.984 9.53-30.428 24.216-36.735 14.687-6.307 31.718-3.265 43.314 7.735-1 .51-2 1-3 1.62L100 70.27c-2.473 1.428-3.997 4.065-4 6.92v50.81L80 118.76ZM40.86 86.93C45.957 78.041 54.29 71.463 64.12 68.57 64.05 69.71 64 70.85 64 72v51.38c-.001 2.859 1.524 5.501 4 6.93l44 25.4L96 165 55.5 141.57C36.369 130.524 29.815 106.061 40.86 86.93ZM73.15 201.57c-20.964-5.604-33.636-26.902-28.56-48 .95 .63 1.91 1.24 2.91 1.81L92 181.12c2.475 1.429 5.525 1.429 8 0l44-25.41v18.48l-40.5 23.38c-9.177 5.331-20.105 6.771-30.35 4ZM176 184c.009 15.988-9.505 30.446-24.191 36.765-14.687 6.319-31.726 3.285-43.329-7.715 1-.51 2-1.05 3-1.63L156 185.73c2.473-1.428 3.997-4.065 4-6.92v-50.81l16 9.24ZM215.14 169.07c-5.097 8.889-13.43 15.467-23.26 18.36 .07-1.14 .12-2.28 .12-3.43v-51.38c.001-2.859-1.524-5.501-4-6.93L144 100.29l16-9.24 40.5 23.38c19.131 11.046 25.685 35.509 14.64 54.64Z"),
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
