package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.MoonCloudyFill: ImageVector
    get() {
        if (_moonCloudyFill != null) return _moonCloudyFill!!
        _moonCloudyFill = remixIcon(
            name = "MoonCloudyFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M8.67 5.007C9.793 2.638 12.205 1 15 1c.416 0 .824 .036 1.22 .106C16.077 1.545 16 2.013 16 2.5 16 4.985 18.015 7 20.5 7c.487 0 .955-.077 1.394-.22C21.964 7.176 22 7.584 22 8c0 1.223-.313 2.372-.865 3.373C22.279 12.381 23 13.856 23 15.5 23 18.538 20.538 21 17.5 21h-8.5C4.582 21 1 17.418 1 13 1 8.692 4.405 5.179 8.67 5.007ZM10.847 5.214c2.573 .608 4.666 2.459 5.61 4.884 .337-.065 .686-.099 1.042-.099 .674 0 1.321 .121 1.918 .344 .225-.424 .392-.885 .487-1.37C16.79 8.691 14.309 6.21 14.027 3.095c-1.321 .261-2.455 1.041-3.18 2.12Z"),
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
        return _moonCloudyFill!!
    }

private var _moonCloudyFill: ImageVector? = null
