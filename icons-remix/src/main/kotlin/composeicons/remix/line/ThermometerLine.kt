package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.ThermometerLine: ImageVector
    get() {
        if (_thermometerLine != null) return _thermometerLine!!
        _thermometerLine = remixIcon(
            name = "ThermometerLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M20.556 3.444c1.562 1.562 1.562 4.095 0 5.657l-8.2 8.2c-.642 .642-1.484 1.047-2.387 1.147l-3.379 .374L4.293 21.121c-.391 .391-1.024 .391-1.414 0-.391-.39-.391-1.024 0-1.414L5.177 17.408l.375-3.378c.1-.903 .505-1.744 1.147-2.387L14.9 3.444c1.562-1.562 4.095-1.562 5.657 0ZM16.314 4.858 8.114 13.058c-.321 .321-.523 .742-.574 1.193l-.276 2.485 2.485-.276c.451-.05 .872-.252 1.193-.574l.422-.422L9.95 14.05l1.414-1.414 1.414 1.414 1.414-1.414L12.778 11.222 14.193 9.808l1.414 1.414L17.021 9.807 15.607 8.393 17.021 6.979l1.414 1.414 .707-.707c.781-.781 .781-2.047 0-2.828-.781-.781-2.047-.781-2.828 0Z"),
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
        return _thermometerLine!!
    }

private var _thermometerLine: ImageVector? = null
