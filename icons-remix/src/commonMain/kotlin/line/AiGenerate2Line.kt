package composeicons.remix.line

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.remix.RemixIcons
import composeicons.remix.remixIcon

val RemixIcons.Line.AiGenerate2Line: ImageVector
    get() {
        if (_aiGenerate2Line != null) return _aiGenerate2Line!!
        _aiGenerate2Line = remixIcon(
            name = "AiGenerate2Line",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 18.000 3.000 C 20.209 3.000 22.000 4.791 22.000 7.000 L 22.000 17.000 C 22.000 19.209 20.209 21.000 18.000 21.000 L 6.000 21.000 C 3.791 21.000 2.000 19.209 2.000 17.000 L 2.000 7.000 C 2.000 4.791 3.791 3.000 6.000 3.000 L 18.000 3.000 ZM 6.000 5.000 C 4.895 5.000 4.000 5.895 4.000 7.000 L 4.000 17.000 C 4.000 18.105 4.895 19.000 6.000 19.000 L 18.000 19.000 C 19.105 19.000 20.000 18.105 20.000 17.000 L 20.000 7.000 C 20.000 5.895 19.105 5.000 18.000 5.000 L 6.000 5.000 ZM 11.412 7.399 C 11.633 6.867 12.367 6.867 12.588 7.399 L 12.904 8.163 C 13.444 9.467 14.452 10.508 15.719 11.071 L 16.615 11.470 C 17.128 11.698 17.128 12.446 16.615 12.674 L 15.665 13.096 C 14.431 13.645 13.441 14.649 12.892 15.909 L 12.584 16.616 C 12.358 17.134 11.642 17.134 11.416 16.616 L 11.108 15.909 C 10.559 14.649 9.570 13.645 8.335 13.096 L 7.385 12.674 C 6.872 12.446 6.872 11.698 7.385 11.470 L 8.281 11.071 C 9.548 10.508 10.555 9.467 11.095 8.163 L 11.412 7.399 Z"),
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
        return _aiGenerate2Line!!
    }

private var _aiGenerate2Line: ImageVector? = null
