package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.UserSound: ImageVector
    get() {
        if (_userSound != null) return _userSound!!
        _userSound = phosphorThinIcon(
            name = "UserSound",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M133.17 166.84c27.945-11.954 43.628-41.913 37.527-71.689C164.596 65.375 138.394 43.997 108 43.997c-30.394 0-56.596 21.378-62.697 51.154-6.101 29.776 9.582 59.736 37.527 71.689-23.76 5.46-45.18 18.69-61.89 38.59-.995 1.084-1.315 2.626-.833 4.017 .482 1.39 1.689 2.403 3.141 2.638 1.453 .235 2.917-.347 3.812-1.515C48 185.7 76.71 172 108 172c31.29 0 60 13.7 80.94 38.57 1.448 1.576 3.88 1.733 5.518 .357 1.639-1.376 1.904-3.799 .602-5.497C178.35 185.53 156.93 172.3 133.17 166.84ZM52 108C52 77.072 77.072 52 108 52c30.928 0 56 25.072 56 56 0 30.928-25.072 56-56 56C77.086 163.967 52.033 138.914 52 108ZM203.68 67.17c11.093 26.09 11.093 55.57 0 81.66-.629 1.474-2.077 2.43-3.68 2.43-.539-.003-1.073-.112-1.57-.32-.976-.416-1.747-1.203-2.143-2.188-.396-.985-.384-2.086 .033-3.062 10.24-24.083 10.24-51.297 0-75.38-.867-2.032 .078-4.383 2.11-5.25 2.032-.867 4.383 .078 5.25 2.11ZM244 108c.022 18.423-3.721 36.656-11 53.58-.632 1.47-2.08 2.422-3.68 2.42-.54 .002-1.074-.107-1.57-.32-.977-.418-1.747-1.208-2.141-2.194-.394-.987-.379-2.09 .041-3.066 13.747-32.208 13.747-68.632 0-100.84-.873-2.03 .065-4.382 2.095-5.255 2.03-.873 4.382 .065 5.255 2.095 7.279 16.924 11.022 35.157 11 53.58Z"),
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
        return _userSound!!
    }

private var _userSound: ImageVector? = null
