package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Disc: ImageVector
    get() {
        if (_disc != null) return _disc!!
        _disc = phosphorThinIcon(
            name = "Disc",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 28C72.772 28 28 72.772 28 128c0 55.228 44.772 100 100 100 55.228 0 100-44.772 100-100C227.939 72.797 183.203 28.061 128 28ZM163.77 124c-.75-6.753-3.407-13.152-7.66-18.45L195.79 65.87c14.65 15.922 23.194 36.514 24.12 58.13ZM156 128c0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28 0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28ZM128 220C86.842 220.03 50.671 192.72 39.43 153.126 28.189 113.532 44.614 71.29 79.649 49.689 114.683 28.088 159.802 32.384 190.13 60.21L150.45 99.89C137.613 89.642 119.467 89.383 106.343 99.26c-13.124 9.877-17.899 27.386-11.605 42.558 6.294 15.172 22.06 24.16 38.322 21.847 16.262-2.313 28.897-15.34 30.711-31.666h56.14c-2.197 49.182-42.679 87.942-91.91 88Z"),
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
        return _disc!!
    }

private var _disc: ImageVector? = null
