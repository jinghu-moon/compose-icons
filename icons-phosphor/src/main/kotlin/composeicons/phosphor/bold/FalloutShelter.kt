package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.FalloutShelter: ImageVector
    get() {
        if (_falloutShelter != null) return _falloutShelter!!
        _falloutShelter = phosphorBoldIcon(
            name = "FalloutShelter",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M128 20C68.353 20 20 68.353 20 128c0 59.647 48.353 108 108 108 59.647 0 108-48.353 108-108C235.934 68.381 187.619 20.066 128 20ZM128 212C81.608 212 44 174.392 44 128 44 81.608 81.608 44 128 44c46.392 0 84 37.608 84 84-.05 46.371-37.629 83.95-84 84ZM194 138.66l-24 36c-2.223 3.352-5.978 5.367-10 5.367-4.022 0-7.777-2.015-10-5.367l-22-33-22 33c-2.223 3.352-5.978 5.367-10 5.367-4.022 0-7.777-2.015-10-5.367l-24-36c-2.458-3.685-2.687-8.424-.595-12.328C63.498 122.428 67.57 119.993 72 120h41.58L94 90.66C91.542 86.975 91.313 82.236 93.405 78.332 95.498 74.428 99.57 71.993 104 72h48c4.43-.007 8.502 2.428 10.595 6.332 2.092 3.904 1.864 8.644-.595 12.328L142.42 120h41.58c4.43-.007 8.502 2.428 10.595 6.332 2.092 3.904 1.864 8.644-.595 12.328Z"),
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
        return _falloutShelter!!
    }

private var _falloutShelter: ImageVector? = null
