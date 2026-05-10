package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.CarWashingFill: ImageVector
    get() {
        if (_carWashingFill != null) return _carWashingFill!!
        _carWashingFill = remixIcon(
            name = "CarWashingFill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M19 21h-14v1c0 .552-.448 1-1 1h-1C2.448 23 2 22.552 2 22v-9L4.417 8.971c.361-.602 1.012-.971 1.715-.971h11.735c.703 0 1.354 .369 1.715 .971L22 13v9c0 .552-.448 1-1 1h-1c-.552 0-1-.448-1-1v-1ZM4.332 13h15.335L17.868 10h-11.735L4.332 13ZM6.5 18C7.328 18 8 17.328 8 16.5 8 15.672 7.328 15 6.5 15 5.672 15 5 15.672 5 16.5 5 17.328 5.672 18 6.5 18ZM17.5 18C18.328 18 19 17.328 19 16.5 19 15.672 18.328 15 17.5 15 16.672 15 16 15.672 16 16.5c0 .828 .672 1.5 1.5 1.5ZM5.439 3.439 6.5 2.379 7.561 3.439C7.832 3.711 8 4.086 8 4.5 8 5.328 7.328 6 6.5 6 5.672 6 5 5.328 5 4.5c0-.414 .168-.789 .439-1.061ZM10.939 3.439 12 2.379l1.061 1.061c.271 .271 .439 .646 .439 1.061 0 .828-.672 1.5-1.5 1.5-.828 0-1.5-.672-1.5-1.5 0-.414 .168-.789 .439-1.061ZM16.439 3.439 17.5 2.379l1.061 1.061c.271 .271 .439 .646 .439 1.061 0 .828-.672 1.5-1.5 1.5C16.672 6 16 5.328 16 4.5c0-.414 .168-.789 .439-1.061Z"),
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
        return _carWashingFill!!
    }

private var _carWashingFill: ImageVector? = null
