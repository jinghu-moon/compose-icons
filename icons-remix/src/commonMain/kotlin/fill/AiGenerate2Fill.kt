package composeicons.remix.fill

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Fill.AiGenerate2Fill: ImageVector
    get() {
        if (_aiGenerate2Fill != null) return _aiGenerate2Fill!!
        _aiGenerate2Fill = remixIcon(
            name = "AiGenerate2Fill",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24.0f, height = 24.0f),
        ) {
    addPath(
        pathData = parseSvgPathData("M 18.000 3.000 C 20.209 3.000 22.000 4.791 22.000 7.000 L 22.000 17.000 C 22.000 19.209 20.209 21.000 18.000 21.000 L 6.000 21.000 C 3.791 21.000 2.000 19.209 2.000 17.000 L 2.000 7.000 C 2.000 4.791 3.791 3.000 6.000 3.000 L 18.000 3.000 ZM 12.588 7.399 C 12.367 6.867 11.633 6.867 11.412 7.399 L 11.095 8.163 C 10.555 9.467 9.548 10.508 8.281 11.071 L 7.385 11.470 C 6.872 11.698 6.872 12.446 7.385 12.674 L 8.335 13.096 C 9.570 13.645 10.559 14.649 11.108 15.909 L 11.416 16.616 C 11.642 17.134 12.358 17.134 12.584 16.616 L 12.892 15.909 C 13.441 14.649 14.431 13.645 15.665 13.096 L 16.615 12.674 C 17.128 12.446 17.128 11.698 16.615 11.470 L 15.719 11.071 C 14.452 10.508 13.444 9.467 12.904 8.163 L 12.588 7.399 Z"),
        pathFillType = PathFillType.NonZero,
        fill = SolidColor(Color(0xFF000000)),
        fillAlpha = 1.0f,
        stroke = null,
        strokeAlpha = 1.0f,
        strokeLineWidth = 0.0f,
        strokeLineCap = StrokeCap.Butt,
        strokeLineJoin = StrokeJoin.Miter,
    )
        }
        return _aiGenerate2Fill!!
    }

private var _aiGenerate2Fill: ImageVector? = null
