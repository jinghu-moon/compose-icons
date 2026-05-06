package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.CoreosLine: ImageVector
    get() {
        if (_coreosLine != null) return _coreosLine!!
        _coreosLine = remixIcon(
            name = "CoreosLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.454 4.414C8.317 4.795 7.249 5.438 6.343 6.343c-3.124 3.124-3.124 8.19 0 11.314 3.124 3.124 8.19 3.124 11.314 0 .964-.964 1.63-2.113 2-3.332-3.4 1.459-7.249 1.98-11.546 1.565C7.4 11.764 7.847 7.938 9.454 4.414ZM11.902 4.001c-.675 1.216-1.189 2.471-1.542 3.769 1.492 .032 2.975 .617 4.114 1.756 1.075 1.075 1.656 2.455 1.745 3.861 1.329-.342 2.588-.82 3.78-1.434-.008-1.311-.336-2.621-.984-3.801C18.657 7.498 18.202 6.888 17.657 6.343 17.083 5.769 16.437 5.295 15.744 4.928 14.547 4.294 13.223 3.985 11.902 4.001ZM4.929 19.071C1.024 15.166 1.024 8.834 4.929 4.929c3.905-3.905 10.237-3.905 14.142 0 3.905 3.905 3.905 10.237 0 14.142-3.905 3.905-10.237 3.905-14.142 0ZM9.949 9.778c-.192 1.363-.217 2.771-.075 4.229 1.524 .061 2.976-.012 4.359-.219 .005-1.03-.385-2.062-1.171-2.849C12.208 10.086 11.065 9.699 9.949 9.778Z"),
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
        return _coreosLine!!
    }

private var _coreosLine: ImageVector? = null
