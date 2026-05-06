package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.CursorClick: ImageVector
    get() {
        if (_cursorClick != null) return _cursorClick!!
        _cursorClick = phosphorBoldIcon(
            name = "CursorClick",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M224.15 179.17 177.33 132.35l37.92-13.51c.26-.09 .51-.19 .76-.3 7.56-3.339 12.287-10.983 11.897-19.238-.39-8.255-5.817-15.42-13.657-18.032L54.16 29C47.022 26.706 39.2 28.597 33.899 33.899 28.597 39.2 26.706 47.022 29 54.16L81.27 214.24c2.612 7.841 9.777 13.267 18.032 13.657 8.255 .39 15.899-4.338 19.238-11.897 .11-.25 .21-.5 .3-.76l13.51-37.92 46.83 46.82c7.81 7.808 20.47 7.808 28.28 0l16.69-16.68c3.752-3.751 5.861-8.839 5.861-14.145 0-5.306-2.108-10.394-5.861-14.145ZM193.32 204.34 144.84 155.86c-3.75-3.751-8.836-5.859-14.14-5.86-1.251 .002-2.5 .12-3.73 .35-6.5 1.227-11.973 5.588-14.62 11.65-.11 .25-.2 .5-.3 .76l-11.65 32.74L54.29 54.29l141.21 46.11-32.71 11.65c-.25 .09-.51 .19-.76 .3-6.067 2.641-10.435 8.111-11.667 14.611-1.233 6.501 .829 13.19 5.507 17.869h0l48.48 48.48ZM84 16v-4C84 5.373 89.373 0 96 0c6.627 0 12 5.373 12 12v4c0 6.627-5.373 12-12 12C89.373 28 84 22.627 84 16ZM12 108C5.373 108 0 102.627 0 96 0 89.373 5.373 84 12 84h4c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM120.62 24.21l4-12c2.146-6.216 8.894-9.546 15.133-7.47 6.239 2.077 9.644 8.788 7.637 15.05l-4 12c-2.146 6.216-8.894 9.546-15.133 7.47-6.239-2.077-9.644-8.788-7.637-15.05ZM39.39 128.21c2.09 6.285-1.307 13.074-7.59 15.17l-12 4c-4.1 1.484-8.682 .628-11.969-2.236C4.544 142.279 3.069 137.857 3.979 133.593c.91-4.264 4.061-7.699 8.231-8.973l12-4c3.019-1.007 6.315-.773 9.162 .651 2.847 1.423 5.012 3.92 6.018 6.939Z"),
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
        return _cursorClick!!
    }

private var _cursorClick: ImageVector? = null
