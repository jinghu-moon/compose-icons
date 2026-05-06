package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.Backpack: ImageVector
    get() {
        if (_backpack != null) return _backpack!!
        _backpack = phosphorBoldIcon(
            name = "Backpack",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M172 48.55v-12.55C172 20.536 159.464 8 144 8h-32C96.536 8 84 20.536 84 36v12.55C54.246 52.588 32.042 77.973 32 108v112c0 11.046 8.954 20 20 20h152c11.046 0 20-8.954 20-20v-112C223.958 77.973 201.754 52.588 172 48.55ZM112 32h32c2.209 0 4 1.791 4 4v12h-40v-12c0-2.209 1.791-4 4-4ZM160 160h-64v-8c0-2.209 1.791-4 4-4h56c2.209 0 4 1.791 4 4ZM96 184h64v32h-64ZM200 216h-16v-64c0-15.464-12.536-28-28-28h-56c-15.464 0-28 12.536-28 28v64h-16v-108C56 88.118 72.118 72 92 72h72c19.882 0 36 16.118 36 36ZM160 100c0 6.627-5.373 12-12 12h-40c-6.627 0-12-5.373-12-12 0-6.627 5.373-12 12-12h40c6.627 0 12 5.373 12 12Z"),
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
        return _backpack!!
    }

private var _backpack: ImageVector? = null
