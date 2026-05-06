package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.AirplaneInFlight: ImageVector
    get() {
        if (_airplaneInFlight != null) return _airplaneInFlight!!
        _airplaneInFlight = phosphorBoldIcon(
            name = "AirplaneInFlight",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M228 216c0 6.627-5.373 12-12 12h-144c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h144c6.627 0 12 5.373 12 12ZM252 136v24c0 6.627-5.373 12-12 12h-178.93C41.609 172.091 24.432 159.307 18.93 140.64L4.86 93.75C3.043 87.697 4.194 81.141 7.964 76.069 11.734 70.997 17.68 68.005 24 68h8c3.18 0 6.23 1.263 8.48 3.51L61 92h15.27L69 70.32C66.967 64.217 67.994 57.509 71.759 52.294 75.524 47.078 81.568 43.992 88 44h8c3.18 0 6.23 1.263 8.48 3.51L149 92h59c24.289 .028 43.972 19.711 44 44ZM228 136c0-11.046-8.954-20-20-20h-64c-3.18-0-6.23-1.263-8.48-3.51L94.83 71.79l9.47 28.42c1.218 3.66 .603 7.682-1.654 10.81-2.257 3.128-5.879 4.981-9.736 4.98h-36.91c-3.184 .003-6.238-1.26-8.49-3.51L30.4 95.36l11.51 38.39c2.508 8.482 10.315 14.288 19.16 14.25h166.93Z"),
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
        return _airplaneInFlight!!
    }

private var _airplaneInFlight: ImageVector? = null
