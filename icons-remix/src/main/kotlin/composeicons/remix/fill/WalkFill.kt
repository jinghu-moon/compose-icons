package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.WalkFill: ImageVector
    get() {
        if (_walkFill != null) return _walkFill!!
        _walkFill = remixIcon(
            name = "WalkFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M7.617 8.712 10.822 6.384c.352-.256 .786-.398 1.243-.383 1.111 .027 2.087 .756 2.427 1.82 .186 .584 .356 .978 .51 1.182 .912 1.213 2.364 1.998 3.998 1.998v2c-2.175 0-4.118-.992-5.402-2.547l-.698 3.956 2.061 1.73 2.223 6.108-1.879 .684L13.266 17.326 9.876 14.481c-.548-.443-.844-1.162-.713-1.904L9.671 9.692l-.677 .492L6.867 13.112 5.249 11.936 7.6 8.7l.017 .012ZM13.5 5.5c-1.105 0-2-.895-2-2 0-1.105 .895-2 2-2 1.104 0 2 .895 2 2 0 1.105-.896 2-2 2ZM10.529 18.681 7.315 22.512 5.783 21.226 8.758 17.68l.747-2.18L11.295 17l-.767 1.681Z"),
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
        return _walkFill!!
    }

private var _walkFill: ImageVector? = null
