package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.SunCloudyFill: ImageVector
    get() {
        if (_sunCloudyFill != null) return _sunCloudyFill!!
        _sunCloudyFill = remixIcon(
            name = "SunCloudyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.984 5.06C11.132 3.222 13.173 2 15.5 2 19.09 2 22 4.91 22 8.5c0 1.08-.264 2.099-.73 2.995C22.335 12.498 23 13.922 23 15.5 23 18.538 20.538 21 17.5 21h-8.5C4.582 21 1 17.418 1 13 1 8.582 4.582 5 9 5c.333 0 .661 .02 .984 .06ZM12.055 5.604c2.012 .832 3.611 2.462 4.402 4.494 .337-.065 .686-.099 1.042-.099 .735 0 1.437 .144 2.078 .406C19.849 9.827 20 9.181 20 8.5 20 6.015 17.985 4 15.5 4c-1.382 0-2.619 .623-3.445 1.604Z"),
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
        return _sunCloudyFill!!
    }

private var _sunCloudyFill: ImageVector? = null
