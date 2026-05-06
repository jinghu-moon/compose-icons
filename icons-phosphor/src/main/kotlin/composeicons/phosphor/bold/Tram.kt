package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Tram: ImageVector
    get() {
        if (_tram != null) return _tram!!
        _tram = phosphorBoldIcon(
            name = "Tram",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184 44h-44v-16h28c6.627 0 12-5.373 12-12C180 9.373 174.627 4 168 4h-80C81.373 4 76 9.373 76 16c0 6.627 5.373 12 12 12h28v16h-44C52.118 44 36 60.118 36 80v104c0 19.882 16.118 36 36 36l-9.6 12.8c-3.976 5.302-2.902 12.824 2.4 16.8 5.302 3.976 12.824 2.902 16.8-2.4L102 220h52l20.4 27.2c3.976 5.302 11.498 6.376 16.8 2.4 5.302-3.976 6.376-11.498 2.4-16.8L184 220c19.882 0 36-16.118 36-36v-104C220 60.118 203.882 44 184 44ZM72 68h112c6.627 0 12 5.373 12 12v36h-136v-36C60 73.373 65.373 68 72 68ZM184 196h-112c-6.627 0-12-5.373-12-12v-44h136v44c0 6.627-5.373 12-12 12ZM104 168c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16ZM184 168c0 8.837-7.163 16-16 16-8.837 0-16-7.163-16-16 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16Z"),
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
        return _tram!!
    }

private var _tram: ImageVector? = null
