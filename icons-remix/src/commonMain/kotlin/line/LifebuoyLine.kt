package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.LifebuoyLine: ImageVector
    get() {
        if (_lifebuoyLine != null) return _lifebuoyLine!!
        _lifebuoyLine = remixIcon(
            name = "LifebuoyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 12.000 2.000 C 17.523 2.000 22.000 6.477 22.000 12.000 C 22.000 17.523 17.523 22.000 12.000 22.000 C 6.477 22.000 2.000 17.523 2.000 12.000 C 2.000 6.477 6.477 2.000 12.000 2.000 ZM 12.000 17.000 C 11.355 17.000 10.739 16.878 10.172 16.656 L 7.936 18.892 C 9.127 19.596 10.516 20.000 12.000 20.000 C 13.484 20.000 14.873 19.596 16.064 18.892 L 13.828 16.656 C 13.261 16.878 12.645 17.000 12.000 17.000 ZM 4.000 12.000 C 4.000 13.484 4.404 14.873 5.108 16.064 L 7.345 13.828 C 7.122 13.261 7.000 12.645 7.000 12.000 C 7.000 11.355 7.122 10.739 7.345 10.172 L 5.108 7.936 C 4.404 9.127 4.000 10.516 4.000 12.000 ZM 18.892 7.936 L 16.656 10.172 C 16.878 10.739 17.000 11.355 17.000 12.000 C 17.000 12.645 16.878 13.261 16.656 13.828 L 18.892 16.064 C 19.596 14.873 20.000 13.484 20.000 12.000 C 20.000 10.516 19.596 9.127 18.892 7.936 ZM 12.000 9.000 C 10.343 9.000 9.000 10.343 9.000 12.000 C 9.000 13.657 10.343 15.000 12.000 15.000 C 13.657 15.000 15.000 13.657 15.000 12.000 C 15.000 10.343 13.657 9.000 12.000 9.000 ZM 12.000 4.000 C 10.516 4.000 9.127 4.404 7.936 5.108 L 10.172 7.345 C 10.739 7.122 11.355 7.000 12.000 7.000 C 12.645 7.000 13.261 7.122 13.828 7.345 L 16.064 5.108 C 14.873 4.404 13.484 4.000 12.000 4.000 Z"),
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
        return _lifebuoyLine!!
    }

private var _lifebuoyLine: ImageVector? = null
