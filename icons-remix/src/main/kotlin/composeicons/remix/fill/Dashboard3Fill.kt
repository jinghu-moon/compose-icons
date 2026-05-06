package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.Dashboard3Fill: ImageVector
    get() {
        if (_dashboard3Fill != null) return _dashboard3Fill!!
        _dashboard3Fill = remixIcon(
            name = "Dashboard3Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 5.523-4.477 10-10 10C6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM16.596 7.404c-.205-.205-.527-.233-.763-.066-2.889 2.028-4.52 3.229-4.894 3.602-.586 .586-.586 1.536 0 2.121 .586 .586 1.536 .586 2.121 0 .219-.219 1.418-1.851 3.598-4.897 .168-.235 .141-.556-.062-.76ZM17.5 11c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1ZM6.5 11c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1ZM8.818 7.404c-.391-.391-1.024-.391-1.414 0-.391 .391-.391 1.024 0 1.414 .391 .391 1.024 .391 1.414 0 .391-.391 .391-1.024 0-1.414ZM12 5.5c-.552 0-1 .448-1 1 0 .552 .448 1 1 1 .552 0 1-.448 1-1 0-.552-.448-1-1-1Z"),
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
        return _dashboard3Fill!!
    }

private var _dashboard3Fill: ImageVector? = null
