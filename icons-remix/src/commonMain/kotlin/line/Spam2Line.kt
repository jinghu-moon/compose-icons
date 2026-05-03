package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Spam2Line: ImageVector
    get() {
        if (_spam2Line != null) return _spam2Line!!
        _spam2Line = remixIcon(
            name = "Spam2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 15.936 2.501 L 21.501 8.066 L 21.501 15.936 L 15.936 21.501 L 8.066 21.501 L 2.501 15.936 L 2.501 8.066 L 8.066 2.501 L 15.936 2.501 ZM 15.108 4.501 L 8.894 4.501 L 4.501 8.894 L 4.501 15.108 L 8.894 19.501 L 15.108 19.501 L 19.501 15.108 L 19.501 8.894 L 15.108 4.501 ZM 11.000 15.000 L 13.000 15.000 L 13.000 17.000 L 11.000 17.000 L 11.000 15.000 ZM 11.000 7.000 L 13.000 7.000 L 13.000 13.000 L 11.000 13.000 L 11.000 7.000 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _spam2Line!!
    }

private var _spam2Line: ImageVector? = null
