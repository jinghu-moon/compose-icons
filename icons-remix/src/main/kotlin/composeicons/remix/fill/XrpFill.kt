package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.XrpFill: ImageVector
    get() {
        if (_xrpFill != null) return _xrpFill!!
        _xrpFill = remixIcon(
            name = "XrpFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M21.778 4h-2.837L14.452 8.371c-.654 .634-1.534 .989-2.452 .989-.918 0-1.798-.355-2.452-.989L5.062 4h-2.839L8.129 9.754c2.14 2.083 5.606 2.083 7.745 0L21.778 4ZM2.223 20h2.828L9.559 15.615c.651-.631 1.529-.985 2.443-.985 .914 0 1.792 .354 2.443 .985L18.952 20h2.826L15.858 14.239c-2.132-2.073-5.585-2.073-7.715 0L2.223 20Z"),
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
        return _xrpFill!!
    }

private var _xrpFill: ImageVector? = null
