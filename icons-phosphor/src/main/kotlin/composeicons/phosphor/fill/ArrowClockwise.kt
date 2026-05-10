package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.ArrowClockwise: ImageVector
    get() {
        if (_arrowClockwise != null) return _arrowClockwise!!
        _arrowClockwise = phosphorFillIcon(
            name = "ArrowClockwise",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M240 56v48c0 4.418-3.582 8-8 8h-48c-3.238 .003-6.158-1.947-7.397-4.938-1.239-2.991-.554-6.434 1.737-8.722l17-17L184.79 71.69l-.25-.24C153.509 40.431 103.284 40.194 71.961 70.918 40.639 101.643 39.908 151.863 70.324 183.486c30.415 31.623 80.626 32.847 112.546 2.744 3.212-3.038 8.277-2.897 11.315 .315 3.038 3.212 2.897 8.277-.315 11.315C176.082 214.704 152.498 224.063 128 224h-1.32C83.419 223.407 45.9 193.95 35.058 152.066 24.216 110.181 42.731 66.22 80.271 44.712 117.811 23.204 165.1 29.464 195.75 60l10.93 10L226.34 50.3c2.293-2.296 5.746-2.979 8.741-1.729 2.995 1.25 4.938 4.185 4.919 7.429Z"),
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
        return _arrowClockwise!!
    }

private var _arrowClockwise: ImageVector? = null
