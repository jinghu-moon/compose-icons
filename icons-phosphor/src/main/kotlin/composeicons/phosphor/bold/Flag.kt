package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Flag: ImageVector
    get() {
        if (_flag != null) return _flag!!
        _flag = phosphorBoldIcon(
            name = "Flag",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M40.14 46.88C37.497 49.171 35.985 52.502 36 56v168c0 6.627 5.373 12 12 12 6.627 0 12-5.373 12-12v-42.28c22.84-17.12 42.1-9.12 70.68 5 16.23 8 34.74 17.2 54.8 17.2 14.72 0 30.28-4.94 46.38-18.88 2.622-2.273 4.132-5.57 4.14-9.04v-120c.001-4.699-2.741-8.966-7.015-10.918-4.274-1.952-9.294-1.23-12.845 1.848C191.43 68.34 171.61 60.24 141.32 45.25 113.19 31.27 78.17 13.94 40.14 46.88ZM212 170.26c-22.84 17.13-42.1 9.11-70.68-5C118.16 153.76 90.33 140 60 153.87v-92.18c22.84-17.12 42.1-9.12 70.68 5 16.23 8 34.74 17.2 54.8 17.2 9.157 .014 18.207-1.969 26.52-5.81Z"),
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
        return _flag!!
    }

private var _flag: ImageVector? = null
