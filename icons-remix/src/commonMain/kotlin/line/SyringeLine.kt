package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SyringeLine: ImageVector
    get() {
        if (_syringeLine != null) return _syringeLine!!
        _syringeLine = remixIcon(
            name = "SyringeLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 21.678 7.979 L 20.264 9.393 L 18.142 7.272 L 16.021 9.393 L 19.557 12.929 L 18.142 14.343 L 17.435 13.636 L 11.071 20.000 L 5.414 20.000 L 3.293 22.121 L 1.879 20.707 L 4.000 18.586 L 4.000 12.929 L 10.364 6.565 L 9.657 5.858 L 11.071 4.444 L 14.607 7.979 L 16.728 5.858 L 14.607 3.737 L 16.021 2.322 L 21.678 7.979 ZM 16.021 12.222 L 11.778 7.979 L 10.364 9.393 L 12.486 11.515 L 11.071 12.929 L 8.950 10.808 L 7.536 12.222 L 9.657 14.343 L 8.243 15.757 L 6.122 13.636 L 6.000 13.757 L 6.000 18.000 L 10.243 18.000 L 16.021 12.222 Z"),
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
        return _syringeLine!!
    }

private var _syringeLine: ImageVector? = null
