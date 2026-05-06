package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.RowsPlusTop: ImageVector
    get() {
        if (_rowsPlusTop != null) return _rowsPlusTop!!
        _rowsPlusTop = phosphorBoldIcon(
            name = "RowsPlusTop",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 156h-160c-11.046 0-20 8.954-20 20v24c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-24c0-11.046-8.954-20-20-20ZM204 196h-152v-16h152ZM208 80h-160C36.954 80 28 88.954 28 100v24c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-24C228 88.954 219.046 80 208 80ZM204 120h-152v-16h152ZM96 36c0-6.627 5.373-12 12-12h8v-8C116 9.373 121.373 4 128 4c6.627 0 12 5.373 12 12v8h8c6.627 0 12 5.373 12 12 0 6.627-5.373 12-12 12h-8v8c0 6.627-5.373 12-12 12-6.627 0-12-5.373-12-12v-8h-8C101.373 48 96 42.627 96 36Z"),
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
        return _rowsPlusTop!!
    }

private var _rowsPlusTop: ImageVector? = null
