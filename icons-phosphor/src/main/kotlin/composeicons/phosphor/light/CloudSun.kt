package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudSun: ImageVector
    get() {
        if (_cloudSun != null) return _cloudSun!!
        _cloudSun = phosphorLightIcon(
            name = "CloudSun",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M164 74c-7.172 0-14.307 1.041-21.18 3.09-2.946-5.114-6.709-9.712-11.14-13.61l10.52-15c1.903-2.714 1.244-6.457-1.47-8.36-2.714-1.903-6.457-1.244-8.36 1.47l-10.52 15C113.922 52.262 105.033 49.996 96 50c-1.15 0-2.28 0-3.41 .12L89.4 32.05c-.311-2.169-1.778-3.995-3.829-4.766-2.051-.771-4.358-.362-6.02 1.065-1.662 1.427-2.413 3.647-1.961 5.791l3.18 18.06C71.001 55.084 62.248 60.673 55.52 68.32L40.47 57.78c-2.714-1.903-6.457-1.244-8.36 1.47-1.903 2.714-1.244 6.457 1.47 8.36l15 10.52C44.244 86.062 41.981 94.96 42 104c0 1.13 0 2.26 .12 3.39l-18.07 3.18c-3.059 .536-5.204 3.317-4.944 6.412 .26 3.095 2.839 5.48 5.944 5.498 .352-.001 .703-.031 1.05-.09l18.1-3.19c1.566 5.338 3.955 10.398 7.08 15C35.497 147.865 29.866 169.898 37.156 189.46 44.446 209.023 63.123 221.996 84 222h80c40.869 0 74-33.131 74-74C238 107.131 204.869 74 164 74ZM54 104C53.994 85.308 66.341 68.861 84.292 63.651c17.951-5.211 37.185 2.069 47.188 17.859C114.136 89.973 100.766 104.853 94.2 123 90.843 122.321 87.425 121.986 84 122c-7.928-.006-15.743 1.887-22.79 5.52C56.513 120.575 54.002 112.384 54 104ZM164 210h-80C69.579 209.989 56.407 201.816 49.993 188.9c-6.414-12.916-4.963-28.35 3.744-39.845 8.708-11.495 23.172-17.071 37.342-14.395-.536 2.976-.893 5.981-1.07 9-.193 3.314 2.336 6.157 5.65 6.35 3.314 .193 6.157-2.336 6.35-5.65 .253-4.137 .923-8.238 2-12.24 0-.15 .08-.29 .11-.43 8.42-31.034 39.149-50.496 70.804-44.844 31.655 5.652 53.749 34.547 50.908 66.577C222.991 185.453 196.155 210.008 164 210Z"),
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
        return _cloudSun!!
    }

private var _cloudSun: ImageVector? = null
