package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.BoxingLine: ImageVector
    get() {
        if (_boxingLine != null) return _boxingLine!!
        _boxingLine = remixIcon(
            name = "BoxingLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M16.5 2C19.538 2 22 4.462 22 7.5v2.5c0 .888-.386 1.686-.999 2.235L21 17c0 1.306-.834 2.417-1.999 2.829L19 21c0 .552-.448 1-1 1h-12C5.448 22 5 21.552 5 21l0-1.171C3.835 19.417 3 18.306 3 17v-11C3 3.791 4.791 2 7 2h9.5ZM9.5 11h-4.5v6c0 .513 .386 .935 .883 .993L6 18h12c.513 0 .935-.386 .993-.883L19 17v-4l-6.036 .001C12.721 14.697 11.263 16 9.5 16h-3.5v-2h3.5c.78 0 1.42-.595 1.493-1.356L11 12.5c0-.78-.595-1.42-1.356-1.493L9.5 11ZM16.5 4h-9.5C5.946 4 5.082 4.816 5.005 5.851L5 6v3h4.5c1.396 0 2.601 .818 3.163 2h6.337c.513 0 .935-.386 .993-.883L20 10v-2.5C20 5.631 18.536 4.105 16.692 4.005L16.5 4Z"),
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
        return _boxingLine!!
    }

private var _boxingLine: ImageVector? = null
