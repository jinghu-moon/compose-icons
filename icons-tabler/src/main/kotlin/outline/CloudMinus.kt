package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.CloudMinus: ImageVector
    get() {
        if (_cloudMinus != null) return _cloudMinus!!
        _cloudMinus = tablerOutlineIcon(
            name = "CloudMinus",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 12.000 18.004 L 6.657 18.004 C 4.085 18.000 2.000 15.993 2.000 13.517 C 2.000 11.042 4.085 9.035 6.657 9.035 C 7.050 7.273 8.451 5.835 10.332 5.262 C 12.212 4.690 14.288 5.069 15.776 6.262 C 17.264 7.452 17.938 9.269 17.546 11.031 L 18.536 11.031 C 20.449 11.031 22.000 12.591 22.000 14.517 C 22.000 14.703 21.985 14.887 21.958 15.065"),
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
                pathData = parseSvgPathData("M 16.000 19.000 L 22.000 19.000"),
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
        return _cloudMinus!!
    }

private var _cloudMinus: ImageVector? = null
