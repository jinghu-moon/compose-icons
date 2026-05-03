package composeicons.tabler.outline

import androidx.compose.ui.graphics.*
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import composeicons.core.IconSize
import composeicons.core.ViewBox
import composeicons.core.parseSvgPathData
import composeicons.tabler.TablerIcons
import composeicons.tabler.tablerOutlineIcon

val TablerIcons.Outline.MoonOff: ImageVector
    get() {
        if (_moonOff != null) return _moonOff!!
        _moonOff = tablerOutlineIcon(
            name = "MoonOff",
            size = IconSize(width = 24f.dp, height = 24f.dp),
            viewBox = ViewBox(minX = 0f, minY = 0f, width = 24f, height = 24f),
        ) {
            addPath(
                pathData = parseSvgPathData("M 7.962 3.949 C 9.215 3.319 10.598 2.991 12.000 2.992 L 12.000 3.000 L 12.393 3.000 C 11.422 3.900 10.708 5.042 10.323 6.308M 10.182 10.148 C 10.368 10.971 10.696 11.774 11.171 12.521 C 12.216 14.165 13.861 15.338 15.757 15.789M 19.650 15.679 C 19.873 15.612 20.094 15.535 20.313 15.446 C 20.229 15.648 20.137 15.847 20.039 16.043M 18.344 18.380 C 14.823 21.890 9.124 21.881 5.615 18.361 C 2.105 14.840 2.113 9.141 5.634 5.631"),
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
                pathData = parseSvgPathData("M 3.000 3.000 L 21.000 21.000"),
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
        return _moonOff!!
    }

private var _moonOff: ImageVector? = null
