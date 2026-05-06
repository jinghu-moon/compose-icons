package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.OpenAiLogo: ImageVector
    get() {
        if (_openAiLogo != null) return _openAiLogo!!
        _openAiLogo = phosphorBoldIcon(
            name = "OpenAiLogo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228.88 113.61c7.1-19.482 3.637-41.25-9.158-57.567C206.927 39.726 186.613 31.171 166 33.42 152.671 17.527 132.079 9.645 111.544 12.578 91.01 15.511 73.447 28.841 65.1 47.83 44.676 51.423 27.555 65.308 19.822 84.55c-7.733 19.242-4.981 41.113 7.278 57.84-6.699 18.425-3.987 38.959 7.265 55.014C45.617 213.458 63.995 223.012 83.6 223c2.155 0 4.308-.12 6.45-.36 13.341 15.865 33.926 23.721 54.444 20.777 20.519-2.944 38.064-16.271 46.406-35.247 20.424-3.593 37.545-17.478 45.278-36.72 7.733-19.242 4.981-41.113-7.278-57.84ZM181.81 58.3c16.765 4.488 27.942 20.298 26.58 37.6L170 73.73c-3.713-2.144-8.287-2.144-12 0L120 95.67v-13.86L154.5 61.9c8.257-4.801 18.091-6.097 27.31-3.6ZM136 123.38v9.24l-8 4.62-8-4.62v-9.24l8-4.62ZM84 72C84 58.632 91.407 46.364 103.237 40.14c11.83-6.225 26.136-5.381 37.153 2.19L102 64.49c-3.712 2.143-5.999 6.104-6 10.39v43.88L84 111.83ZM44.33 88.93C47.958 82.616 53.424 77.558 60 74.43v44.33c-.003 4.29 2.285 8.255 6 10.4l38 21.93L92 158 57.5 138.1C40.288 128.157 34.392 106.145 44.33 88.93ZM74.19 197.7C57.425 193.212 46.248 177.402 47.61 160.1L86 182.27c3.713 2.144 8.287 2.144 12 0l38-21.94v13.86l-34.5 19.91c-8.257 4.801-18.091 6.097-27.31 3.6ZM172 184c0 13.368-7.407 25.636-19.237 31.86-11.83 6.225-26.136 5.381-37.153-2.19L154 191.51c3.712-2.143 5.999-6.104 6-10.39v-43.88l12 6.93ZM211.67 167.07c-3.628 6.314-9.094 11.372-15.67 14.5v-44.33c.003-4.29-2.285-8.255-6-10.4L152 104.91 164 98l34.5 19.92c17.2 9.943 23.094 31.939 13.17 49.15Z"),
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
