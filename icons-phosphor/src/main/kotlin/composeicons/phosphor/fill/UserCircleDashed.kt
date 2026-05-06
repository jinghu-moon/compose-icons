package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.UserCircleDashed: ImageVector
    get() {
        if (_userCircleDashed != null) return _userCircleDashed!!
        _userCircleDashed = phosphorFillIcon(
            name = "UserCircleDashed",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M96.26 37C95.178 32.736 97.742 28.398 102 27.29c17.054-4.398 34.946-4.398 52 0 3.909 1.001 6.46 4.755 5.952 8.758-.508 4.002-3.917 7-7.952 6.992-.675-.004-1.347-.091-2-.26-14.43-3.726-29.57-3.726-44 0-2.058 .528-4.242 .215-6.069-.87C98.104 40.826 96.783 39.059 96.26 37ZM33.35 110c2.045 .568 4.232 .3 6.079-.744 1.847-1.045 3.204-2.781 3.771-4.826C47.191 90.076 54.761 76.97 65.2 66.34c2.893-3.181 2.754-8.08-.315-11.092C61.817 52.237 56.917 52.189 53.79 55.14c-12.334 12.559-21.279 28.042-26 45-.571 2.045-.306 4.233 .736 6.082 1.043 1.849 2.778 3.208 4.824 3.778ZM212.79 104.44c1.182 4.258 5.592 6.752 9.85 5.57 4.258-1.182 6.752-5.592 5.57-9.85-4.719-16.959-13.665-32.442-26-45-3.098-3.151-8.164-3.193-11.315-.095-3.151 3.098-3.193 8.164-.095 11.315 10.433 10.625 17.999 23.724 21.99 38.07ZM222.66 146c-2.046-.568-4.234-.298-6.082 .748-1.848 1.047-3.203 2.785-3.768 4.832-3.587 12.91-10.087 24.826-19 34.83C187.977 177.974 180.572 170.741 172 165.11c-1.497-.993-3.472-.866-4.83 .31-22.468 19.441-55.802 19.441-78.27 0-1.36-1.181-3.341-1.308-4.84-.31-8.627 5.555-16.098 12.727-22 21.12C53.232 176.253 46.792 164.397 43.23 151.56c-1.182-4.258-5.592-6.752-9.85-5.57-4.258 1.182-6.752 5.592-5.57 9.85 12.566 44.966 53.541 76.061 100.23 76.061 46.689 0 87.664-31.094 100.23-76.061 .564-2.049 .289-4.238-.764-6.084-1.052-1.846-2.796-3.197-4.846-3.756ZM128 164c24.301 0 44-19.699 44-44C172 95.699 152.301 76 128 76 103.699 76 84 95.699 84 120c.028 24.289 19.711 43.972 44 44Z"),
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
        return _userCircleDashed!!
    }

private var _userCircleDashed: ImageVector? = null
