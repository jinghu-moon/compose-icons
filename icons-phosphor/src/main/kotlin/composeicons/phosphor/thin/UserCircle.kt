package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserCircle: ImageVector
    get() {
        if (_userCircle != null) return _userCircle!!
        _userCircle = phosphorThinIcon(
            name = "UserCircle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM68.87 198.42C80.952 177.145 103.533 164 128 164c24.467 0 47.048 13.144 59.13 34.42-34.17 28.773-84.09 28.773-118.26 0ZM193.17 192.87c-9.937-16.613-25.868-28.783-44.51-34 17.835-9.485 26.92-29.895 22.033-49.494C165.805 89.776 148.2 76.022 128 76.022c-20.2 0-37.805 13.754-42.693 33.354-4.888 19.6 4.198 40.01 22.033 49.494-18.642 5.217-34.573 17.387-44.51 34C26.996 156.908 27.066 98.717 62.985 62.84c35.919-35.877 94.111-35.877 130.03 0 35.919 35.877 35.989 94.068 .155 130.03ZM128 156C108.118 156 92 139.882 92 120c0-19.882 16.118-36 36-36 19.882 0 36 16.118 36 36 0 19.882-16.118 36-36 36Z"),
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
        return _userCircle!!
    }

private var _userCircle: ImageVector? = null
