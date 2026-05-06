package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.Group2Line: ImageVector
    get() {
        if (_group2Line != null) return _group2Line!!
        _group2Line = remixIcon(
            name = "Group2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M9.55 11.5C8.307 11.5 7.3 10.493 7.3 9.25 7.3 8.007 8.307 7 9.55 7c1.243 0 2.25 1.007 2.25 2.25 0 1.243-1.007 2.25-2.25 2.25ZM10 19.748v-3.348c0-.488 .144-.937 .404-1.338C10.109 15.021 9.807 15 9.5 15c-1.568 0-3.006 .555-4.129 1.48 1.078 1.592 2.715 2.776 4.629 3.268ZM4.453 14.66C5.864 13.617 7.61 13 9.5 13c1.043 0 2.043 .188 2.967 .532 .878-.343 1.926-.532 3.033-.532 1.66 0 3.185 .424 4.206 1.156C19.898 13.47 20 12.747 20 12 20 7.582 16.418 4 12 4 7.582 4 4 7.582 4 12c0 .932 .16 1.828 .453 2.66ZM18.879 16.086C18.486 15.553 17.171 15 15.5 15 13.494 15 12 15.797 12 16.4v3.6c2.925 0 5.484-1.57 6.879-3.914ZM12 22C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10ZM15.5 12.5c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.105 0 2 .895 2 2 0 1.105-.895 2-2 2Z"),
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
        return _group2Line!!
    }

private var _group2Line: ImageVector? = null
