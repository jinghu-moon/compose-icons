package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCircleCheck: ImageVector
    get() {
        if (_userCircleCheck != null) return _userCircleCheck!!
        _userCircleCheck = phosphorThinIcon(
            name = "UserCircleCheck",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M222 108.05c-1.046 .176-1.98 .761-2.595 1.626-.615 .865-.862 1.938-.685 2.984 .848 5.069 1.276 10.2 1.28 15.34 .014 24.326-9.637 47.661-26.83 64.87-9.937-16.613-25.868-28.783-44.51-34 17.835-9.485 26.92-29.895 22.033-49.494C165.805 89.776 148.2 76.022 128 76.022c-20.2 0-37.805 13.754-42.693 33.354-4.888 19.6 4.198 40.01 22.033 49.494-18.642 5.217-34.573 17.387-44.51 34C36.634 166.526 28.854 127.012 43.107 92.704 57.36 58.396 90.849 36.027 128 36c5.14 .001 10.27 .425 15.34 1.27 2.168 .342 4.206-1.127 4.569-3.291 .362-2.165-1.087-4.217-3.249-4.599C103.274 22.387 61.925 41.983 41.133 78.444 20.34 114.905 24.529 160.469 51.62 192.528c27.092 32.059 71.32 43.788 110.737 29.367C201.775 207.474 227.993 169.973 228 128c-.002-5.582-.464-11.154-1.38-16.66-.174-1.05-.759-1.988-1.626-2.605-.867-.617-1.945-.864-2.994-.685ZM92 120c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36C108.118 156 92 139.882 92 120ZM68.87 198.42C80.952 177.145 103.533 164 128 164c24.467 0 47.048 13.144 59.13 34.42-34.17 28.773-84.09 28.773-118.26 0ZM234.87 42.83l-32 32c-.75 .751-1.768 1.173-2.83 1.173-1.062 0-2.08-.422-2.83-1.173l-16-16c-1.563-1.563-1.563-4.097 0-5.66 1.563-1.563 4.097-1.563 5.66 0L200 66.34 229.17 37.17c1.563-1.563 4.097-1.563 5.66 0 1.563 1.563 1.563 4.097 0 5.66Z"),
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
        return _userCircleCheck!!
    }

private var _userCircleCheck: ImageVector? = null
