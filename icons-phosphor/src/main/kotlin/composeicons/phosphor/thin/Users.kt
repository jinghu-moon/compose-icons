package composeicons.phosphor.thin

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorThinIcon

val PhosphorIcons.Thin.Users: ImageVector
    get() {
        if (_users != null) return _users!!
        _users = phosphorThinIcon(
            name = "Users",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M107.19 159c23.99-10.914 37.123-37.079 31.539-62.837C133.145 70.405 110.356 52.027 84 52.027c-26.356 0-49.145 18.378-54.729 44.136-5.584 25.758 7.549 51.923 31.539 62.837C38.619 164.752 19.382 178.595 6.88 197.81c-.805 1.197-.904 2.735-.257 4.025 .646 1.29 1.937 2.132 3.378 2.203 1.441 .071 2.809-.638 3.58-1.858C29.077 178.35 55.574 163.973 84 163.973c28.426 0 54.923 14.376 70.42 38.207 .771 1.22 2.139 1.93 3.579 1.858 1.441-.072 2.732-.913 3.378-2.203 .646-1.29 .548-2.828-.257-4.025C148.618 178.595 129.381 164.752 107.19 159ZM36 108C36 81.49 57.49 60 84 60c26.51 0 48 21.49 48 48 0 26.51-21.49 48-48 48C57.502 155.972 36.028 134.498 36 108ZM248 203.35c-1.85 1.202-4.325 .679-5.53-1.17C226.982 178.318 200.447 163.942 172 164c-2.209 0-4-1.791-4-4 0-2.209 1.791-4 4-4 19.336-.011 36.777-11.622 44.247-29.456 7.47-17.835 3.51-38.41-10.047-52.197C192.644 60.559 172.138 56.252 154.18 63.42c-2.052 .828-4.387-.163-5.215-2.215-.828-2.052 .163-4.387 2.215-5.215 28.443-12.15 61.35 1.057 73.5 29.5 12.15 28.443-1.057 61.35-29.5 73.5 22.199 5.764 41.437 19.627 53.93 38.86 1.193 1.829 .699 4.277-1.11 5.5Z"),
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
        return _users!!
    }

private var _users: ImageVector? = null
