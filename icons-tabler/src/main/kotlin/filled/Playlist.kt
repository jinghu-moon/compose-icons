package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Playlist: ImageVector
    get() {
        if (_playlist != null) return _playlist!!
        _playlist = tablerFilledIcon(
            name = "Playlist",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 21.000 3.000 C 21.552 3.000 22.000 3.448 22.000 4.000 C 22.000 4.552 21.552 5.000 21.000 5.000 L 18.000 5.000 L 18.000 17.000 C 18.000 18.810 16.784 20.395 15.035 20.863 C 13.287 21.332 11.441 20.568 10.536 19.000 C 9.631 17.432 9.891 15.452 11.171 14.172 C 12.451 12.891 14.431 12.630 15.999 13.535 L 16.000 4.000 C 16.000 3.448 16.448 3.000 17.000 3.000 Z"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 14.000 5.000 C 14.000 5.552 13.552 6.000 13.000 6.000 L 3.000 6.000 C 2.448 6.000 2.000 5.552 2.000 5.000 C 2.000 4.448 2.448 4.000 3.000 4.000 L 13.000 4.000 C 13.552 4.000 14.000 4.448 14.000 5.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 14.000 9.000 C 14.000 9.552 13.552 10.000 13.000 10.000 L 3.000 10.000 C 2.448 10.000 2.000 9.552 2.000 9.000 C 2.000 8.448 2.448 8.000 3.000 8.000 L 13.000 8.000 C 13.552 8.000 14.000 8.448 14.000 9.000"),
                pathFillType = PathFillType.NonZero,
                fill = SolidColor(Color(0xFF000000)),
                fillAlpha = 1f,
                stroke = null,
                strokeAlpha = 1f,
                strokeLineWidth = 0f,
                strokeLineCap = StrokeCap.Butt,
                strokeLineJoin = StrokeJoin.Miter,
            )
            addPath(
                pathData = parseSvgPathData("M 10.000 13.000 C 10.000 13.552 9.552 14.000 9.000 14.000 L 3.000 14.000 C 2.448 14.000 2.000 13.552 2.000 13.000 C 2.000 12.448 2.448 12.000 3.000 12.000 L 9.000 12.000 C 9.552 12.000 10.000 12.448 10.000 13.000"),
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
        return _playlist!!
    }

private var _playlist: ImageVector? = null
