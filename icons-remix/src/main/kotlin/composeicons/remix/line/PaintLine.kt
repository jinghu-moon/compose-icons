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
                pathData = parseSvgPathData("M19.228 18.732l1.768-1.768 1.768 1.768c.976 .976 .976 2.559 0 3.535-.976 .976-2.559 .976-3.536 0-.976-.976-.976-2.559 0-3.535ZM8.879 1.08 20.192 12.393c.39 .391 .39 1.024 0 1.414l-8.485 8.485c-.391 .39-1.024 .39-1.414 0L1.808 13.808c-.391-.391-.391-1.024 0-1.414L9.586 4.615 7.464 2.494 8.879 1.08ZM11 6.029 3.929 13.101l7.071 7.071 7.071-7.071L11 6.029Z"),
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
