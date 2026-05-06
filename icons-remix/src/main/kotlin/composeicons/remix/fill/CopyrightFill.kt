package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CopyrightFill: ImageVector
    get() {
        if (_copyrightFill != null) return _copyrightFill!!
        _copyrightFill = remixIcon(
            name = "CopyrightFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.52 0 10 4.48 10 10 0 5.52-4.48 10-10 10C6.48 22 2 17.52 2 12 2 6.48 6.48 2 12 2ZM12 7C9.24 7 7 9.24 7 12c0 2.76 2.24 5 5 5 1.819 0 3.413-.973 4.288-2.428L14.573 13.544C14.048 14.417 13.093 15 12 15 10.342 15 9 13.658 9 12 9 10.342 10.342 9 12 9c1.093 0 2.049 .584 2.573 1.457L16.288 9.428C15.413 7.973 13.819 7 12 7Z"),
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
        return _copyrightFill!!
    }

private var _copyrightFill: ImageVector? = null
