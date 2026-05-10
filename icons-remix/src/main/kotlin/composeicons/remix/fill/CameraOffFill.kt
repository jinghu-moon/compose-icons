package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CameraOffFill: ImageVector
    get() {
        if (_cameraOffFill != null) return _cameraOffFill!!
        _cameraOffFill = remixIcon(
            name = "CameraOffFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19.586 21h-16.586c-.552 0-1-.448-1-1v-14c0-.552 .448-1 1-1h.586L1.394 2.808 2.808 1.393 22.607 21.192l-1.414 1.414L19.586 21ZM7.555 8.97C6.589 10.035 6 11.449 6 13c0 3.314 2.686 6 6 6 1.551 0 2.965-.589 4.031-1.555L14.614 16.028c-.701 .606-1.615 .972-2.614 .972C9.791 17 8 15.209 8 13c0-.999 .366-1.913 .972-2.614L7.555 8.97ZM22 17.786 17.955 13.741c.03-.243 .045-.49 .045-.741 0-3.314-2.686-6-6-6-.251 0-.498 .015-.741 .045L8.107 3.893l.893-.893h6l2 2h4c.552 0 1 .448 1 1v11.786ZM13.509 9.294c.996 .406 1.792 1.202 2.198 2.198L13.509 9.294Z"),
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
        return _cameraOffFill!!
    }

private var _cameraOffFill: ImageVector? = null
