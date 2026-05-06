package composeicons.phosphor.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorFillIcon

val PhosphorIcons.Fill.Empty: ImageVector
    get() {
        if (_empty != null) return _empty!!
        _empty = phosphorFillIcon(
            name = "Empty",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M170.49 91.59c18.033 21.137 17.841 52.299-.45 73.212C151.749 185.716 120.89 190.057 97.54 175ZM128 72c-21.851 .023-41.693 12.753-50.822 32.606-9.128 19.853-5.875 43.202 8.332 59.804L158.51 81.04C149.436 75.122 138.833 71.981 128 72ZM232 128c0 57.438-46.562 104-104 104C70.562 232 24 185.438 24 128 24 70.562 70.562 24 128 24c57.408 .072 103.928 46.592 104 104ZM200 128c.015-17.98-6.727-35.309-18.89-48.55L186 73.27c2.091-2.112 2.838-5.209 1.941-8.043-.897-2.833-3.291-4.936-6.216-5.46-2.925-.524-5.9 .617-7.725 2.963l-4.91 6.18C138.991 48.173 98.13 53.278 74.059 80.784c-24.071 27.506-23.714 68.683 .831 95.766L70 182.73c-2.599 3.341-2.145 8.129 1.035 10.923 3.181 2.794 7.987 2.626 10.965-.383l4.91-6.18c21.998 15.331 50.695 17.159 74.46 4.742C185.135 179.415 200.023 154.813 200 128Z"),
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
        return _empty!!
    }

private var _empty: ImageVector? = null
