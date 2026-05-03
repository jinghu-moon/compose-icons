package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.Horse: ImageVector
    get() {
        if (_horse != null) return _horse!!
        _horse = tablerOutlineIcon(
            name = "Horse",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.000 10.000 L 6.150 18.507 C 6.112 18.889 6.236 19.269 6.494 19.553 C 6.751 19.838 7.116 20.000 7.500 20.000 L 7.646 20.000 C 8.464 20.000 9.199 19.502 9.503 18.743 L 10.497 16.257 C 10.801 15.498 11.536 15.000 12.354 15.000 L 13.646 15.000 C 14.464 15.000 15.199 15.498 15.503 16.257 L 16.497 18.743 C 16.801 19.502 17.536 20.000 18.354 20.000 L 18.500 20.000 C 18.885 20.000 19.252 19.838 19.511 19.554 C 19.771 19.270 19.899 18.889 19.864 18.506 L 19.000 9.000 L 11.000 9.000 C 11.000 6.000 8.000 4.000 5.000 4.000 L 2.000 10.000 L 4.000 12.000 L 7.000 10.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
            addPath(
                pathData = parseSvgPathData("M 22.000 14.000 L 22.000 12.000 C 22.000 10.343 20.657 9.000 19.000 9.000"),
                pathFillType = PathFillType.NonZero,
                fill = null,
                fillAlpha = 1f,
                stroke = SolidColor(Color(0xFF000000)),
                strokeAlpha = 1f,
                strokeLineWidth = 2f,
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
            )
        }
        return _horse!!
    }

private var _horse: ImageVector? = null
