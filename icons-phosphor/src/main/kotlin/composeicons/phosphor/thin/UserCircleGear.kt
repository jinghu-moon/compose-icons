package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCircleGear: ImageVector
    get() {
        if (_userCircleGear != null) return _userCircleGear!!
        _userCircleGear = phosphorThinIcon(
            name = "UserCircleGear",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M226.25 66.54 219 62.33c1.387-4.106 1.387-8.554 0-12.66l7.29-4.21c1.809-1.15 2.39-3.522 1.317-5.377-1.073-1.856-3.418-2.536-5.317-1.543l-7.31 4.21C212.106 39.498 208.252 37.269 204 36.4v-8.4c0-2.209-1.791-4-4-4-2.209 0-4 1.791-4 4v8.4c-4.238 .877-8.076 3.106-10.94 6.35l-7.31-4.21c-1.24-.788-2.812-.833-4.095-.117-1.283 .716-2.07 2.078-2.05 3.547 .02 1.469 .844 2.809 2.146 3.49L181 49.67c-1.387 4.106-1.387 8.554 0 12.66l-7.29 4.21c-1.564 .907-2.325 2.75-1.856 4.496 .468 1.746 2.049 2.961 3.856 2.964 .703 .003 1.394-.184 2-.54l7.31-4.21c2.874 3.252 6.728 5.481 10.98 6.35v8.4c0 2.209 1.791 4 4 4 2.209 0 4-1.791 4-4v-8.4c4.238-.877 8.076-3.106 10.94-6.35l7.31 4.21c.606 .356 1.297 .543 2 .54 1.808-.003 3.388-1.218 3.856-2.964 .468-1.746-.293-3.589-1.856-4.496ZM200 68c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12ZM222 108.06c-2.174 .367-3.642 2.425-3.28 4.6 .847 5.07 1.275 10.2 1.28 15.34 .016 24.326-9.635 47.662-26.83 64.87-9.937-16.613-25.868-28.783-44.51-34 17.835-9.485 26.92-29.895 22.033-49.494C165.805 89.776 148.2 76.022 128 76.022c-20.2 0-37.805 13.754-42.693 33.354-4.888 19.6 4.198 40.01 22.033 49.494-18.642 5.217-34.573 17.387-44.51 34C36.634 166.526 28.854 127.012 43.107 92.704 57.36 58.396 90.849 36.027 128 36c5.14 .001 10.27 .425 15.34 1.27 2.168 .342 4.206-1.127 4.569-3.291 .362-2.165-1.087-4.217-3.249-4.599C101.817 22.198 59.244 43.528 39.347 82.145 19.451 120.762 26.794 167.811 57.512 198.528c30.717 30.717 77.766 38.06 116.383 18.164 38.617-19.896 59.948-62.469 52.765-105.313-.166-1.064-.754-2.016-1.631-2.641-.877-.625-1.969-.87-3.029-.679ZM92 120c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36C108.118 156 92 139.882 92 120ZM68.87 198.42c12.081-21.28 34.664-34.428 59.135-34.428 24.471 0 47.054 13.148 59.135 34.428-34.173 28.775-84.097 28.775-118.27 0Z"),
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
        return _userCircleGear!!
    }

private var _userCircleGear: ImageVector? = null
