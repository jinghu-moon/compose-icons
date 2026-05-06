package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserPlus: ImageVector
    get() {
        if (_userPlus != null) return _userPlus!!
        _userPlus = phosphorThinIcon(
            name = "UserPlus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M252 136c0 2.209-1.791 4-4 4h-20v20c0 2.209-1.791 4-4 4-2.209 0-4-1.791-4-4v-20h-20c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4h20v-20c0-2.209 1.791-4 4-4 2.209 0 4 1.791 4 4v20h20c2.209 0 4 1.791 4 4ZM195.06 197.43c1.302 1.698 1.037 4.121-.602 5.497-1.639 1.376-4.071 1.219-5.518-.357C168 177.7 139.3 164 108 164c-31.3 0-60 13.7-80.94 38.57-.895 1.168-2.36 1.749-3.812 1.515-1.453-.235-2.659-1.248-3.141-2.638-.482-1.39-.162-2.933 .833-4.017C37.65 177.53 59.07 164.3 82.83 158.84 54.885 146.886 39.202 116.927 45.303 87.151 51.404 57.375 77.606 35.997 108 35.997c30.394 0 56.596 21.378 62.697 51.154 6.101 29.776-9.582 59.736-37.527 71.689 23.76 5.46 45.18 18.69 61.89 38.59ZM108 156c30.928 0 56-25.072 56-56C164 69.072 138.928 44 108 44 77.072 44 52 69.072 52 100c.033 30.914 25.086 55.967 56 56Z"),
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
        return _userPlus!!
    }

private var _userPlus: ImageVector? = null
