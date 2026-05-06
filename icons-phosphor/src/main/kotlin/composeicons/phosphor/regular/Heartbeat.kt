package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Heartbeat: ImageVector
    get() {
        if (_heartbeat != null) return _heartbeat!!
        _heartbeat = phosphorRegularIcon(
            name = "Heartbeat",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M72 144h-40c-4.418 0-8-3.582-8-8 0-4.418 3.582-8 8-8h35.72L81.34 107.56c1.483-2.229 3.983-3.568 6.66-3.568 2.677 0 5.177 1.339 6.66 3.568l25.34 38 9.34-14c1.485-2.226 3.984-3.562 6.66-3.56h24c4.418 0 8 3.582 8 8 0 4.418-3.582 8-8 8h-19.72l-13.62 20.44c-1.483 2.229-3.983 3.568-6.66 3.568-2.677 0-5.177-1.339-6.66-3.568L88 126.42l-9.34 14C77.18 142.653 74.679 143.997 72 144ZM178 40c-20.65 0-38.73 8.88-50 23.89C116.73 48.88 98.65 40 78 40 43.774 40.039 16.039 67.774 16 102c0 .75 0 1.5 0 2.25 .138 4.418 3.832 7.888 8.25 7.75 4.418-.138 7.888-3.832 7.75-8.25 0-.58 0-1.17 0-1.75C32.033 76.609 52.609 56.033 78 56c19.45 0 35.78 10.36 42.6 27 1.233 3.001 4.156 4.96 7.4 4.96 3.244 0 6.167-1.959 7.4-4.96C142.22 66.33 158.55 56 178 56c25.391 .033 45.967 20.609 46 46 0 53.61-77.76 102.15-96 112.8-10.83-6.31-42.63-26-66.68-52.21-2.988-3.258-8.052-3.478-11.31-.49-3.258 2.988-3.478 8.052-.49 11.31 31.17 34 72.93 56.68 74.69 57.63 2.366 1.273 5.214 1.273 7.58 0C136.21 228.66 240 172 240 102 239.961 67.774 212.226 40.039 178 40Z"),
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
        return _heartbeat!!
    }

private var _heartbeat: ImageVector? = null
