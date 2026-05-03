package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.ZodiacTaurus: ImageVector
    get() {
        if (_zodiacTaurus != null) return _zodiacTaurus!!
        _zodiacTaurus = tablerOutlineIcon(
            name = "ZodiacTaurus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 6.000 3.000 C 6.000 6.314 8.686 9.000 12.000 9.000 C 15.314 9.000 18.000 6.314 18.000 3.000"),
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
                pathData = parseSvgPathData("M 6.000 15.000 C 6.000 18.314 8.686 21.000 12.000 21.000 C 15.314 21.000 18.000 18.314 18.000 15.000 C 18.000 11.686 15.314 9.000 12.000 9.000 C 8.686 9.000 6.000 11.686 6.000 15.000"),
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
        return _zodiacTaurus!!
    }

private var _zodiacTaurus: ImageVector? = null
