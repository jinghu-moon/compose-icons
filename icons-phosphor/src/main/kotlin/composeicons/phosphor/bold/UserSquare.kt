package composeicons.phosphor.bold

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorBoldIcon

val PhosphorIcons.Bold.UserSquare: ImageVector
    get() {
        if (_userSquare != null) return _userSquare!!
        _userSquare = phosphorBoldIcon(
            name = "UserSquare",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M208 28h-160C36.954 28 28 36.954 28 48v160c0 11.046 8.954 20 20 20h160c11.046 0 20-8.954 20-20v-160C228 36.954 219.046 28 208 28ZM204 52v144.24c-8.112-17.299-21.904-31.299-39.08-39.67 20.185-20.351 20.095-53.198-.201-73.438-20.296-20.24-53.143-20.24-73.439 0-20.296 20.24-20.385 53.087-.201 73.438C73.904 164.941 60.112 178.941 52 196.24v-144.24ZM100 120c0-15.464 12.536-28 28-28 15.464 0 28 12.536 28 28 0 15.464-12.536 28-28 28-15.464 0-28-12.536-28-28ZM128 172c13.725-.055 27.044 4.648 37.69 13.31 6.331 5.13 11.559 11.488 15.37 18.69h-106.12c3.811-7.202 9.039-13.56 15.37-18.69C100.956 176.648 114.275 171.945 128 172Z"),
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
        return _userSquare!!
    }

private var _userSquare: ImageVector? = null
