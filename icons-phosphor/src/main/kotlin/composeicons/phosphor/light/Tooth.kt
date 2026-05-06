package composeicons.phosphor.light

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorLightIcon

val PhosphorIcons.Light.Tooth: ImageVector
    get() {
        if (_tooth != null) return _tooth!!
        _tooth = phosphorLightIcon(
            name = "Tooth",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170.23 69.57 144.16 80l26.07 10.43c2.007 .785 3.438 2.586 3.75 4.718 .312 2.132-.543 4.268-2.24 5.595-1.697 1.328-3.976 1.643-5.97 .827L128 86.46 90.23 101.57c-1.479 .591-3.131 .57-4.594-.059-1.463-.628-2.616-1.812-3.206-3.291-1.225-3.073 .269-6.558 3.34-7.79L111.84 80 85.77 69.57C82.72 68.321 81.249 64.847 82.473 61.787c1.225-3.059 4.688-4.558 7.757-3.357L128 73.53 165.77 58.43c1.994-.816 4.273-.501 5.97 .827 1.697 1.328 2.552 3.463 2.24 5.595-.312 2.132-1.744 3.933-3.75 4.718ZM222 79.75c0 42.45-7.91 74.9-14.59 94.64-8.59 25.41-20.22 44.74-31.91 53-4.071 2.931-9.419 3.403-13.94 1.23-4.573-2.177-7.626-6.639-8-11.69-1.13-15.33-5.87-51-25.52-51-19.65 0-24.39 35.64-25.52 51-.572 7.316-6.661 12.97-14 13-2.871 0-5.67-.902-8-2.58-11.69-8.29-23.32-27.62-31.91-53C41.91 154.65 34 122.2 34 79.75 34.138 50.024 58.274 26 88 26h80c29.726-0 53.862 24.024 54 53.75ZM210 79.75C209.863 56.652 191.099 38 168 38h-80C64.897 38 46.132 56.658 46 79.76c-.07 73.93 24.69 126 41.44 137.88 .546 .408 1.277 .466 1.88 .15 .686-.302 1.145-.962 1.19-1.71C93.46 176 106.77 154 128 154c21.23 0 34.54 22 37.49 62.09 .045 .748 .504 1.408 1.19 1.71 .603 .316 1.334 .257 1.88-.15C185.31 205.74 210.07 153.69 210 79.76Z"),
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
        return _tooth!!
    }

private var _tooth: ImageVector? = null
