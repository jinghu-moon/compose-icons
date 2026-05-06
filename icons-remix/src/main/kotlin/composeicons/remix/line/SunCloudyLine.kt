package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.SunCloudyLine: ImageVector
    get() {
        if (_sunCloudyLine != null) return _sunCloudyLine!!
        _sunCloudyLine = remixIcon(
            name = "SunCloudyLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.984 5.06C11.132 3.222 13.173 2 15.5 2 19.09 2 22 4.91 22 8.5c0 1.08-.264 2.099-.73 2.995C22.335 12.498 23 13.922 23 15.5 23 18.538 20.538 21 17.5 21h-8.5C4.582 21 1 17.418 1 13 1 8.582 4.582 5 9 5c.333 0 .661 .02 .984 .06ZM12.055 5.604c2.012 .832 3.611 2.462 4.402 4.494 .337-.065 .686-.099 1.042-.099 .735 0 1.437 .144 2.078 .406C19.849 9.827 20 9.181 20 8.5 20 6.015 17.985 4 15.5 4c-1.382 0-2.619 .623-3.445 1.604ZM17.5 19C19.433 19 21 17.433 21 15.5 21 13.567 19.433 12 17.5 12c-.979 0-1.865 .402-2.5 1.051C15 13.034 15 13.017 15 13 15 9.686 12.314 7 9 7 5.686 7 3 9.686 3 13c0 3.314 2.686 6 6 6h8.5Z"),
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
        return _sunCloudyLine!!
    }

private var _sunCloudyLine: ImageVector? = null
