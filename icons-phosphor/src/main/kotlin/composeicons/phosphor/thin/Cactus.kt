package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Cactus: ImageVector
    get() {
        if (_cactus != null) return _cactus!!
        _cactus = phosphorThinIcon(
            name = "Cactus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 212h-52v-32h8c35.33-.039 63.961-28.67 64-64C236 102.745 225.255 92 212 92c-13.255 0-24 10.745-24 24 0 8.837-7.163 16-16 16h-8v-76C164 36.118 147.882 20 128 20 108.118 20 92 36.118 92 56v36h-8C75.163 92 68 84.837 68 76 68 62.745 57.255 52 44 52 30.745 52 20 62.745 20 76c.039 35.33 28.67 63.961 64 64h8v72h-52c-2.209 0-4 1.791-4 4 0 2.209 1.791 4 4 4h176c2.209 0 4-1.791 4-4 0-2.209-1.791-4-4-4ZM96 132h-12C53.086 131.967 28.033 106.914 28 76 28 67.163 35.163 60 44 60c8.837 0 16 7.163 16 16 0 13.255 10.745 24 24 24h12c2.209 0 4-1.791 4-4v-40c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28v80c0 2.209 1.791 4 4 4h12c13.255 0 24-10.745 24-24 0-8.837 7.163-16 16-16 8.837 0 16 7.163 16 16-.033 30.914-25.086 55.967-56 56h-12c-2.209 0-4 1.791-4 4v36h-56v-76c0-2.209-1.791-4-4-4Z"),
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
        return _cactus!!
    }

private var _cactus: ImageVector? = null
