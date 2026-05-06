package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.OpenAiLogo: ImageVector
    get() {
        if (_openAiLogo != null) return _openAiLogo!!
        _openAiLogo = phosphorLightIcon(
            name = "OpenAiLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 114.56c7.9-18.193 5.191-39.254-7.057-54.855C202.694 44.104 182.879 36.473 163.33 39.83 151.516 23.921 131.938 15.76 112.322 18.569 92.706 21.378 76.205 34.705 69.33 53.29 49.643 55.568 32.785 68.447 25.412 86.843c-7.373 18.396-4.076 39.353 8.588 54.597-6.251 14.409-5.918 30.826 .911 44.97 6.829 14.144 19.478 24.614 34.649 28.68 4.574 1.244 9.29 1.886 14.03 1.91 3.037 .001 6.068-.26 9.06-.78 11.814 15.909 31.392 24.07 51.008 21.261 19.616-2.809 36.117-16.136 42.992-34.721 19.71-2.259 36.594-15.144 43.975-33.559 7.381-18.415 4.069-39.394-8.625-54.641ZM183.37 52.5c11.057 2.961 20.427 10.307 25.941 20.339 5.514 10.031 6.695 21.879 3.269 32.801-1.631-1.203-3.326-2.315-5.08-3.33L163 76.62c-1.856-1.072-4.144-1.072-6 0l-47 27.13v-23.09L151.5 56.66c9.642-5.586 21.117-7.084 31.87-4.16ZM146 138.39l-18 10.39L110 138.39v-20.78l18-10.39 18 10.39ZM78 72C77.998 54.69 88.616 39.151 104.744 32.863c16.128-6.288 34.461-2.037 46.176 10.707-1.855 .815-3.664 1.73-5.42 2.74L101 72c-1.855 1.071-2.998 3.049-3 5.19v54.27L78 119.92ZM39.13 85.93c5.851-10.203 15.735-17.465 27.22-20C66.122 67.945 66.005 69.972 66 72v51.38c-.001 2.145 1.142 4.128 3 5.2l47 27.13L96 167.26l-41.5-24C34.439 131.662 27.561 106.008 39.13 85.93ZM72.63 203.5C61.573 200.539 52.203 193.193 46.689 183.161 41.175 173.13 39.994 161.282 43.42 150.36c1.631 1.203 3.326 2.315 5.08 3.33L93 179.38c1.856 1.072 4.144 1.072 6 0l47-27.13v23.09l-41.5 24c-9.642 5.586-21.117 7.084-31.87 4.16ZM178 184c.002 17.31-10.616 32.849-26.744 39.137-16.128 6.288-34.461 2.037-46.176-10.707 1.855-.815 3.664-1.73 5.42-2.74L155 184c1.855-1.071 2.998-3.049 3-5.19v-54.27l20 11.54ZM216.87 170.07c-5.851 10.203-15.735 17.465-27.22 20 .228-2.015 .345-4.042 .35-6.07v-51.38c.001-2.145-1.142-4.128-3-5.2L140 100.29 160 88.74l41.5 24c20.061 11.598 26.939 37.252 15.37 57.33Z"),
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
