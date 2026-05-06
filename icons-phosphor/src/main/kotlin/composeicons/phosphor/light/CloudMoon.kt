package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.CloudMoon: ImageVector
    get() {
        if (_cloudMoon != null) return _cloudMoon!!
        _cloudMoon = phosphorLightIcon(
            name = "CloudMoon",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 74c-4.756-.001-9.501 .455-14.17 1.36C155.793 44.549 133.808 18.712 103.72 11.77c-2.022-.468-4.143 .143-5.606 1.615C96.65 14.857 96.051 16.98 96.53 19c4.447 19.471-1.426 39.86-15.548 53.982C66.86 87.104 46.471 92.977 27 88.53c-2.014-.462-4.124 .144-5.585 1.605-1.461 1.461-2.067 3.571-1.605 5.585 4.395 18.949 16.453 35.226 33.3 44.95-12.049 14.985-14.436 35.553-6.141 52.9C55.264 210.917 72.772 221.97 92 222h80c40.869 0 74-33.131 74-74C246 107.131 212.869 74 172 74ZM34.22 101.76Q37.1 102 40 102c38.642-.044 69.956-31.358 70-70 0-1.94-.08-3.88-.24-5.8 21.549 8.612 35.832 29.307 36.24 52.51C125.619 86.348 109.61 102.535 102.2 123 98.843 122.321 95.425 121.986 92 122c-10.765-.012-21.242 3.469-29.86 9.92C49.477 125.594 39.552 114.872 34.22 101.76ZM172 210h-80C77.579 209.989 64.407 201.816 57.993 188.9c-6.414-12.916-4.963-28.35 3.744-39.845 8.708-11.495 23.172-17.071 37.342-14.395-.536 2.976-.893 5.981-1.07 9-.193 3.314 2.336 6.157 5.65 6.35 3.314 .193 6.157-2.336 6.35-5.65 .253-4.137 .923-8.238 2-12.24 0-.15 .08-.29 .11-.43 8.42-31.034 39.149-50.496 70.804-44.844 31.655 5.652 53.749 34.547 50.908 66.577C230.991 185.453 204.155 210.008 172 210Z"),
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
        return _cloudMoon!!
    }

private var _cloudMoon: ImageVector? = null
