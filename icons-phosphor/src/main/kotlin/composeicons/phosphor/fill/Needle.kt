package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Needle: ImageVector
    get() {
        if (_needle != null) return _needle!!
        _needle = phosphorFillIcon(
            name = "Needle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M212.28 43.72c-15.62-15.615-40.94-15.615-56.56 0l-24 24c-1.17 1.168-1.949 2.671-2.23 4.3C120.69 123.28 36 208.73 34.36 210.33h0c-3.126 3.123-3.128 8.189-.005 11.315 3.123 3.126 8.189 3.128 11.315 .005h0c.86-.87 86.83-86.31 138.32-95.15 1.629-.281 3.132-1.06 4.3-2.23l24-24c15.615-15.62 15.615-40.94 0-56.56ZM189.66 77.66l-16 16c-3.126 3.126-8.194 3.126-11.32 0-3.126-3.126-3.126-8.194 0-11.32l16-16c3.126-3.126 8.194-3.126 11.32 0 3.126 3.126 3.126 8.194 0 11.32Z"),
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
        return _needle!!
    }

private var _needle: ImageVector? = null
