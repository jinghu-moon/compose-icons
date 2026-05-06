package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Fish: ImageVector
    get() {
        if (_fish != null) return _fish!!
        _fish = phosphorBoldIcon(
            name = "Fish",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 76c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM220.22 145.58c-6.706 12.142-15.819 22.789-26.78 31.29-.24 .2-.47 .39-.72 .56-4.293 3.273-8.822 6.225-13.55 8.83-18.3 10.07-40.88 15.9-67.22 17.36L91 249c-1.952 4.259-6.205 6.993-10.89 7q-.41 0-.81 0c-4.958-.335-9.197-3.691-10.66-8.44l-14.16-46-46-14.19C3.726 185.905 .369 181.658 .04 176.694-.288 171.73 2.48 167.079 7 165L52.4 144.08C53.87 117.75 59.7 95.17 69.77 76.88c2.598-4.735 5.539-9.274 8.8-13.58 .16-.22 .34-.44 .51-.66C87.584 51.651 98.246 42.517 110.41 35.8c25.55-14.19 54.33-16.37 74-15.69 17.76 .61 36.49 4 40.76 6.52 1.743 1.033 3.197 2.487 4.23 4.23 2.52 4.26 5.92 23 6.53 40.76 .64 19.64-1.53 48.38-15.71 73.96ZM151.52 172.24c-4.05-2.409-7.785-5.311-11.12-8.64-8.683-8.662-14.271-19.944-15.9-32.1-12.156-1.629-23.438-7.217-32.1-15.9-3.329-3.336-6.228-7.075-8.63-11.13q-7 20.48-7.7 47.69c-.115 4.584-2.831 8.701-7 10.61L45.51 173.64l22.1 6.82c3.798 1.169 6.771 4.142 7.94 7.94l6.79 22.09L93.23 186.9c1.909-4.169 6.026-6.885 10.61-7q27.16-.61 47.68-7.66ZM209 47C192.75 43.86 147.19 38 114 61.91c-5.19 3.733-9.893 8.1-14 13-.311 9.195 3.35 18.08 10.05 24.385 6.7 6.306 15.79 9.422 24.95 8.555 3.566-.342 7.097 .927 9.63 3.46 2.533 2.533 3.802 6.064 3.46 9.63-.869 9.17 2.255 18.271 8.574 24.973 6.319 6.702 15.22 10.356 24.426 10.027 4.903-4.104 9.27-8.807 13-14C218.05 108.81 212.18 63.22 209 47Z"),
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
        return _fish!!
    }

private var _fish: ImageVector? = null
