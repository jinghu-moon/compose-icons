package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tire: ImageVector
    get() {
        if (_tire != null) return _tire!!
        _tire = phosphorLightIcon(
            name = "Tire",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M168 174c14.44 0 22-23.14 22-46 0-22.86-7.56-46-22-46-14.44 0-22 23.14-22 46 0 22.86 7.56 46 22 46ZM168 94c2.57 0 10 11.69 10 34 0 22.31-7.43 34-10 34-2.57 0-10-11.69-10-34 0-22.31 7.43-34 10-34ZM232 218h-40.29C209.89 201 222 167.43 222 128 222 70.8 196.52 26 164 26h-72C59.48 26 34 70.8 34 128c0 57.2 25.48 102 58 102h140c3.314 0 6-2.686 6-6 0-3.314-2.686-6-6-6ZM210 128c0 48.79-21.07 90-46 90-24.93 0-46-41.21-46-90 0-48.79 21.07-90 46-90 24.93 0 46 41.21 46 90ZM46 128c0-2.86 .08-5.69 .22-8.5L80 95.37l26.5 18.93c-.33 4.47-.5 9-.5 13.7-.058 12.801 1.284 25.57 4 38.08l-26.55-19c-2.092-1.502-4.908-1.502-7 0L50.35 165.72C47.41 153.364 45.95 140.701 46 128ZM92 38h44.29C122.49 50.92 112.2 73.35 108 100.65L83.49 83.12c-2.092-1.502-4.908-1.502-7 0L47.79 103.63C53.37 66.24 71.36 38 92 38ZM92 218C76.42 218 62.36 201.92 54 178L80 159.42l35.53 25.39c5.22 13.92 12.34 25.35 20.76 33.24Z"),
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
        return _tire!!
    }

private var _tire: ImageVector? = null
