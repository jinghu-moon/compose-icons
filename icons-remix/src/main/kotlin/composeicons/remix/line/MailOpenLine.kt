package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.MailOpenLine: ImageVector
    get() {
        if (_mailOpenLine != null) return _mailOpenLine!!
        _mailOpenLine = remixIcon(
            name = "MailOpenLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M2.243 6.854 11.49 1.309c.317-.19 .712-.19 1.029 0l9.239 5.546c.151 .09 .243 .253 .243 .429v12.717c0 .552-.448 1-1 1h-18C2.448 21 2 20.552 2 20v-12.717c0-.176 .092-.338 .243-.429ZM4 8.133v10.867h16v-10.868L12.004 3.332 4 8.133ZM12.06 13.698 17.356 9.235l1.289 1.529-6.57 5.537L5.364 10.772 6.636 9.228l5.424 4.47Z"),
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
        return _mailOpenLine!!
    }

private var _mailOpenLine: ImageVector? = null
