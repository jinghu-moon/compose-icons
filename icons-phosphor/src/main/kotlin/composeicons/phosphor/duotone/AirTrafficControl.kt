package composeicons.phosphor.duotone

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorDuotoneIcon

val PhosphorIcons.Duotone.AirTrafficControl: ImageVector
    get() {
        if (_airTrafficControl != null) return _airTrafficControl!!
        _airTrafficControl = phosphorDuotoneIcon(
            name = "AirTrafficControl",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M223.51 82.73l-26.18 72c-1.149 3.164-4.154 5.27-7.52 5.27h-123.62c-3.366 0-6.371-2.106-7.52-5.27L32.49 82.73c-.89-2.451-.529-5.181 .966-7.317C34.951 73.277 37.393 72.003 40 72h176c2.607 .003 5.049 1.277 6.544 3.413 1.495 2.136 1.855 4.867 .966 7.317Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 0.2f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M229.11 70.82C226.114 66.544 221.221 63.998 216 64h-80v-32h16c4.418 0 8-3.582 8-8 0-4.418-3.582-8-8-8h-48c-4.418 0-8 3.582-8 8 0 4.418 3.582 8 8 8h16v32h-80c-5.213 .012-10.094 2.563-13.08 6.836C23.934 75.11 23.218 80.571 25 85.47l26.19 72c2.295 6.31 8.286 10.515 15 10.53h29.81v64c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-64h32v64c0 4.418 3.582 8 8 8 4.418 0 8-3.582 8-8v-64h29.82c6.714-.015 12.705-4.22 15-10.53l26.19-72c1.794-4.901 1.085-10.369-1.9-14.65ZM110.68 152 97.58 80h60.84l-13.1 72ZM40 80h41.32l13.09 72h-28.23ZM189.82 152h-28.23L174.68 80h41.32Z"),
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
        return _airTrafficControl!!
    }

private var _airTrafficControl: ImageVector? = null
