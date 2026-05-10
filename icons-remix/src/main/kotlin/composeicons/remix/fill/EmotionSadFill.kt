package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.EmotionSadFill: ImageVector
    get() {
        if (_emotionSadFill != null) return _emotionSadFill!!
        _emotionSadFill = remixIcon(
            name = "EmotionSadFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M12 2c5.523 0 10 4.477 10 10 0 1.617-.384 3.144-1.065 4.496-.071-.278-.204-.543-.397-.775l-.123-.135L19 14.172l-1.414 1.414-.117 .127c-.662 .786-.623 1.961 .117 2.701 .428 .428 1.002 .622 1.562 .58C17.332 20.849 14.801 22 12 22 6.477 22 2 17.523 2 12 2 6.477 6.477 2 12 2ZM12 15c-1.38 0-2.63 .559-3.534 1.463l-.166 .174 .945 .859C10.035 17.183 10.982 17 12 17c.905 0 1.754 .144 2.486 .396l.269 .1 .945-.859C14.785 15.631 13.466 15 12 15ZM8.5 10C7.672 10 7 10.672 7 11.5 7 12.328 7.672 13 8.5 13 9.328 13 10 12.328 10 11.5 10 10.672 9.328 10 8.5 10ZM15.5 10C14.672 10 14 10.672 14 11.5c0 .828 .672 1.5 1.5 1.5C16.328 13 17 12.328 17 11.5 17 10.672 16.328 10 15.5 10Z"),
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
        return _emotionSadFill!!
    }

private var _emotionSadFill: ImageVector? = null
