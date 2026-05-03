package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.PaintLine: ImageVector
    get() {
        if (_paintLine != null) return _paintLine!!
        _paintLine = remixIcon(
            name = "PaintLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 19.228 18.732 L 20.996 16.965 L 22.763 18.732 C 23.740 19.709 23.740 21.292 22.763 22.268 C 21.787 23.244 20.204 23.244 19.228 22.268 C 18.251 21.292 18.251 19.709 19.228 18.732 ZM 8.879 1.080 L 20.192 12.393 C 20.583 12.784 20.583 13.417 20.192 13.808 L 11.707 22.293 C 11.316 22.683 10.683 22.683 10.293 22.293 L 1.808 13.808 C 1.417 13.417 1.417 12.784 1.808 12.393 L 9.586 4.615 L 7.464 2.494 L 8.879 1.080 ZM 11.000 6.029 L 3.929 13.101 L 11.000 20.172 L 18.071 13.101 L 11.000 6.029 Z"),
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
        return _paintLine!!
    }

private var _paintLine: ImageVector? = null
