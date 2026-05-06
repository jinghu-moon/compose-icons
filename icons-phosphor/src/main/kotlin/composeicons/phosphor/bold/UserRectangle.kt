package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserRectangle: ImageVector
    get() {
        if (_userRectangle != null) return _userRectangle!!
        _userRectangle = phosphorBoldIcon(
            name = "UserRectangle",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M216 36h-176C28.954 36 20 44.954 20 56v144c0 11.046 8.954 20 20 20h176c11.046 0 20-8.954 20-20v-144C236 44.954 227.046 36 216 36ZM100 128c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28ZM128 180c15.155-.049 29.76 5.672 40.85 16h-81.7C98.24 185.672 112.845 179.951 128 180ZM212 196h-12.44C191.277 182.421 179.286 171.492 165 164.5c20.119-20.374 19.982-53.18-.308-73.384-20.289-20.205-53.095-20.205-73.385 0C71.018 111.32 70.881 144.126 91 164.5 76.714 171.492 64.723 182.421 56.44 196h-12.44v-136h168Z"),
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
        return _userRectangle!!
    }

private var _userRectangle: ImageVector? = null
