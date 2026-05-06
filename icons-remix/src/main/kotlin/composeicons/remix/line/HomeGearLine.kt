package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.HomeGearLine: ImageVector
    get() {
        if (_homeGearLine != null) return _homeGearLine!!
        _homeGearLine = remixIcon(
            name = "HomeGearLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 21h-14C4.448 21 4 20.552 4 20v-9h-3L11.327 1.612c.381-.347 .964-.347 1.345 0L23 11h-3v9c0 .552-.448 1-1 1ZM6 19h12v-9.843L12 3.703 6 9.157v9.843ZM8.591 13.809c-.062-.26-.095-.532-.095-.811 0-.279 .033-.551 .094-.811l-.991-.572L8.6 9.883l.992 .573c.393-.372 .872-.653 1.404-.812v-1.144h1.999v1.144c.532 .158 1.011 .44 1.404 .812l.992-.573 1 1.731-.991 .572c.062 .26 .095 .532 .095 .811 0 .279-.033 .551-.094 .811l.991 .572-.999 1.731-.992-.573c-.393 .372-.872 .653-1.404 .812v1.144h-1.999v-1.144c-.532-.158-1.011-.44-1.404-.812l-.992 .573L7.6 14.381l.991-.572ZM11.995 14.497c.828 0 1.499-.671 1.499-1.499 0-.828-.671-1.499-1.499-1.499-.828 0-1.499 .671-1.499 1.499 0 .828 .671 1.499 1.499 1.499Z"),
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
        return _homeGearLine!!
    }

private var _homeGearLine: ImageVector? = null
