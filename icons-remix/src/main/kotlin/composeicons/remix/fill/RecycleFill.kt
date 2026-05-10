package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.RecycleFill: ImageVector
    get() {
        if (_recycleFill != null) return _recycleFill!!
        _recycleFill = remixIcon(
            name = "RecycleFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.561 12.099l1.531 2.652c.966 1.674 .393 3.815-1.281 4.781-.532 .307-1.136 .469-1.75 .469l-2.062-.001v2.001l-5-3.5 5-3.5v1.999l2.062 .001c.088 0 .174-.023 .25-.067 .213-.123 .301-.378 .221-.601l-.038-.082L16.963 13.599l2.598-1.5ZM7.736 9.384l.531 6.08L6.536 14.465 5.504 16.25c-.044 .076-.067 .162-.067 .25 0 .246 .177 .45 .41 .492l.09 .008 3.062-0v3l-3.062 0c-1.933 0-3.5-1.567-3.5-3.5 0-.614 .162-1.218 .469-1.75L3.938 12.965 2.205 11.964 7.736 9.384ZM13.749 2.969c.532 .307 .974 .749 1.281 1.281l1.031 1.786L17.794 5.036l-.531 6.08L11.731 8.536l1.732-1L12.432 5.75c-.044-.076-.107-.139-.183-.183-.213-.123-.478-.072-.631 .109l-.052 .074L10.036 8.402 7.438 6.902 8.968 4.25C9.935 2.576 12.075 2.003 13.749 2.969Z"),
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
        return _recycleFill!!
    }

private var _recycleFill: ImageVector? = null
