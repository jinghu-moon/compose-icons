package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FileVideo: ImageVector
    get() {
        if (_fileVideo != null) return _fileVideo!!
        _fileVideo = phosphorBoldIcon(
            name = "FileVideo",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216.49 79.51l-56-56C158.238 21.26 155.184 19.997 152 20h-96C44.954 20 36 28.954 36 40v68c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-64h76v48c0 6.627 5.373 12 12 12h48v108c-6.627 0-12 5.373-12 12 0 6.627 5.373 12 12 12h4c11.046 0 20-8.954 20-20v-128c.003-3.184-1.26-6.238-3.51-8.49ZM160 57l23 23h-23ZM158.09 141.69c-3.666-2.16-8.201-2.217-11.92-.15l-19.67 10.9C123.431 144.922 116.12 140.007 108 140h-60c-11.046 0-20 8.954-20 20v48c0 11.046 8.954 20 20 20h60c8.12-.007 15.431-4.922 18.5-12.44l19.67 10.93c3.717 2.066 8.25 2.011 11.915-.146 3.665-2.156 5.915-6.092 5.915-10.344v-64c0-4.25-2.248-8.183-5.91-10.34ZM104 204h-52v-40h52ZM140 195.61l-12-6.67v-9.88l12-6.67Z"),
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
        return _fileVideo!!
    }

private var _fileVideo: ImageVector? = null
