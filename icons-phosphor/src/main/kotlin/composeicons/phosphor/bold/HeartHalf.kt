package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.HeartHalf: ImageVector
    get() {
        if (_heartHalf != null) return _heartHalf!!
        _heartHalf = phosphorBoldIcon(
            name = "HeartHalf",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170.21 60.72c6.514-1.221 10.806-7.491 9.585-14.005-1.221-6.514-7.491-10.806-14.005-9.585C150.5 40 137.49 47.2 128.08 57.66 116 44 98.14 36 78 36 41.567 36.044 12.044 65.567 12 102c0 31 18.91 63 56.2 94.87 16.783 14.277 34.903 26.902 54.11 37.7 1.751 .936 3.705 1.427 5.69 1.43 1.985-.006 3.938-.508 5.68-1.46h0c14.537-8.146 28.454-17.351 41.64-27.54 4.986-4.12 5.809-11.451 1.861-16.574-3.948-5.124-11.246-6.196-16.501-2.426-7.48 5.76-14.63 10.72-20.68 14.68v-120.13c5.43-11.32 16.31-19.23 30.21-21.83ZM116 202.66C104.658 195.259 93.8 187.142 83.49 178.36 61.82 159.77 36 131.42 36 102 36 78.804 54.804 60 78 60c17 0 31.35 8.57 38 22.52ZM233 107.93c-3.164 .351-6.338-.57-8.823-2.56-2.485-1.99-4.077-4.886-4.427-8.05C218.387 85.011 211.646 73.936 201.34 67.07c-5.445-3.708-6.882-11.112-3.22-16.588 3.662-5.476 11.053-6.976 16.56-3.362 16.197 10.798 26.785 28.211 28.92 47.56 .731 6.586-4.014 12.517-10.6 13.25ZM234 141.35c-5.84 11.72-14.33 23.63-25.23 35.43-4.527 4.73-12.009 4.958-16.816 .514-4.807-4.444-5.165-11.921-.804-16.804 9.36-10.13 16.55-20.17 21.38-29.84 1.83-3.975 5.678-6.638 10.042-6.951 4.364-.313 8.553 1.775 10.931 5.448 2.378 3.673 2.568 8.349 .497 12.203Z"),
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
        return _heartHalf!!
    }

private var _heartHalf: ImageVector? = null
