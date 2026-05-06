package composeicons.phosphor.regular

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.phosphor.PhosphorIcons
import composeicons.phosphor.phosphorRegularIcon

val PhosphorIcons.Regular.PaperPlaneTilt: ImageVector
    get() {
        if (_paperPlaneTilt != null) return _paperPlaneTilt!!
        _paperPlaneTilt = phosphorRegularIcon(
            name = "PaperPlaneTilt",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 256f, height = 256f),
        ) {
            addPath(
                pathData = parseSvgPathData("M227.32 28.68c-4.097-4.094-10.086-5.655-15.66-4.08h-.15L19.57 82.84C13.19 84.679 8.609 90.266 8.056 96.882c-.553 6.616 3.038 12.886 9.024 15.758L102 154l41.3 84.87c2.623 5.597 8.259 9.161 14.44 9.13q.69 0 1.38-.06c6.613-.535 12.196-5.126 14-11.51L231.32 44.49c0-.05 0-.1 0-.15 1.595-5.559 .066-11.547-4-15.66ZM157.83 231.85l-.05 .14v-.07L117.72 149.62l48-48c2.988-3.145 2.925-8.099-.143-11.167-3.068-3.068-8.022-3.131-11.167-.143l-48 48L24.08 98.25h-.07 .14L216 40Z"),
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
        return _paperPlaneTilt!!
    }

private var _paperPlaneTilt: ImageVector? = null
