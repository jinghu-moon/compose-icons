package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.Bandaids: ImageVector
    get() {
        if (_bandaids != null) return _bandaids!!
        _bandaids = phosphorRegularIcon(
            name = "Bandaids",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M184.57 128l27.71-27.72C222.678 90.237 226.849 75.365 223.188 61.38 219.527 47.395 208.605 36.473 194.62 32.812c-13.985-3.661-28.857 .51-38.9 10.908L128 71.43 100.28 43.72C90.237 33.322 75.365 29.151 61.38 32.812 47.395 36.473 36.473 47.395 32.812 61.38c-3.661 13.985 .51 28.857 10.908 38.9L71.43 128 43.72 155.72C33.322 165.763 29.151 180.635 32.812 194.62c3.661 13.985 14.582 24.907 28.568 28.568 13.985 3.661 28.857-.51 38.9-10.908L128 184.57l27.72 27.71c10.043 10.398 24.915 14.569 38.9 10.908 13.985-3.661 24.907-14.582 28.568-28.568 3.661-13.985-.51-28.857-10.908-38.9ZM167 55c9.389-9.389 24.611-9.389 34 0 9.389 9.389 9.389 24.611 0 34l-27.72 27.72L139.31 82.75ZM161.91 128 128 161.94 94.06 128 128 94.06ZM55 89h0C45.611 79.611 45.611 64.389 55 55c9.389-9.389 24.611-9.389 34 0l27.72 27.72L82.75 116.69ZM89 201c-9.389 9.389-24.611 9.389-34 0-9.389-9.389-9.389-24.611 0-34L82.72 139.28l33.94 33.94ZM201 201c-4.503 4.519-10.62 7.059-17 7.059-6.38 0-12.497-2.54-17-7.059L139.28 173.28l33.94-33.94L201 167c4.519 4.503 7.059 10.62 7.059 17 0 6.38-2.54 12.497-7.059 17ZM116 128c0-6.627 5.373-12 12-12 6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12Z"),
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
        return _bandaids!!
    }

private var _bandaids: ImageVector? = null
