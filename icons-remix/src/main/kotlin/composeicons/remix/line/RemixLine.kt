package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.RemixLine: ImageVector
    get() {
        if (_remixLine != null) return _remixLine!!
        _remixLine = remixIcon(
            name = "RemixLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.512 0 9.982 4.46 9.999 9.968 0 .007-0 .014 0 .021 0 .004 .001 .008 .001 .012 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 4C10.075 4 8.309 4.68 6.929 5.812 7.584 5.61 8.28 5.5 9 5.5c3.866 0 7 3.134 7 7 0 .552-.448 1-1 1-.552 0-1-.448-1-1C14 9.739 11.761 7.5 9 7.5c-2.611 0-4.769 2.001-4.999 4.543C4.024 16.441 7.596 20 12 20c1.925 0 3.69-.681 5.07-1.813-.655 .202-1.35 .313-2.07 .313-3.866 0-7-3.134-7-7 0-.552 .448-1 1-1 .552 0 1 .448 1 1 0 2.761 2.239 5 5 5 2.612 0 4.768-2.001 4.998-4.544C19.974 7.558 16.404 4 12 4Z"),
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
        return _remixLine!!
    }

private var _remixLine: ImageVector? = null
