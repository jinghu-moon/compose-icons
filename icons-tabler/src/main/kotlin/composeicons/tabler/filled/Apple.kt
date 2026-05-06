package composeicons.tabler.filled

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerFilledIcon

val TablerIcons.Filled.Apple: ImageVector
    get() {
        if (_apple != null) return _apple!!
        _apple = tablerFilledIcon(
            name = "Apple",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M15 2c.529 .001 .966 .413 .997 .941 .031 .528-.355 .989-.88 1.052L15 4c-.693 0-1.33 .694-1.691 1.552 .617-.314 1.291-.499 1.982-.544L15.556 5C18.538 5 21 8.053 21 11.32c0 3.547-.606 5.862-2.423 8.578-1.692 2.251-4.092 2.753-6.41 1.234-.096-.061-.217-.065-.317-.01C9.515 22.65 7.115 22.149 5.39 19.852 3.607 17.184 3 14.868 3 11.32l.004-.222C3.112 7.917 5.53 5 8.444 5c.94 0 1.852 .291 2.688 .792C11.551 3.842 12.95 2 15 2M7.966 8.154C6.606 9.012 6 10.214 6 12c0 .552 .448 1 1 1 .552 0 1-.448 1-1C8 10.875 8.28 10.322 9.034 9.846c.467-.295 .607-.913 .312-1.38C9.051 7.999 8.433 7.859 7.966 8.154"),
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
        return _apple!!
    }

private var _apple: ImageVector? = null
