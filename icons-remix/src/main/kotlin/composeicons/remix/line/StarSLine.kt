package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.StarSLine: ImageVector
    get() {
        if (_starSLine != null) return _starSLine!!
        _starSLine = remixIcon(
            name = "StarSLine",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 17 6.122 20.59 7.72 13.891 2.489 9.41 9.355 8.859 12 2.5l2.645 6.359 6.866 .55-5.231 4.481 1.598 6.7L12 17ZM12 14.656l2.817 1.72-.766-3.21 2.507-2.147-3.29-.264L12 7.708l-1.267 3.047-3.29 .264 2.507 2.147-.766 3.21 2.817-1.72Z"),
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
        return _starSLine!!
    }

private var _starSLine: ImageVector? = null
